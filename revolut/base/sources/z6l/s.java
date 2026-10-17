package z6l;

import com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import v6l.a0;
import v6l.b0;
import v6l.b1;
import v6l.j0;
import v6l.v;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements i6l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6l.b f319829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6l.s f319830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10.d f319831c;
    public final fnc.s d;
    public final da3.m e;
    public final ij0.a f;

    public s(j6l.b revolutCardRepository, v6l.s cardRepository, r10.d locationProvider, fnc.s cardEventsInteractor, da3.m cardsNetworkConfiguration, ij0.a coreNetworkConfiguration) {
        Intrinsics.checkNotNullParameter(revolutCardRepository, "revolutCardRepository");
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(cardEventsInteractor, "cardEventsInteractor");
        Intrinsics.checkNotNullParameter(cardsNetworkConfiguration, "cardsNetworkConfiguration");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        this.f319829a = revolutCardRepository;
        this.f319830b = cardRepository;
        this.f319831c = locationProvider;
        this.d = cardEventsInteractor;
        this.e = cardsNetworkConfiguration;
        this.f = coreNetworkConfiguration;
    }

    public final Object A(String cardId, gim.i iVar) {
        b1 b1Var = (b1) this.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        d0<p6l.q> cardById = b1Var.f286424a.getCardById(cardId);
        a0 a0Var = new a0(2, new v6e.d(29));
        cardById.getClass();
        pfm.a aVar = new pfm.a(new ufm.i(cardById, a0Var, 1), new a0(3, new v(b1Var, 27)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Object objA = nim.a.a(w.g0(aVar), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof z6l.o
            if (r0 == 0) goto L13
            r0 = r8
            z6l.o r0 = (z6l.o) r0
            int r1 = r0.f319825w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319825w = r1
            goto L18
        L13:
            z6l.o r0 = new z6l.o
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319825w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L80
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            j6l.b r8 = r6.f319829a
            v6l.b1 r8 = (v6l.b1) r8
            r8.getClass()
            java.lang.String r2 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r2 = r8.f286424a
            efm.d0 r7 = r2.getCardState(r7)
            v6l.b0 r2 = new v6l.b0
            r4 = 9
            r2.<init>(r4)
            v6l.a0 r4 = new v6l.a0
            r5 = 27
            r4.<init>(r5, r2)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            v6l.d0 r7 = new v6l.d0
            r4 = 6
            r7.<init>(r8, r4)
            v6l.a0 r8 = new v6l.a0
            r4 = 28
            r8.<init>(r4, r7)
            ufm.i r7 = new ufm.i
            r4 = 0
            r7.<init>(r2, r8, r4)
            java.lang.String r8 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            ufm.n r7 = te0.w.i0(r7)
            r0.f319825w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.B(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z6l.p
            if (r0 == 0) goto L13
            r0 = r8
            z6l.p r0 = (z6l.p) r0
            int r1 = r0.f319826w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319826w = r1
            goto L18
        L13:
            z6l.p r0 = new z6l.p
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319826w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L8a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            j6l.b r8 = r5.f319829a
            v6l.b1 r8 = (v6l.b1) r8
            r8.getClass()
            java.lang.String r2 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r4 = r8.f286424a
            efm.d0 r6 = r4.renewVirtualCard(r6, r7)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r2, r7)
            java.util.Set r7 = zhm.y0.b(r4)
            ufm.f r6 = ue0.e.t(r6, r7)
            v6e.d r7 = new v6e.d
            r2 = 22
            r7.<init>(r2)
            v6l.k r2 = new v6l.k
            r4 = 21
            r2.<init>(r4, r7)
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            v6l.v r6 = new v6l.v
            r2 = 4
            r6.<init>(r8, r2)
            v6l.k r8 = new v6l.k
            r2 = 22
            r8.<init>(r2, r6)
            ufm.i r6 = new ufm.i
            r2 = 0
            r6.<init>(r7, r8, r2)
            java.lang.String r7 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            ufm.n r6 = te0.w.i0(r6)
            r0.f319826w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L8a
            return r1
        L8a:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.C(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Object D(String id10, gim.i iVar) {
        b1 b1Var = (b1) this.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        pfm.a aVarE = b1Var.f286424a.delete(id10, Boolean.TRUE).e(b1Var.n(id10));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        Object objA = nim.a.a(w.g0(aVarE), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object E(String id10, gim.i iVar) {
        b1 b1Var = (b1) this.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        d0<p6l.q> d0VarReportDamaged = b1Var.f286424a.reportDamaged(id10);
        a0 a0Var = new a0(9, new b0(2));
        d0VarReportDamaged.getClass();
        pfm.a aVar = new pfm.a(new ufm.i(d0VarReportDamaged, a0Var, 1), new a0(10, new v(b1Var, 28)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Object objA = nim.a.a(w.g0(aVar), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof z6l.q
            if (r0 == 0) goto L13
            r0 = r8
            z6l.q r0 = (z6l.q) r0
            int r1 = r0.f319827w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319827w = r1
            goto L18
        L13:
            z6l.q r0 = new z6l.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319827w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L7f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            j6l.b r8 = r6.f319829a
            v6l.b1 r8 = (v6l.b1) r8
            r8.getClass()
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r2 = r8.f286424a
            efm.d0 r7 = r2.reportLost(r7)
            v6l.b0 r2 = new v6l.b0
            r4 = 4
            r2.<init>(r4)
            v6l.a0 r4 = new v6l.a0
            r5 = 13
            r4.<init>(r5, r2)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            v6l.d0 r7 = new v6l.d0
            r4 = 1
            r7.<init>(r8, r4)
            v6l.a0 r8 = new v6l.a0
            r4 = 14
            r8.<init>(r4, r7)
            ufm.i r7 = new ufm.i
            r4 = 0
            r7.<init>(r2, r8, r4)
            java.lang.String r8 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            ufm.n r7 = te0.w.i0(r7)
            r0.f319827w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L7f
            return r1
        L7f:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.F(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object G(String cardId, i93.e type, boolean z, gim.c cVar) {
        i93.f fVar;
        b1 b1Var = (b1) this.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (j0.f286457a[type.ordinal()]) {
            case 1:
                fVar = new i93.f(Boolean.valueOf(z), null, null, null, null, null, 62);
                break;
            case 2:
                fVar = new i93.f(null, Boolean.valueOf(!z), null, null, null, null, 61);
                break;
            case 3:
                fVar = new i93.f(null, null, null, null, Boolean.valueOf(!z), null, 47);
                break;
            case 4:
                fVar = new i93.f(null, null, Boolean.valueOf(!z), null, null, null, 59);
                break;
            case 5:
                fVar = new i93.f(null, null, null, Boolean.valueOf(!z), null, null, 55);
                break;
            case 6:
                fVar = new i93.f(null, null, null, null, null, Boolean.valueOf(!z), 31);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        RevolutCardService revolutCardService = b1Var.f286424a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        efm.b bVarUpdateSecuritySettings = revolutCardService.updateSecuritySettings(cardId, new p6l.h(fVar.f159554a, fVar.f159555b, fVar.f159556c, fVar.d, fVar.e, fVar.f));
        int i = 10;
        pfm.a aVar = new pfm.a(new ufm.c(new b7c.b(b1Var, cardId, type, z, 5), 2), new v6l.k(i, new v6l.d0(b1Var, i)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVarE = bVarUpdateSecuritySettings.e(aVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        Object objA = nim.a.a(w.g0(aVarE), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.String r7, i93.d r8, java.util.List r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof z6l.r
            if (r0 == 0) goto L13
            r0 = r10
            z6l.r r0 = (z6l.r) r0
            int r1 = r0.f319828w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319828w = r1
            goto L18
        L13:
            z6l.r r0 = new z6l.r
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319828w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L87
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r10)
            j6l.b r10 = r6.f319829a
            v6l.b1 r10 = (v6l.b1) r10
            r10.getClass()
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r2 = r10.f286424a
            q6l.p r4 = new q6l.p
            if (r8 == 0) goto L4b
            java.lang.Object r5 = u6l.k.f
            java.lang.String r8 = le.u1.h(r8, r5)
            goto L4c
        L4b:
            r8 = 0
        L4c:
            r4.<init>(r8, r9)
            efm.d0 r7 = r2.updateSettingsBindingStrategy(r7, r4)
            v6l.w0 r8 = v6l.w0.f
            uyd.y r8 = new uyd.y
            r9 = 5
            r8.<init>(r9)
            r7.getClass()
            ufm.i r9 = new ufm.i
            r9.<init>(r7, r8, r3)
            v6l.v r7 = new v6l.v
            r8 = 0
            r7.<init>(r10, r8)
            v6l.k r10 = new v6l.k
            r2 = 12
            r10.<init>(r2, r7)
            ufm.i r7 = new ufm.i
            r7.<init>(r9, r10, r8)
            java.lang.String r8 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            ufm.n r7 = te0.w.i0(r7)
            r0.f319828w = r3
            java.lang.Object r10 = nim.a.b(r7, r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.H(java.lang.String, i93.d, java.util.List, gim.c):java.lang.Object");
    }

    public final Object I(String str, String str2, gim.i iVar) {
        Object objS = ((b1) this.f319829a).s(str, str2, iVar);
        return objS == fim.a.COROUTINE_SUSPENDED ? objS : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof z6l.b
            if (r0 == 0) goto L13
            r0 = r9
            z6l.b r0 = (z6l.b) r0
            int r1 = r0.f319811w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319811w = r1
            goto L18
        L13:
            z6l.b r0 = new z6l.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319811w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L89
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            j6l.b r9 = r6.f319829a
            v6l.b1 r9 = (v6l.b1) r9
            r9.getClass()
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r2 = r9.f286424a
            q6l.e r4 = new q6l.e
            r4.<init>(r8)
            efm.b r2 = r2.changeLabel(r7, r4)
            r2d.e r4 = new r2d.e
            r5 = 19
            r4.<init>(r9, r5, r8, r7)
            pfm.h r8 = new pfm.h
            r5 = 2
            r8.<init>(r4, r5)
            java.lang.String r4 = "fromAction(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            pfm.a r8 = r2.e(r8)
            h93.f0 r7 = r9.f(r7)
            if (r7 == 0) goto L8f
            ufm.b r7 = efm.d0.m(r7)
            java.lang.String r9 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            rfm.f0 r7 = r8.f(r7)
            java.lang.String r8 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            ufm.n r7 = te0.w.i0(r7)
            r0.f319811w = r3
            java.lang.Object r9 = nim.a.b(r7, r0)
            if (r9 != r1) goto L89
            return r1
        L89:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
            return r9
        L8f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof z6l.c
            if (r0 == 0) goto L13
            r0 = r9
            z6l.c r0 = (z6l.c) r0
            int r1 = r0.f319812w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319812w = r1
            goto L18
        L13:
            z6l.c r0 = new z6l.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319812w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L96
        L2b:
            r8 = move-exception
            goto L99
        L2d:
            r8 = move-exception
            goto Laa
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            yhm.o.b(r9)
            goto L78
        L3c:
            yhm.o.b(r9)
            j6l.b r9 = r7.f319829a
            v6l.b1 r9 = (v6l.b1) r9
            r9.getClass()
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r2 = r9.f286424a
            efm.b r2 = r2.delete(r8, r5)
            pfm.h r8 = r9.n(r8)
            pfm.a r8 = r2.e(r8)
            w4l.f r9 = r9.o
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r6 = 0
            efm.b r9 = r9.g(r2, r6)
            pfm.a r8 = r8.e(r9)
            java.lang.String r9 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            pfm.r r8 = te0.w.g0(r8)
            r0.f319812w = r4
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L78
            goto L95
        L78:
            fnc.s r8 = r7.d     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.f319812w = r3     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r8 = r8.f136657b     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            xoj.a r8 = (xoj.a) r8     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            cpj.b r8 = (cpj.b) r8     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            pfm.a r8 = r8.n()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            pfm.a r8 = ue0.e.v(r8)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r8 = nim.a.a(r8, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r8 != r1) goto L91
            goto L93
        L91:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
        L93:
            if (r8 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto La2
        L99:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r5, r5, r8, r9)
        La2:
            v6l.s r8 = r7.f319830b
            r8.a()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Laa:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.c(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object d(String str, gim.i iVar) {
        Object objA = nim.a.a(w.g0(((b1) this.f319829a).f286424a.dismissPendingDigitisedCard(str)), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = Unit.f186387a;
        }
        return objA == aVar ? objA : Unit.f186387a;
    }

    public final void e() {
        ((b1) this.f319829a).f286430l.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (G(r6, r7, true, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z6l.d
            if (r0 == 0) goto L13
            r0 = r7
            z6l.d r0 = (z6l.d) r0
            int r1 = r0.f319813w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319813w = r1
            goto L18
        L13:
            z6l.d r0 = new z6l.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319813w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L42
        L36:
            yhm.o.b(r7)
            r0.f319813w = r4
            java.lang.Object r7 = r5.h(r6, r0)
            if (r7 != r1) goto L42
            goto L54
        L42:
            h93.f0 r7 = (h93.f0) r7
            i93.c r6 = r7.f150113g
            if (r6 == 0) goto L58
            java.lang.String r6 = r7.f150110a
            i93.e r7 = i93.e.ECOMMERCE
            r0.f319813w = r3
            java.lang.Object r6 = r5.G(r6, r7, r4, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L58:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.f(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(b93.d r5, b93.k r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof z6l.e
            if (r0 == 0) goto L13
            r0 = r7
            z6l.e r0 = (z6l.e) r0
            int r1 = r0.f319814w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319814w = r1
            goto L18
        L13:
            z6l.e r0 = new z6l.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319814w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            j6l.b r7 = r4.f319829a
            v6l.b1 r7 = (v6l.b1) r7
            efm.r r5 = r7.m(r5, r3, r6)
            z55.w r6 = new z55.w
            r7 = 12
            r6.<init>(r7)
            z3e.a r7 = new z3e.a
            r2 = 22
            r7.<init>(r6, r2)
            efm.r r5 = r5.map(r7)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.f319814w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.g(b93.d, b93.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z6l.f
            if (r0 == 0) goto L13
            r0 = r7
            z6l.f r0 = (z6l.f) r0
            int r1 = r0.f319815w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319815w = r1
            goto L18
        L13:
            z6l.f r0 = new z6l.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319815w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            j6l.b r7 = r5.f319829a
            v6l.b1 r7 = (v6l.b1) r7
            efm.r r7 = r7.b(r6)
            f28.b0 r2 = new f28.b0
            r4 = 27
            r2.<init>(r6, r4)
            z0f.a0 r6 = new z0f.a0
            r4 = 22
            r6.<init>(r4)
            efm.r r6 = m70.a.e(r7, r2, r6)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f319815w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.h(java.lang.String, gim.c):java.lang.Object");
    }

    public final String i(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.e.getClass();
        return j6.a.r(this.f.getBaseUrl(), "/my-card/", cardId, "/customisation");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof z6l.g
            if (r0 == 0) goto L13
            r0 = r6
            z6l.g r0 = (z6l.g) r0
            int r1 = r0.f319816w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319816w = r1
            goto L18
        L13:
            z6l.g r0 = new z6l.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319816w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            j6l.b r6 = r4.f319829a
            v6l.b1 r6 = (v6l.b1) r6
            r6.getClass()
            java.lang.String r2 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            ryc.a r6 = r6.u
            r6.getClass()
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.Object r6 = r6.f258290b
            w4l.f r6 = (w4l.f) r6
            r2 = 0
            efm.r r5 = r6.f(r5, r2)
            zhm.h0 r6 = zhm.h0.f322473a
            efm.r r5 = ue0.e.q(r5, r6)
            r6 = 3
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r2, r6)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.f319816w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.j(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z6l.h
            if (r0 == 0) goto L13
            r0 = r7
            z6l.h r0 = (z6l.h) r0
            int r1 = r0.f319817w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319817w = r1
            goto L18
        L13:
            z6l.h r0 = new z6l.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319817w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            j6l.b r7 = r5.f319829a
            v6l.b1 r7 = (v6l.b1) r7
            r7.getClass()
            java.lang.String r2 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r7 = r7.f286424a
            efm.d0 r6 = r7.getRefundAmount(r6)
            v6e.d r7 = new v6e.d
            r2 = 20
            r7.<init>(r2)
            v6l.k r2 = new v6l.k
            r4 = 19
            r2.<init>(r4, r7)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            ufm.n r6 = te0.w.i0(r7)
            r0.f319817w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.k(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(h93.l0 r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof z6l.i
            if (r0 == 0) goto L13
            r0 = r8
            z6l.i r0 = (z6l.i) r0
            int r1 = r0.f319818w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319818w = r1
            goto L18
        L13:
            z6l.i r0 = new z6l.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319818w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L67
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            b93.d r8 = b93.d.ALL
            b93.k r2 = b93.k.CREATED_DATE
            j6l.b r4 = r6.f319829a
            v6l.b1 r4 = (v6l.b1) r4
            r5 = 0
            efm.r r8 = r4.m(r8, r5, r2)
            n33.k0 r2 = new n33.k0
            r4 = 2
            r2.<init>(r7, r4)
            efm.r r7 = nim.a.w(r8, r2)
            z0f.a0 r8 = new z0f.a0
            r2 = 23
            r8.<init>(r2)
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r8, r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f319818w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.l(h93.l0, gim.c):java.lang.Object");
    }

    public final Object m(c93.s sVar, gim.i iVar) {
        return ((b1) this.f319829a).j(sVar, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof z6l.j
            if (r0 == 0) goto L13
            r0 = r10
            z6l.j r0 = (z6l.j) r0
            int r1 = r0.f319819w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319819w = r1
            goto L18
        L13:
            z6l.j r0 = new z6l.j
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319819w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L8f
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            yhm.o.b(r10)
            goto L44
        L36:
            yhm.o.b(r10)
            r0.f319819w = r4
            r10.d r10 = r9.f319831c
            java.lang.Object r10 = r10.S(r0)
            if (r10 != r1) goto L44
            goto L8e
        L44:
            co3.a r10 = (co3.a) r10
            j6l.b r2 = r9.f319829a
            v6l.b1 r2 = (v6l.b1) r2
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r4 = r2.f286424a
            r5 = 0
            if (r10 == 0) goto L56
            double r6 = r10.f25486a
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            goto L57
        L56:
            r6 = r5
        L57:
            if (r10 == 0) goto L60
            double r7 = r10.f25487b
            java.lang.Double r10 = java.lang.Double.valueOf(r7)
            goto L61
        L60:
            r10 = r5
        L61:
            java.lang.String r7 = "GCM"
            efm.d0 r10 = r4.getPendingDigitisedCards(r7, r5, r6, r10)
            v6l.d0 r4 = new v6l.d0
            r5 = 4
            r4.<init>(r2, r5)
            v6l.a0 r2 = new v6l.a0
            r5 = 21
            r2.<init>(r5, r4)
            r10.getClass()
            ufm.i r4 = new ufm.i
            r5 = 1
            r4.<init>(r10, r2, r5)
            java.lang.String r10 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r10)
            ufm.n r10 = te0.w.i0(r4)
            r0.f319819w = r3
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L8f
        L8e:
            return r1
        L8f:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.n(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(a7l.a r34, gim.c r35) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.o(a7l.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r18, e93.e r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, i93.d r23, java.util.Set r24, e93.b r25, gim.c r26) {
        /*
            r17 = this;
            r0 = r17
            r1 = r26
            boolean r2 = r1 instanceof z6l.l
            if (r2 == 0) goto L17
            r2 = r1
            z6l.l r2 = (z6l.l) r2
            int r3 = r2.f319822x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f319822x = r3
            goto L1c
        L17:
            z6l.l r2 = new z6l.l
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f319822x
            j6l.b r5 = r0.f319829a
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 == r7) goto L3a
            if (r4 != r6) goto L32
            h93.f0 r2 = r2.u
            yhm.o.b(r1)
            goto L96
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            yhm.o.b(r1)
            goto L61
        L3e:
            yhm.o.b(r1)
            r8 = r5
            v6l.b1 r8 = (v6l.b1) r8
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r15 = r24
            r16 = r25
            ufm.n r1 = r8.l(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.f319822x = r7
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L61
            goto L94
        L61:
            h93.f0 r1 = (h93.f0) r1
            boolean r4 = r1.X()
            if (r4 == 0) goto L97
            r2.u = r1
            r2.f319822x = r6
            v6l.b1 r5 = (v6l.b1) r5
            mk0.a r4 = r5.f
            v6l.f0 r5 = v6l.b1.Companion
            r5.getClass()
            java.lang.String r5 = "id"
            java.lang.String r6 = "HIDE_DISPOSABLE_PLACEHOLDER"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            tk0.b r5 = new tk0.b
            r5.<init>(r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r4.e(r5, r6, r2)
            if (r2 != r3) goto L8b
            goto L8d
        L8b:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L8d:
            if (r2 != r3) goto L90
            goto L92
        L90:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L92:
            if (r2 != r3) goto L95
        L94:
            return r3
        L95:
            r2 = r1
        L96:
            r1 = r2
        L97:
            v6l.s r2 = r0.f319830b
            r2.a()
            kotlin.jvm.internal.Intrinsics.h(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.p(java.lang.String, e93.e, java.lang.String, java.lang.String, java.lang.String, i93.d, java.util.Set, e93.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(b93.b r19, java.lang.String r20, java.lang.String r21, h93.l0 r22, java.lang.String r23, gim.c r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r24
            boolean r3 = r2 instanceof z6l.m
            if (r3 == 0) goto L19
            r3 = r2
            z6l.m r3 = (z6l.m) r3
            int r4 = r3.f319823w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f319823w = r4
            goto L1e
        L19:
            z6l.m r3 = new z6l.m
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f319823w
            r6 = 1
            if (r5 == 0) goto L36
            if (r5 != r6) goto L2e
            yhm.o.b(r2)
            goto La2
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r2)
            j6l.b r2 = r0.f319829a
            v6l.b1 r2 = (v6l.b1) r2
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r5 = r2.f286424a
            java.lang.String r7 = "cardCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            q6l.l r8 = new q6l.l
            java.lang.String r10 = r1.f13615a
            r15 = 0
            if (r22 == 0) goto L52
            java.lang.String r1 = r22.name()
            r16 = r1
            goto L54
        L52:
            r16 = r15
        L54:
            r9 = 0
            r11 = 0
            r13 = 0
            r12 = r20
            r14 = r21
            r17 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r1 = "CARDS_BRAZIL_EXPANSION"
            r7 = 0
            efm.d0 r1 = r5.issueVirtualCard(r7, r8, r1)
            v6e.d r5 = new v6e.d
            r7 = 16
            r5.<init>(r7)
            v6l.k r7 = new v6l.k
            r8 = 13
            r7.<init>(r8, r5)
            r1.getClass()
            ufm.i r5 = new ufm.i
            r8 = 1
            r5.<init>(r1, r7, r8)
            v6l.w r1 = new v6l.w
            r1.<init>(r12, r2)
            v6l.k r2 = new v6l.k
            r7 = 14
            r2.<init>(r7, r1)
            ufm.i r1 = new ufm.i
            r7 = 0
            r1.<init>(r5, r2, r7)
            java.lang.String r2 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ufm.n r1 = te0.w.i0(r1)
            r3.f319823w = r6
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto La2
            return r4
        La2:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.q(b93.b, java.lang.String, java.lang.String, h93.l0, java.lang.String, gim.c):java.lang.Object");
    }

    public final vkm.d r(b93.d cardScope, boolean z, b93.k sortType) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return rd0.e.b(((b1) this.f319829a).m(cardScope, z, sortType));
    }

    public final vkm.d s(boolean z) {
        return rd0.e.b(((b1) this.f319829a).o.f(Unit.f186387a, z));
    }

    public final ahe.i t() {
        mk0.a aVar = ((b1) this.f319829a).f;
        b1.Companion.getClass();
        Intrinsics.checkNotNullParameter("HIDE_DISPOSABLE_PLACEHOLDER", "id");
        return new ahe.i(oc.c.t(aVar, new tk0.b("HIDE_DISPOSABLE_PLACEHOLDER"), Boolean.FALSE), 17);
    }

    public final vkm.d u(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return rd0.e.b(((b1) this.f319829a).b(cardId));
    }

    public final vkm.d v(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        j6l.a aVar = j6l.b.Companion;
        b1 b1Var = (b1) this.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        return rd0.e.b(b1Var.f286439x.f(token, false));
    }

    public final vkm.d w(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        b1 b1Var = (b1) this.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(b1Var.f286436s.e(cardId, loadingStrategy));
    }

    public final vkm.d x(String cardId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b1 b1Var = (b1) this.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(b1Var.f286437t.e(cardId, loadingStrategy));
    }

    public final vkm.d y() {
        mk0.a aVar = ((b1) this.f319829a).f286427g.f286453a;
        v6l.i.Companion.getClass();
        Intrinsics.checkNotNullParameter("CARDS_SORT_ORDER", "id");
        efm.r map = pw5.a.z(aVar, new tk0.e("CARDS_SORT_ORDER")).map(new v4a.i(28, new v6e.d(8)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof z6l.n
            if (r0 == 0) goto L13
            r0 = r9
            z6l.n r0 = (z6l.n) r0
            int r1 = r0.f319824w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319824w = r1
            goto L18
        L13:
            z6l.n r0 = new z6l.n
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319824w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L81
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            j6l.b r9 = r7.f319829a
            v6l.b1 r9 = (v6l.b1) r9
            r9.getClass()
            java.lang.String r2 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r2 = r9.f286424a
            java.lang.String r4 = "CHARGEBACK_REACTIVATION"
            efm.d0 r2 = r2.reactivateCard(r8, r4)
            v6l.b0 r4 = new v6l.b0
            r5 = 7
            r4.<init>(r5)
            v6l.a0 r5 = new v6l.a0
            r6 = 23
            r5.<init>(r6, r4)
            r2.getClass()
            ufm.i r4 = new ufm.i
            r6 = 1
            r4.<init>(r2, r5, r6)
            v6l.w r2 = new v6l.w
            r5 = 4
            r2.<init>(r9, r8, r5)
            v6l.a0 r8 = new v6l.a0
            r9 = 24
            r8.<init>(r9, r2)
            ufm.i r9 = new ufm.i
            r2 = 0
            r9.<init>(r4, r8, r2)
            java.lang.String r8 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            ufm.n r8 = te0.w.i0(r9)
            r0.f319824w = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            r8 = r9
            h93.f0 r8 = (h93.f0) r8
            v6l.s r8 = r7.f319830b
            r8.a()
            java.lang.String r8 = "also(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z6l.s.z(java.lang.String, gim.c):java.lang.Object");
    }
}
