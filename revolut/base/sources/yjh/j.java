package yjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import x8h.t0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends hih.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tzg.m f314483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tzg.l f314484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cjh.a f314485n;

    public j(tzg.m wealthAccountsInteractor, tzg.l wealthAccountsBalanceInteractor, cjh.a navigationCreator) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsBalanceInteractor, "wealthAccountsBalanceInteractor");
        Intrinsics.checkNotNullParameter(navigationCreator, "navigationCreator");
        this.f314483l = wealthAccountsInteractor;
        this.f314484m = wealthAccountsBalanceInteractor;
        this.f314485n = navigationCreator;
    }

    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.Analytics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (e3(r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hih.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.wealth.ui.api.actions.WealthAction r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.j.b3(com.revolut.feature.wealth.ui.api.actions.WealthAction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r9) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.j.c3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(hih.a r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof yjh.g
            if (r0 == 0) goto L13
            r0 = r7
            yjh.g r0 = (yjh.g) r0
            int r1 = r0.f314470w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314470w = r1
            goto L18
        L13:
            yjh.g r0 = new yjh.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314470w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L64
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            if (r6 != 0) goto L37
            r6 = -1
            goto L3f
        L37:
            int[] r7 = yjh.e.f314467a
            int r6 = r6.ordinal()
            r6 = r7[r6]
        L3f:
            switch(r6) {
                case -1: goto Lb1;
                case 0: goto L42;
                case 1: goto Lb1;
                case 2: goto Lb1;
                case 3: goto Lb1;
                case 4: goto L48;
                case 5: goto Lb1;
                case 6: goto Lb1;
                case 7: goto Lb1;
                default: goto L42;
            }
        L42:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L48:
            tzg.m r6 = r5.f314483l
            cfl.k r7 = cfl.k.f23744a
            akg.n r6 = tzg.m.c(r6, r4, r7, r3)
            yd8.a r7 = new yd8.a
            r2 = 25
            r7.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)
            r0.f314470w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L6a
            zhm.f0 r7 = zhm.f0.f322471a
        L6a:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r7.next()
            boolean r1 = r0 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities
            if (r1 == 0) goto L75
            r6.add(r0)
            goto L75
        L87:
            java.util.Iterator r6 = r6.iterator()
        L8b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r6.next()
            r0 = r7
            com.revolut.feature.wealth.api.domain.model.WealthAccount$Securities r0 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities) r0
            boolean r0 = r0.d9()
            if (r0 == 0) goto L8b
            goto La0
        L9f:
            r7 = r4
        La0:
            com.revolut.feature.wealth.api.domain.model.WealthAccount$Securities r7 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities) r7
            if (r7 == 0) goto Lb1
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r6 = r7.f95240c
            if (r6 == 0) goto Lb1
            java.util.UUID r6 = r6.f105210a
            if (r6 == 0) goto Lb1
            java.lang.String r6 = r6.toString()
            return r6
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.j.d3(hih.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r18) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.j.e3(gim.c):java.lang.Object");
    }

    public final Flow f3(WealthAccount wealthAccount) {
        if (wealthAccount != null) {
            return nim.a.v(((t0) this.f314484m).c(wealthAccount), new yi5.b(23));
        }
        dj0.d.Companion.getClass();
        return new go.g(zi0.c.P(dj0.d.e, false, null, 3), 2);
    }
}
