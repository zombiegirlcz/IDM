package com.revolut.feature.credit.autopay.models.repayment;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "SimpleMoney", "FixedAmount", "StatementBalance", "MinimumPayment", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$FixedAmount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$MinimumPayment;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$SimpleMoney;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$StatementBalance;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RepresentationAmountStyle implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$FixedAmount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FixedAmount extends RepresentationAmountStyle {

        @NotNull
        public static final Parcelable.Creator<FixedAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f68560a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FixedAmount((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FixedAmount[i];
            }
        }

        public FixedAmount(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f68560a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FixedAmount) && Intrinsics.f(this.f68560a, ((FixedAmount) obj2).f68560a);
        }

        public final int hashCode() {
            return this.f68560a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68560a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$MinimumPayment;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle;", "<init>", "()V", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MinimumPayment extends RepresentationAmountStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MinimumPayment f68561a = new MinimumPayment();

        @NotNull
        public static final Parcelable.Creator<MinimumPayment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MinimumPayment.f68561a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MinimumPayment[i];
            }
        }

        private MinimumPayment() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$SimpleMoney;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SimpleMoney extends RepresentationAmountStyle {

        @NotNull
        public static final Parcelable.Creator<SimpleMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f68562a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SimpleMoney((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimpleMoney[i];
            }
        }

        public SimpleMoney(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f68562a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SimpleMoney) && Intrinsics.f(this.f68562a, ((SimpleMoney) obj2).f68562a);
        }

        public final int hashCode() {
            return this.f68562a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68562a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle$StatementBalance;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationAmountStyle;", "<init>", "()V", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StatementBalance extends RepresentationAmountStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StatementBalance f68563a = new StatementBalance();

        @NotNull
        public static final Parcelable.Creator<StatementBalance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StatementBalance.f68563a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementBalance[i];
            }
        }

        private StatementBalance() {
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

    private RepresentationAmountStyle() {
    }
}
