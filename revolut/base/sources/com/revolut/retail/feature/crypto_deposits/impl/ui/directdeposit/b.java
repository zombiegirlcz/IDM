package com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.tfr.validation.api.R$string;
import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.retail.feature.crypto_deposits.api.CryptoDepositsApi$Toggles$DirectDeposits;
import com.revolut.retail.feature.crypto_deposits.api.CryptoDepositsApi$Toggles$DirectDepositsGenericEntryPoint;
import com.revolut.retail.feature.crypto_deposits.api.repository.CryptoDepositsRepository$BeneficiariesNotYetCreated;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData;
import grl.k9;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import y8a.g;
import ybh.a0;
import ybj.c;
import ybj.d;
import ybj.k;
import yji.l;
import yki.i;
import zhm.h0;
import zm5.e;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements c {

    @NotNull
    public static final d Companion = new d();
    public final CryptoDirectDepositFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ibj.a f100067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f100068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f100069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybj.a f100070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gk5.a f100071t;
    public final asi.d u;
    public final zja.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f100072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f100073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qki.d f100074y;
    public final i z;

    public b(CryptoDirectDepositFlowContract$InputData input, ibj.a cryptoDepositsRepository, e meshInteractor, gte.a featureToggleInteractor, ybj.a cryptoDirectDepositDialogProvider, gk5.a cryptoCounterpartyRepository, asi.d userSessionInteractor, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cryptoDepositsRepository, "cryptoDepositsRepository");
        Intrinsics.checkNotNullParameter(meshInteractor, "meshInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoDirectDepositDialogProvider, "cryptoDirectDepositDialogProvider");
        Intrinsics.checkNotNullParameter(cryptoCounterpartyRepository, "cryptoCounterpartyRepository");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = input;
        this.f100067p = cryptoDepositsRepository;
        this.f100068q = meshInteractor;
        this.f100069r = featureToggleInteractor;
        this.f100070s = cryptoDirectDepositDialogProvider;
        this.f100071t = cryptoCounterpartyRepository;
        this.u = userSessionInteractor;
        this.v = productArticleInteractor;
        this.f100072w = new ArrayList();
        this.f100074y = hx7.e.b(this, new CryptoDirectDepositFlowContract$DomainState(null, null));
        this.z = d8l.d.a(this, new g(this, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b r7, com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent.TransferCompleted.Success r8, com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent.IntegrationConnected r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof ybj.e
            if (r0 == 0) goto L13
            r0 = r10
            ybj.e r0 = (ybj.e) r0
            int r1 = r0.f312375w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312375w = r1
            goto L18
        L13:
            ybj.e r0 = new ybj.e
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312375w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L6c
            goto L7a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r10)
            r10 = 0
            if (r9 == 0) goto L38
            java.lang.String r2 = r9.f71003a
            goto L39
        L38:
            r2 = r10
        L39:
            java.lang.String r4 = "deFiWallet"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            if (r2 == 0) goto L7a
            gk5.a r7 = r7.f100071t     // Catch: java.lang.Exception -> L6c
            qj5.b r2 = new qj5.b     // Catch: java.lang.Exception -> L6c
            java.lang.String r4 = r8.f71009c     // Catch: java.lang.Exception -> L6c
            java.lang.String r9 = r9.f71004b     // Catch: java.lang.Exception -> L6c
            wk5.e r5 = wk5.e.MESH_TRANSFER     // Catch: java.lang.Exception -> L6c
            qj5.a r6 = new qj5.a     // Catch: java.lang.Exception -> L6c
            java.lang.String r8 = r8.e     // Catch: java.lang.Exception -> L6c
            r6.<init>(r8)     // Catch: java.lang.Exception -> L6c
            r2.<init>(r4, r9, r5, r6)     // Catch: java.lang.Exception -> L6c
            r0.f312375w = r3     // Catch: java.lang.Exception -> L6c
            r7.getClass()     // Catch: java.lang.Exception -> L6c
            ga9.v r8 = new ga9.v     // Catch: java.lang.Exception -> L6c
            r9 = 26
            r8.<init>(r7, r2, r10, r9)     // Catch: java.lang.Exception -> L6c
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Exception -> L6c
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Exception -> L6c
            java.lang.Object r7 = skm.e0.J(r7, r8, r0)     // Catch: java.lang.Exception -> L6c
            if (r7 != r1) goto L7a
            return r1
        L6c:
            r7 = move-exception
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            java.lang.String r10 = "Error creating pre approved counterparty"
            java.lang.String r0 = "CryptoDirectDepositFlowModel"
            rd0.d.a(r9, r0, r10, r7, r8)
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.I2(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b, com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent$TransferCompleted$Success, com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent$IntegrationConnected, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r8.L2(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof ybj.f
            if (r0 == 0) goto L13
            r0 = r9
            ybj.f r0 = (ybj.f) r0
            int r1 = r0.f312376w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312376w = r1
            goto L18
        L13:
            ybj.f r0 = new ybj.f
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312376w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L7c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            goto L73
        L36:
            yhm.o.b(r9)
            com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData r9 = r8.o
            boolean r9 = r9 instanceof com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData.AllOptions
            if (r9 == 0) goto L73
            ibj.a r9 = r8.f100067p
            r0.f312376w = r4
            ubj.h r9 = (ubj.h) r9
            x4l.c r9 = r9.f278926j
            int r2 = jli.h.f175850a
            kotlin.Unit r2 = kotlin.Unit.f186387a
            w4l.h r5 = w4l.h.f294642c
            vkm.d r9 = r9.b(r2, r5)
            tzh.g r5 = new tzh.g
            r6 = 9
            r5.<init>(r9, r6)
            ryd.u r9 = new ryd.u
            r6 = 4
            r7 = 0
            r9.<init>(r6, r4, r7)
            vkm.y r4 = new vkm.y
            r4.<init>(r5, r9)
            r9 = 3
            jhi.b r9 = mo3.a.g(r4, r7, r7, r9)
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L70
            r2 = r9
        L70:
            if (r2 != r1) goto L73
            goto L7b
        L73:
            r0.f312376w = r3
            java.lang.Object r8 = r8.L2(r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.J2(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b r5, com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent.IntegrationConnected r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof ybj.l
            if (r0 == 0) goto L13
            r0 = r7
            ybj.l r0 = (ybj.l) r0
            int r1 = r0.f312383w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312383w = r1
            goto L18
        L13:
            ybj.l r0 = new ybj.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312383w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L65
            goto L73
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            r7 = 0
            if (r6 == 0) goto L38
            com.revolut.feature.crypto.tfr.validation.api.model.CryptoMeshAccessToken r2 = r6.f71005c
            goto L39
        L38:
            r2 = r7
        L39:
            if (r2 == 0) goto L73
            java.lang.String r6 = r6.f71003a
            java.lang.String r4 = "deFiWallet"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r4)
            if (r6 != 0) goto L73
            ibj.a r5 = r5.f100067p     // Catch: java.lang.Exception -> L65
            r0.f312383w = r3     // Catch: java.lang.Exception -> L65
            ubj.h r5 = (ubj.h) r5     // Catch: java.lang.Exception -> L65
            r5.getClass()     // Catch: java.lang.Exception -> L65
            u2i.g r6 = new u2i.g     // Catch: java.lang.Exception -> L65
            r3 = 8
            r6.<init>(r5, r2, r7, r3)     // Catch: java.lang.Exception -> L65
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Exception -> L65
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Exception -> L65
            java.lang.Object r5 = skm.e0.J(r5, r6, r0)     // Catch: java.lang.Exception -> L65
            if (r5 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L65
        L62:
            if (r5 != r1) goto L73
            return r1
        L65:
            r5 = move-exception
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r0 = "Error posting MESH managed token"
            java.lang.String r1 = "CryptoDirectDepositFlowModel"
            rd0.d.a(r7, r1, r0, r5, r6)
        L73:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.K2(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b, com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent$IntegrationConnected, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ybj.g
            if (r0 == 0) goto L13
            r0 = r11
            ybj.g r0 = (ybj.g) r0
            int r1 = r0.f312377w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312377w = r1
            goto L18
        L13:
            ybj.g r0 = new ybj.g
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312377w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r11)
            goto L69
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L30:
            yhm.o.b(r11)
            com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData r11 = r10.o
            boolean r2 = r11 instanceof com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData.AllOptions
            if (r2 == 0) goto L3c
            zhm.f0 r11 = zhm.f0.f322471a
            goto L4f
        L3c:
            boolean r2 = r11 instanceof com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData.Option
            if (r2 == 0) goto L9a
            gbj.d r2 = new gbj.d
            com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData$Option r11 = (com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData.Option) r11
            xi0.b r5 = r11.f100063a
            wk5.a r11 = r11.f100064b
            r2.<init>(r11, r5)
            java.util.List r11 = zhm.u.c(r2)
        L4f:
            r0.f312377w = r4
            ibj.a r2 = r10.f100067p
            ubj.h r2 = (ubj.h) r2
            r2.getClass()
            u2i.g r4 = new u2i.g
            r5 = 7
            r4.<init>(r2, r11, r3, r5)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L69
            return r1
        L69:
            gbj.b r11 = (gbj.b) r11
            java.lang.String r0 = r11.f142269a
            java.util.List r11 = r11.f142270b
            zm5.e r1 = r10.f100068q
            com.revolut.kompot.common.ExternalDestination$ByIntent r11 = r1.a(r0, r11)
            r10.C1(r11)
            r1.getClass()
            kotlinx.coroutines.flow.SharedFlow r11 = com.meshconnect.link.LinkEventsKt.getLinkEvents()
            ymk.u r5 = new ymk.u
            r0 = 11
            r5.<init>(r11, r1, r0)
            y83.d r8 = new y83.d
            r11 = 10
            r8.<init>(r10, r3, r11)
            r9 = 3
            r6 = 0
            r7 = 0
            r4 = r10
            skm.a2 r11 = yji.l.a1(r4, r5, r6, r7, r8, r9)
            r4.f100073x = r11
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L9a:
            r4 = r10
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        FeatureDefinition featureDefinition;
        CryptoDirectDepositFlowContract$InputData cryptoDirectDepositFlowContract$InputData = this.o;
        if (cryptoDirectDepositFlowContract$InputData instanceof CryptoDirectDepositFlowContract$InputData.AllOptions) {
            featureDefinition = CryptoDepositsApi$Toggles$DirectDepositsGenericEntryPoint.f100034c;
        } else {
            if (!(cryptoDirectDepositFlowContract$InputData instanceof CryptoDirectDepositFlowContract$InputData.Option)) {
                throw new NoWhenBranchMatchedException();
            }
            featureDefinition = CryptoDepositsApi$Toggles$DirectDeposits.f100033c;
        }
        if (this.f100069r.a(featureDefinition)) {
            h.D2(this.z);
        } else {
            l2(new ybj.h(this, null, 1), new yi5.b(26)).k(new y8a.h(this, 20));
        }
    }

    public final void M2() {
        qki.d dVar = this.f100074y;
        MeshEvent.TransferCompleted transferCompleted = ((CryptoDirectDepositFlowContract$DomainState) ((j2) dVar.f22677a).getValue()).f100060a;
        MeshEvent.IntegrationConnected integrationConnected = ((CryptoDirectDepositFlowContract$DomainState) ((j2) dVar.f22677a).getValue()).f100061b;
        if (transferCompleted != null) {
            H2(dVar, new a0(14));
            if (transferCompleted instanceof MeshEvent.TransferCompleted.Success) {
                n2(new k(this, (MeshEvent.TransferCompleted.Success) transferCompleted, integrationConnected, null), new whi.b(6)).k(new y8a.h(this, 20));
                return;
            }
            if (!(transferCompleted instanceof MeshEvent.TransferCompleted.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f100070s.getClass();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_tfr_validation_error_popup_title, null, null, 14);
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            l.b1(this, X1(new y0(null, new z(textLocalisedClause, null, null, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, null, null, 32254), false, 5)), null, new ybj.i(this, null, 0), 3);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        M2();
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f100074y;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof CryptoDepositsRepository$BeneficiariesNotYetCreated)) {
            super.o1(throwable);
            return false;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CryptoDirectDepositFlowModel", "Generating beneficiaries timed out", null, h0Var);
        this.f100070s.getClass();
        X1(new y0(null, new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_state_error_title_generic, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
