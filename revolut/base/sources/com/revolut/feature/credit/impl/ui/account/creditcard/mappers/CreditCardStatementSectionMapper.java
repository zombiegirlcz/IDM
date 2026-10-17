package com.revolut.feature.credit.impl.ui.account.creditcard.mappers;

import aim.e;
import android.os.Parcel;
import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import ip0.q6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import x15.f;
import yoj.b;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class CreditCardStatementSectionMapper {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel;", "Landroid/os/Parcelable;", "PaymentDueParcel", "SetupAutoPay", "AutoPaySettings", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel$AutoPaySettings;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel$PaymentDueParcel;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel$SetupAutoPay;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StatementParcel extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel$AutoPaySettings;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AutoPaySettings implements StatementParcel {

            @NotNull
            public static final Parcelable.Creator<AutoPaySettings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f70049a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoPaySettings(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AutoPaySettings[i];
                }
            }

            public AutoPaySettings(String facilityId) {
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                this.f70049a = facilityId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AutoPaySettings) && Intrinsics.f(this.f70049a, ((AutoPaySettings) obj2).f70049a);
            }

            public final int hashCode() {
                return this.f70049a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f70049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel$PaymentDueParcel;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel;", "<init>", "()V", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PaymentDueParcel implements StatementParcel {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PaymentDueParcel f70050a = new PaymentDueParcel();

            @NotNull
            public static final Parcelable.Creator<PaymentDueParcel> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PaymentDueParcel.f70050a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PaymentDueParcel[i];
                }
            }

            private PaymentDueParcel() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel$SetupAutoPay;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardStatementSectionMapper$StatementParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupAutoPay implements StatementParcel {

            @NotNull
            public static final Parcelable.Creator<SetupAutoPay> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f70051a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SetupAutoPay(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SetupAutoPay[i];
                }
            }

            public SetupAutoPay(String facilityId) {
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                this.f70051a = facilityId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SetupAutoPay) && Intrinsics.f(this.f70051a, ((SetupAutoPay) obj2).f70051a);
            }

            public final int hashCode() {
                return this.f70051a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f70051a);
            }
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static void a(e eVar, f fVar) {
        if (fVar.f302269t) {
            eVar.add(c("id_statement_minimum", new TextLocalisedClause(R$string.credit_card_account_statement_minimum, null, null, 14), sx4.f.b(3, null, null, fVar.f302262l), null));
        }
    }

    public static List b(CreditCardAutopayPayments creditCardAutopayPayments, String str) {
        TextLocalisedClause textLocalisedClause;
        if (creditCardAutopayPayments == null) {
            return f0.f322471a;
        }
        CreditCardAutopayPayment.AutoPayment autoPaymentA = creditCardAutopayPayments.a();
        if (autoPaymentA == null) {
            return u.c(new CellDetailsActionDelegate.Model("id_statement_auto_pay", new TextLocalisedClause(R$string.credit_card_account_statement_auto_pay, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.credit_management_set_up, null, null, 14), false, false, null, !creditCardAutopayPayments.d.isEmpty() ? new StatementParcel.AutoPaySettings(str) : new StatementParcel.SetupAutoPay(str), 0, 0, 32224));
        }
        CreditCardAutopayPayment.PaymentAmount paymentAmount = autoPaymentA.e;
        boolean z = paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Fixed;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_account_statement_auto_pay_active_fixed, null, null, 14);
        } else if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.MinRepayment) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_account_statement_auto_pay_active_minimum, null, null, 14);
        } else if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.StatementBalance) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_account_statement_auto_pay_active_statement, null, null, 14);
        } else {
            if (!(paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = null;
        }
        return i2b.a.r(new CellDetailsActionDelegate.Model("id_statement_auto_pay", new TextLocalisedClause(R$string.credit_card_account_statement_auto_pay, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), b.w(b.w(new TextLocalisedClause(R$string.credit_card_account_statement_auto_pay_active, null, null, 14), new DotDividerClause((Integer) null)), textLocalisedClause), false, false, null, new StatementParcel.AutoPaySettings(str), 0, 0, 32224), z ? new PlainTextDelegate.Model("id_statement_auto_pay_note", (Clause) null, (Clause) new TextLocalisedClause(R$string.credit_card_account_statement_auto_pay_note_fixed, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422) : null);
    }

    public static CellDetailsDelegate.Model c(String str, TextLocalisedClause textLocalisedClause, Clause clause, StatementParcel.PaymentDueParcel paymentDueParcel) {
        return new CellDetailsDelegate.Model(str, textLocalisedClause, clause, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, paymentDueParcel, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
    }

    public static CellDetailsDelegate.Model d(Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        return new CellDetailsDelegate.Model(str, textLocalisedClause, clause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
    }

    public static q6 e(TextLocalisedClause textLocalisedClause, String str) {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_management_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorBackground), false, null, false, null, 254), 10);
        int i = R$attr.uikit_colorAccent;
        return new q6(str, textLocalisedClause, new TagViewData(resourceImage2, textLocalisedClause2, new Color.Solid(i), i, null, 1000), resourceImage, null, 0, 0, YearClass.CLASS_2016);
    }

    public static CellDetailsDelegate.Model f(f fVar) {
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_account_statement_payment_due_date, null, null, 14);
        Clause clauseB = j.b(c7.Companion, fVar.f302268s, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT));
        long j2 = fVar.f302267r;
        if (j2 != 0) {
            if (j2 == 1) {
                compositeClause = new CompositeClause(v.k(clauseB, new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.credit_card_account_statement_due_tomorrow, null, null, 14)), null, null, null, 14);
            }
            return c("id_statement_payment_due", textLocalisedClause, clauseB, StatementParcel.PaymentDueParcel.f70050a);
        }
        compositeClause = new CompositeClause(v.k(clauseB, new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.credit_card_account_statement_due_today, null, null, 14)), null, null, null, 14);
        clauseB = compositeClause;
        return c("id_statement_payment_due", textLocalisedClause, clauseB, StatementParcel.PaymentDueParcel.f70050a);
    }

    public static CellDetailsDelegate.Model g(f fVar) {
        TimeClause timeClauseB = j.b(c7.Companion, fVar.f302261j, new LocalDateClause$DateFormat.Month(ka.SHORT));
        return c("id_statement_statement", fVar.f302262l.f115082a > 0 ? new TextLocalisedClause(R$string.credit_management_statement_dot_value, u.c(timeClauseB), null, 12) : new TextLocalisedClause(R$string.credit_management_remaining_dot_value, u.c(timeClauseB), null, 12), sx4.f.b(3, null, null, fVar.f302264n), null);
    }
}
