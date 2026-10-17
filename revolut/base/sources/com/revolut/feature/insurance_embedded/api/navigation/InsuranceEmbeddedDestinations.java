package com.revolut.feature.insurance_embedded.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bu7.k;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import dl7.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class InsuranceEmbeddedDestinations {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$CfacCoverageSelectionLayout;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CfacCoverageSelectionLayout implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CfacCoverageSelectionLayout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75851a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CfacCoverageSelectionLayout(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfacCoverageSelectionLayout[i];
            }
        }

        public CfacCoverageSelectionLayout(String insuranceProduct) {
            Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
            this.f75851a = insuranceProduct;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF75851a() {
            return this.f75851a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CfacCoverageSelectionLayout) && Intrinsics.f(this.f75851a, ((CfacCoverageSelectionLayout) obj2).f75851a);
        }

        public final int hashCode() {
            return this.f75851a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75851a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$CoverageDetails;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoverageDetails implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CoverageDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75853b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoverageDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageDetails[i];
            }
        }

        public CoverageDetails(String insuranceProduct, String coverageId) {
            Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
            Intrinsics.checkNotNullParameter(coverageId, "coverageId");
            this.f75852a = insuranceProduct;
            this.f75853b = coverageId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF75853b() {
            return this.f75853b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF75852a() {
            return this.f75852a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CoverageDetails)) {
                return false;
            }
            CoverageDetails coverageDetails = (CoverageDetails) obj2;
            return Intrinsics.f(this.f75852a, coverageDetails.f75852a) && Intrinsics.f(this.f75853b, coverageDetails.f75853b);
        }

        public final int hashCode() {
            return this.f75853b.hashCode() + (this.f75852a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75852a);
            dest.writeString(this.f75853b);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$CoverageList;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoverageList implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CoverageList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f75854a;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoverageList(k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageList[i];
            }
        }

        public CoverageList(k coverageGroup) {
            Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
            this.f75854a = coverageGroup;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CoverageList) && this.f75854a == ((CoverageList) obj2).f75854a;
        }

        public final int hashCode() {
            return this.f75854a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75854a.name());
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$Detail;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Detail implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<Detail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dl7.a f75856b;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Detail(parcel.readString(), dl7.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Detail[i];
            }
        }

        public Detail(String insuranceId, dl7.a type) {
            Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f75855a = insuranceId;
            this.f75856b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) obj2;
            return Intrinsics.f(this.f75855a, detail.f75855a) && this.f75856b == detail.f75856b;
        }

        public final int hashCode() {
            return this.f75856b.hashCode() + (this.f75855a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75855a);
            dest.writeString(this.f75856b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$DetailsLayout;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailsLayout implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<DetailsLayout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f75858b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DetailsLayout(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailsLayout[i];
            }
        }

        public DetailsLayout(String insuranceProduct, boolean z) {
            Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
            this.f75857a = insuranceProduct;
            this.f75858b = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF75858b() {
            return this.f75858b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF75857a() {
            return this.f75857a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailsLayout)) {
                return false;
            }
            DetailsLayout detailsLayout = (DetailsLayout) obj2;
            return Intrinsics.f(this.f75857a, detailsLayout.f75857a) && this.f75858b == detailsLayout.f75858b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75858b) + (this.f75857a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75857a);
            dest.writeInt(this.f75858b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$DocumentsLayout;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsLayout implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<DocumentsLayout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75859a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsLayout(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsLayout[i];
            }
        }

        public DocumentsLayout(String insuranceProduct) {
            Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
            this.f75859a = insuranceProduct;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF75859a() {
            return this.f75859a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentsLayout) && Intrinsics.f(this.f75859a, ((DocumentsLayout) obj2).f75859a);
        }

        public final int hashCode() {
            return this.f75859a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75859a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$GetHelp;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetHelp implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<GetHelp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dl7.a f75861b;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetHelp(parcel.readString(), dl7.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetHelp[i];
            }
        }

        public GetHelp(String insuranceId, dl7.a type) {
            Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f75860a = insuranceId;
            this.f75861b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GetHelp)) {
                return false;
            }
            GetHelp getHelp = (GetHelp) obj2;
            return Intrinsics.f(this.f75860a, getHelp.f75860a) && this.f75861b == getHelp.f75861b;
        }

        public final int hashCode() {
            return this.f75861b.hashCode() + (this.f75860a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75860a);
            dest.writeString(this.f75861b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$GetHelpLayout;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetHelpLayout implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<GetHelpLayout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75862a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetHelpLayout(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetHelpLayout[i];
            }
        }

        public GetHelpLayout(String insuranceProduct) {
            Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
            this.f75862a = insuranceProduct;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF75862a() {
            return this.f75862a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetHelpLayout) && Intrinsics.f(this.f75862a, ((GetHelpLayout) obj2).f75862a);
        }

        public final int hashCode() {
            return this.f75862a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75862a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$InsuranceDocumentsReview;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsuranceDocumentsReview implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<InsuranceDocumentsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75863a;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsuranceDocumentsReview(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsuranceDocumentsReview[i];
            }
        }

        public InsuranceDocumentsReview(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f75863a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsuranceDocumentsReview) && Intrinsics.f(this.f75863a, ((InsuranceDocumentsReview) obj2).f75863a);
        }

        public final int hashCode() {
            return this.f75863a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75863a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$MakeClaimLayout;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MakeClaimLayout implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<MakeClaimLayout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75864a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MakeClaimLayout(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MakeClaimLayout[i];
            }
        }

        public MakeClaimLayout(String insuranceProduct) {
            Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
            this.f75864a = insuranceProduct;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF75864a() {
            return this.f75864a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MakeClaimLayout) && Intrinsics.f(this.f75864a, ((MakeClaimLayout) obj2).f75864a);
        }

        public final int hashCode() {
            return this.f75864a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75864a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$PlanComparison;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanComparison implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanComparison> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f75865a;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanComparison(k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanComparison[i];
            }
        }

        public PlanComparison(k coverageGroup) {
            Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
            this.f75865a = coverageGroup;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanComparison) && this.f75865a == ((PlanComparison) obj2).f75865a;
        }

        public final int hashCode() {
            return this.f75865a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75865a.name());
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/navigation/InsuranceEmbeddedDestinations$SchemeInsurance;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SchemeInsurance implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SchemeInsurance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75866a;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SchemeInsurance(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SchemeInsurance[i];
            }
        }

        public SchemeInsurance(String product) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.f75866a = product;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SchemeInsurance) && Intrinsics.f(this.f75866a, ((SchemeInsurance) obj2).f75866a);
        }

        public final int hashCode() {
            return this.f75866a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75866a);
        }
    }

    private InsuranceEmbeddedDestinations() {
    }

    public static KompotBridgeFeatureConfig a(String insuranceId, a type) {
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new GetHelp(insuranceId, type), false, (Integer) null, 0, 61);
    }
}
