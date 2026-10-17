package zq;

import ad.q;
import cfl.s;
import cfl.u;
import ch.qos.logback.core.CoreConstants;
import com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase;
import com.revolut.core.currency.impl.services.CurrenciesConfigService;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreenContract$InputData;
import com.revolut.feature.passcode.R$string;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoApi$Toggles$PayWithPhoto;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreen;
import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.mdm.ServiceState;
import csj.j;
import defpackage.o0;
import defpackage.u0;
import defpackage.v;
import defpackage.v1;
import dp4.p;
import efm.r;
import ewh.x;
import hd.o;
import hmf.c0;
import ibd.h;
import ibd.i;
import ind.a0;
import ind.b0;
import io3.l;
import java.math.BigDecimal;
import java.security.GeneralSecurityException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import skm.p0;
import te0.w;
import tof.a3;
import tof.j5;
import tof.k;
import tof.l0;
import tof.o3;
import tof.q7;
import tof.v5;
import tof.w5;
import tof.x1;
import tof.y6;
import tof.z6;
import vge.z2;
import vkm.j2;
import vkm.q0;
import wl0.f;
import wl0.g;
import wsg.n;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements zp0.c, zl0.a, ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f324335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f324336c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f324334a = i;
        this.f324335b = obj2;
        this.f324336c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1 A[Catch: all -> 0x002b, TRY_ENTER, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x0026, B:49:0x00c0, B:46:0x00b1), top: B:75:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(zq.a r10, com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.c(zq.a, com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(zq.a r4, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof eie.d
            if (r0 == 0) goto L13
            r0 = r6
            eie.d r0 = (eie.d) r0
            int r1 = r0.f126593x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126593x = r1
            goto L18
        L13:
            eie.d r0 = new eie.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126593x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r5 = r0.u
            yhm.o.b(r6)
            goto L5a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            if (r5 != 0) goto L37
            goto L73
        L37:
            java.lang.Object r4 = r4.f324336c
            vge.d r4 = (vge.d) r4
            r0.u = r5
            r0.f126593x = r3
            vge.x r4 = (vge.x) r4
            r4.getClass()
            c8g.a.c(r5)
            com.revolut.feature.tab.accounts.models.ProductId r6 = r5.getF89727a()
            pfe.b r4 = r4.h(r6)
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r5.getF89728b()
            java.lang.Object r6 = r4.n(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            com.revolut.feature.slot_manager.api.model.SlotContext r6 = (com.revolut.feature.slot_manager.api.model.SlotContext) r6
            if (r6 == 0) goto L5f
            return r6
        L5f:
            com.revolut.feature.tab.accounts.models.ProductId r4 = r5.getF89727a()
            int[] r6 = eie.c.f126591a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r3) goto L7b
            r6 = 2
            if (r4 == r6) goto L78
            r6 = 3
            if (r4 == r6) goto L75
        L73:
            r4 = 0
            return r4
        L75:
            akd.s r4 = akd.s.HOME
            goto L7d
        L78:
            akd.s r4 = akd.s.JUNIOR
            goto L7d
        L7b:
            akd.s r4 = akd.s.HOME
        L7d:
            com.revolut.feature.tab.accounts.models.ProductId r6 = com.revolut.feature.tab.accounts.models.ProductId.YOUTH
            java.util.Set r6 = zhm.y0.b(r6)
            com.revolut.feature.tab.accounts.models.ProductId r0 = r5.getF89727a()
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L98
            com.revolut.feature.tab.accounts.models.ProductAccountId r5 = r5.getF89728b()
            java.lang.String r5 = r5.f89729a
            java.util.Set r5 = zhm.y0.b(r5)
            goto L9a
        L98:
            zhm.h0 r5 = zhm.h0.f322473a
        L9a:
            com.revolut.feature.slot_manager.api.model.SlotContext r6 = new com.revolut.feature.slot_manager.api.model.SlotContext
            r6.<init>(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.d(zq.a, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(h02.c r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof j82.c
            if (r0 == 0) goto L13
            r0 = r8
            j82.c r0 = (j82.c) r0
            int r1 = r0.f172086y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172086y = r1
            goto L18
        L13:
            j82.c r0 = new j82.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f172084w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172086y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            z92.i r7 = r0.v
            yhm.o.b(r8)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            h02.c r7 = r0.u
            yhm.o.b(r8)
            goto L54
        L3a:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f324335b
            m72.a r8 = (m72.a) r8
            r0.u = r7
            r0.f172086y = r4
            m72.k r8 = (m72.k) r8
            x92.j r8 = r8.f203294a
            java.lang.String r2 = r7.f148181b
            java.lang.String r4 = r7.f148182c
            java.lang.Object r8 = r8.h(r2, r4, r0)
            if (r8 != r1) goto L54
            goto L70
        L54:
            z92.j r8 = (z92.j) r8
            boolean r2 = r8 instanceof z92.i
            if (r2 == 0) goto L71
            j82.b r2 = new j82.b
            r4 = 1
            r5 = 0
            r2.<init>(r6, r7, r5, r4)
            r0.u = r5
            r7 = r8
            z92.i r7 = (z92.i) r7
            r0.v = r7
            r0.f172086y = r3
            java.lang.Object r7 = r6.C(r2, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.A(h02.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(com.revolut.feature_move_money.api.model.AccountWrapper r5, c7i.q r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof c7i.e
            if (r0 == 0) goto L13
            r0 = r7
            c7i.e r0 = (c7i.e) r0
            int r1 = r0.f22001w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22001w = r1
            goto L18
        L13:
            c7i.e r0 = new c7i.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22001w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            if (r5 == 0) goto L4a
            java.lang.String r7 = "position"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            b7i.c r7 = new b7i.c
            r7.<init>(r6)
            boolean r6 = r7.a(r5)
            if (r6 == 0) goto L4a
            c7i.m r6 = new c7i.m
            r6.<init>(r5)
            return r6
        L4a:
            java.lang.Object r5 = r4.f324336c
            wsg.n r5 = (wsg.n) r5
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r5 = r5.x(r6)
            r0.f22001w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            xi0.b r7 = (xi0.b) r7
            c7i.n r5 = new c7i.n
            kotlin.jvm.internal.Intrinsics.h(r7)
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.B(com.revolut.feature_move_money.api.model.AccountWrapper, c7i.q, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(kotlin.jvm.functions.Function1 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j82.d
            if (r0 == 0) goto L13
            r0 = r6
            j82.d r0 = (j82.d) r0
            int r1 = r0.f172087w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172087w = r1
            goto L18
        L13:
            j82.d r0 = new j82.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172087w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.f172087w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L47
            return r1
        L3d:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
        L47:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.C(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public String D(a3 transaction) {
        w5 w5Var;
        w5 w5Var2;
        BigDecimal bigDecimal;
        gte.a aVar = (gte.a) this.f324335b;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        y6 y6Var = transaction.e;
        y6 y6Var2 = transaction.e;
        w5 w5Var3 = transaction.f272624y;
        k kVar = transaction.T0;
        String str = transaction.f272611s;
        v5 v5Var = transaction.f272618v1;
        x1 x1Var = transaction.f272585c1;
        switch (c0.f153728a[y6Var.ordinal()]) {
            case 1:
                return kt5.b.a(transaction) ? "FUTURES_COLLATERAL" : k71.k.R(transaction) ? "SAVINGS" : k71.k.n0(transaction) ? "SUBACCOUNT" : k71.k.t(transaction) ? "CRYPTO_COMMODITY_EXCHANGE" : k71.k.f(transaction) ? "FALLBACK" : k71.k.A(transaction) ? "REVX_TRANSFER" : "EXCHANGE";
            case 2:
                return "COLLECTION_EXCHANGE";
            case 3:
            case 4:
            case 5:
                Set set = k71.k.f181789a;
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                return transaction.P0 != null ? "CREDIT_CARD_PRE_PURCHASE" : k71.k.s0(transaction) ? "CARD_AUTH" : k71.k.p(transaction) ? "CREDIT_CARD_CARD" : "CARD";
            case 6:
                return "CASHBACK";
            case 7:
                return "FREELANCER_MERCHANT_CASHBACK";
            case 8:
            default:
                return "FALLBACK";
            case 9:
                Set set2 = k71.k.f181789a;
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                y6 y6Var3 = y6.REWARD;
                if (y6Var2 == y6Var3 && w5Var3.f273144b == l.LOCKED_GIFT) {
                    return "CRYPTO_GIFT_REWARD";
                }
                if (k71.k.o1(transaction)) {
                    return "CRYPTO_STAKING_REWARD";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                return (y6Var2 == y6Var3 && transaction.L0 != null && transaction.P1 == null) ? "CRYPTO_REFERRAL_REWARD" : transaction.f0 ? "SAVINGS_REWARD" : k71.k.E0(transaction) ? "DOXGETY_REWARD" : k71.k.z(transaction) ? "SAVINGS_INTEREST" : k71.k.k1(transaction) ? "SALARY_BONUS" : "CASHBACK";
            case 10:
                if (kt5.b.a(transaction)) {
                    return "FUTURES_COLLATERAL";
                }
                if (kt5.b.d(transaction)) {
                    return "FUTURES_FUNDING";
                }
                if (k71.k.m1(transaction) || k71.k.x1(transaction)) {
                    return "CRYPTO_STAKING";
                }
                if (k71.k.v1(transaction) || k71.k.w1(transaction)) {
                    return "CRYPTO_UNSTAKING_LOCKUP";
                }
                if (k71.k.m(transaction)) {
                    return "CASHBACK";
                }
                if (k71.k.z(transaction)) {
                    return "SAVINGS_INTEREST";
                }
                if (k71.k.R(transaction)) {
                    return "SAVINGS";
                }
                if (k71.k.p(transaction)) {
                    return "CREDIT_TRANSFER";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (k71.k.b1(transaction)) {
                    return "PAY_LATER_TRANSFER";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                z6 z6Var = transaction.H;
                if (((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == l.INSTALMENT) {
                    return "PAY_LATER_TRANSFER";
                }
                if (k71.k.n0(transaction) && k71.k.U0(transaction)) {
                    return "SUBACCOUNT";
                }
                j5 j5Var = transaction.f272605o1;
                if (j5Var != null && x1Var == x1.UPI) {
                    return "P2M_PAYMENT";
                }
                if (j5Var != null && v5Var == v5.AANI) {
                    return "P2M_PAYMENT";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (x1Var == x1.NPP || x1Var == x1.NPP_OSKO || x1Var == x1.NPP_SINGLE_CREDIT_TRANSFER) {
                    i iVar = transaction.C;
                    if ((iVar != null ? iVar.getType() : null) == h.EXTERNAL_MANDATE) {
                        return "APM_PAY_TO";
                    }
                }
                if (k71.k.j1(transaction)) {
                    return "ROBO";
                }
                if (k71.k.B0(transaction) || k71.k.C0(transaction)) {
                    return "REVX_TRANSFER";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                x1[] elements = {x1.TAPI, x1.TAPI_CO};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (d0.T(kotlin.collections.d.y0(elements), x1Var)) {
                    return "BILLS_TRANSFER";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (x1Var == x1.BPAY) {
                    return "BILLS_TRANSFER";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (v5Var == v5.NZ_BILLS || d0.T(y0.b(x1.F24), x1Var)) {
                    return "BILLS_TRANSFER";
                }
                if (k71.k.d1(transaction)) {
                    return "PIX_TRANSFER";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (kVar != null) {
                    return "APM_TRANSFER";
                }
                if (x1Var == x1.PSE) {
                    return "PSE_TRANSFER";
                }
                if (k71.k.j0(transaction)) {
                    return "PAYMENT_LINK";
                }
                if (k71.k.f1(transaction)) {
                    return "PUSH_TO_CARD";
                }
                if (k71.k.l0(transaction) != null) {
                    return "P2P_TRANSFER";
                }
                if (!k71.k.P(transaction) && !k71.k.X(transaction)) {
                    return k71.k.k0(transaction) ? "BANK_TRANSFER" : "FALLBACK";
                }
                jte.d dVar = (jte.d) aVar;
                return (dVar.c(TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty.f91961c) || dVar.c(TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager.f91960c)) ? "LOYALTY" : "BANK_TRANSFER";
            case 11:
                return "SAVINGS_INTEREST";
            case 12:
                q7 q7Var = kt5.b.f189500a;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                if (y6Var != y6.DERIVATIVE_PNL) {
                    return "FALLBACK";
                }
                Enum r06 = w5Var3.f273144b;
                Enum r110 = l.COLLATERAL;
                if (r06 == r110) {
                    return "FUTURES_REALIZED_PNL";
                }
                o3 o3Var = transaction.J;
                if (o3Var != null && (w5Var2 = o3Var.f272966b) != null) {
                    enum = w5Var2.f273144b;
                }
                return enum == r110 ? "FUTURES_REALIZED_PNL" : "FALLBACK";
            case 13:
                return "CRYPTO_WITHDRAW";
            case 14:
                if (k71.k.y0(transaction)) {
                    return "CRYPTO_DEPOSIT";
                }
                if (k71.k.s1(transaction)) {
                    return "CRYPTO_STAKING";
                }
                if (k71.k.B0(transaction) || k71.k.C0(transaction)) {
                    return "REVX_TRANSFER";
                }
                boolean zG = ((o8b.c) ((n8b.a) this.f324336c)).g();
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (zG) {
                    xi0.b bVar = transaction.k.f115083b;
                    xi0.b.Companion.getClass();
                    if (!Intrinsics.f(bVar, xi0.b.E) && y6Var == y6.TOPUP) {
                        return "INDIAN_MCY_TOP_UP";
                    }
                }
                return kVar != null ? "APM_TRANSFER" : "TOP_UP";
            case 15:
            case 16:
                return "TOP_UP";
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return "P2M_PAYMENT";
            case 22:
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                return transaction.B0 != null ? "DONATION" : k71.k.h1(transaction) ? "PAY_WITH_REVOLUT_AUTH" : "PAY_WITH_REVOLUT";
            case 23:
                return "PAY_WITH_REVOLUT";
            case 24:
            case 25:
                return "FREELANCER_MERCHANT_PAYMENT";
            case 26:
                return "REVX_EXCHANGE";
            case 27:
                return kt5.b.a(transaction) ? "FUTURES_COLLATERAL" : "REVX_TRANSFER";
            case 28:
            case 29:
            case 30:
                return "REFUND";
            case 31:
                return "FREELANCER_MERCHANT_REFUND";
            case 32:
            case 33:
                return k71.k.L0(transaction) ? "IOF_TAX" : "TAX";
            case 34:
            case 35:
            case 36:
            case 37:
                if (kt5.b.c(transaction)) {
                    return "FUTURES_TRADING_FEE";
                }
                if (k71.k.p(transaction)) {
                    return "CREDIT_FEE";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (Intrinsics.f(str, "credit_card_monthly_admin_fee")) {
                    return "CREDIT_FEE";
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                return Intrinsics.f(str, "credit_card_late_payment_fee") ? "CREDIT_FEE" : "FEE";
            case 38:
                return "OTP_REFUND";
            case 39:
                return "OTP_PAYMENT";
            case 40:
            case 41:
                return "LOAN_PAYMENT";
            case 42:
                return "LOAN_DISBURSAL";
            case 43:
                return transaction.O0 != null ? "CREDIT_CARD_STATEMENT_FINANCING_INTEREST" : "CREDIT_INTEREST";
            case 44:
                return "DEFI_EXCHANGE";
            case 45:
                return "DEFI_DEPOSIT";
            case 46:
                l0 l0Var = transaction.Q1;
                return (l0Var == null || (bigDecimal = l0Var.f272897c.f272777a) == null || bigDecimal.signum() != -1) ? "FALLBACK" : "DEFI_WITHDRAW";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (x(r13, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(java.lang.String r13, dl8.d r14, gim.c r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof jl8.i
            if (r0 == 0) goto L13
            r0 = r15
            jl8.i r0 = (jl8.i) r0
            int r1 = r0.f175652x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175652x = r1
            goto L18
        L13:
            jl8.i r0 = new jl8.i
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175652x
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r15)
            goto L80
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            java.lang.String r13 = r0.u
            yhm.o.b(r15)
            goto L75
        L3c:
            java.lang.String r13 = r0.u
            yhm.o.b(r15)
            goto L6a
        L42:
            yhm.o.b(r15)
            java.lang.Object r15 = r12.f324335b
            r7 = r15
            fl8.d r7 = (fl8.d) r7
            r0.u = r13
            r0.f175652x = r5
            r7.getClass()
            fl8.b r6 = new fl8.b
            r11 = 1
            r8 = r13
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r6, r0)
            if (r13 != r1) goto L64
            goto L66
        L64:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L66:
            if (r13 != r1) goto L69
            goto L7f
        L69:
            r13 = r8
        L6a:
            r0.u = r13
            r0.f175652x = r4
            java.lang.Object r14 = r12.w(r0)
            if (r14 != r1) goto L75
            goto L7f
        L75:
            r0.u = r10
            r0.f175652x = r3
            java.lang.Object r13 = r12.x(r13, r0)
            if (r13 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.E(java.lang.String, dl8.d, gim.c):java.lang.Object");
    }

    public s4j.c F(String iban, BankFieldDefinition definition, Boolean bool) {
        Intrinsics.checkNotNullParameter(iban, "input");
        Intrinsics.checkNotNullParameter(definition, "definition");
        if (iban.length() == 0) {
            return s4j.c.Empty;
        }
        if (!((zzl.c) ((zzl.b) this.f324336c)).a(definition.f60272b, iban)) {
            return Intrinsics.f(bool, Boolean.TRUE) ? s4j.c.InvalidFilled : iban.equals(definition.e) ? s4j.c.Empty : s4j.c.Invalid;
        }
        if (definition.k) {
            usc.a aVar = (usc.a) this.f324335b;
            Intrinsics.checkNotNullParameter(iban, "iban");
            if (!((dnm.a) aVar.f282889b).b(iban)) {
                return s4j.c.InvalidFilled;
            }
        }
        return s4j.c.Valid;
    }

    @Override // zl0.a
    public g a() {
        return new g((String) this.f324335b, ((fe9.e) this.f324336c).d.b(new TextLocalisedClause(R$string.biometric_prompt_cancel, null, null, 14)).toString(), false);
    }

    @Override // zl0.a
    public f b() {
        String str = (String) this.f324335b;
        fe9.e eVar = (fe9.e) this.f324336c;
        String string = eVar.d.b(new TextLocalisedClause(R$string.biometric_prompt_error_auth, null, null, 14)).toString();
        String string2 = eVar.d.b(new TextLocalisedClause(R$string.biometric_prompt_error_locked, null, null, 14)).toString();
        PinCodeView pinCodeView = eVar.f134480j;
        if (pinCodeView != null) {
            return new f(str, string, string2, pinCodeView.getFingerprintLabel());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public TextLocalisedClause e() {
        return ((efj.d) ((cej.b) this.f324336c)).a() ? new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_widget_title_mobile_plans, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_widget_title, null, null, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (x(r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jl8.f
            if (r0 == 0) goto L13
            r0 = r9
            jl8.f r0 = (jl8.f) r0
            int r1 = r0.f175647x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175647x = r1
            goto L18
        L13:
            jl8.f r0 = new jl8.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175647x
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r9)
            goto L7d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L72
        L3c:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L67
        L42:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f324335b
            fl8.d r9 = (fl8.d) r9
            r0.u = r8
            r0.f175647x = r6
            r9.getClass()
            etj.l r2 = new etj.l
            r6 = 21
            r2.<init>(r9, r8, r3, r6)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L62
            goto L64
        L62:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L64:
            if (r9 != r1) goto L67
            goto L7c
        L67:
            r0.u = r8
            r0.f175647x = r5
            java.lang.Object r9 = r7.w(r0)
            if (r9 != r1) goto L72
            goto L7c
        L72:
            r0.u = r3
            r0.f175647x = r4
            java.lang.Object r8 = r7.x(r8, r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.f(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(h02.c r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof j82.a
            if (r0 == 0) goto L13
            r0 = r8
            j82.a r0 = (j82.a) r0
            int r1 = r0.f172081y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172081y = r1
            goto L18
        L13:
            j82.a r0 = new j82.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f172079w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172081y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            z92.i r7 = r0.v
            yhm.o.b(r8)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            h02.c r7 = r0.u
            yhm.o.b(r8)
            goto L56
        L3a:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f324335b
            m72.a r8 = (m72.a) r8
            r0.u = r7
            r0.f172081y = r4
            m72.k r8 = (m72.k) r8
            x92.j r8 = r8.f203294a
            java.lang.String r2 = r7.f148181b
            java.lang.String r4 = r7.f
            java.lang.String r5 = r7.f148182c
            java.lang.Object r8 = r8.a(r2, r4, r5, r0)
            if (r8 != r1) goto L56
            goto L72
        L56:
            z92.j r8 = (z92.j) r8
            boolean r2 = r8 instanceof z92.i
            if (r2 == 0) goto L73
            j82.b r2 = new j82.b
            r4 = 0
            r5 = 0
            r2.<init>(r6, r7, r5, r4)
            r0.u = r5
            r7 = r8
            z92.i r7 = (z92.i) r7
            r0.v = r7
            r0.f172081y = r3
            java.lang.Object r7 = r6.C(r2, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.g(h02.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (x(r13, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r13, dl8.d r14, gim.c r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof jl8.g
            if (r0 == 0) goto L13
            r0 = r15
            jl8.g r0 = (jl8.g) r0
            int r1 = r0.f175649x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175649x = r1
            goto L18
        L13:
            jl8.g r0 = new jl8.g
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175649x
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r15)
            goto L80
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            java.lang.String r13 = r0.u
            yhm.o.b(r15)
            goto L75
        L3c:
            java.lang.String r13 = r0.u
            yhm.o.b(r15)
            goto L6a
        L42:
            yhm.o.b(r15)
            java.lang.Object r15 = r12.f324335b
            r7 = r15
            fl8.d r7 = (fl8.d) r7
            r0.u = r13
            r0.f175649x = r5
            r7.getClass()
            fl8.b r6 = new fl8.b
            r11 = 0
            r8 = r13
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r6, r0)
            if (r13 != r1) goto L64
            goto L66
        L64:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L66:
            if (r13 != r1) goto L69
            goto L7f
        L69:
            r13 = r8
        L6a:
            r0.u = r13
            r0.f175649x = r4
            java.lang.Object r14 = r12.w(r0)
            if (r14 != r1) goto L75
            goto L7f
        L75:
            r0.u = r10
            r0.f175649x = r3
            java.lang.Object r13 = r12.x(r13, r0)
            if (r13 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.h(java.lang.String, dl8.d, gim.c):java.lang.Object");
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object... objArr) {
        u0 u0Var = (u0) this.f324336c;
        int i = o0.f221096a[taskEvent.ordinal()];
        if (i == 1) {
            u0Var.d = (ITask) objArr[0];
            u0Var.notifyMonitor(TaskEvent.FAILED, this);
            return;
        }
        if (i != 2) {
            return;
        }
        if (objArr != null && objArr.length > 0) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                u0Var.I.remove((BinaryUpdate) this.f324335b);
                list.addAll(u0Var.I);
                u0Var.I = list;
            }
        }
        if (!u0Var.K.isEmpty()) {
            BinaryUpdate binaryUpdate = (BinaryUpdate) u0Var.K.poll();
            v1.a("download " + binaryUpdate.getCfg().getLabel());
            u0Var.b(ServiceState.DOWNLOAD_BINARY, binaryUpdate.getCfg(), Integer.valueOf(u0Var.K.size()));
            new v(u0Var.H, binaryUpdate, u0Var.J).execute(new a(u0Var, binaryUpdate));
            return;
        }
        LinkedList linkedList = new LinkedList();
        List list2 = u0Var.I;
        if (list2 != null && !list2.isEmpty()) {
            u0.c(linkedList, u0Var.I, 0);
            u0.c(linkedList, u0Var.I, 10);
            u0.c(linkedList, u0Var.I, 8);
            u0.c(linkedList, u0Var.I, 7);
            u0.c(linkedList, u0Var.I, 12);
            u0.c(linkedList, u0Var.I, 4);
            u0.c(linkedList, u0Var.I, 5);
            u0.c(linkedList, u0Var.I, 11);
            linkedList.addAll(u0Var.I);
            v1.a("will upload " + linkedList.size() + " binaries");
        }
        u0Var.K = linkedList;
        u0Var.d();
    }

    public void i(xi0.b currency, Collection targetCollection) {
        fd0.d dVar = (fd0.d) this.f324336c;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        String str = currency.f306286a;
        targetCollection.add(cp5.d.z(currency) ? cp5.d.K(currency) : str);
        String strA = (String) dVar.c(str);
        if (strA == null && (strA = ((t70.b) this.f324335b).a(currency)) != null) {
            dVar.d(str, strA);
        }
        if (strA != null) {
            targetCollection.add(strA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.j(com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct, gim.c):java.lang.Object");
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        if (z) {
            j2 j2Var = ((SetCategoryBudgetsScreen) this.f324335b).f101552b0;
            j jVar = new j((CategoryBudgetEditingInfo) this.f324336c, extractedValue);
            j2Var.getClass();
            j2Var.g(null, jVar);
        }
    }

    public ufm.i l(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        ufm.i iVar = new ufm.i(w.o0(p0.f264003c, new a01.e(this, null, 17)), new a9j.j(new acb.f(juniorId, this, 8), 15), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public dj0.d m(ind.e current, ind.e eVar, boolean z) {
        long j2;
        long j3;
        lnd.p0 p0Var = (lnd.p0) this.f324336c;
        Intrinsics.checkNotNullParameter(current, "current");
        b0 b0VarD = current.D();
        b0 b0VarD2 = eVar != null ? eVar.D() : null;
        if ((b0VarD instanceof a0) && (b0VarD2 instanceof a0)) {
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalA = current.a();
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalA2 = eVar.a();
            List list = ((a0) b0VarD).f162787a;
            he3.j jVarB = lnd.p0.b(p0Var, list);
            if (jVarB != null) {
                dj0.d dVarA = jVarB.f151564b;
                he3.j jVarB2 = lnd.p0.b(p0Var, ((a0) b0VarD2).f162787a);
                if (jVarB2 != null) {
                    dj0.d dVarA2 = jVarB2.f151564b;
                    if (z) {
                        dVarA = dVarA.a();
                    }
                    if (z) {
                        dVarA2 = dVarA2.a();
                    }
                    LocalDate localDateE = ((l80.f) ((l80.e) this.f324335b)).e();
                    LocalDate localDate = analyticsSpendingPeriod$IntervalA.f99210a;
                    if (localDateE.compareTo((Object) analyticsSpendingPeriod$IntervalA.f99211b) > 0 || localDateE.compareTo((Object) localDate) < 0) {
                        j2 = dVarA.f115082a;
                        j3 = dVarA2.f115082a;
                    } else {
                        long jBetween = ChronoUnit.DAYS.between(analyticsSpendingPeriod$IntervalA.f99210a, localDateE);
                        LocalDate localDate2 = analyticsSpendingPeriod$IntervalA2.f99210a;
                        Comparable comparableD = kotlin.ranges.f.d(localDate2.plusDays(jBetween), analyticsSpendingPeriod$IntervalA2.f99211b);
                        Intrinsics.checkNotNullExpressionValue(comparableD, "coerceAtMost(...)");
                        vim.e eVarB = vim.i.b(localDate2, comparableD);
                        j3 = 0;
                        for (Map.Entry entry : jVarB2.f151565c.entrySet()) {
                            org.joda.time.LocalDate localDate3 = (org.joda.time.LocalDate) entry.getKey();
                            he3.i iVar = (he3.i) entry.getValue();
                            if (eVarB.contains(jli.b.e(localDate3))) {
                                long jAbs = iVar.f151561a;
                                if (z) {
                                    jAbs = Math.abs(jAbs);
                                }
                                j3 += jAbs;
                            }
                        }
                        j2 = dVarA.f115082a;
                    }
                    return new dj0.d(j2 - j3, ((he3.j) d0.b0(list)).f151564b.f115083b);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof et6.x1
            if (r0 == 0) goto L13
            r0 = r9
            et6.x1 r0 = (et6.x1) r0
            int r1 = r0.f129368x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129368x = r1
            goto L18
        L13:
            et6.x1 r0 = new et6.x1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129368x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L67
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            if (r8 == 0) goto L85
            java.lang.Object r9 = r7.f324335b
            nd1.c r9 = (nd1.c) r9
            r2 = 0
            efm.r r9 = r9.c(r2)
            vkm.d r9 = rd0.e.b(r9)
            en6.a r2 = new en6.a
            r5 = 23
            r2.<init>(r5)
            jhi.b r9 = mo3.a.g(r9, r4, r2, r3)
            eob.e r2 = new eob.e
            r5 = 3
            r6 = 6
            r2.<init>(r5, r6, r4)
            zhm.h0 r5 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r9, r5, r2)
            r0.u = r8
            r0.f129368x = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L6d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r9.next()
            r1 = r0
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r1 = (com.revolut.feature.acquiring.lite_pos.api.model.TaxRate) r1
            java.lang.String r1 = r1.f60694a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r8)
            if (r1 == 0) goto L6d
            r4 = r0
        L83:
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r4 = (com.revolut.feature.acquiring.lite_pos.api.model.TaxRate) r4
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.n(java.lang.String, gim.c):java.lang.Object");
    }

    public r o() {
        kpj.f fVar = (kpj.f) this.f324335b;
        oyc.c cVar = (oyc.c) fVar.f188258b;
        r map = m70.a.g(nim.a.w(cVar.e.f(Unit.f186387a, true), new oyc.a(cVar, 0)), null, null, 3).distinctUntilChanged().map(new ey7.a(new x(19), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        x xVar = new x(20);
        h0 h0Var = h0.f322473a;
        return nim.a.w(u1.d(pd.b.r(ue0.e.y(map, h0Var, xVar), new ezc.a(this, 0)), zi0.c.F(ue0.e.q(nim.a.w(fVar.l(), new x(15)), h0Var), f0.f322471a)), new x(this, 18));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r7, k1j.a r8, c7i.q r9, c7i.o r10, c7i.o r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.p(java.lang.String, k1j.a, c7i.q, c7i.o, c7i.o, gim.c):java.lang.Object");
    }

    public fkg.a q() {
        return (fkg.a) this.f324336c;
    }

    public jcm.a r() {
        return (jcm.a) this.f324335b;
    }

    public boolean s() {
        if (!((jte.d) ((gte.a) this.f324335b)).c(PayWithPhotoApi$Toggles$PayWithPhoto.f78941c)) {
            return false;
        }
        cw9.d dVar = (cw9.d) this.f324336c;
        zjh.f fVar = dVar.f109573b;
        Intrinsics.checkNotNullParameter("TRANSFER.bank_transfer", "featureCode");
        return ((jla.h) fVar.f322835b).d("TRANSFER.bank_transfer", null) == bla.c.ENABLED && dVar.f109574c.J();
    }

    public Flow t() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ivg.b bVar = (ivg.b) this.f324335b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(bVar.d.b(Unit.f186387a, loadingStrategy), new hs4.l(this, 25));
    }

    public String toString() {
        switch (this.f324334a) {
            case 28:
                return "Request{url=" + ((jcm.a) this.f324335b) + CoreConstants.CURLY_RIGHT;
            default:
                return super.toString();
        }
    }

    public vkm.d u(String juniorId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        fl8.d dVar = (fl8.d) this.f324335b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return dVar.d.b(juniorId, loadingStrategy);
    }

    public a6e.b v(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return new a6e.b(new q0(new vkm.v1(new p(this, descriptor, (Continuation) null, 16)), new cyc.c(2, (z2) this.f324335b, z2.class, "notifySlotContextChanged", "notifySlotContextChanged(Lcom/revolut/feature/slot_manager/api/model/SlotContext;)V", 4, 17), 1), 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jl8.h
            if (r0 == 0) goto L13
            r0 = r5
            jl8.h r0 = (jl8.h) r0
            int r1 = r0.f175650w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175650w = r1
            goto L18
        L13:
            jl8.h r0 = new jl8.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175650w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L46
        L27:
            r5 = move-exception
            goto L49
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f324336c     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            hj8.a r5 = (hj8.a) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f175650w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            nj8.n r5 = (nj8.n) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 0
            java.lang.Object r5 = r5.n(r2, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L53
        L49:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
        L53:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.a.w(gim.c):java.lang.Object");
    }

    public Object x(String str, gim.c cVar) {
        Object objD = ((fl8.d) this.f324335b).d.d(str, true, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    public void y(o oVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f324335b;
        hd.p pVar = new hd.p(oVar.f151358a, id.g.class);
        if (!map.containsKey(pVar)) {
            map.put(pVar, oVar);
            return;
        }
        o oVar2 = (o) map.get(pVar);
        if (oVar2.equals(oVar) && oVar.equals(oVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + pVar);
    }

    public void z(q qVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f324336c;
        if (qVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsB = qVar.b();
        if (!map.containsKey(clsB)) {
            map.put(clsB, qVar);
            return;
        }
        q qVar2 = (q) map.get(clsB);
        if (!qVar2.equals(qVar) || !qVar.equals(qVar2)) {
            throw new GeneralSecurityException(a0.d.l(clsB, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
        }
    }

    public a(u0 u0Var, BinaryUpdate binaryUpdate) {
        this.f324334a = 20;
        this.f324335b = binaryUpdate;
        this.f324336c = u0Var;
    }

    public a(ixe.g nextButtonMapper, ixe.b footerMapper) {
        this.f324334a = 26;
        Intrinsics.checkNotNullParameter(nextButtonMapper, "nextButtonMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f324335b = nextButtonMapper;
        this.f324336c = footerMapper;
    }

    public a(z80.b phoneToolsProvider, zzl.b regexMatcher) {
        this.f324334a = 7;
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f324335b = phoneToolsProvider;
        this.f324336c = regexMatcher;
    }

    public a(gte.a featureToggleInteractor, cw9.d paymentsProductFeatureChecker) {
        this.f324334a = 10;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f324335b = featureToggleInteractor;
        this.f324336c = paymentsProductFeatureChecker;
    }

    public a(t70.b currencyLocalization) {
        this.f324334a = 2;
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        this.f324335b = currencyLocalization;
        this.f324336c = new fd0.d(20);
    }

    public a(usc.a ibanValidator, zzl.b regexMatcher) {
        this.f324334a = 3;
        Intrinsics.checkNotNullParameter(ibanValidator, "ibanValidator");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f324335b = ibanValidator;
        this.f324336c = regexMatcher;
    }

    public a(CurrenciesConfigService service, b9b.a currencyConfigProvider, ae0.b mapper) {
        this.f324334a = 4;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(currencyConfigProvider, "currencyConfigProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f324335b = service;
        this.f324336c = mapper;
    }

    public a(m72.a sdkInteractor, l72.f interactor) {
        this.f324334a = 27;
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f324335b = sdkInteractor;
        this.f324336c = interactor;
    }

    public a(ate.e interactor, grb.a appTipsProvider) {
        this.f324334a = 11;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(appTipsProvider, "appTipsProvider");
        this.f324335b = interactor;
        this.f324336c = appTipsProvider;
    }

    public a(e8j.b aboutMapper, f80.a uriHelper) {
        this.f324334a = 12;
        Intrinsics.checkNotNullParameter(aboutMapper, "aboutMapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f324335b = aboutMapper;
        this.f324336c = uriHelper;
    }

    public a(ybl.j tradingAccountProductGroupOnboardingStateInteractor) {
        this.f324334a = 21;
        Intrinsics.checkNotNullParameter(tradingAccountProductGroupOnboardingStateInteractor, "tradingAccountProductGroupOnboardingStateInteractor");
        this.f324335b = tradingAccountProductGroupOnboardingStateInteractor;
        u[] elements = {cfl.q.f23747a, s.f23749a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f324336c = kotlin.collections.d.y0(elements);
    }

    public a(gej.a bytesFormatter, cej.b mobilePlansFeatureAvailabilityInteractor) {
        this.f324334a = 19;
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f324335b = bytesFormatter;
        this.f324336c = mobilePlansFeatureAvailabilityInteractor;
    }

    public a(h6i.o moveMoneyAccountProvider, n walletInteractor, b7i.d accountEligibilityInteractorFactory) {
        this.f324334a = 6;
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountEligibilityInteractorFactory, "accountEligibilityInteractorFactory");
        this.f324335b = moveMoneyAccountProvider;
        this.f324336c = walletInteractor;
    }

    public a(nd1.c catalogueInteractor, bd1.a litePosCatalogueLineItemMapper) {
        this.f324334a = 14;
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(litePosCatalogueLineItemMapper, "litePosCatalogueLineItemMapper");
        this.f324335b = catalogueInteractor;
        this.f324336c = litePosCatalogueLineItemMapper;
    }

    public a(fl8.d repository, hj8.a juniorProfileInteractor) {
        this.f324334a = 29;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f324335b = repository;
        this.f324336c = juniorProfileInteractor;
    }

    public a(ivg.b repository, ybl.b instrumentTickerInteractor) {
        this.f324334a = 24;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f324335b = repository;
        this.f324336c = instrumentTickerInteractor;
    }

    public a(zrc.d cryptoScaInteractor, zrc.e tradingScaInteractor, d8i.a checkScaRequiredRequestProvider) {
        this.f324334a = 9;
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(tradingScaInteractor, "tradingScaInteractor");
        Intrinsics.checkNotNullParameter(checkScaRequiredRequestProvider, "checkScaRequiredRequestProvider");
        this.f324335b = cryptoScaInteractor;
        this.f324336c = tradingScaInteractor;
    }

    public a(l80.e dateProvider, lnd.p0 aggregationMapper) {
        this.f324334a = 25;
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(aggregationMapper, "aggregationMapper");
        this.f324335b = dateProvider;
        this.f324336c = aggregationMapper;
    }

    public a(vge.d accountInteractor, z2 productAccountsInteractor) {
        this.f324334a = 13;
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        this.f324335b = productAccountsInteractor;
        this.f324336c = accountInteractor;
    }

    public a(zw.g videoStorageRepository, vw.p videoPayloadFactory) {
        this.f324334a = 5;
        Intrinsics.checkNotNullParameter(videoStorageRepository, "videoStorageRepository");
        Intrinsics.checkNotNullParameter(videoPayloadFactory, "videoPayloadFactory");
        Intrinsics.checkNotNullParameter(videoStorageRepository, "videoStorageRepository");
        bw.a memfdDescriptorProvider = bw.a.f19139a;
        Intrinsics.checkNotNullParameter(memfdDescriptorProvider, "memfdDescriptorProvider");
        Intrinsics.checkNotNullParameter(videoPayloadFactory, "videoPayloadFactory");
        this.f324335b = videoStorageRepository;
        this.f324336c = videoPayloadFactory;
    }

    public a(uxj.a juniorUpgradeFactory, ao.h juniorCoparentInteractor) {
        this.f324334a = 1;
        Intrinsics.checkNotNullParameter(juniorUpgradeFactory, "juniorUpgradeFactory");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        this.f324335b = juniorUpgradeFactory;
        this.f324336c = juniorCoparentInteractor;
    }

    public a(IrisAreaScreenContract$InputData inputData, h12.h apmAreaProvider) {
        this.f324334a = 18;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        this.f324335b = inputData;
        this.f324336c = apmAreaProvider;
    }

    public a(g6e.d subaccountInteractor, te8.v juniorPocketsProductInteractor) {
        this.f324334a = 17;
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        this.f324335b = subaccountInteractor;
        this.f324336c = juniorPocketsProductInteractor;
    }

    public a(kpj.f sotInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        this.f324334a = 15;
        Intrinsics.checkNotNullParameter(sotInteractor, "sotInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f324335b = sotInteractor;
        this.f324336c = transactionsInteractor;
    }

    public a(BiometricVerificationDatabase biometricVerificationDatabase) {
        this.f324334a = 0;
        this.f324335b = biometricVerificationDatabase;
        this.f324336c = new z8g.i(9);
    }

    public a(r10.w wVar) {
        this.f324334a = 28;
        this.f324335b = (jcm.a) wVar.f250865a;
        io.grpc.okhttp.internal.e eVar = (io.grpc.okhttp.internal.e) wVar.f250866b;
        eVar.getClass();
        this.f324336c = new fkg.a(eVar);
    }

    public a() {
        this.f324334a = 22;
        this.f324335b = new HashMap();
        this.f324336c = new HashMap();
    }

    public a(hd.q qVar) {
        this.f324334a = 22;
        this.f324335b = new HashMap(qVar.f151362a);
        this.f324336c = new HashMap(qVar.f151363b);
    }

    public a(gte.a featureToggleInteractor, n8b.a countryInteractor) {
        this.f324334a = 23;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f324335b = featureToggleInteractor;
        this.f324336c = countryInteractor;
    }
}
