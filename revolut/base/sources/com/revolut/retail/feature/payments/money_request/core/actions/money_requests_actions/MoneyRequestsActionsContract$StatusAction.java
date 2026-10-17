package com.revolut.retail.feature.payments.money_request.core.actions.money_requests_actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/payments/money_request/core/actions/money_requests_actions/MoneyRequestsActionsContract$StatusAction", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "InsufficientFunds", "Lcom/revolut/retail/feature/payments/money_request/core/actions/money_requests_actions/MoneyRequestsActionsContract$StatusAction$InsufficientFunds;", "Lcom/revolut/retail/feature/payments/money_request/core/actions/money_requests_actions/MoneyRequestsActionsContract$StatusAction$Success;", "feature_payments_money_request_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoneyRequestsActionsContract$StatusAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/money_request/core/actions/money_requests_actions/MoneyRequestsActionsContract$StatusAction$InsufficientFunds;", "Lcom/revolut/retail/feature/payments/money_request/core/actions/money_requests_actions/MoneyRequestsActionsContract$StatusAction;", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsufficientFunds extends MoneyRequestsActionsContract$StatusAction {

        @NotNull
        public static final Parcelable.Creator<InsufficientFunds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyRequest f102139a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsufficientFunds((MoneyRequest) parcel.readParcelable(InsufficientFunds.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsufficientFunds[i];
            }
        }

        public InsufficientFunds(MoneyRequest moneyRequest) {
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            this.f102139a = moneyRequest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsufficientFunds) && Intrinsics.f(this.f102139a, ((InsufficientFunds) obj2).f102139a);
        }

        public final int hashCode() {
            return this.f102139a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102139a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/money_request/core/actions/money_requests_actions/MoneyRequestsActionsContract$StatusAction$Success;", "Lcom/revolut/retail/feature/payments/money_request/core/actions/money_requests_actions/MoneyRequestsActionsContract$StatusAction;", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success extends MoneyRequestsActionsContract$StatusAction {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyRequest f102140a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((MoneyRequest) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(MoneyRequest moneyRequest) {
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            this.f102140a = moneyRequest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Success) && Intrinsics.f(this.f102140a, ((Success) obj2).f102140a);
        }

        public final int hashCode() {
            return this.f102140a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102140a, i);
        }
    }

    private MoneyRequestsActionsContract$StatusAction() {
    }
}
