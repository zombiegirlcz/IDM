package com.revolut.feature.shops.impl.flow.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.shops.api.model.ShopsCampaignDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Home", "CarouselDetails", "PurchaseDetails", "Search", "MapView", "CampaignCheckout", "FullScreenPrompt", "Onboarding", "AuctionBid", "OptIn", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$AuctionBid;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$CampaignCheckout;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$CarouselDetails;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$FullScreenPrompt;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$Home;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$MapView;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$Onboarding;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$OptIn;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$PurchaseDetails;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$Search;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShopsSessionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$AuctionBid;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuctionBid extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuctionBid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87103b;

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
            this.f87102a = auctionId;
            this.f87103b = str;
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
            return Intrinsics.f(this.f87102a, auctionBid.f87102a) && Intrinsics.f(this.f87103b, auctionBid.f87103b);
        }

        public final int hashCode() {
            int iHashCode = this.f87102a.hashCode() * 31;
            String str = this.f87103b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87102a);
            dest.writeString(this.f87103b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$CampaignCheckout;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CampaignCheckout extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CampaignCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShopsCampaignDetails f87104a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CampaignCheckout((ShopsCampaignDetails) parcel.readParcelable(CampaignCheckout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CampaignCheckout[i];
            }
        }

        public CampaignCheckout(ShopsCampaignDetails shopsCampaignDetails) {
            Intrinsics.checkNotNullParameter(shopsCampaignDetails, "shopsCampaignDetails");
            this.f87104a = shopsCampaignDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CampaignCheckout) && Intrinsics.f(this.f87104a, ((CampaignCheckout) obj2).f87104a);
        }

        public final int hashCode() {
            return this.f87104a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87104a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$CarouselDetails;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CarouselDetails extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CarouselDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87106b;

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

        public CarouselDetails(String carouselTitle, String carouselId) {
            Intrinsics.checkNotNullParameter(carouselTitle, "carouselTitle");
            Intrinsics.checkNotNullParameter(carouselId, "carouselId");
            this.f87105a = carouselTitle;
            this.f87106b = carouselId;
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
            return Intrinsics.f(this.f87105a, carouselDetails.f87105a) && Intrinsics.f(this.f87106b, carouselDetails.f87106b);
        }

        public final int hashCode() {
            return this.f87106b.hashCode() + (this.f87105a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87105a);
            dest.writeString(this.f87106b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$FullScreenPrompt;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullScreenPrompt extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FullScreenPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f87107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87108b;

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
            this.f87107a = promptTypes;
            this.f87108b = source;
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
            return Intrinsics.f(this.f87107a, fullScreenPrompt.f87107a) && Intrinsics.f(this.f87108b, fullScreenPrompt.f87108b);
        }

        public final int hashCode() {
            return this.f87108b.hashCode() + (this.f87107a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f87107a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f87108b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$MapView;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MapView extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MapView> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final co3.a f87110a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MapView((co3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MapView[i];
            }
        }

        public MapView(co3.a aVar) {
            this.f87110a = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MapView) && Intrinsics.f(this.f87110a, ((MapView) obj2).f87110a);
        }

        public final int hashCode() {
            co3.a aVar = this.f87110a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87110a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$Onboarding;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f87111a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarding((ProductArticleParams) parcel.readParcelable(Onboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        public Onboarding(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f87111a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onboarding) && Intrinsics.f(this.f87111a, ((Onboarding) obj2).f87111a);
        }

        public final int hashCode() {
            return this.f87111a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87111a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$PurchaseDetails;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurchaseDetails extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PurchaseDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87114b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurchaseDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurchaseDetails[i];
            }
        }

        public PurchaseDetails(String carouselTitle, String carouselId) {
            Intrinsics.checkNotNullParameter(carouselTitle, "carouselTitle");
            Intrinsics.checkNotNullParameter(carouselId, "carouselId");
            this.f87113a = carouselTitle;
            this.f87114b = carouselId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PurchaseDetails)) {
                return false;
            }
            PurchaseDetails purchaseDetails = (PurchaseDetails) obj2;
            return Intrinsics.f(this.f87113a, purchaseDetails.f87113a) && Intrinsics.f(this.f87114b, purchaseDetails.f87114b);
        }

        public final int hashCode() {
            return this.f87114b.hashCode() + (this.f87113a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87113a);
            dest.writeString(this.f87114b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$Search;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "<init>", "()V", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Search extends ShopsSessionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Search f87115a = new Search();

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Search.f87115a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        private Search() {
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

    private ShopsSessionFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$Home;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87109a;

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
            this.f87109a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f87109a, ((Home) obj2).f87109a);
        }

        public final int hashCode() {
            String str = this.f87109a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87109a);
        }

        public Home() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step$OptIn;", "Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptIn extends ShopsSessionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87112a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptIn(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        public OptIn(String str) {
            this.f87112a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptIn) && Intrinsics.f(this.f87112a, ((OptIn) obj2).f87112a);
        }

        public final int hashCode() {
            String str = this.f87112a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87112a);
        }

        public OptIn() {
            this(null);
        }
    }
}
