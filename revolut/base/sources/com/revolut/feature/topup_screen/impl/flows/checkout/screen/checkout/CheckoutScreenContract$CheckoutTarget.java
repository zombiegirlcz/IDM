package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget", "Landroid/os/Parcelable;", "Savings", "Joint", "Invest", "Pro", "Main", "RevXFiat", "Junior", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Invest;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Joint;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Junior;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Main;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Pro;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$RevXFiat;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Savings;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckoutScreenContract$CheckoutTarget extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Invest;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invest implements CheckoutScreenContract$CheckoutTarget {

        @NotNull
        public static final Parcelable.Creator<Invest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90714a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Invest(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invest[i];
            }
        }

        public Invest(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f90714a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Invest) && Intrinsics.f(this.f90714a, ((Invest) obj2).f90714a);
        }

        public final int hashCode() {
            return this.f90714a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90714a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Joint;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint implements CheckoutScreenContract$CheckoutTarget {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId.Joint f90715a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint((AccountId.Joint) parcel.readParcelable(Joint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(AccountId.Joint accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f90715a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f90715a, ((Joint) obj2).f90715a);
        }

        public final int hashCode() {
            return this.f90715a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90715a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Junior;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior implements CheckoutScreenContract$CheckoutTarget {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90716a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(String walletId) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f90716a = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Junior) && Intrinsics.f(this.f90716a, ((Junior) obj2).f90716a);
        }

        public final int hashCode() {
            return this.f90716a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90716a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Main;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Main implements CheckoutScreenContract$CheckoutTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Main f90717a = new Main();

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Main.f90717a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        private Main() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Pro;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro implements CheckoutScreenContract$CheckoutTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pro f90718a = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f90718a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$RevXFiat;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevXFiat implements CheckoutScreenContract$CheckoutTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevXFiat f90719a = new RevXFiat();

        @NotNull
        public static final Parcelable.Creator<RevXFiat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevXFiat.f90719a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevXFiat[i];
            }
        }

        private RevXFiat() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget$Savings;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutTarget;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings implements CheckoutScreenContract$CheckoutTarget {

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f90721b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Savings(parcel.readParcelable(Savings.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public Savings(Parcelable parcelable, String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f90720a = id10;
            this.f90721b = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) obj2;
            return Intrinsics.f(this.f90720a, savings.f90720a) && Intrinsics.f(this.f90721b, savings.f90721b);
        }

        public final int hashCode() {
            int iHashCode = this.f90720a.hashCode() * 31;
            Parcelable parcelable = this.f90721b;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90720a);
            dest.writeParcelable(this.f90721b, i);
        }
    }
}
