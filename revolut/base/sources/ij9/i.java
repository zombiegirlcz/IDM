package ij9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pay_later.api.models.PayLaterActivationError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import vi9.e0;
import yji.n;
import zh9.a0;
import zh9.c0;
import zh9.d0;
import zh9.f0;
import zh9.g0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends n implements di9.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f161748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xh9.a f161749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qi9.d f161750n;
    public final e0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vi9.f f161751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final di9.c f161752q;

    public i(j60.a bottomExpandableDialogControllerExtension, xh9.a payLaterInteractor, qi9.d payLaterNavigationCommandFactory, e0 payLaterStateDialogMapper, vi9.f payLaterActivationWarningDialogMapper, di9.c payLaterModeActivationExtension) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterActivationWarningDialogMapper, "payLaterActivationWarningDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
        this.f161748l = bottomExpandableDialogControllerExtension;
        this.f161749m = payLaterInteractor;
        this.f161750n = payLaterNavigationCommandFactory;
        this.o = payLaterStateDialogMapper;
        this.f161751p = payLaterActivationWarningDialogMapper;
        this.f161752q = payLaterModeActivationExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ij9.i r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ij9.c
            if (r0 == 0) goto L13
            r0 = r5
            ij9.c r0 = (ij9.c) r0
            int r1 = r0.f161741w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161741w = r1
            goto L18
        L13:
            ij9.c r0 = new ij9.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161741w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L5a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            xh9.a r4 = r4.f161749m
            w4l.h r5 = w4l.h.f294642c
            ti9.g r4 = (ti9.g) r4
            efm.r r4 = r4.o(r5)
            ieg.y r5 = new ieg.y
            r2 = 26
            r5.<init>(r2)
            r2 = 0
            efm.r r4 = m70.a.g(r4, r2, r5, r3)
            efm.d0 r4 = r4.firstOrError()
            java.lang.String r5 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.f161741w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ij9.i.Z2(ij9.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r1.equals("GOT_IT_BUTTON_ID") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (r1.equals("HOW_IT_WORKS_GOT_IT_BUTTON") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        j60.a.v(r8, false, null, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        return true;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b3(yx4.b r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ij9.i.b3(yx4.b):boolean");
    }

    public final boolean c3(Throwable th10) {
        y yVarA;
        if (th10 instanceof PayLaterActivationError) {
            PayLaterActivationError error = (PayLaterActivationError) th10;
            this.f161751p.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            Unit unit = null;
            if ((error instanceof PayLaterActivationError.Overdue) || (error instanceof PayLaterActivationError.Outstanding)) {
                yVarA = vi9.f.a(new TextLocalisedClause(R$string.pay_later_switch_warning_late_payment_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_switch_warning_late_payment_description, null, null, 14), new vi9.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_go_to_payment, null, null, 14), "GOT_TO_PAYMENT_BUTTON_ID"));
            } else if (error instanceof PayLaterActivationError.Cancelled) {
                yVarA = vi9.f.a(new TextLocalisedClause(R$string.pay_later_switch_warning_agreement_cancelled_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_switch_warning_agreement_cancelled_description, null, null, 14), new vi9.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), "GOT_IT_BUTTON_ID"));
            } else if (error instanceof PayLaterActivationError.Terminated) {
                yVarA = vi9.f.a(new TextLocalisedClause(R$string.pay_later_switch_warning_agreement_terminated_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_switch_warning_agreement_terminated_description, null, null, 14), new vi9.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), "GOT_IT_BUTTON_ID"));
            } else if (error instanceof PayLaterActivationError.NoEligibleCards) {
                yVarA = vi9.f.a(new TextLocalisedClause(R$string.pay_later_switch_warning_add_card_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_switch_warning_add_card_description, null, null, 14), new vi9.e(new TextLocalisedClause(R$string.pay_later_cards_ineligible_create_card_button, null, null, 14), "ADD_CARD_BUTTON_ID"));
            } else if (error instanceof PayLaterActivationError.MaxPurchaseAmountTooLow) {
                yVarA = vi9.f.a(new TextLocalisedClause(R$string.pay_later_switch_warning_max_purchase_amount_too_low_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_switch_warning_max_purchase_amount_too_low_description, u.c(pi9.b.a(((PayLaterActivationError.MaxPurchaseAmountTooLow) error).f78810a, null, 3)), null, 12), new vi9.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), "GOT_IT_BUTTON_ID"));
            } else {
                if (!(error instanceof PayLaterActivationError.FacilityNotCreated) && !(error instanceof PayLaterActivationError.UnknownError)) {
                    throw new NoWhenBranchMatchedException();
                }
                yVarA = null;
            }
            if (yVarA != null) {
                this.f161748l.x(yVarA);
                unit = Unit.f186387a;
            }
            if (unit != null) {
                return true;
            }
        }
        return ((sj9.a) this.f161752q).b3(th10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ij9.f
            if (r0 == 0) goto L13
            r0 = r7
            ij9.f r0 = (ij9.f) r0
            int r1 = r0.f161745w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161745w = r1
            goto L18
        L13:
            ij9.f r0 = new ij9.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161745w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L61
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            xh9.a r7 = r6.f161749m
            efm.r r7 = xh9.a.a(r7)
            igh.k r2 = new igh.k
            r5 = 27
            r2.<init>(r5)
            efm.r r7 = nim.a.w(r7, r2)
            ieg.y r2 = new ieg.y
            r5 = 25
            r2.<init>(r5)
            efm.r r7 = m70.a.g(r7, r3, r2, r4)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f161745w = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L79
            ij9.e r7 = new ij9.e
            r0 = 1
            r7.<init>(r6, r3, r0)
            yi5.b r0 = new yi5.b
            r1 = 27
            r0.<init>(r1)
            r6.T2(r7, r0)
        L79:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ij9.i.d3(gim.c):java.lang.Object");
    }

    public final void e3(zh9.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        zh9.h hVar = iVar.f;
        zh9.a aVar = hVar == null ? null : new zh9.a(cp5.c.o(hVar), iVar.e.f115083b, hVar.f322272j);
        if (aVar == null) {
            return;
        }
        this.f161748l.x(this.o.c(null, aVar));
    }

    public final void f3(g0 g0Var) {
        Throwable maxPurchaseAmountTooLow;
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        if (g0Var instanceof a0) {
            maxPurchaseAmountTooLow = PayLaterActivationError.Cancelled.f78808a;
        } else if (g0Var instanceof f0) {
            maxPurchaseAmountTooLow = PayLaterActivationError.Terminated.f78814a;
        } else if (g0Var instanceof d0) {
            maxPurchaseAmountTooLow = PayLaterActivationError.Outstanding.f78812a;
        } else if (g0Var instanceof zh9.e0) {
            maxPurchaseAmountTooLow = PayLaterActivationError.Overdue.f78813a;
        } else {
            if (!(g0Var instanceof c0)) {
                throw new NoWhenBranchMatchedException();
            }
            maxPurchaseAmountTooLow = new PayLaterActivationError.MaxPurchaseAmountTooLow(((c0) g0Var).f322253a);
        }
        c3(maxPurchaseAmountTooLow);
    }

    public final void g3() {
        T2(new e(this, null, 2), new i4g.g(1, this, i.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (d3(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ij9.h
            if (r0 == 0) goto L13
            r0 = r6
            ij9.h r0 = (ij9.h) r0
            int r1 = r0.f161747w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161747w = r1
            goto L18
        L13:
            ij9.h r0 = new ij9.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161747w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L52
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L49
        L36:
            yhm.o.b(r6)
            zh9.p1 r6 = zh9.p1.Cards
            r0.f161747w = r4
            di9.c r2 = r5.f161752q
            sj9.a r2 = (sj9.a) r2
            r4 = 0
            java.lang.Object r6 = r2.Z2(r4, r6, r0)
            if (r6 != r1) goto L49
            goto L51
        L49:
            r0.f161747w = r3
            java.lang.Object r6 = r5.d3(r0)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ij9.i.h3(gim.c):java.lang.Object");
    }
}
