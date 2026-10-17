package com.revolut.feature.credit.card.impl.widget.statement;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.y0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CreditCardStatementWidgetMapper {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ActionParcel", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementWidgetParcel implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StatementWidgetParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f69786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActionParcel f69787b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel$ActionParcel;", "Landroid/os/Parcelable;", "AutopaySetup", "Repay", "Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel$ActionParcel$AutopaySetup;", "Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel$ActionParcel$Repay;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface ActionParcel extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel$ActionParcel$AutopaySetup;", "Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel$ActionParcel;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class AutopaySetup implements ActionParcel {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final AutopaySetup f69788a = new AutopaySetup();

                @NotNull
                public static final Parcelable.Creator<AutopaySetup> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return AutopaySetup.f69788a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AutopaySetup[i];
                    }
                }

                private AutopaySetup() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel$ActionParcel$Repay;", "Lcom/revolut/feature/credit/card/impl/widget/statement/CreditCardStatementWidgetMapper$StatementWidgetParcel$ActionParcel;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Repay implements ActionParcel {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Repay f69789a = new Repay();

                @NotNull
                public static final Parcelable.Creator<Repay> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Repay.f69789a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Repay[i];
                    }
                }

                private Repay() {
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
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatementWidgetParcel((LocalDate) parcel.readSerializable(), (ActionParcel) parcel.readParcelable(StatementWidgetParcel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementWidgetParcel[i];
            }
        }

        public StatementWidgetParcel(LocalDate statementStartDate, ActionParcel actionParcel) {
            Intrinsics.checkNotNullParameter(statementStartDate, "statementStartDate");
            this.f69786a = statementStartDate;
            this.f69787b = actionParcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatementWidgetParcel)) {
                return false;
            }
            StatementWidgetParcel statementWidgetParcel = (StatementWidgetParcel) obj2;
            return Intrinsics.f(this.f69786a, statementWidgetParcel.f69786a) && Intrinsics.f(this.f69787b, statementWidgetParcel.f69787b);
        }

        public final int hashCode() {
            int iHashCode = this.f69786a.hashCode() * 31;
            ActionParcel actionParcel = this.f69787b;
            return iHashCode + (actionParcel == null ? 0 : actionParcel.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69786a);
            dest.writeParcelable(this.f69787b, i);
        }
    }

    public static ErrorWidgetDelegate.Model a(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new ErrorWidgetDelegate.Model(widgetId, null, new TextLocalisedClause(R$string.credit_card_statement_widget_error_title, null, null, 14), new TextLocalisedClause(R$string.common_try_again, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }

    public static GoalProgressLoadingWidgetDelegate.Model b(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new GoalProgressLoadingWidgetDelegate.Model(widgetId, new TextLocalisedClause(R$string.credit_card_statement_widget_title_total, null, null, 14), y0.WITHOUT_PROGRESS, 24);
    }
}
