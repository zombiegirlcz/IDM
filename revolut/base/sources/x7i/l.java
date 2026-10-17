package x7i;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;
import n7i.k0;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends yji.n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o8l.c f303231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w5i.e f303232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k0 f303233n;
    public final n7i.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f303234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rea.m f303235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v8i.a f303236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MoveMoneyInputData f303237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uc.d f303238t;
    public final q7i.a u;
    public lii.c v;

    public l(o8l.c moveMoneyInteractor, w5i.e moveMoneyScheduleInteractor, k0 statusDialogMapper, n7i.k navigationProvider, q fxOrderInteractorProxy, rea.m pocketDetailsInteractor, v8i.a orderQuoteMapper, MoveMoneyInputData inputData, uc.d firmPriceDevianceDelegate, q7i.a noteDelegate) {
        Intrinsics.checkNotNullParameter(moveMoneyInteractor, "moveMoneyInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyScheduleInteractor, "moveMoneyScheduleInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(fxOrderInteractorProxy, "fxOrderInteractorProxy");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteMapper, "orderQuoteMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(firmPriceDevianceDelegate, "firmPriceDevianceDelegate");
        Intrinsics.checkNotNullParameter(noteDelegate, "noteDelegate");
        this.f303231l = moveMoneyInteractor;
        this.f303232m = moveMoneyScheduleInteractor;
        this.f303233n = statusDialogMapper;
        this.o = navigationProvider;
        this.f303234p = fxOrderInteractorProxy;
        this.f303235q = pocketDetailsInteractor;
        this.f303236r = orderQuoteMapper;
        this.f303237s = inputData;
        this.f303238t = firmPriceDevianceDelegate;
        this.u = noteDelegate;
    }

    @Override // yji.n
    public final void E2() {
        lii.c cVar = this.v;
        if (cVar != null) {
            q2().b(cVar);
        }
        this.v = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature_move_money.api.model.AccountWrapper r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof x7i.g
            if (r0 == 0) goto L13
            r0 = r8
            x7i.g r0 = (x7i.g) r0
            int r1 = r0.f303220x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303220x = r1
            goto L18
        L13:
            x7i.g r0 = new x7i.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303220x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r0.u
            yhm.o.b(r8)
            goto L4b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            com.revolut.feature_move_money.api.model.AccountSource r8 = r7.d
            boolean r2 = r8 instanceof com.revolut.feature_move_money.api.model.AccountSource.NonExistingCurrencyAccount
            if (r2 == 0) goto L76
            x7i.h r2 = new x7i.h
            r4 = 0
            r2.<init>(r6, r8, r4)
            r0.u = r7
            r0.f303220x = r3
            java.lang.Object r8 = do3.q.u(r6, r2, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            eda.e r8 = (eda.e) r8
            io3.d r8 = r8.f124961a
            com.revolut.feature_move_money.api.model.AccountSource$PocketSource r4 = new com.revolut.feature_move_money.api.model.AccountSource$PocketSource
            r4.<init>(r8)
            j8l.a r1 = r7.f97224a
            com.revolut.core.ui_kit.models.Clause r2 = r7.f97225b
            com.revolut.core.ui_kit_core.displayers.image.Image r3 = r7.f97226c
            com.revolut.feature.transfer.core.models.CountryProfile r5 = r7.e
            java.lang.String r7 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            java.lang.String r7 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.lang.String r7 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            java.lang.String r7 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = new com.revolut.feature_move_money.api.model.AccountWrapper
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L76:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x7i.l.Z2(com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r13, com.revolut.shared.feature.move_money.api.model.MoveMoneyReason r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof x7i.i
            if (r0 == 0) goto L13
            r0 = r15
            x7i.i r0 = (x7i.i) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            x7i.i r0 = new x7i.i
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f303224y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            com.revolut.feature_move_money.api.model.AccountWrapper r13 = r0.f303223x
            com.revolut.feature_move_money.api.model.AccountWrapper r14 = r0.f303222w
            yhm.o.b(r15)
            r6 = r12
            goto Lb6
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            com.revolut.feature_move_money.api.model.AccountWrapper r13 = r0.f303222w
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReason r14 = r0.v
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r2 = r0.u
            yhm.o.b(r15)
            r7 = r13
            r5 = r2
        L46:
            r9 = r14
            goto L7a
        L48:
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReason r14 = r0.v
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r13 = r0.u
            yhm.o.b(r15)
            goto L63
        L50:
            yhm.o.b(r15)
            com.revolut.feature_move_money.api.model.AccountWrapper r15 = r13.d
            r0.u = r13
            r0.v = r14
            r0.A = r5
            java.lang.Object r15 = r12.Z2(r15, r0)
            if (r15 != r1) goto L63
        L61:
            r6 = r12
            goto Lb3
        L63:
            com.revolut.feature_move_money.api.model.AccountWrapper r15 = (com.revolut.feature_move_money.api.model.AccountWrapper) r15
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r13.e
            r0.u = r13
            r0.v = r14
            r0.f303222w = r15
            r0.A = r4
            java.lang.Object r2 = r12.Z2(r2, r0)
            if (r2 != r1) goto L76
            goto L61
        L76:
            r5 = r13
            r7 = r15
            r15 = r2
            goto L46
        L7a:
            r8 = r15
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = (com.revolut.feature_move_money.api.model.AccountWrapper) r8
            com.revolut.feature_move_money.api.model.OrderMode r13 = r5.f97401a
            com.revolut.feature_move_money.api.model.AccountWrapper r14 = r5.d
            j8l.a r14 = r14.f97224a
            com.revolut.feature_move_money.api.model.AccountWrapper r15 = r5.e
            j8l.a r15 = r15.f97224a
            q7i.a r2 = r12.u
            r2.getClass()
            boolean r13 = q7i.a.b(r13, r14, r15)
            r14 = 0
            if (r13 == 0) goto L9b
            com.revolut.feature_move_money.api.model.OrderMode r13 = r5.f97401a
            java.lang.String r13 = q7i.a.a(r13)
            r10 = r13
            goto L9c
        L9b:
            r10 = r14
        L9c:
            x7i.j r4 = new x7i.j
            r11 = 0
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.u = r14
            r0.v = r14
            r0.f303222w = r7
            r0.f303223x = r8
            r0.A = r3
            java.lang.Object r15 = do3.q.u(r12, r4, r0)
            if (r15 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            r14 = r7
            r13 = r8
        Lb6:
            j8l.l r15 = (j8l.l) r15
            x7i.f r0 = new x7i.f
            r0.<init>(r14, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x7i.l.b3(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo, com.revolut.shared.feature.move_money.api.model.MoveMoneyReason, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, x7i.f] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, java.lang.String, lii.c, n7i.h, x7i.f] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r32v0, types: [x7i.l, yji.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.revolut.feature_move_money.api.model.AccountSource$InvestCashHolding] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r33, java.lang.String r34, boolean r35, com.revolut.shared.feature.move_money.api.model.MoveMoneyReason r36, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r37, gim.c r38) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x7i.l.c3(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo, java.lang.String, boolean, com.revolut.shared.feature.move_money.api.model.MoveMoneyReason, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, gim.c):java.lang.Object");
    }
}
