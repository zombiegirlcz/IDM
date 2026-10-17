package hx3;

import com.revolut.feature.credit.application.plugins.impl.repositories.impl.plugins.financial_evidence.FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1;
import exe.j;
import ft3.h1;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j34.g f156379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f156380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oe6.a f156381c;
    public final whf.b d;

    public g(j34.g financialEvidenceRepository, n walletInteractor, oe6.a externalInstitutionsInteractor, whf.b transactionsListContentProvider) {
        Intrinsics.checkNotNullParameter(financialEvidenceRepository, "financialEvidenceRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        this.f156379a = financialEvidenceRepository;
        this.f156380b = walletInteractor;
        this.f156381c = externalInstitutionsInteractor;
        this.d = transactionsListContentProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hx3.g r13, gim.c r14) {
        /*
            r13.getClass()
            wsg.n r0 = r13.f156380b
            boolean r1 = r14 instanceof hx3.c
            if (r1 == 0) goto L19
            r1 = r14
            hx3.c r1 = (hx3.c) r1
            int r2 = r1.f156375y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.f156375y = r2
        L17:
            r13 = r1
            goto L1f
        L19:
            hx3.c r1 = new hx3.c
            r1.<init>(r13, r14)
            goto L17
        L1f:
            java.lang.Object r14 = r13.f156373w
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.f156375y
            r9 = 3
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L4b
            if (r1 == r11) goto L47
            if (r1 == r10) goto L3f
            if (r1 != r9) goto L37
            xi0.b r13 = r13.v
            yhm.o.b(r14)
            goto Lb0
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3f:
            java.util.List r1 = r13.u
            java.util.List r1 = (java.util.List) r1
            yhm.o.b(r14)
            goto L7c
        L47:
            yhm.o.b(r14)
            goto L65
        L4b:
            yhm.o.b(r14)
            io3.k r2 = io3.k.ACTIVE
            io3.i r3 = io3.i.INTERNAL
            r6 = 0
            r7 = 57
            r1 = 0
            r4 = 0
            r5 = 0
            efm.d0 r14 = osg.b.j(r0, r1, r2, r3, r4, r5, r6, r7)
            r13.f156375y = r11
            java.lang.Object r14 = nim.a.b(r14, r13)
            if (r14 != r8) goto L65
            goto Lac
        L65:
            r1 = r14
            java.util.List r1 = (java.util.List) r1
            com.revolut.core.model.account.AccountId$Personal r14 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r14 = r0.x(r14)
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            r13.u = r2
            r13.f156375y = r10
            java.lang.Object r14 = nim.a.b(r14, r13)
            if (r14 != r8) goto L7c
            goto Lac
        L7c:
            xi0.b r14 = (xi0.b) r14
            kotlin.jvm.internal.Intrinsics.h(r1)
            kotlin.jvm.internal.Intrinsics.h(r14)
            r2 = 0
            efm.r r0 = r0.O(r1, r2, r14)
            vkm.d r0 = rd0.e.b(r0)
            ht1.l r1 = new ht1.l
            r2 = 26
            r1.<init>(r2)
            r2 = 0
            jhi.b r0 = mo3.a.g(r0, r2, r1, r11)
            ghk.a0 r1 = new ghk.a0
            r3 = 21
            r1.<init>(r0, r14, r3)
            r13.u = r2
            r13.v = r14
            r13.f156375y = r9
            java.lang.Object r13 = vkm.q.x(r1, r13)
            if (r13 != r8) goto Lad
        Lac:
            return r8
        Lad:
            r12 = r14
            r14 = r13
            r13 = r12
        Lb0:
            dj0.d r14 = (dj0.d) r14
            av3.j r0 = new av3.j
            kotlin.jvm.internal.Intrinsics.h(r13)
            long r1 = r14.f115082a
            r0.<init>(r1, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hx3.g.a(hx3.g, gim.c):java.lang.Object");
    }

    public final j b(h1 productPayload) {
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        j34.g gVar = this.f156379a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        ve0.c cVar = gVar.e;
        String strE = j34.g.e(productPayload);
        Type type = new FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getRevolutTransactionIdsType(...)");
        return new j(new a44.c(ue0.e.R(cVar, strE, type), 7), 19);
    }
}
