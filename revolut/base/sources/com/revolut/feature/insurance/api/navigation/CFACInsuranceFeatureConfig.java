package com.revolut.feature.insurance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import dl7.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Details", "MakeClaim", "Documents", "DetailsDestination", "MakeClaimDestination", "DocumentsDestination", "ClaimDetailsDestination", "Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$Details;", "Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$Documents;", "Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$MakeClaim;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CFACInsuranceFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$ClaimDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimDetailsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ClaimDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75015a;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimDetailsDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimDetailsDestination[i];
            }
        }

        public ClaimDetailsDestination(String claimId) {
            Intrinsics.checkNotNullParameter(claimId, "claimId");
            this.f75015a = claimId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimDetailsDestination) && Intrinsics.f(this.f75015a, ((ClaimDetailsDestination) obj2).f75015a);
        }

        public final int hashCode() {
            return this.f75015a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75015a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$Details;", "Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends CFACInsuranceFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f75016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f75017h;
        public final ActivityAnimation i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), (b) parcel.readSerializable(), (ActivityAnimation) parcel.readParcelable(Details.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Details(String insuranceId, b subtypeInfo, ActivityAnimation activityAnimation) {
            super(activityAnimation, new DetailsDestination(insuranceId, subtypeInfo), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
            Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
            this.f75016g = insuranceId;
            this.f75017h = subtypeInfo;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f75016g, details.f75016g) && Intrinsics.f(this.f75017h, details.f75017h) && Intrinsics.f(this.i, details.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f75017h.hashCode() + (this.f75016g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75016g);
            dest.writeSerializable(this.f75017h);
            dest.writeParcelable(this.i, i);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$DetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<DetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f75019b;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DetailsDestination(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailsDestination[i];
            }
        }

        public DetailsDestination(String insuranceId, b subtypeInfo) {
            Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
            Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
            this.f75018a = insuranceId;
            this.f75019b = subtypeInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailsDestination)) {
                return false;
            }
            DetailsDestination detailsDestination = (DetailsDestination) obj2;
            return Intrinsics.f(this.f75018a, detailsDestination.f75018a) && Intrinsics.f(this.f75019b, detailsDestination.f75019b);
        }

        public final int hashCode() {
            return this.f75019b.hashCode() + (this.f75018a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75018a);
            dest.writeSerializable(this.f75019b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$Documents;", "Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents extends CFACInsuranceFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f75020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CFACProductDetails f75021h;
        public final CFACReimbursementType i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f75022j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents(parcel.readString(), CFACProductDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CFACReimbursementType.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Documents.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Documents(String insuranceId, CFACProductDetails productDetails, CFACReimbursementType cFACReimbursementType, ActivityAnimation activityAnimation) {
            super(activityAnimation, new DocumentsDestination(insuranceId, productDetails, cFACReimbursementType), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
            Intrinsics.checkNotNullParameter(productDetails, "productDetails");
            this.f75020g = insuranceId;
            this.f75021h = productDetails;
            this.i = cFACReimbursementType;
            this.f75022j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.f75022j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Documents)) {
                return false;
            }
            Documents documents = (Documents) obj2;
            return Intrinsics.f(this.f75020g, documents.f75020g) && Intrinsics.f(this.f75021h, documents.f75021h) && this.i == documents.i && Intrinsics.f(this.f75022j, documents.f75022j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f75021h.hashCode() + (this.f75020g.hashCode() * 31)) * 31;
            CFACReimbursementType cFACReimbursementType = this.i;
            int iHashCode2 = (iHashCode + (cFACReimbursementType == null ? 0 : cFACReimbursementType.hashCode())) * 31;
            ActivityAnimation activityAnimation = this.f75022j;
            return iHashCode2 + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75020g);
            this.f75021h.writeToParcel(dest, i);
            CFACReimbursementType cFACReimbursementType = this.i;
            if (cFACReimbursementType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cFACReimbursementType.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f75022j, i);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$DocumentsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<DocumentsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CFACProductDetails f75024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CFACReimbursementType f75025c;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsDestination(parcel.readString(), CFACProductDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CFACReimbursementType.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsDestination[i];
            }
        }

        public DocumentsDestination(String insuranceId, CFACProductDetails productDetails, CFACReimbursementType cFACReimbursementType) {
            Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
            Intrinsics.checkNotNullParameter(productDetails, "productDetails");
            this.f75023a = insuranceId;
            this.f75024b = productDetails;
            this.f75025c = cFACReimbursementType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentsDestination)) {
                return false;
            }
            DocumentsDestination documentsDestination = (DocumentsDestination) obj2;
            return Intrinsics.f(this.f75023a, documentsDestination.f75023a) && Intrinsics.f(this.f75024b, documentsDestination.f75024b) && this.f75025c == documentsDestination.f75025c;
        }

        public final int hashCode() {
            int iHashCode = (this.f75024b.hashCode() + (this.f75023a.hashCode() * 31)) * 31;
            CFACReimbursementType cFACReimbursementType = this.f75025c;
            return iHashCode + (cFACReimbursementType == null ? 0 : cFACReimbursementType.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75023a);
            this.f75024b.writeToParcel(dest, i);
            CFACReimbursementType cFACReimbursementType = this.f75025c;
            if (cFACReimbursementType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cFACReimbursementType.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$MakeClaim;", "Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MakeClaim extends CFACInsuranceFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MakeClaim> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CFACInsuranceDetails f75026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f75027h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f75028j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MakeClaim(CFACInsuranceDetails.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable(), parcel.readInt() != 0, (ActivityAnimation) parcel.readParcelable(MakeClaim.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MakeClaim[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MakeClaim(CFACInsuranceDetails cfacInsuranceDetails, b subtypeInfo, boolean z, ActivityAnimation activityAnimation) {
            super(activityAnimation, new MakeClaimDestination(cfacInsuranceDetails, subtypeInfo, z), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(cfacInsuranceDetails, "cfacInsuranceDetails");
            Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
            this.f75026g = cfacInsuranceDetails;
            this.f75027h = subtypeInfo;
            this.i = z;
            this.f75028j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getI() {
            return this.f75028j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MakeClaim)) {
                return false;
            }
            MakeClaim makeClaim = (MakeClaim) obj2;
            return Intrinsics.f(this.f75026g, makeClaim.f75026g) && Intrinsics.f(this.f75027h, makeClaim.f75027h) && this.i == makeClaim.i && Intrinsics.f(this.f75028j, makeClaim.f75028j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = j6.a.c((this.f75027h.hashCode() + (this.f75026g.hashCode() * 31)) * 31, 31, this.i);
            ActivityAnimation activityAnimation = this.f75028j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75026g.writeToParcel(dest, i);
            dest.writeSerializable(this.f75027h);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeParcelable(this.f75028j, i);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/navigation/CFACInsuranceFeatureConfig$MakeClaimDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MakeClaimDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<MakeClaimDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACInsuranceDetails f75029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f75030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75031c;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MakeClaimDestination(CFACInsuranceDetails.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MakeClaimDestination[i];
            }
        }

        public MakeClaimDestination(CFACInsuranceDetails cfacInsuranceDetails, b subtypeInfo, boolean z) {
            Intrinsics.checkNotNullParameter(cfacInsuranceDetails, "cfacInsuranceDetails");
            Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
            this.f75029a = cfacInsuranceDetails;
            this.f75030b = subtypeInfo;
            this.f75031c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MakeClaimDestination)) {
                return false;
            }
            MakeClaimDestination makeClaimDestination = (MakeClaimDestination) obj2;
            return Intrinsics.f(this.f75029a, makeClaimDestination.f75029a) && Intrinsics.f(this.f75030b, makeClaimDestination.f75030b) && this.f75031c == makeClaimDestination.f75031c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75031c) + ((this.f75030b.hashCode() + (this.f75029a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75029a.writeToParcel(dest, i);
            dest.writeSerializable(this.f75030b);
            dest.writeInt(this.f75031c ? 1 : 0);
        }
    }
}
