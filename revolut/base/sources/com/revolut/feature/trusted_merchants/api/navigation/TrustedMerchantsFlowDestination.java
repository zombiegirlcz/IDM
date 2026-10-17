package com.revolut.feature.trusted_merchants.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TrustedMerchantsFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TrustedMerchantsFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f94413b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f94414a;

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
            this.f94414a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f94414a, ((InputData) obj2).f94414a);
        }

        public final int hashCode() {
            return this.f94414a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94414a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$StartType;", "Landroid/os/Parcelable;", "<init>", "()V", "MerchantList", "MerchantDetails", "Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$StartType$MerchantDetails;", "Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$StartType$MerchantList;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$StartType$MerchantDetails;", "Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MerchantDetails extends StartType {

            @NotNull
            public static final Parcelable.Creator<MerchantDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TrustedMerchant.Approved f94415a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MerchantDetails(TrustedMerchant.Approved.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MerchantDetails[i];
                }
            }

            public MerchantDetails(TrustedMerchant.Approved merchant) {
                Intrinsics.checkNotNullParameter(merchant, "merchant");
                this.f94415a = merchant;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MerchantDetails) && Intrinsics.f(this.f94415a, ((MerchantDetails) obj2).f94415a);
            }

            public final int hashCode() {
                return this.f94415a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f94415a.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$StartType$MerchantList;", "Lcom/revolut/feature/trusted_merchants/api/navigation/TrustedMerchantsFlowDestination$StartType;", "<init>", "()V", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MerchantList extends StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MerchantList f94416a = new MerchantList();

            @NotNull
            public static final Parcelable.Creator<MerchantList> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MerchantList.f94416a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MerchantList[i];
                }
            }

            private MerchantList() {
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

        private StartType() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrustedMerchantsFlowDestination((StartType) parcel.readParcelable(TrustedMerchantsFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrustedMerchantsFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedMerchantsFlowDestination(StartType startType) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f94413b = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TrustedMerchantsFlowDestination) && Intrinsics.f(this.f94413b, ((TrustedMerchantsFlowDestination) obj2).f94413b);
    }

    public final int hashCode() {
        return this.f94413b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94413b, i);
    }
}
