package com.revolut.feature.retail.savings.api.creation.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter", "Landroid/os/Parcelable;", "Campaign", "Product", "All", "ProductId", "Currency", "Challenge", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$All;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Campaign;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Challenge;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Currency;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Product;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$ProductId;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsAccountCreationFlow$Filter extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$All;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter;", "<init>", "()V", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class All implements SavingsAccountCreationFlow$Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final All f83128a = new All();

        @NotNull
        public static final Parcelable.Creator<All> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return All.f83128a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new All[i];
            }
        }

        private All() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Campaign;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Campaign implements SavingsAccountCreationFlow$Filter {

        @NotNull
        public static final Parcelable.Creator<Campaign> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83129a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Campaign(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Campaign[i];
            }
        }

        public Campaign(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f83129a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Campaign) && Intrinsics.f(this.f83129a, ((Campaign) obj2).f83129a);
        }

        public final int hashCode() {
            return this.f83129a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83129a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Challenge;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter;", "<init>", "()V", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Challenge implements SavingsAccountCreationFlow$Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Challenge f83130a = new Challenge();

        @NotNull
        public static final Parcelable.Creator<Challenge> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Challenge.f83130a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Challenge[i];
            }
        }

        private Challenge() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Currency;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Currency implements SavingsAccountCreationFlow$Filter {

        @NotNull
        public static final Parcelable.Creator<Currency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f83131a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Currency((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Currency[i];
            }
        }

        public Currency(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f83131a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Currency) && Intrinsics.f(this.f83131a, ((Currency) obj2).f83131a);
        }

        public final int hashCode() {
            return this.f83131a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f83131a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$Product;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Product implements SavingsAccountCreationFlow$Filter {

        @NotNull
        public static final Parcelable.Creator<Product> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f83132a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Product(g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Product[i];
            }
        }

        public Product(g productType) {
            Intrinsics.checkNotNullParameter(productType, "productType");
            this.f83132a = productType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Product) && this.f83132a == ((Product) obj2).f83132a;
        }

        public final int hashCode() {
            return this.f83132a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83132a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter$ProductId;", "Lcom/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Filter;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductId implements SavingsAccountCreationFlow$Filter {

        @NotNull
        public static final Parcelable.Creator<ProductId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83133a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductId[i];
            }
        }

        public ProductId(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83133a = productId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductId) && Intrinsics.f(this.f83133a, ((ProductId) obj2).f83133a);
        }

        public final int hashCode() {
            return this.f83133a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83133a);
        }
    }
}
