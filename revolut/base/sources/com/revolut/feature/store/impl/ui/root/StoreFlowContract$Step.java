package com.revolut.feature.store.impl.ui.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import com.revolut.feature.store.api.navigation.StoreTab;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/store/impl/ui/root/StoreFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OptIn", "OpenHome", "OpenBrandDetail", "OpenOrdersSeeAll", "OpenSearch", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenBrandDetail;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenHome;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenOrdersSeeAll;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenSearch;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OptIn;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenBrandDetail;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenBrandDetail extends StoreFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenBrandDetail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StoreMegaOffer f88724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BrandDetailTab f88725c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenBrandDetail(parcel.readString(), (StoreMegaOffer) parcel.readParcelable(OpenBrandDetail.class.getClassLoader()), (BrandDetailTab) parcel.readParcelable(OpenBrandDetail.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenBrandDetail[i];
            }
        }

        public OpenBrandDetail(String offerId, StoreMegaOffer storeMegaOffer, BrandDetailTab brandDetailTab, String str) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            this.f88723a = offerId;
            this.f88724b = storeMegaOffer;
            this.f88725c = brandDetailTab;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenBrandDetail)) {
                return false;
            }
            OpenBrandDetail openBrandDetail = (OpenBrandDetail) obj2;
            return Intrinsics.f(this.f88723a, openBrandDetail.f88723a) && Intrinsics.f(this.f88724b, openBrandDetail.f88724b) && Intrinsics.f(this.f88725c, openBrandDetail.f88725c) && Intrinsics.f(this.d, openBrandDetail.d);
        }

        public final int hashCode() {
            int iHashCode = this.f88723a.hashCode() * 31;
            StoreMegaOffer storeMegaOffer = this.f88724b;
            int iHashCode2 = (iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode())) * 31;
            BrandDetailTab brandDetailTab = this.f88725c;
            int iHashCode3 = (iHashCode2 + (brandDetailTab == null ? 0 : brandDetailTab.hashCode())) * 31;
            String str = this.d;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88723a);
            dest.writeParcelable(this.f88724b, i);
            dest.writeParcelable(this.f88725c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenHome;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenHome extends StoreFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenHome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreTab f88726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88727b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenHome((StoreTab) parcel.readParcelable(OpenHome.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenHome[i];
            }
        }

        public OpenHome() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenHome)) {
                return false;
            }
            OpenHome openHome = (OpenHome) obj2;
            return Intrinsics.f(this.f88726a, openHome.f88726a) && Intrinsics.f(this.f88727b, openHome.f88727b);
        }

        public final int hashCode() {
            int iHashCode = this.f88726a.hashCode() * 31;
            String str = this.f88727b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88726a, i);
            dest.writeString(this.f88727b);
        }

        public OpenHome(StoreTab tab2, String str) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            this.f88726a = tab2;
            this.f88727b = str;
        }

        public /* synthetic */ OpenHome(int i) {
            this(StoreTab.Deals.f88623a, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenSearch;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenSearch extends StoreFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenSearch f88729a = new OpenSearch();

        @NotNull
        public static final Parcelable.Creator<OpenSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenSearch.f88729a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenSearch[i];
            }
        }

        private OpenSearch() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OptIn;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OptIn extends StoreFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OptIn f88730a = new OptIn();

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptIn.f88730a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        private OptIn() {
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

    private StoreFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step$OpenOrdersSeeAll;", "Lcom/revolut/feature/store/impl/ui/root/StoreFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenOrdersSeeAll extends StoreFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenOrdersSeeAll> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreOrdersSeeAllContract$InputData f88728a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenOrdersSeeAll((StoreOrdersSeeAllContract$InputData) parcel.readParcelable(OpenOrdersSeeAll.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenOrdersSeeAll[i];
            }
        }

        public OpenOrdersSeeAll(StoreOrdersSeeAllContract$InputData mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f88728a = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenOrdersSeeAll) && Intrinsics.f(this.f88728a, ((OpenOrdersSeeAll) obj2).f88728a);
        }

        public final int hashCode() {
            return this.f88728a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88728a, i);
        }

        public OpenOrdersSeeAll() {
            this(StoreOrdersSeeAllContract$InputData.Orders.f88715a);
        }
    }
}
