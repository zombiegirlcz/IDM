package hy2;

import ce9.m;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import e93.o;
import e93.p;
import e93.q;
import efm.r;
import h93.j0;
import h93.l0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.m4;
import skm.p0;
import te0.w;
import v6l.s;
import wsg.n;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements hx2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f156704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f156705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f156706c;
    public final m4 d;

    public f(s cardRepository, n walletInteractor, gte.a featureToggleInteractor, m4 familyCreditCardWalletInteractor) {
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        this.f156704a = cardRepository;
        this.f156705b = walletInteractor;
        this.f156706c = featureToggleInteractor;
        this.d = familyCreditCardWalletInteractor;
    }

    public static List d(List list, c93.f fVar) {
        if (fVar != c93.f.DISPOSABLE && fVar != c93.f.FREELANCER_DISPOSABLE) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (m.s((e93.f) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList f(e93.f fVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String strL = ((e93.f) obj2).l();
            Object objO = linkedHashMap.get(strL);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, strL);
            }
            ((List) objO).add(obj2);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            p pVar = new p(str, list2);
            e93.f fVar2 = d0.T(list2, fVar) ? fVar : null;
            if (fVar2 == null) {
                fVar2 = (e93.f) d0.b0(list2);
            }
            arrayList.add(new q(pVar, fVar2));
        }
        return arrayList;
    }

    public static r k(f fVar, String str, boolean z, boolean z3, j0 j0Var, l0 l0Var, j0 j0Var2, l0 l0Var2, String str2, String str3, String str4, List list, boolean z4, boolean z6, o oVar, e93.b bVar, int i) {
        j0 j0Var3;
        Object objO0;
        boolean z11 = (i & 4) != 0 ? false : z3;
        Continuation continuation = null;
        j0 j0Var4 = (i & 8) != 0 ? null : j0Var;
        l0 l0Var3 = (i & 16) != 0 ? null : l0Var;
        j0 j0Var5 = (i & 32) != 0 ? null : j0Var2;
        l0 l0Var4 = (i & 64) != 0 ? null : l0Var2;
        String str5 = (i & 512) != 0 ? null : str4;
        List list2 = (i & 1024) != 0 ? null : list;
        boolean z12 = (i & 2048) != 0 ? false : z4;
        boolean z29 = (i & 4096) != 0 ? false : z6;
        o oVar2 = (i & 8192) != 0 ? o.DEFAULT : oVar;
        e93.b bVar2 = (i & 16384) != 0 ? null : bVar;
        fVar.getClass();
        if (j0Var4 != null) {
            j0Var5 = j0Var4;
        }
        if (j0Var5 != null) {
            j0Var3 = j0Var5;
        } else if (z11) {
            j0Var5 = j0.PRO;
            j0Var3 = j0Var5;
        } else {
            j0Var3 = null;
        }
        if (l0Var3 != null) {
            l0Var4 = l0Var3;
        }
        if (l0Var4 == null) {
            l0Var4 = z ? l0.CREDIT : null;
        }
        if (str != null) {
            objO0 = efm.d0.m(str);
            Intrinsics.checkNotNullExpressionValue(objO0, "just(...)");
        } else {
            objO0 = j0Var3 == j0.FAMILY ? w.o0(p0.f264003c, new e(fVar, continuation, 0)) : fVar.f156705b.E(AccountId.Personal.f51414a);
        }
        sfm.b bVar3 = new sfm.b(objO0, new hy1.m(24, new c(fVar, z12, j0Var3, l0Var4, str2, str3, str5, list2, oVar2, bVar2, z29, z, z11, j0Var4, l0Var3)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
        return nim.a.w(bVar3, new hw9.a(fVar, 9));
    }

    public static r m(f fVar, String str, boolean z, boolean z3, boolean z4, boolean z6, j0 j0Var, l0 l0Var, j0 j0Var2, l0 l0Var2, boolean z11, boolean z12, String str2, e93.b bVar, List list, int i) {
        j0 j0Var3;
        l0 l0Var3;
        boolean z29 = (i & 4) != 0 ? false : z3;
        boolean z31 = (i & 8) != 0 ? false : z4;
        boolean z41 = (i & 16) != 0 ? false : z6;
        l0 l0Var4 = null;
        j0 j0Var4 = (i & 128) != 0 ? null : j0Var2;
        l0 l0Var5 = (i & 256) != 0 ? null : l0Var2;
        String str3 = (i & 2048) != 0 ? null : str2;
        e93.b bVar2 = (i & 4096) != 0 ? null : bVar;
        List list2 = (i & 8192) != 0 ? null : list;
        String str4 = str3;
        s sVar = fVar.f156704a;
        if (j0Var != null) {
            j0Var4 = j0Var;
        }
        if (j0Var4 != null) {
            j0Var3 = j0Var4;
        } else if (z29) {
            j0Var4 = j0.PRO;
            j0Var3 = j0Var4;
        } else {
            j0Var3 = null;
        }
        if (l0Var != null) {
            l0Var5 = l0Var;
        }
        if (l0Var5 == null) {
            if (z) {
                l0Var4 = l0.CREDIT;
            } else if (z31) {
                l0Var4 = l0.INSTALMENT;
            } else if (z41) {
                l0Var4 = l0.CRYPTO;
            }
            l0Var3 = l0Var4;
        } else {
            l0Var3 = l0Var5;
        }
        r rVarFlatMap = (fVar.e() ? sVar.h(z12, j0Var3, l0Var3, str, str4, bVar2, list2) : sVar.j(z12, str, z, z29, z31, z41, str4, j0Var, l0Var, bVar2, list2)).flatMap(new hy1.m(17, new g7b.q(z11, 16)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final boolean e() {
        return ((jte.d) this.f156706c).c(CardsCoreApi$Toggles.CardDesignApiFlagsMigration.f65556c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(e93.f r6, hha.d r7) {
        /*
            r5 = this;
            java.lang.String r0 = "currentPlan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "cardDesign"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = ce9.m.w(r6)
            r1 = 0
            if (r0 == 0) goto L13
            goto L85
        L13:
            boolean r0 = r6 instanceof e93.d
            r2 = 1
            if (r0 == 0) goto L6a
            e93.d r6 = (e93.d) r6
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            c93.g r3 = c93.h.Companion
            r3.getClass()
            c93.h r3 = c93.h.f22278l
            boolean r3 = ce9.m.r(r6, r3)
            if (r3 != 0) goto L3a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            c93.h r3 = c93.h.f22279m
            boolean r3 = ce9.m.r(r6, r3)
            if (r3 == 0) goto L38
            goto L3a
        L38:
            r3 = r1
            goto L3b
        L3a:
            r3 = r2
        L3b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "design"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.ArrayList r7 = r7.f152290g
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L4c
            goto L67
        L4c:
            java.util.Iterator r7 = r7.iterator()
        L50:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r7.next()
            b93.j r0 = (b93.j) r0
            b93.b r0 = r0.f13639a
            b93.b r4 = r6.f123827c
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r4)
            if (r0 == 0) goto L50
            goto L85
        L67:
            if (r3 != 0) goto L85
            goto L84
        L6a:
            boolean r0 = r6 instanceof e93.e
            if (r0 == 0) goto L86
            e93.e r6 = (e93.e) r6
            e93.m0 r6 = r6.f
            e93.m0 r0 = e93.m0.VIRTUAL
            if (r6 != r0) goto L77
            goto L85
        L77:
            hha.t r6 = hha.u.Companion
            r6.getClass()
            hha.u r6 = hha.u.g0
            boolean r6 = hha.s.h(r7, r6)
            if (r6 != 0) goto L85
        L84:
            return r2
        L85:
            return r1
        L86:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hy2.f.g(e93.f, hha.d):boolean");
    }

    public final r h(b93.b cardCode, String planId, String str) {
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(planId, "planId");
        return nim.a.w(k(this, str, hx7.l.o(cardCode), hx7.l.r(cardCode), null, null, null, null, null, planId, null, null, false, false, null, null, 32376), new ha3.e(cardCode, 2));
    }

    public final r i() {
        boolean zE = e();
        s sVar = this.f156704a;
        return ue0.e.H(nim.a.w(zE ? sVar.h(true, (126 & 2) != 0 ? null : null, (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? null : null, null, null, null) : sVar.j(true, (2046 & 2) != 0 ? null : null, (2046 & 4) != 0 ? false : false, (2046 & 8) != 0 ? false : false, false, false, null, null, (2046 & 256) != 0 ? null : null, null, null), new hy1.i(26)), h0.f322473a, new hy1.i(27));
    }

    public final r j(hha.d plan, j0 productType, l0 l0Var, j0 j0Var, l0 l0Var2, String str, String str2, String str3, boolean z, o entryPoint, e93.b bVar) {
        boolean z3;
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        boolean z4 = true;
        if (l0Var == l0.CREDIT) {
            z3 = true;
        } else {
            z3 = true;
            z4 = false;
        }
        return nim.a.w(k(this, str, z4, productType == j0.PRO ? z3 : false, j0Var, l0Var2, productType, l0Var, str2, plan.f152287a, str3, null, false, z, entryPoint, bVar, 1024), new hy1.i(this, 18));
    }

    public final r l(boolean z, hha.d plan, j0 productType, l0 l0Var, j0 j0Var, l0 l0Var2, String str, String str2, e93.b bVar, boolean z3) {
        boolean z4;
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(productType, "productType");
        boolean z6 = true;
        if (l0Var == l0.CREDIT) {
            z4 = true;
        } else {
            z4 = true;
            z6 = false;
        }
        return nim.a.w(nim.a.w(m(this, str, z6, productType == j0.PRO ? z4 : false, l0Var == l0.INSTALMENT ? z4 : false, l0Var == l0.CRYPTO ? z4 : false, j0Var, l0Var2, productType, l0Var, !z, z3, str2, bVar, null, 8192), new gae.a(this, z, 11)), new hy1.i(this, 19));
    }
}
