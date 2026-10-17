package com.revolut.feature.shops.impl.ui.bid_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductArticleAuction", "PlaceBid", "CustomBidInput", "Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step$CustomBidInput;", "Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step$PlaceBid;", "Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step$ProductArticleAuction;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShopsBidFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step$CustomBidInput;", "Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomBidInput extends ShopsBidFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomBidInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f87135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f87136c;
        public final double d;
        public final double e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                double d = parcel.readDouble();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int i2 = 0;
                while (true) {
                    double d5 = parcel.readDouble();
                    if (i2 == i) {
                        return new CustomBidInput(d, d5, parcel.readDouble(), string, arrayList);
                    }
                    arrayList.add(Double.valueOf(d5));
                    i2++;
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomBidInput[i];
            }
        }

        public CustomBidInput(double d, double d5, double d6, String auctionId, List suggestedValues) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            Intrinsics.checkNotNullParameter(suggestedValues, "suggestedValues");
            this.f87134a = auctionId;
            this.f87135b = d;
            this.f87136c = suggestedValues;
            this.d = d5;
            this.e = d6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomBidInput)) {
                return false;
            }
            CustomBidInput customBidInput = (CustomBidInput) obj2;
            return Intrinsics.f(this.f87134a, customBidInput.f87134a) && Double.compare(this.f87135b, customBidInput.f87135b) == 0 && Intrinsics.f(this.f87136c, customBidInput.f87136c) && Double.compare(this.d, customBidInput.d) == 0 && Double.compare(this.e, customBidInput.e) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.e) + m72.b.c(p.a.d(m72.b.c(this.f87134a.hashCode() * 31, this.f87135b, 31), 31, this.f87136c), this.d, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87134a);
            dest.writeDouble(this.f87135b);
            Iterator itV = p.a.v(this.f87136c, dest);
            while (itV.hasNext()) {
                dest.writeDouble(((Number) itV.next()).doubleValue());
            }
            dest.writeDouble(this.d);
            dest.writeDouble(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step$PlaceBid;", "Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlaceBid extends ShopsBidFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlaceBid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f87138b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlaceBid(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceBid[i];
            }
        }

        public PlaceBid(String auctionId, Double d) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f87137a = auctionId;
            this.f87138b = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlaceBid)) {
                return false;
            }
            PlaceBid placeBid = (PlaceBid) obj2;
            return Intrinsics.f(this.f87137a, placeBid.f87137a) && Intrinsics.f(this.f87138b, placeBid.f87138b);
        }

        public final int hashCode() {
            int iHashCode = this.f87137a.hashCode() * 31;
            Double d = this.f87138b;
            return iHashCode + (d == null ? 0 : d.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87137a);
            Double d = this.f87138b;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step$ProductArticleAuction;", "Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticleAuction extends ShopsBidFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticleAuction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87140b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticleAuction(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticleAuction[i];
            }
        }

        public ProductArticleAuction(String articleId, String auctionId) {
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f87139a = articleId;
            this.f87140b = auctionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticleAuction)) {
                return false;
            }
            ProductArticleAuction productArticleAuction = (ProductArticleAuction) obj2;
            return Intrinsics.f(this.f87139a, productArticleAuction.f87139a) && Intrinsics.f(this.f87140b, productArticleAuction.f87140b);
        }

        public final int hashCode() {
            return this.f87140b.hashCode() + (this.f87139a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87139a);
            dest.writeString(this.f87140b);
        }
    }

    private ShopsBidFlowContract$Step() {
    }
}
