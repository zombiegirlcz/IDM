package com.revolut.feature.store.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"com/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Deals", "Exclusives", "Brands", "YourItems", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$Brands;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$Deals;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$Exclusives;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$YourItems;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreHomeFlowContract$PagerItem implements FixedIdPagerItem, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$Brands;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Brands extends StoreHomeFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Brands f88695a = new Brands();

        @NotNull
        public static final Parcelable.Creator<Brands> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Brands.f88695a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Brands[i];
            }
        }

        private Brands() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$Deals;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Deals extends StoreHomeFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Deals f88696a = new Deals();

        @NotNull
        public static final Parcelable.Creator<Deals> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Deals.f88696a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deals[i];
            }
        }

        private Deals() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$Exclusives;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Exclusives extends StoreHomeFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Exclusives f88697a = new Exclusives();

        @NotNull
        public static final Parcelable.Creator<Exclusives> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Exclusives.f88697a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exclusives[i];
            }
        }

        private Exclusives() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem$YourItems;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class YourItems extends StoreHomeFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final YourItems f88698a = new YourItems();

        @NotNull
        public static final Parcelable.Creator<YourItems> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return YourItems.f88698a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YourItems[i];
            }
        }

        private YourItems() {
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

    private StoreHomeFlowContract$PagerItem() {
    }
}
