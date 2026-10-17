package com.revolut.feature.shops.impl.flow.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Home", "Map", "CarouselDetails", "FullScreenPrompt", "AuctionBid", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$AuctionBid;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$CarouselDetails;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$FullScreenPrompt;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$Home;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$Map;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShopsSessionFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$AuctionBid;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuctionBid extends ShopsSessionFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AuctionBid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87095b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuctionBid(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuctionBid[i];
            }
        }

        public AuctionBid(String auctionId, String str) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f87094a = auctionId;
            this.f87095b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuctionBid)) {
                return false;
            }
            AuctionBid auctionBid = (AuctionBid) obj2;
            return Intrinsics.f(this.f87094a, auctionBid.f87094a) && Intrinsics.f(this.f87095b, auctionBid.f87095b);
        }

        public final int hashCode() {
            int iHashCode = this.f87094a.hashCode() * 31;
            String str = this.f87095b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87094a);
            dest.writeString(this.f87095b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$CarouselDetails;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CarouselDetails extends ShopsSessionFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CarouselDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87097b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CarouselDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarouselDetails[i];
            }
        }

        public CarouselDetails(String carouselId, String carouselTitle) {
            Intrinsics.checkNotNullParameter(carouselId, "carouselId");
            Intrinsics.checkNotNullParameter(carouselTitle, "carouselTitle");
            this.f87096a = carouselId;
            this.f87097b = carouselTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CarouselDetails)) {
                return false;
            }
            CarouselDetails carouselDetails = (CarouselDetails) obj2;
            return Intrinsics.f(this.f87096a, carouselDetails.f87096a) && Intrinsics.f(this.f87097b, carouselDetails.f87097b);
        }

        public final int hashCode() {
            return this.f87097b.hashCode() + (this.f87096a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87096a);
            dest.writeString(this.f87097b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$FullScreenPrompt;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullScreenPrompt extends ShopsSessionFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<FullScreenPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f87098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87099b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(FullScreenPrompt.class, parcel, arrayList, iE, 1);
                }
                return new FullScreenPrompt(arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FullScreenPrompt[i];
            }
        }

        public FullScreenPrompt(List promptTypes, String source) {
            Intrinsics.checkNotNullParameter(promptTypes, "promptTypes");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f87098a = promptTypes;
            this.f87099b = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FullScreenPrompt)) {
                return false;
            }
            FullScreenPrompt fullScreenPrompt = (FullScreenPrompt) obj2;
            return Intrinsics.f(this.f87098a, fullScreenPrompt.f87098a) && Intrinsics.f(this.f87099b, fullScreenPrompt.f87099b);
        }

        public final int hashCode() {
            return this.f87099b.hashCode() + (this.f87098a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f87098a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f87099b);
        }
    }

    private ShopsSessionFlowContract$InputData() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$Home;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends ShopsSessionFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87100a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(String str) {
            this.f87100a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f87100a, ((Home) obj2).f87100a);
        }

        public final int hashCode() {
            String str = this.f87100a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87100a);
        }

        public Home() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData$Map;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Map extends ShopsSessionFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Map> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final co3.a f87101a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Map((co3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Map[i];
            }
        }

        public Map(co3.a aVar) {
            this.f87101a = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Map) && Intrinsics.f(this.f87101a, ((Map) obj2).f87101a);
        }

        public final int hashCode() {
            co3.a aVar = this.f87101a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87101a);
        }

        public Map() {
            this(null);
        }
    }
}
