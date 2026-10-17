package com.revolut.retail.feature.airportlounges.impl.ui.screens.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.e;
import svi.k;
import svi.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPointsBottomSheet", "UnlimitedProfileSwitchBottomSheet", "PassBreakdown", "GiftedPassesBreakdown", "HelpBottomSheet", "ProductArticle", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$GiftedPassesBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$HelpBottomSheet;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$PassBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$ProductArticle;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$UnlimitedProfileSwitchBottomSheet;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportLoungesHomeScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$GiftedPassesBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiftedPassesBreakdown implements AirportLoungesHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<GiftedPassesBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f99077a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiftedPassesBreakdown((e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftedPassesBreakdown[i];
            }
        }

        public GiftedPassesBreakdown(e giftedPasses) {
            Intrinsics.checkNotNullParameter(giftedPasses, "giftedPasses");
            this.f99077a = giftedPasses;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GiftedPassesBreakdown) && Intrinsics.f(this.f99077a, ((GiftedPassesBreakdown) obj2).f99077a);
        }

        public final int hashCode() {
            return this.f99077a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99077a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$HelpBottomSheet;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HelpBottomSheet implements AirportLoungesHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<HelpBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f99078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f99079b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HelpBottomSheet((k) parcel.readSerializable(), (w) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HelpBottomSheet[i];
            }
        }

        public HelpBottomSheet(k pass, w wVar) {
            Intrinsics.checkNotNullParameter(pass, "pass");
            this.f99078a = pass;
            this.f99079b = wVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HelpBottomSheet)) {
                return false;
            }
            HelpBottomSheet helpBottomSheet = (HelpBottomSheet) obj2;
            return Intrinsics.f(this.f99078a, helpBottomSheet.f99078a) && Intrinsics.f(this.f99079b, helpBottomSheet.f99079b);
        }

        public final int hashCode() {
            int iHashCode = this.f99078a.hashCode() * 31;
            w wVar = this.f99079b;
            return iHashCode + (wVar == null ? 0 : wVar.f266012a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99078a);
            dest.writeSerializable(this.f99079b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$PassBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassBreakdown implements AirportLoungesHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PassBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f99080a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassBreakdown((k) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassBreakdown[i];
            }
        }

        public PassBreakdown(k pass) {
            Intrinsics.checkNotNullParameter(pass, "pass");
            this.f99080a = pass;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PassBreakdown) && Intrinsics.f(this.f99080a, ((PassBreakdown) obj2).f99080a);
        }

        public final int hashCode() {
            return this.f99080a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99080a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$ProductArticle;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements AirportLoungesHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f99081a;

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
            this.f99081a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f99081a, ((ProductArticle) obj2).f99081a);
        }

        public final int hashCode() {
            return this.f99081a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99081a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsBottomSheet implements AirportLoungesHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsBottomSheet f99082a = new RevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<RevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsBottomSheet.f99082a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsBottomSheet[i];
            }
        }

        private RevPointsBottomSheet() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep$UnlimitedProfileSwitchBottomSheet;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnlimitedProfileSwitchBottomSheet implements AirportLoungesHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnlimitedProfileSwitchBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData f99083a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnlimitedProfileSwitchBottomSheet(AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnlimitedProfileSwitchBottomSheet[i];
            }
        }

        public UnlimitedProfileSwitchBottomSheet(AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f99083a = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnlimitedProfileSwitchBottomSheet) && Intrinsics.f(this.f99083a, ((UnlimitedProfileSwitchBottomSheet) obj2).f99083a);
        }

        public final int hashCode() {
            return this.f99083a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99083a.writeToParcel(dest, i);
        }
    }
}
