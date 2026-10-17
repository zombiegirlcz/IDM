package dug;

import dkk.a0;
import du7.e2;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import rfm.j;
import rfm.u;
import sri.m;
import te0.w;
import wp5.y;
import ybl.k;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements ntg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f117977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f117978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f117979c;
    public final Object d;
    public final Object e;

    public i(m navigator, ybl.d portfolioInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f117977a = navigator;
        this.f117978b = portfolioInteractor;
        this.f117979c = tradingAccountsInteractor;
        this.d = w.y0(new e2(27));
        this.e = w.y0(new e2(28));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "account-closure") && Intrinsics.f(cVar.e(3), "negative-balance") && cVar.e(4).length() == 0;
    }

    public final efm.k b(jf0.c cVar) {
        String str = (String) cVar.d.get("portfolioId");
        if (str != null) {
            u uVarG = efm.k.g(str);
            Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
            return uVarG;
        }
        int i = 0;
        d0 d0VarFirst = rd0.e.c(mo3.a.e(zi0.c.w(rd0.e.n(xam.a.h(new dob.c(this, null, 19), k.k(this.f117979c, null, null, null, 7)), h0.f322473a)), new dmb.m(29), new d(i)), kotlin.coroutines.g.f186406a).first(f0.f322471a);
        a0 a0Var = new a0(new ds4.b(6), 28);
        d0VarFirst.getClass();
        j jVar = new j(d0VarFirst, a0Var, 2);
        h hVar = h.f;
        rfm.m mVar = new rfm.m(jVar, new e(i), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dug.g
            if (r0 == 0) goto L13
            r0 = r6
            dug.g r0 = (dug.g) r0
            int r1 = r0.f117976w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117976w = r1
            goto L1a
        L13:
            dug.g r0 = new dug.g
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f117976w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            efm.k r5 = r4.b(r5)
            r0.f117976w = r3
            java.lang.Object r6 = nim.a.i(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r6 = (java.lang.String) r6
            r5 = 0
            if (r6 == 0) goto L58
            q06.h r0 = new q06.h
            com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureNegativeBalanceDestination r1 = new com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureNegativeBalanceDestination
            r1.<init>(r6)
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160141b
            r6.<init>(r2, r5)
            r0.<init>(r1, r6)
            return r0
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dug.i.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        rfm.f0 f0VarP = new rfm.m(b(deeplink), new a0(new a(this, 1), 27), 1).p(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        return f0VarP;
    }
}
