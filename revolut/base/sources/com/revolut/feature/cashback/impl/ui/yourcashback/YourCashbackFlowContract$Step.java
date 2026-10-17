package com.revolut.feature.cashback.impl.ui.yourcashback;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Home", "Transactions", "SplitBySource", "SplitByCurrency", "Product", "WithdrawMetal", "PlanCashbackDetails", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$Home;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$PlanCashbackDetails;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$Product;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$SplitByCurrency;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$SplitBySource;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$Transactions;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$WithdrawMetal;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class YourCashbackFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$PlanCashbackDetails;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanCashbackDetails extends YourCashbackFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanCashbackDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f65707a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanCashbackDetails((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanCashbackDetails[i];
            }
        }

        public PlanCashbackDetails(d balance) {
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f65707a = balance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanCashbackDetails) && Intrinsics.f(this.f65707a, ((PlanCashbackDetails) obj2).f65707a);
        }

        public final int hashCode() {
            return this.f65707a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65707a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$Product;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Product extends YourCashbackFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Product> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uc3.d f65708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65709b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Product(uc3.d.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Product[i];
            }
        }

        public Product(uc3.d cashbackSourceType, boolean z) {
            Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
            this.f65708a = cashbackSourceType;
            this.f65709b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Product)) {
                return false;
            }
            Product product = (Product) obj2;
            return this.f65708a == product.f65708a && this.f65709b == product.f65709b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f65709b) + (this.f65708a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65708a.name());
            dest.writeInt(this.f65709b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$SplitByCurrency;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step;", "<init>", "()V", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SplitByCurrency extends YourCashbackFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SplitByCurrency f65710a = new SplitByCurrency();

        @NotNull
        public static final Parcelable.Creator<SplitByCurrency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SplitByCurrency.f65710a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitByCurrency[i];
            }
        }

        private SplitByCurrency() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$SplitBySource;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step;", "<init>", "()V", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SplitBySource extends YourCashbackFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SplitBySource f65711a = new SplitBySource();

        @NotNull
        public static final Parcelable.Creator<SplitBySource> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SplitBySource.f65711a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitBySource[i];
            }
        }

        private SplitBySource() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$Transactions;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transactions extends YourCashbackFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transactions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CashbackBySources f65712a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transactions((CashbackBySources) parcel.readParcelable(Transactions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transactions[i];
            }
        }

        public Transactions(CashbackBySources cashbackBySources) {
            Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
            this.f65712a = cashbackBySources;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transactions) && Intrinsics.f(this.f65712a, ((Transactions) obj2).f65712a);
        }

        public final int hashCode() {
            return this.f65712a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65712a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$WithdrawMetal;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithdrawMetal extends YourCashbackFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WithdrawMetal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uc3.a f65713a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithdrawMetal((uc3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawMetal[i];
            }
        }

        public WithdrawMetal(uc3.a cashbackBox) {
            Intrinsics.checkNotNullParameter(cashbackBox, "cashbackBox");
            this.f65713a = cashbackBox;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithdrawMetal) && Intrinsics.f(this.f65713a, ((WithdrawMetal) obj2).f65713a);
        }

        public final int hashCode() {
            return this.f65713a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65713a);
        }
    }

    private YourCashbackFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step$Home;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends YourCashbackFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f65706a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(boolean z) {
            this.f65706a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && this.f65706a == ((Home) obj2).f65706a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f65706a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f65706a ? 1 : 0);
        }

        public Home() {
            this(false);
        }
    }
}
