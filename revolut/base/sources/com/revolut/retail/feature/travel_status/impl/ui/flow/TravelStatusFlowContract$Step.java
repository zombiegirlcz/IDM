package com.revolut.retail.feature.travel_status.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerActionBottomSheetData;
import i2l.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Overview", "Partner", "Enrollment", "ProductArticle", "PartnerActionBottomSheet", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$Enrollment;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$Partner;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$PartnerActionBottomSheet;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$ProductArticle;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelStatusFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$Enrollment;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Enrollment implements TravelStatusFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Enrollment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelStatusLinkAccountInfo f104304b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Enrollment(parcel.readString(), TravelStatusLinkAccountInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Enrollment[i];
            }
        }

        public Enrollment(String partnerId, TravelStatusLinkAccountInfo linkAccountInfo) {
            Intrinsics.checkNotNullParameter(partnerId, "partnerId");
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            this.f104303a = partnerId;
            this.f104304b = linkAccountInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Enrollment)) {
                return false;
            }
            Enrollment enrollment = (Enrollment) obj2;
            return Intrinsics.f(this.f104303a, enrollment.f104303a) && Intrinsics.f(this.f104304b, enrollment.f104304b);
        }

        public final int hashCode() {
            return this.f104304b.hashCode() + (this.f104303a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104303a);
            this.f104304b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview implements TravelStatusFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overview f104305a = new Overview();

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Overview.f104305a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        private Overview() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Overview);
        }

        public final int hashCode() {
            return -276742705;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$Partner;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Partner implements TravelStatusFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Partner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104306a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Partner(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Partner[i];
            }
        }

        public Partner(String partnerId) {
            Intrinsics.checkNotNullParameter(partnerId, "partnerId");
            this.f104306a = partnerId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Partner) && Intrinsics.f(this.f104306a, ((Partner) obj2).f104306a);
        }

        public final int hashCode() {
            return this.f104306a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104306a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$PartnerActionBottomSheet;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartnerActionBottomSheet implements TravelStatusFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PartnerActionBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelStatusPartnerActionBottomSheetData f104307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f104309c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartnerActionBottomSheet(TravelStatusPartnerActionBottomSheetData.CREATOR.createFromParcel(parcel), p.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartnerActionBottomSheet[i];
            }
        }

        public PartnerActionBottomSheet(TravelStatusPartnerActionBottomSheetData data, p confirmAction, String partnerId) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(partnerId, "partnerId");
            Intrinsics.checkNotNullParameter(confirmAction, "confirmAction");
            this.f104307a = data;
            this.f104308b = partnerId;
            this.f104309c = confirmAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PartnerActionBottomSheet)) {
                return false;
            }
            PartnerActionBottomSheet partnerActionBottomSheet = (PartnerActionBottomSheet) obj2;
            return Intrinsics.f(this.f104307a, partnerActionBottomSheet.f104307a) && Intrinsics.f(this.f104308b, partnerActionBottomSheet.f104308b) && this.f104309c == partnerActionBottomSheet.f104309c;
        }

        public final int hashCode() {
            return this.f104309c.hashCode() + p.a.c(this.f104307a.hashCode() * 31, 31, this.f104308b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f104307a.writeToParcel(dest, i);
            dest.writeString(this.f104308b);
            dest.writeString(this.f104309c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements TravelStatusFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f104310a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f104310a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f104310a, ((ProductArticle) obj2).f104310a);
        }

        public final int hashCode() {
            return this.f104310a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104310a, i);
        }
    }
}
