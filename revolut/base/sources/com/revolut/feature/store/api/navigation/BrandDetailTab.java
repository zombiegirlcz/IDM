package com.revolut.feature.store.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/store/api/navigation/BrandDetailTab;", "Landroid/os/Parcelable;", "<init>", "()V", "Earn", "Redeem", "Msi", "Discount", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Discount;", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Earn;", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Msi;", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Redeem;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrandDetailTab implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Discount;", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab;", "<init>", "()V", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Discount extends BrandDetailTab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Discount f88608a = new Discount();

        @NotNull
        public static final Parcelable.Creator<Discount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Discount.f88608a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discount[i];
            }
        }

        private Discount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Earn;", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab;", "<init>", "()V", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Earn extends BrandDetailTab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Earn f88609a = new Earn();

        @NotNull
        public static final Parcelable.Creator<Earn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Earn.f88609a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Earn[i];
            }
        }

        private Earn() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Msi;", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab;", "<init>", "()V", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Msi extends BrandDetailTab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Msi f88610a = new Msi();

        @NotNull
        public static final Parcelable.Creator<Msi> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Msi.f88610a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Msi[i];
            }
        }

        private Msi() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/api/navigation/BrandDetailTab$Redeem;", "Lcom/revolut/feature/store/api/navigation/BrandDetailTab;", "<init>", "()V", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Redeem extends BrandDetailTab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Redeem f88611a = new Redeem();

        @NotNull
        public static final Parcelable.Creator<Redeem> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Redeem.f88611a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Redeem[i];
            }
        }

        private Redeem() {
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

    private BrandDetailTab() {
    }
}
