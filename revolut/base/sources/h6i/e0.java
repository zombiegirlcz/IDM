package h6i;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f149661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5i.d f149662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f149663c;
    public final m6i.j d;
    public final opf.c0 e;
    public final r10.a f;

    public e0(MoveMoneyInputData inputData, w5i.d quoteInteractor, g0 amountValidator, m6i.j moveMoneyAmountPreselectedInfoProvider, opf.c0 suggestionAmountsInteractor, r10.a feeInfoProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(amountValidator, "amountValidator");
        Intrinsics.checkNotNullParameter(moveMoneyAmountPreselectedInfoProvider, "moveMoneyAmountPreselectedInfoProvider");
        Intrinsics.checkNotNullParameter(suggestionAmountsInteractor, "suggestionAmountsInteractor");
        Intrinsics.checkNotNullParameter(feeInfoProvider, "feeInfoProvider");
        this.f149661a = inputData;
        this.f149662b = quoteInteractor;
        this.f149663c = amountValidator;
        this.d = moveMoneyAmountPreselectedInfoProvider;
        this.e = suggestionAmountsInteractor;
        this.f = feeInfoProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(h6i.e0 r18, com.revolut.feature_move_money.api.model.AccountWrapper r19, com.revolut.feature_move_money.api.model.AccountWrapper r20, b6i.j r21, b6i.l r22, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r23, com.revolut.feature_move_money.api.model.OrderMode r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.e0.a(h6i.e0, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, b6i.j, b6i.l, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, com.revolut.feature_move_money.api.model.OrderMode, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature_move_money.api.model.AccountWrapper r17, long r18, boolean r20, boolean r21, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r22, com.revolut.feature_move_money.api.model.OrderMode r23, gim.c r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r24
            boolean r2 = r1 instanceof h6i.v
            if (r2 == 0) goto L17
            r2 = r1
            h6i.v r2 = (h6i.v) r2
            int r3 = r2.f149728w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f149728w = r3
            goto L1c
        L17:
            h6i.v r2 = new h6i.v
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f149728w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L7f
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            h6i.f0 r6 = new h6i.f0
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r1 = r0.f149661a
            com.revolut.shared.feature.move_money.api.navigation.Action r4 = r1.f104833a
            boolean r7 = r4 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.MoveWithFixedAccount
            r8 = 0
            if (r7 == 0) goto L44
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveWithFixedAccount r4 = (com.revolut.shared.feature.move_money.api.navigation.Action.MoveWithFixedAccount) r4
            goto L45
        L44:
            r4 = r8
        L45:
            if (r4 == 0) goto L4f
            long r9 = r4.d
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r13 = r4
            goto L50
        L4f:
            r13 = r8
        L50:
            com.revolut.shared.feature.move_money.api.navigation.Action r1 = r1.f104833a
            boolean r4 = r1 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.MoveWithFixedAccount
            if (r4 == 0) goto L59
            r8 = r1
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveWithFixedAccount r8 = (com.revolut.shared.feature.move_money.api.navigation.Action.MoveWithFixedAccount) r8
        L59:
            r1 = 0
            if (r8 == 0) goto L61
            boolean r4 = r8.f104826g
            if (r4 != 0) goto L61
            r1 = r5
        L61:
            r14 = r1 ^ 1
            r7 = r17
            r8 = r18
            r10 = r20
            r12 = r21
            r11 = r22
            r15 = r23
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15)
            r2.f149728w = r5
            h6i.g0 r1 = r0.f149663c
            h6i.i0 r1 = (h6i.i0) r1
            java.lang.Object r1 = r1.c(r6, r2)
            if (r1 != r3) goto L7f
            return r3
        L7f:
            yqi.d r1 = (yqi.d) r1
            java.util.List r1 = r1.f316033b
            java.lang.Object r1 = zhm.d0.d0(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.e0.b(com.revolut.feature_move_money.api.model.AccountWrapper, long, boolean, boolean, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, com.revolut.feature_move_money.api.model.OrderMode, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r15) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.e0.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow d(long r13, com.revolut.feature_move_money.api.model.AccountWrapper r15, com.revolut.feature_move_money.api.model.AccountWrapper r16, b6i.j r17, b6i.l r18, com.revolut.feature_move_money.api.model.OrderMode r19) {
        /*
            r12 = this;
            r2 = r16
            r8 = r17
            java.lang.String r0 = "sourceAccount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "targetAccount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "currentFocus"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r1 = "mode"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "orderMode"
            r6 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int[] r0 = b6i.k.f12793a
            int r1 = r9.ordinal()
            r0 = r0[r1]
            r1 = 0
            r3 = 1
            if (r0 == r3) goto L44
            r4 = 2
            if (r0 != r4) goto L3e
            b6i.j r0 = b6i.j.BOTTOM
            if (r8 != r0) goto L3c
        L3a:
            r5 = r3
            goto L49
        L3c:
            r5 = r1
            goto L49
        L3e:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L44:
            b6i.j r0 = b6i.j.TOP
            if (r8 != r0) goto L3c
            goto L3a
        L49:
            dj0.d r0 = r15.getBalance()
            xi0.b r10 = r0.f115083b
            dj0.d r0 = r2.getBalance()
            xi0.b r11 = r0.f115083b
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            w5i.d r1 = r12.f149662b
            if (r0 != 0) goto L85
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r10, r11)
            if (r13 != 0) goto L70
            r7 = 0
            r0 = r1
            c8i.z r0 = (c8i.z) r0
            r3 = 1
            r1 = r15
            jhi.b r13 = r0.d(r1, r2, r3, r5, r6, r7)
        L6e:
            r1 = r13
            goto L78
        L70:
            go.g r13 = new go.g
            r14 = 2
            r0 = 0
            r13.<init>(r0, r14)
            goto L6e
        L78:
            h6i.z r0 = new h6i.z
            r5 = r12
            r4 = r15
            r7 = r16
            r2 = r9
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L85:
            r0 = r10
            r4 = r11
            j8l.a r6 = r15.f97224a
            j8l.a r7 = r2.f97224a
            r9 = r1
            c8i.z r9 = (c8i.z) r9
            boolean r0 = r9.g(r6, r7, r0, r4)
            if (r0 == 0) goto Lb0
            r7 = 0
            r0 = r1
            c8i.z r0 = (c8i.z) r0
            r3 = r13
            r1 = r15
            r6 = r19
            jhi.b r13 = r0.d(r1, r2, r3, r5, r6, r7)
            h6i.z r0 = new h6i.z
            r2 = r12
            r1 = r13
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        Lb0:
            h6i.d0 r0 = new h6i.d0
            r10 = 0
            r6 = r12
            r2 = r13
            r5 = r15
            r9 = r16
            r7 = r17
            r1 = r18
            r8 = r19
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10)
            vkm.v1 r13 = new vkm.v1
            r13.<init>(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.e0.d(long, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, b6i.j, b6i.l, com.revolut.feature_move_money.api.model.OrderMode):kotlinx.coroutines.flow.Flow");
    }
}
