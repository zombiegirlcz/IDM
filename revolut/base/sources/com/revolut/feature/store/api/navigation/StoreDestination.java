package com.revolut.feature.store.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.navigation.StoreTab;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/store/api/navigation/StoreDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/store/api/navigation/StoreDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<StoreDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f88614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f88615c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/navigation/StoreDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f88616a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartType) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartType startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f88616a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f88616a, ((InputData) obj2).f88616a);
        }

        public final int hashCode() {
            return this.f88616a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88616a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/store/api/navigation/StoreDestination$StartType;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenStoreHome", "OpenBrandDetail", "Lcom/revolut/feature/store/api/navigation/StoreDestination$StartType$OpenBrandDetail;", "Lcom/revolut/feature/store/api/navigation/StoreDestination$StartType$OpenStoreHome;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/navigation/StoreDestination$StartType$OpenBrandDetail;", "Lcom/revolut/feature/store/api/navigation/StoreDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenBrandDetail extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenBrandDetail> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f88617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final StoreMegaOffer f88618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BrandDetailTab f88619c;
            public final String d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenBrandDetail(parcel.readString(), parcel.readInt() == 0 ? null : StoreMegaOffer.CREATOR.createFromParcel(parcel), (BrandDetailTab) parcel.readParcelable(OpenBrandDetail.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenBrandDetail[i];
                }
            }

            public OpenBrandDetail(String offerId, StoreMegaOffer storeMegaOffer, BrandDetailTab brandDetailTab, String str) {
                Intrinsics.checkNotNullParameter(offerId, "offerId");
                this.f88617a = offerId;
                this.f88618b = storeMegaOffer;
                this.f88619c = brandDetailTab;
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
                return Intrinsics.f(this.f88617a, openBrandDetail.f88617a) && Intrinsics.f(this.f88618b, openBrandDetail.f88618b) && Intrinsics.f(this.f88619c, openBrandDetail.f88619c) && Intrinsics.f(this.d, openBrandDetail.d);
            }

            public final int hashCode() {
                int iHashCode = this.f88617a.hashCode() * 31;
                StoreMegaOffer storeMegaOffer = this.f88618b;
                int iHashCode2 = (iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode())) * 31;
                BrandDetailTab brandDetailTab = this.f88619c;
                int iHashCode3 = (iHashCode2 + (brandDetailTab == null ? 0 : brandDetailTab.hashCode())) * 31;
                String str = this.d;
                return iHashCode3 + (str != null ? str.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f88617a);
                StoreMegaOffer storeMegaOffer = this.f88618b;
                if (storeMegaOffer == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    storeMegaOffer.writeToParcel(dest, i);
                }
                dest.writeParcelable(this.f88619c, i);
                dest.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/navigation/StoreDestination$StartType$OpenStoreHome;", "Lcom/revolut/feature/store/api/navigation/StoreDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenStoreHome extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenStoreHome> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StoreTab f88620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f88621b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenStoreHome((StoreTab) parcel.readParcelable(OpenStoreHome.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenStoreHome[i];
                }
            }

            public OpenStoreHome() {
                this((StoreTab) null, 3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenStoreHome)) {
                    return false;
                }
                OpenStoreHome openStoreHome = (OpenStoreHome) obj2;
                return Intrinsics.f(this.f88620a, openStoreHome.f88620a) && Intrinsics.f(this.f88621b, openStoreHome.f88621b);
            }

            public final int hashCode() {
                int iHashCode = this.f88620a.hashCode() * 31;
                String str = this.f88621b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f88620a, i);
                dest.writeString(this.f88621b);
            }

            public OpenStoreHome(StoreTab tab2, String str) {
                Intrinsics.checkNotNullParameter(tab2, "tab");
                this.f88620a = tab2;
                this.f88621b = str;
            }

            public /* synthetic */ OpenStoreHome(StoreTab storeTab, int i) {
                this((i & 1) != 0 ? StoreTab.Deals.f88623a : storeTab, (String) null);
            }
        }

        private StartType() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreDestination((StartType) parcel.readParcelable(StoreDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(StoreDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreDestination[i];
        }
    }

    public StoreDestination() {
        this((StartType) null, 3);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF88615c() {
        return this.f88615c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreDestination)) {
            return false;
        }
        StoreDestination storeDestination = (StoreDestination) obj2;
        return Intrinsics.f(this.f88614b, storeDestination.f88614b) && Intrinsics.f(this.f88615c, storeDestination.f88615c);
    }

    public final int hashCode() {
        int iHashCode = this.f88614b.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f88615c;
        return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88614b, i);
        dest.writeParcelable(this.f88615c, i);
    }

    public /* synthetic */ StoreDestination(StartType startType, int i) {
        this((i & 1) != 0 ? new StartType.OpenStoreHome((StoreTab) null, 3) : startType, (TransitionAnimation) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreDestination(StartType startType, TransitionAnimation transitionAnimation) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f88614b = startType;
        this.f88615c = transitionAnimation;
    }
}
