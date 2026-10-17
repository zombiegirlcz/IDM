package ow3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import ft3.a0;
import ft3.d0;
import ft3.e0;
import ft3.f0;
import ft3.g0;
import ft3.j;
import ft3.k0;
import ft3.m;
import ft3.n;
import ft3.n0;
import ft3.o0;
import ft3.p0;
import ft3.q0;
import ft3.t;
import ft3.w;
import ft3.z;
import it3.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj4.a f230303a;

    public g(sj4.a creditApplicationExpireMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationExpireMapper, "creditApplicationExpireMapper");
        this.f230303a = creditApplicationExpireMapper;
    }

    public final TextLocalisedClause a(q0 product, k kVar, Integer num) {
        Intrinsics.checkNotNullParameter(product, "product");
        if (product instanceof ft3.d) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_pay_later, null, null, 14);
        }
        if (product instanceof ft3.g) {
            return (num == null || num.intValue() <= 0) ? new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_credit_card, null, null, 14) : new TextLocalisedClause(R$string.credit_application_cancellation_credit_card_cancel_application_dialog_description, u.c(this.f230303a.a(num.intValue())), null, 12);
        }
        if (product instanceof n) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_credit_limit_increase, null, null, 14);
        }
        if (product instanceof m) {
            return new TextLocalisedClause(R$string.credit_credit_application_in_progress_cancel_credit_limit_decrease, null, null, 14);
        }
        if (product instanceof ft3.c) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_credit_card, null, null, 14);
        }
        if (product instanceof t) {
            switch (kVar == null ? -1 : f.f230302a[kVar.ordinal()]) {
                case -1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_additional_credit_card_card_owner, null, null, 14);
                case 0:
                default:
                    return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_additional_credit_card_card_owner, null, null, 14);
                case 1:
                    return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_additional_credit_card_invitee, null, null, 14);
            }
        }
        if ((product instanceof w) || (product instanceof ft3.u)) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_loan, null, null, 14);
        }
        if (product instanceof o0) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_refinancing, null, null, 14);
        }
        if ((product instanceof z) || (product instanceof j)) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_forbearance, null, null, 14);
        }
        if (product instanceof a0) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_mortgage, null, null, 14);
        }
        if (product instanceof p0) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_refinancing_mortgage, null, null, 14);
        }
        if (product instanceof d0) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_mortgage_renegotiation, null, null, 14);
        }
        if (product instanceof g0) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_overdraft, null, null, 14);
        }
        if ((product instanceof k0) || (product instanceof n0)) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_post_termination, null, null, 14);
        }
        if ((product instanceof e0) || (product instanceof f0)) {
            return new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_description_insurance, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
