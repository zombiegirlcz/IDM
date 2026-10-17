package eu1;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ufm.n;
import zt1.l;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {

    @NotNull
    public static final b Companion = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xt1.d f129469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pre.c f129470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vw1.b f129471c;
    public final fx1.a d;

    public h(xt1.d blikRepository, pre.c termsInteractor, vw1.b aliasRepository, fx1.a apmOnboardingRepository) {
        Intrinsics.checkNotNullParameter(blikRepository, "blikRepository");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        this.f129469a = blikRepository;
        this.f129470b = termsInteractor;
        this.f129471c = aliasRepository;
        this.d = apmOnboardingRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eu1.d
            if (r0 == 0) goto L13
            r0 = r6
            eu1.d r0 = (eu1.d) r0
            int r1 = r0.f129464w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129464w = r1
            goto L18
        L13:
            eu1.d r0 = new eu1.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129464w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f129464w = r3
            vw1.b r6 = r4.f129471c
            uy1.j r6 = (uy1.j) r6
            java.lang.Object r6 = r6.h(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            zz1.f r6 = (zz1.f) r6
            zz1.e r5 = r6.d()
            int[] r0 = eu1.c.f129463a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 3
            if (r5 == r0) goto L6e
            r0 = 4
            if (r5 != r0) goto L56
            c02.c r5 = c02.c.FAILED
            goto L70
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            zz1.e r6 = r6.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected state for BLIK P2P: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L6e:
            c02.c r5 = c02.c.COMPLETED
        L70:
            zz1.d r0 = r6.a()
            java.lang.String r0 = r0.a()
            java.lang.String r1 = r6.b()
            zz1.e r6 = r6.d()
            zz1.e r2 = zz1.e.FAILED
            if (r6 != r2) goto L85
            goto L86
        L85:
            r1 = 0
        L86:
            c02.d r6 = new c02.d
            r6.<init>(r5, r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eu1.h.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final n b(c02.j transaction, String pocketId) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        xt1.d dVar = this.f129469a;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        d0<l> d0VarConfirmBlikTransaction = dVar.f308742a.confirmBlikTransaction(transaction.a(), pocketId);
        xt1.a aVar = new xt1.a(4, new xrl.a(15));
        d0VarConfirmBlikTransaction.getClass();
        ufm.i iVar = new ufm.i(d0VarConfirmBlikTransaction, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    public final n c(c02.j transaction, c02.a aVar) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        xt1.d dVar = this.f129469a;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        d0<l> d0VarDeclineBlikTransaction = dVar.f308742a.declineBlikTransaction(transaction.a(), yt1.a.b(aVar));
        xt1.a aVar2 = new xt1.a(3, new xrl.a(14));
        d0VarDeclineBlikTransaction.getClass();
        ufm.i iVar = new ufm.i(d0VarDeclineBlikTransaction, aVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum d(com.revolut.feature.apm.core.models.alias.Alias r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof eu1.e
            if (r0 == 0) goto L13
            r0 = r9
            eu1.e r0 = (eu1.e) r0
            int r1 = r0.f129466x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129466x = r1
            goto L18
        L13:
            eu1.e r0 = new eu1.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129466x
            vw1.b r3 = r7.f129471c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            zz1.e r8 = r0.u
            yhm.o.b(r9)
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r9)
            goto L58
        L3d:
            yhm.o.b(r9)
            goto L4d
        L41:
            yhm.o.b(r9)
            r0.f129466x = r6
            java.lang.Object r9 = vw1.b.b(r3, r8, r0)
            if (r9 != r1) goto L4d
            goto L6c
        L4d:
            zz1.f r9 = (zz1.f) r9
            r0.f129466x = r5
            java.lang.Enum r9 = vw1.b.d(r3, r9, r0)
            if (r9 != r1) goto L58
            goto L6c
        L58:
            zz1.e r9 = (zz1.e) r9
            boolean r8 = nz8.d.l(r9)
            if (r8 == 0) goto L6d
            r0.u = r9
            r0.f129466x = r4
            uy1.j r3 = (uy1.j) r3
            java.lang.Object r8 = r3.j(r6, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: eu1.h.d(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof eu1.g
            if (r0 == 0) goto L13
            r0 = r8
            eu1.g r0 = (eu1.g) r0
            int r1 = r0.f129468w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129468w = r1
            goto L18
        L13:
            eu1.g r0 = new eu1.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129468w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L50
        L36:
            yhm.o.b(r8)
            zz1.i r8 = new zz1.i
            com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r2 = new com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias
            com.revolut.feature.apm.core.models.alias.AliasType$PHONE r5 = com.revolut.feature.apm.core.models.alias.AliasType.PHONE.f61895b
            r2.<init>(r5, r7)
            r8.<init>(r2)
            r0.f129468w = r3
            vw1.b r7 = r6.f129471c
            java.lang.Object r8 = vw1.b.a(r7, r8, r0)
            if (r8 != r1) goto L50
            goto L9e
        L50:
            zz1.f r8 = (zz1.f) r8
            zz1.e r7 = r8.d()
            int[] r2 = eu1.c.f129463a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r3) goto L92
            if (r7 == r4) goto L92
            r0 = 3
            if (r7 == r0) goto L82
            r0 = 4
            if (r7 != r0) goto L7c
            c02.d r7 = new c02.d
            c02.c r0 = c02.c.FAILED
            zz1.d r1 = r8.a()
            java.lang.String r1 = r1.a()
            java.lang.String r8 = r8.b()
            r7.<init>(r0, r1, r8)
            return r7
        L7c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L82:
            c02.d r7 = new c02.d
            c02.c r0 = c02.c.COMPLETED
            zz1.d r8 = r8.a()
            java.lang.String r8 = r8.a()
            r7.<init>(r0, r8)
            return r7
        L92:
            java.lang.String r7 = r8.c()
            r0.f129468w = r4
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eu1.h.e(java.lang.String, gim.c):java.lang.Object");
    }
}
