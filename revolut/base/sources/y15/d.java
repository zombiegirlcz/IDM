package y15;

import a35.n;
import a35.q;
import com.revolut.feature.credit.api.navigation.GetCreditDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import grl.r2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import sri.m;
import ufm.i;
import xy7.j;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements op3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f310302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f310303b;

    public d(m navigator, n creditProductsMediator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditProductsMediator, "creditProductsMediator");
        this.f310302a = navigator;
        this.f310303b = creditProductsMediator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        g.Companion.getClass();
        return e.a(deeplink) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof y15.c
            if (r6 == 0) goto L13
            r6 = r7
            y15.c r6 = (y15.c) r6
            int r0 = r6.f310301w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f310301w = r0
            goto L1a
        L13:
            y15.c r6 = new y15.c
            gim.c r7 = (gim.c) r7
            r6.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f310301w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            a35.n r7 = r5.f310303b
            a35.q r7 = (a35.q) r7
            akg.n r7 = r7.d()
            y13.a r1 = new y13.a
            r4 = 4
            r1.<init>(r4)
            jhi.b r7 = mo3.a.g(r7, r3, r1, r2)
            vvh.e r1 = new vvh.e
            r4 = 12
            r1.<init>(r7, r4)
            kotlin.coroutines.g r7 = kotlin.coroutines.g.f186406a
            efm.r r7 = rd0.e.c(r1, r7)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r1 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r6.f310301w = r2
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r0) goto L66
            return r0
        L66:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L7b
            q06.h r6 = new q06.h
            com.revolut.feature.credit.api.navigation.GetCreditDestination r7 = new com.revolut.feature.credit.api.navigation.GetCreditDestination
            grl.r2 r0 = grl.r2.DEEPLINK
            r7.<init>(r0)
            r6.<init>(r7, r3)
            return r6
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y15.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        g.Companion.getClass();
        g gVarA = e.a(deeplink);
        if (gVarA == null) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!(gVarA instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        h hVar = new h(new xza.a(this, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new GetCreditDestination(r2.DEEPLINK), false, (Integer) null, 0, 61)), 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        d0 d0VarFirstOrError = rd0.e.c(new vvh.e(mo3.a.g(((q) this.f310303b).d(), null, new y13.a(3), 1), 11), kotlin.coroutines.g.f186406a).firstOrError();
        j jVar = new j(22, new oq3.g(hVar, 1));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, jVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
