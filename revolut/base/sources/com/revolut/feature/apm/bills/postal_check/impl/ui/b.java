package com.revolut.feature.apm.bills.postal_check.impl.ui;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.postal_check.api.R$string;
import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$InputData;
import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlowContract$Step;
import d8l.d;
import g12.l;
import java.util.Map;
import jr1.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kr1.g;
import lp2.c;
import lr1.j;
import nii.l0;
import nii.y0;
import oki.h;
import yki.i;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements lr1.b {
    public final PostalCheckNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f61523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f61524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f61525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f61526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xi0.b f61527t;
    public final i u;

    public b(PostalCheckNavigation$InputData inputData, zja.a productArticleInteractor, l qrHandler, g qrScanResultDialogProvider, e postalCheckInteractor, xi0.b featureCurrency) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(qrScanResultDialogProvider, "qrScanResultDialogProvider");
        Intrinsics.checkNotNullParameter(postalCheckInteractor, "postalCheckInteractor");
        Intrinsics.checkNotNullParameter(featureCurrency, "featureCurrency");
        this.o = inputData;
        this.f61523p = productArticleInteractor;
        this.f61524q = qrHandler;
        this.f61525r = qrScanResultDialogProvider;
        this.f61526s = postalCheckInteractor;
        this.f61527t = featureCurrency;
        this.u = d.a(this, new c(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.bills.postal_check.impl.ui.b r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof lr1.f
            if (r0 == 0) goto L13
            r0 = r6
            lr1.f r0 = (lr1.f) r0
            int r1 = r0.f199372w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199372w = r1
            goto L18
        L13:
            lr1.f r0 = new lr1.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199372w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            jr1.e r6 = r4.f61526s
            r0.f199372w = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult r6 = (com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult) r6
            r4.K2(r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bills.postal_check.impl.ui.b.I2(com.revolut.feature.apm.bills.postal_check.impl.ui.b, java.lang.String, gim.c):java.lang.Object");
    }

    public final void J2(PostalCheckQrScanResult.Success success) {
        if (success.f61498a.k.isEmpty()) {
            L2(success, r0.g());
            return;
        }
        PostalCheckFlowContract$Step.Form form = new PostalCheckFlowContract$Step.Form(success);
        i iVar = this.u;
        PostalCheckFlowContract$Step postalCheckFlowContract$Step = (PostalCheckFlowContract$Step) iVar.d();
        h.t2(this, iVar, form, ((postalCheckFlowContract$Step instanceof PostalCheckFlowContract$Step.TermsAndConditions) || (postalCheckFlowContract$Step instanceof PostalCheckFlowContract$Step.QrScanner) || !(this.o instanceof PostalCheckNavigation$InputData.Scanner)) ? false : true, null, false, 12);
    }

    public final void K2(PostalCheckQrScanResult postalCheckQrScanResult) {
        if (!(postalCheckQrScanResult instanceof PostalCheckQrScanResult.Success)) {
            if (!(postalCheckQrScanResult instanceof PostalCheckQrScanResult.TermsRequired)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new j(this, (PostalCheckQrScanResult.TermsRequired) postalCheckQrScanResult, null), new yi5.b(26));
        } else {
            PostalCheckQrScanResult.Success success = (PostalCheckQrScanResult.Success) postalCheckQrScanResult;
            if (!success.f61498a.f61505j) {
                J2(success);
            } else {
                this.f61525r.getClass();
                yji.l.b1(this, X1(new y0("ID_ALREADY_PAID_DIALOG", new l0(new TextLocalisedClause(R$string.postal_check_already_paid_title, null, null, 14), new TextLocalisedClause(R$string.postal_check_already_paid_description, null, null, 14), null, new TextLocalisedClause(R$string.postal_check_already_paid_continue, null, null, 14), new TextLocalisedClause(R$string.postal_check_already_paid_cancel, null, null, 14), null, false, null, 996), false, 4)), null, new lr1.e(this, success, null), 3);
            }
        }
    }

    public final void L2(PostalCheckQrScanResult.Success success, Map map) {
        PostalCheckFlowContract$Step.Payment payment = new PostalCheckFlowContract$Step.Payment(success, map);
        i iVar = this.u;
        PostalCheckFlowContract$Step postalCheckFlowContract$Step = (PostalCheckFlowContract$Step) iVar.d();
        h.t2(this, iVar, payment, ((postalCheckFlowContract$Step instanceof PostalCheckFlowContract$Step.TermsAndConditions) || (postalCheckFlowContract$Step instanceof PostalCheckFlowContract$Step.QrScanner) || (!(this.o instanceof PostalCheckNavigation$InputData.Scanner) && success.f61498a.k.isEmpty())) ? false : true, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        l2(new lo.c(this, (Continuation) null, 3), new yi5.b(26));
    }

    public final void M2() {
        PostalCheckNavigation$InputData postalCheckNavigation$InputData = this.o;
        if (postalCheckNavigation$InputData instanceof PostalCheckNavigation$InputData.ScannedData) {
            K2(((PostalCheckNavigation$InputData.ScannedData) postalCheckNavigation$InputData).f61509a);
        } else {
            if (!(postalCheckNavigation$InputData instanceof PostalCheckNavigation$InputData.Scanner)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, this.u, PostalCheckFlowContract$Step.QrScanner.f61519a, false, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
