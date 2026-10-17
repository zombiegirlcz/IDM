package rae;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f252815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9e.c f252816b;

    public b(m navigator, c9e.c navigationProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.f252815a = navigator;
        this.f252816b = navigationProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "standing-orders") || Intrinsics.f(cVar.e(1), "subscriptions") || Intrinsics.f(cVar.e(1), "scheduled-payments");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rae.a
            if (r0 == 0) goto L13
            r0 = r9
            rae.a r0 = (rae.a) r0
            int r1 = r0.f252814w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252814w = r1
            goto L1a
        L13:
            rae.a r0 = new rae.a
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f252814w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r9)
            goto L88
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            goto L71
        L38:
            yhm.o.b(r9)
            java.lang.String r9 = r8.e(r3)
            java.lang.String r2 = "scheduled-payments"
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            c9e.c r5 = r7.f252816b
            if (r9 == 0) goto L52
            rae.c r5 = (rae.c) r5
            com.revolut.retail.core.navigation.FeatureCommand r8 = r5.h(r2)
            goto L8b
        L52:
            java.lang.String r9 = r8.e(r4)
            java.lang.String r6 = "inactive"
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r6)
            if (r9 == 0) goto L75
            boolean r8 = r8.l()
            rae.c r5 = (rae.c) r5
            ufm.b r8 = r5.b(r8)
            r0.f252814w = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L71
            goto L87
        L71:
            r8 = r9
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            goto L8b
        L75:
            boolean r8 = r8.l()
            rae.c r5 = (rae.c) r5
            ufm.b r8 = r5.d(r2, r8)
            r0.f252814w = r4
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L88
        L87:
            return r1
        L88:
            r8 = r9
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
        L8b:
            q06.h r9 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.<init>(r8)
            r8 = 0
            r9.<init>(r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rae.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        ufm.b bVarD;
        boolean zD = y.D(cVar, "deeplink", 1, "scheduled-payments");
        AccountId.Personal personal = AccountId.Personal.f51414a;
        c9e.c cVar2 = this.f252816b;
        if (zD) {
            bVarD = d0.m(((c) cVar2).h(personal));
            Intrinsics.checkNotNullExpressionValue(bVarD, "just(...)");
        } else if (Intrinsics.f(cVar.e(2), "inactive")) {
            bVarD = ((c) cVar2).b(cVar.l());
        } else {
            bVarD = ((c) cVar2).d(personal, cVar.l());
        }
        i iVar = new i(bVarD, new r83.d(20, new r38.m(this, 29)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }
}
