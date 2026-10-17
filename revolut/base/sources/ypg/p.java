package ypg;

import com.revolut.data.model.Data;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import pcd.x;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class p implements ppg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qdd.a f315887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f315888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f315889c;
    public final lpg.b d;
    public final xvh.c e;
    public final odd.a f;

    public p(qdd.a vaultsRepository, wsg.n walletInteractor, ppk.f ratesInteractor, lpg.b sharedVaultPushInterceptor, xvh.c autoInvestInteractor, odd.a sharedVaultsInteractor) {
        Intrinsics.checkNotNullParameter(vaultsRepository, "vaultsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(sharedVaultPushInterceptor, "sharedVaultPushInterceptor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(sharedVaultsInteractor, "sharedVaultsInteractor");
        this.f315887a = vaultsRepository;
        this.f315888b = walletInteractor;
        this.f315889c = ratesInteractor;
        this.d = sharedVaultPushInterceptor;
        this.e = autoInvestInteractor;
        this.f = sharedVaultsInteractor;
    }

    public static ArrayList d(List list, xi0.b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            xi0.b bVarA = ((s) it8.next()).h().a();
            if (Intrinsics.f(bVarA, bVar)) {
                bVarA = null;
            }
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(setI1, 10));
        Iterator it9 = setI1.iterator();
        while (it9.hasNext()) {
            v1.c.A(arrayList2, (xi0.b) it9.next(), bVar);
        }
        return arrayList2;
    }

    public static List r(List list, List list2, xi0.b bVar, npg.l lVar) {
        List<s> list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (s sVar : list3) {
            arrayList.add(v13.d.h0(list2, sVar, new dj0.d(sVar.b(), kii.e.u(sVar, xi0.b.Companion)), bVar));
        }
        int i = m.f315884a[lVar.ordinal()];
        if (i == 1) {
            return arrayList;
        }
        if (i == 2) {
            return d0.P0(arrayList, new o());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ypg.n
            if (r0 == 0) goto L13
            r0 = r8
            ypg.n r0 = (ypg.n) r0
            int r1 = r0.f315886x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315886x = r1
            goto L18
        L13:
            ypg.n r0 = new ypg.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315886x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            pcd.s r7 = r0.u
            yhm.o.b(r8)
            goto L7e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L48
        L38:
            yhm.o.b(r8)
            ufm.i r7 = r6.c(r7)
            r0.f315886x = r4
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L48
            goto L7d
        L48:
            r7 = r8
            pcd.s r7 = (pcd.s) r7
            pcd.b r8 = r7.a()
            pcd.b r2 = pcd.b.PERSONAL_JOINT
            if (r8 != r2) goto L8d
            java.lang.String r8 = r7.d()
            w4l.h r2 = w4l.h.f294642c
            wsg.n r5 = r6.f315888b
            efm.r r8 = r5.Z(r8, r2)
            ypg.h r2 = new ypg.h
            r5 = 2
            r2.<init>(r5)
            r5 = 0
            efm.r r8 = m70.a.g(r8, r5, r2, r4)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f315886x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            fo3.c r8 = (fo3.c) r8
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.core.model.account.AccountId r7 = xpg.a.a(r7, r8)
            return r7
        L8d:
            com.revolut.core.model.account.AccountId$Personal r7 = com.revolut.core.model.account.AccountId.Personal.f51414a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ypg.p.b(java.lang.String, gim.c):java.lang.Object");
    }

    public final ufm.i c(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        return ((eed.n) this.f).e(vaultId);
    }

    public final r e(pcd.i filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        return f(w4l.h.f294642c, filter);
    }

    public final r f(w4l.k loadingStrategy, pcd.i filter) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return ((eed.n) this.f).f(loadingStrategy, filter);
    }

    public final r g(ArrayList arrayList, xi0.b bVar) {
        r rVarJust = arrayList.isEmpty() ? r.just(new Data(f0.f322471a, null, false, 6, null)) : this.f315889c.b(arrayList, false).distinctUntilChanged();
        Intrinsics.h(rVarJust);
        return nim.a.w(rVarJust, new vgc.b(this, bVar, 15));
    }

    public final r h(boolean z) {
        r rVarRepeatWhen = ((aed.o) this.f315887a).e(z).repeatWhen(new l(new yo7.p(this, 7), 0));
        Intrinsics.checkNotNullExpressionValue(rVarRepeatWhen, "repeatWhen(...)");
        return rVarRepeatWhen;
    }

    public final r i(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        return j(vaultId, w4l.h.f294642c);
    }

    public final r j(String vaultId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((eed.n) this.f).g(vaultId, loadingStrategy);
    }

    public final r k(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        return pd.b.r(j(vaultId, w4l.h.f294642c), new yj2.b(this, vaultId, 14));
    }

    public final r l(w4l.k loadingStrategy, pcd.i filter) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return ((eed.n) this.f).h(loadingStrategy, filter);
    }

    public final akg.n m(List vaults, xi0.b baseCurrency, w4l.k loadingStrategy, npg.l vaultsSortStrategy) {
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(vaultsSortStrategy, "vaultsSortStrategy");
        return nim.a.v(rd0.e.b(g(d(vaults, baseCurrency), baseCurrency)), new k(this, vaults, baseCurrency, vaultsSortStrategy, 1));
    }

    public final akg.n n(List vaults, xi0.b baseCurrency, npg.l vaultsSortStrategy) {
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(vaultsSortStrategy, "vaultsSortStrategy");
        ArrayList arrayListD = d(vaults, baseCurrency);
        r rVarJust = arrayListD.isEmpty() ? r.just(new Data(f0.f322471a, null, false, 6, null)) : zi0.c.o(this.f315889c.d(arrayListD, n9l.b.SEC_60)).distinctUntilChanged();
        Intrinsics.h(rVarJust);
        return nim.a.v(rd0.e.b(nim.a.w(rVarJust, new vgc.b(this, baseCurrency, 16))), new k(this, vaults, baseCurrency, vaultsSortStrategy, 0));
    }

    public final pfm.a o(pcd.b accountType, boolean z) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return ((eed.n) this.f).j(accountType, z);
    }

    public final pfm.a p(String vaultId, x member) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(member, "member");
        pfm.a aVarE = ((aed.o) this.f315887a).f(vaultId, member.getId()).e(o(pcd.b.PERSONAL, true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a q(String vaultId, Map membersPermissions) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(membersPermissions, "membersPermissions");
        pfm.a aVarE = ((aed.o) this.f315887a).g(vaultId, membersPermissions).e(o(pcd.b.PERSONAL, true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
