package com.revolut.feature.onboarding.impl.exchange_global_access.flow;

import ang.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import d8l.d;
import fn2.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import sy6.j;
import t5e.m;
import t99.b;
import t99.e;
import t99.g;
import vkm.q;
import yji.l;
import yki.i;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final ExchangeGlobalAccessFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f78265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jla.h f78266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pre.c f78267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f78268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zja.a f78269t;
    public final i u;

    public a(ExchangeGlobalAccessFlowContract$InputData inputData, c productCatalogueLoader, jla.h productCatalogueInteractor, pre.c termsInteractor, f userInteractor, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f78265p = productCatalogueLoader;
        this.f78266q = productCatalogueInteractor;
        this.f78267r = termsInteractor;
        this.f78268s = userInteractor;
        this.f78269t = productArticleInteractor;
        this.u = d.a(this, new suf.a(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.onboarding.impl.exchange_global_access.flow.a r20, com.revolut.feature.terms.api.model.Terms r21, gim.c r22) {
        /*
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof t99.h
            if (r2 == 0) goto L17
            r2 = r1
            t99.h r2 = (t99.h) r2
            int r3 = r2.f268965w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f268965w = r3
            goto L1c
        L17:
            t99.h r2 = new t99.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f268965w
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto L49
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            yhm.o.b(r1)
            sb4.i r1 = new sb4.i
            r4 = 17
            r7 = r21
            r1.<init>(r0, r7, r6, r4)
            r2.f268965w = r5
            java.lang.Object r1 = do3.q.t(r0, r1, r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            nii.y0 r1 = new nii.y0
            nii.j0 r7 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.onboarding.impl.R$string.exchange_global_access_activation_success
            r3 = 14
            r8.<init>(r2, r6, r6, r3)
            r18 = 0
            r19 = 4094(0xffe, float:5.737E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = 0
            r3 = 5
            r1.<init>(r6, r7, r2, r3)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r1)
            t99.i r4 = new t99.i
            r4.<init>(r0, r6)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.exchange_global_access.flow.a.I2(com.revolut.feature.onboarding.impl.exchange_global_access.flow.a, com.revolut.feature.terms.api.model.Terms, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.g(((kka.h) this.f78269t).d), null, null, new j(this, null, 27), 3);
    }

    public final void J2() {
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new g(this, null), 3);
    }

    public final void K2(bla.c cVar) {
        int i = t99.c.f268963a[cVar.ordinal()];
        if (i == 1) {
            L2(ExchangeGlobalAccessOutput.FeatureAvailable.f78171a);
            return;
        }
        if (i == 2) {
            h.t2(this, this.u, ExchangeGlobalAccessFlowContract$Step.Article.f78264a, false, null, false, 12);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            J2();
        }
    }

    public final void L2(ExchangeGlobalAccessOutput exchangeGlobalAccessOutput) {
        ExchangeGlobalAccessFlowContract$InputData exchangeGlobalAccessFlowContract$InputData = this.o;
        if (exchangeGlobalAccessFlowContract$InputData.f78261a != null && (exchangeGlobalAccessOutput instanceof ExchangeGlobalAccessOutput.FeatureAvailable)) {
            h.D2(this.u);
            C1(new BridgeDestination(exchangeGlobalAccessFlowContract$InputData.f78261a));
        } else if (exchangeGlobalAccessFlowContract$InputData.d) {
            C1(new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("EXCHANGE_GLOBAL_ACCESS_OUTPUT", exchangeGlobalAccessOutput)), null, 4)));
        } else {
            C2(exchangeGlobalAccessOutput);
        }
    }

    @Override // yki.j
    public final void M0() {
        bla.c cVar = this.o.f78262b;
        if (cVar != null) {
            K2(cVar);
        } else {
            l2(new e(this, null, 1), new m(this, 19));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
