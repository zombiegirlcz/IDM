package w43;

import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import efm.r;
import h93.f0;
import h93.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w2a.o;
import wsg.n;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements y33.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f294508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f294509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f294510c;
    public final xoj.a d;
    public final n6e.b e;
    public final g6e.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y91.b f294511g;

    public i(ppk.f ratesInteractor, n walletInteractor, l93.f revolutCardsInteractor, xoj.a featuresInteractor, n6e.b pocketSubaccountsProvider, g6e.d subaccountInteractor, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(pocketSubaccountsProvider, "pocketSubaccountsProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f294508a = ratesInteractor;
        this.f294509b = walletInteractor;
        this.f294510c = revolutCardsInteractor;
        this.d = featuresInteractor;
        this.e = pocketSubaccountsProvider;
        this.f = subaccountInteractor;
        this.f294511g = accountsProductFeatureChecker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v16, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [w43.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(w43.i r19, com.revolut.core.model.account.AccountId r20, xi0.b r21, java.util.List r22, java.util.List r23, java.util.List r24, i93.d r25, java.util.List r26, boolean r27, boolean r28, boolean r29, h93.l0 r30, gim.c r31) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w43.i.a(w43.i, com.revolut.core.model.account.AccountId, xi0.b, java.util.List, java.util.List, java.util.List, i93.d, java.util.List, boolean, boolean, boolean, h93.l0, gim.c):java.lang.Object");
    }

    public static ArrayList b(List list, l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            x33.a aVar = (x33.a) obj2;
            int i = l0Var == null ? -1 : c.f294496b[l0Var.ordinal()];
            boolean zEquals = true;
            if (i == 1) {
                xi0.b bVarL = z92.f.l(aVar.f302630a.f65523a);
                xi0.b.Companion.getClass();
                zEquals = bVarL.equals(xi0.b.E);
            } else if (i == 2) {
                xi0.b bVarL2 = z92.f.l(aVar.f302630a.f65523a);
                xi0.b.Companion.getClass();
                if (bVarL2.equals(xi0.b.E)) {
                    zEquals = false;
                }
            }
            if (zEquals) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.core.model.account.AccountId r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w43.d
            if (r0 == 0) goto L13
            r0 = r7
            w43.d r0 = (w43.d) r0
            int r1 = r0.f294497w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294497w = r1
            goto L18
        L13:
            w43.d r0 = new w43.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294497w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L73
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof com.revolut.core.model.account.AccountId.Joint
            if (r7 == 0) goto L38
            r6 = 0
            goto L7e
        L38:
            boolean r6 = r6 instanceof com.revolut.core.model.account.AccountId.Personal
            if (r6 == 0) goto L83
            xoj.a r6 = r5.d
            yoj.c r7 = yoj.c.CRYPTO
            efm.r r6 = xoj.a.d(r6, r7)
            efm.d0 r6 = r6.firstOrError()
            w29.a r7 = new w29.a
            r2 = 14
            r7.<init>(r2)
            vz4.c r2 = new vz4.c
            r4 = 25
            r2.<init>(r7, r4)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            pfm.z r6 = ue0.e.F(r7, r6)
            r0.f294497w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
        L7e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L83:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w43.i.c(com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(i93.b r5, i93.d r6, java.util.List r7, java.util.List r8) {
        /*
            r4 = this;
            java.lang.Object r7 = zhm.d0.d0(r7)
            com.revolut.feature.cards.models.card.PocketWithSubaccount r7 = (com.revolut.feature.cards.models.card.PocketWithSubaccount) r7
            i93.d r0 = i93.d.POCKETS
            r1 = 0
            r2 = 1
            if (r0 != r6) goto L57
            int[] r6 = w43.c.f294495a
            int r0 = r5.ordinal()
            r6 = r6[r0]
            r0 = 0
            if (r6 == r2) goto L45
            r3 = 2
            if (r6 == r3) goto L36
            r3 = 3
            if (r6 == r3) goto L27
            r3 = 4
            if (r6 != r3) goto L21
            goto L27
        L21:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L27:
            if (r7 == 0) goto L31
            io3.d r6 = r7.f65523a
            if (r6 == 0) goto L31
            xi0.b r0 = z92.f.l(r6)
        L31:
            boolean r6 = cp5.d.A(r0)
            goto L53
        L36:
            if (r7 == 0) goto L40
            io3.d r6 = r7.f65523a
            if (r6 == 0) goto L40
            xi0.b r0 = z92.f.l(r6)
        L40:
            boolean r6 = cp5.d.z(r0)
            goto L53
        L45:
            if (r7 == 0) goto L4f
            io3.d r6 = r7.f65523a
            if (r6 == 0) goto L4f
            xi0.b r0 = z92.f.l(r6)
        L4f:
            boolean r6 = cp5.d.A(r0)
        L53:
            if (r6 == 0) goto L57
            r6 = r2
            goto L58
        L57:
            r6 = r1
        L58:
            boolean r5 = r8.contains(r5)
            y91.b r7 = r4.f294511g
            java.lang.String r8 = "REVOLUT_CARD.link_to_pocket"
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L6c
            if (r6 != 0) goto L6c
            if (r5 == 0) goto L6b
            goto L6c
        L6b:
            return r1
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w43.i.d(i93.b, i93.d, java.util.List, java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.util.List r17, i93.d r18, com.revolut.core.model.account.AccountId r19, boolean r20, h93.l0 r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w43.i.e(java.util.List, i93.d, com.revolut.core.model.account.AccountId, boolean, h93.l0, gim.c):java.io.Serializable");
    }

    public final r f(SelectPaymentMethodInputData.UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        f0 f0VarA = d43.a.a(useCase);
        boolean z = false;
        if (f0VarA != null && f0VarA.M()) {
            z = true;
        }
        return pd.b.r(this.f294509b.J(useCase.getF65249b(), w4l.h.f294642c), new pud.b(this, useCase, z, 27));
    }

    public final r g(List list, xi0.b bVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((PocketWithSubaccount) it8.next()).f65523a);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            v1.c.A(arrayList2, z92.f.l((io3.d) it9.next()), bVar);
        }
        r map = m70.a.f(ue0.e.p(this.f294508a.b(arrayList2, false), h0.f322473a), new o(1), new w2.d(13), new w2.d(14)).map(new w38.w(2, h.f294507a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(ue0.e.E(map, zi0.c.P(zhm.f0.f322471a, false, null, 3)), new c9h.a(list, bVar, 8));
    }
}
