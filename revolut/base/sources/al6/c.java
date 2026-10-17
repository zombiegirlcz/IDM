package al6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.z;
import o9a.e0;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6154a;

    public /* synthetic */ c(int i) {
        this.f6154a = i;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) throws Throwable {
        switch (this.f6154a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 1:
                return new z(new TextLocalisedClause(R$string.credit_application_offer_document_loading_error_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_offer_document_loading_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 2:
                return new z(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 3:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
                return new z(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 4:
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var2);
                return new z(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 5:
                return new z(new TextLocalisedClause(R$string.credit_error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 6:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 7:
                return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 8:
                return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 9:
                return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 10:
                return new z(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 11:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var3);
                return null;
            case 12:
                return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510);
            case 13:
                return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510);
            case 14:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                throw throwable2;
            case 15:
                Throwable throwable3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable3, h0Var4);
                return null;
            case 16:
                Throwable throwable4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable4, "throwable");
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable4, h0Var5);
                return null;
            case 17:
                Throwable throwable5 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable5, "throwable");
                h0 h0Var6 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable5, h0Var6);
                return null;
            case 18:
                return new z(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_status_declined, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
            case 19:
                return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 20:
                return new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 21:
                return new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 22:
                return new z(new TextLocalisedClause(R$string.credit_card_direct_debit_set_account_error_invalid_number, u.c(new TextLocalisedClause(R$string.credit_card_direct_debit_account_type_clabe, null, null, 14)), null, 12), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 23:
                Throwable t2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(t2, "t");
                Set setB = y0.b(new Pair("PartnerRewardActivateMembershipActionHandler", "activatePartnerMembership"));
                CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, t2, setB);
                return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
            case 24:
                Throwable t3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(t3, "t");
                Set setB2 = y0.b(new Pair("RewardActivationActionHandler", "activate"));
                CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, t3, setB2);
                return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
            case 25:
                Throwable throwable6 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable6, "throwable");
                Set setB3 = y0.b(new Pair("SubscriptionCancellationHandler", "cancelSubscription"));
                CopyOnWriteArrayList copyOnWriteArrayList9 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable6, setB3);
                return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
            case 26:
                return new z(new TextLocalisedClause(R$string.credit_application_offer_document_loading_error_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_offer_document_loading_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 27:
                return null;
            case 28:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new z(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_withdraw_status_dialog_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_withdraw_status_dialog_error_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_withdraw_status_dialog_error_primary_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            default:
                return e0.a();
        }
    }
}
