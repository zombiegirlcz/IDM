package com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/my_claims/status_update/CFACClaimStatusUpdateScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "InReviewProgress", "DeclinedProgress", "Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/status_update/CFACClaimStatusUpdateScreenContract$InputData$DeclinedProgress;", "Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/status_update/CFACClaimStatusUpdateScreenContract$InputData$InReviewProgress;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CFACClaimStatusUpdateScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/status_update/CFACClaimStatusUpdateScreenContract$InputData$DeclinedProgress;", "Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/status_update/CFACClaimStatusUpdateScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclinedProgress extends CFACClaimStatusUpdateScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DeclinedProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dl7.a f75144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f75145c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclinedProgress(dl7.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclinedProgress[i];
            }
        }

        public DeclinedProgress(dl7.a policySubtype, String policyId, String claimMessage) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            Intrinsics.checkNotNullParameter(policySubtype, "policySubtype");
            Intrinsics.checkNotNullParameter(claimMessage, "claimMessage");
            this.f75143a = policyId;
            this.f75144b = policySubtype;
            this.f75145c = claimMessage;
        }

        @Override // com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF75146a() {
            return this.f75143a;
        }

        @Override // com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final dl7.a getF75147b() {
            return this.f75144b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclinedProgress)) {
                return false;
            }
            DeclinedProgress declinedProgress = (DeclinedProgress) obj2;
            return Intrinsics.f(this.f75143a, declinedProgress.f75143a) && this.f75144b == declinedProgress.f75144b && Intrinsics.f(this.f75145c, declinedProgress.f75145c);
        }

        public final int hashCode() {
            return this.f75145c.hashCode() + ((this.f75144b.hashCode() + (this.f75143a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75143a);
            dest.writeString(this.f75144b.name());
            dest.writeString(this.f75145c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/status_update/CFACClaimStatusUpdateScreenContract$InputData$InReviewProgress;", "Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/status_update/CFACClaimStatusUpdateScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InReviewProgress extends CFACClaimStatusUpdateScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<InReviewProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dl7.a f75147b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InReviewProgress(parcel.readString(), dl7.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InReviewProgress[i];
            }
        }

        public InReviewProgress(String policyId, dl7.a policySubtype) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            Intrinsics.checkNotNullParameter(policySubtype, "policySubtype");
            this.f75146a = policyId;
            this.f75147b = policySubtype;
        }

        @Override // com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF75146a() {
            return this.f75146a;
        }

        @Override // com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final dl7.a getF75147b() {
            return this.f75147b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InReviewProgress)) {
                return false;
            }
            InReviewProgress inReviewProgress = (InReviewProgress) obj2;
            return Intrinsics.f(this.f75146a, inReviewProgress.f75146a) && this.f75147b == inReviewProgress.f75147b;
        }

        public final int hashCode() {
            return this.f75147b.hashCode() + (this.f75146a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75146a);
            dest.writeString(this.f75147b.name());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF75146a();

    /* JADX INFO: renamed from: b */
    public abstract dl7.a getF75147b();
}
