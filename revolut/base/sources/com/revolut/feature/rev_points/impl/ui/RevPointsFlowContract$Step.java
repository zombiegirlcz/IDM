package com.revolut.feature.rev_points.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.ChallengeId;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import d73.n;
import eub.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.p;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"com/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OpenChallengesGrid", "OpenTransactionsList", "OpenTransactionDetails", "OpenTransactionDetailsByTransactionId", "OpenTransactionDetailsPager", "OpenChallengeDetails", "OpenUpsellSelectPlan", "OpenRedeemHub", "OpenEarnHub", "OpenLearnScreen", "OpenRelatedTransactionsBottomSheet", "OpenChallengeDetailsBottomSheet", "OpenRevPointsExpiryHome", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenChallengeDetails;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenChallengeDetailsBottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenChallengesGrid;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenEarnHub;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenLearnScreen;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenRedeemHub;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenRelatedTransactionsBottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenRevPointsExpiryHome;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionDetails;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionDetailsByTransactionId;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionDetailsPager;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionsList;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenUpsellSelectPlan;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenChallengeDetails;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenChallengeDetails extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenChallengeDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChallengeId f83736a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenChallengeDetails((ChallengeId) parcel.readParcelable(OpenChallengeDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenChallengeDetails[i];
            }
        }

        public OpenChallengeDetails(ChallengeId challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.f83736a = challengeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenChallengeDetails) && Intrinsics.f(this.f83736a, ((OpenChallengeDetails) obj2).f83736a);
        }

        public final int hashCode() {
            return this.f83736a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83736a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenChallengeDetailsBottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenChallengeDetailsBottomSheet extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenChallengeDetailsBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83737a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenChallengeDetailsBottomSheet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenChallengeDetailsBottomSheet[i];
            }
        }

        public OpenChallengeDetailsBottomSheet(String challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.f83737a = challengeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenChallengeDetailsBottomSheet) && Intrinsics.f(this.f83737a, ((OpenChallengeDetailsBottomSheet) obj2).f83737a);
        }

        public final int hashCode() {
            return this.f83737a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83737a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenEarnHub;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenEarnHub extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenEarnHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevPointsFlowDestination.EarnHubPendingAction f83740b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenEarnHub(parcel.readInt() != 0, (RevPointsFlowDestination.EarnHubPendingAction) parcel.readParcelable(OpenEarnHub.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenEarnHub[i];
            }
        }

        public OpenEarnHub(boolean z, RevPointsFlowDestination.EarnHubPendingAction pendingAction) {
            Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
            this.f83739a = z;
            this.f83740b = pendingAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenEarnHub)) {
                return false;
            }
            OpenEarnHub openEarnHub = (OpenEarnHub) obj2;
            return this.f83739a == openEarnHub.f83739a && Intrinsics.f(this.f83740b, openEarnHub.f83740b);
        }

        public final int hashCode() {
            return this.f83740b.hashCode() + (Boolean.hashCode(this.f83739a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83739a ? 1 : 0);
            dest.writeParcelable(this.f83740b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenLearnScreen;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenLearnScreen extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenLearnScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f83741a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenLearnScreen(p.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenLearnScreen[i];
            }
        }

        public OpenLearnScreen(p learnType) {
            Intrinsics.checkNotNullParameter(learnType, "learnType");
            this.f83741a = learnType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenLearnScreen) && this.f83741a == ((OpenLearnScreen) obj2).f83741a;
        }

        public final int hashCode() {
            return this.f83741a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83741a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenRedeemHub;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenRedeemHub extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenRedeemHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83742a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenRedeemHub(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenRedeemHub[i];
            }
        }

        public OpenRedeemHub(boolean z) {
            this.f83742a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenRedeemHub) && this.f83742a == ((OpenRedeemHub) obj2).f83742a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83742a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83742a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenRelatedTransactionsBottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenRelatedTransactionsBottomSheet extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenRelatedTransactionsBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f83743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevPoints f83744b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenRelatedTransactionsBottomSheet(parcel.createStringArrayList(), (RevPoints) parcel.readParcelable(OpenRelatedTransactionsBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenRelatedTransactionsBottomSheet[i];
            }
        }

        public OpenRelatedTransactionsBottomSheet(List relatedLoyaltyTransactionIds, RevPoints totalEarnedPoints) {
            Intrinsics.checkNotNullParameter(relatedLoyaltyTransactionIds, "relatedLoyaltyTransactionIds");
            Intrinsics.checkNotNullParameter(totalEarnedPoints, "totalEarnedPoints");
            this.f83743a = relatedLoyaltyTransactionIds;
            this.f83744b = totalEarnedPoints;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenRelatedTransactionsBottomSheet)) {
                return false;
            }
            OpenRelatedTransactionsBottomSheet openRelatedTransactionsBottomSheet = (OpenRelatedTransactionsBottomSheet) obj2;
            return Intrinsics.f(this.f83743a, openRelatedTransactionsBottomSheet.f83743a) && Intrinsics.f(this.f83744b, openRelatedTransactionsBottomSheet.f83744b);
        }

        public final int hashCode() {
            return this.f83744b.f83960a.hashCode() + (this.f83743a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f83743a);
            dest.writeParcelable(this.f83744b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenRevPointsExpiryHome;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenRevPointsExpiryHome extends RevPointsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenRevPointsExpiryHome f83745a = new OpenRevPointsExpiryHome();

        @NotNull
        public static final Parcelable.Creator<OpenRevPointsExpiryHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenRevPointsExpiryHome.f83745a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenRevPointsExpiryHome[i];
            }
        }

        private OpenRevPointsExpiryHome() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionDetails;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenTransactionDetails extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenTransactionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsTransaction f83746a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenTransactionDetails((RevPointsTransaction) parcel.readParcelable(OpenTransactionDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenTransactionDetails[i];
            }
        }

        public OpenTransactionDetails(RevPointsTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f83746a = transaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenTransactionDetails) && Intrinsics.f(this.f83746a, ((OpenTransactionDetails) obj2).f83746a);
        }

        public final int hashCode() {
            return this.f83746a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83746a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionDetailsByTransactionId;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenTransactionDetailsByTransactionId extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenTransactionDetailsByTransactionId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83747a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenTransactionDetailsByTransactionId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenTransactionDetailsByTransactionId[i];
            }
        }

        public OpenTransactionDetailsByTransactionId(String transactionId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f83747a = transactionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenTransactionDetailsByTransactionId) && Intrinsics.f(this.f83747a, ((OpenTransactionDetailsByTransactionId) obj2).f83747a);
        }

        public final int hashCode() {
            return this.f83747a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83747a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionDetailsPager;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenTransactionDetailsPager extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenTransactionDetailsPager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f83748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RevPointsTransaction f83750c;
        public final RevPointsTransactionPageParams d;
        public final String e;
        public final l f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f83751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final n f83752h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenTransactionDetailsPager(null, parcel.readString(), (RevPointsTransaction) parcel.readParcelable(OpenTransactionDetailsPager.class.getClassLoader()), (RevPointsTransactionPageParams) parcel.readParcelable(OpenTransactionDetailsPager.class.getClassLoader()), parcel.readString(), null, parcel.readInt() != 0, null, 161);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenTransactionDetailsPager[i];
            }
        }

        public OpenTransactionDetailsPager(List transactionsList, String selectedTransactionId, RevPointsTransaction initialTransaction, RevPointsTransactionPageParams pageParams, String searchQuery, l lVar, boolean z, n nVar, int i) {
            transactionsList = (i & 1) != 0 ? f0.f322471a : transactionsList;
            searchQuery = (i & 16) != 0 ? "" : searchQuery;
            lVar = (i & 32) != 0 ? null : lVar;
            z = (i & 64) != 0 ? false : z;
            nVar = (i & 128) != 0 ? null : nVar;
            Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
            Intrinsics.checkNotNullParameter(selectedTransactionId, "selectedTransactionId");
            Intrinsics.checkNotNullParameter(initialTransaction, "initialTransaction");
            Intrinsics.checkNotNullParameter(pageParams, "pageParams");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            this.f83748a = transactionsList;
            this.f83749b = selectedTransactionId;
            this.f83750c = initialTransaction;
            this.d = pageParams;
            this.e = searchQuery;
            this.f = lVar;
            this.f83751g = z;
            this.f83752h = nVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenTransactionDetailsPager)) {
                return false;
            }
            OpenTransactionDetailsPager openTransactionDetailsPager = (OpenTransactionDetailsPager) obj2;
            return Intrinsics.f(this.f83748a, openTransactionDetailsPager.f83748a) && Intrinsics.f(this.f83749b, openTransactionDetailsPager.f83749b) && Intrinsics.f(this.f83750c, openTransactionDetailsPager.f83750c) && Intrinsics.f(this.d, openTransactionDetailsPager.d) && Intrinsics.f(this.e, openTransactionDetailsPager.e) && Intrinsics.f(this.f, openTransactionDetailsPager.f) && this.f83751g == openTransactionDetailsPager.f83751g && Intrinsics.f(this.f83752h, openTransactionDetailsPager.f83752h);
        }

        public final int hashCode() {
            int iC = p.a.c((this.d.hashCode() + ((this.f83750c.hashCode() + p.a.c(this.f83748a.hashCode() * 31, 31, this.f83749b)) * 31)) * 31, 31, this.e);
            l lVar = this.f;
            int iC2 = j6.a.c((iC + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f83751g);
            n nVar = this.f83752h;
            return iC2 + (nVar != null ? nVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83749b);
            dest.writeParcelable(this.f83750c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e);
            dest.writeInt(this.f83751g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenUpsellSelectPlan;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenUpsellSelectPlan extends RevPointsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenUpsellSelectPlan f83761a = new OpenUpsellSelectPlan();

        @NotNull
        public static final Parcelable.Creator<OpenUpsellSelectPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenUpsellSelectPlan.f83761a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenUpsellSelectPlan[i];
            }
        }

        private OpenUpsellSelectPlan() {
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

    private RevPointsFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenChallengesGrid;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenChallengesGrid extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenChallengesGrid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChallengeId f83738a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenChallengesGrid((ChallengeId) parcel.readParcelable(OpenChallengesGrid.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenChallengesGrid[i];
            }
        }

        public OpenChallengesGrid(ChallengeId challengeId) {
            this.f83738a = challengeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenChallengesGrid) && Intrinsics.f(this.f83738a, ((OpenChallengesGrid) obj2).f83738a);
        }

        public final int hashCode() {
            ChallengeId challengeId = this.f83738a;
            if (challengeId == null) {
                return 0;
            }
            return challengeId.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83738a, i);
        }

        public OpenChallengesGrid() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionsList;", "Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "UiOverrides", "EmptyStateOverride", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenTransactionsList extends RevPointsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenTransactionsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsTransactionPageParams f83753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UiOverrides f83754b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionsList$UiOverrides;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UiOverrides implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<UiOverrides> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ResourceId f83758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f83759b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f83760c;
            public final EmptyStateOverride d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UiOverrides((ResourceId) parcel.readParcelable(UiOverrides.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : EmptyStateOverride.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UiOverrides[i];
                }
            }

            public UiOverrides() {
                this(0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UiOverrides)) {
                    return false;
                }
                UiOverrides uiOverrides = (UiOverrides) obj2;
                return Intrinsics.f(this.f83758a, uiOverrides.f83758a) && this.f83759b == uiOverrides.f83759b && this.f83760c == uiOverrides.f83760c && Intrinsics.f(this.d, uiOverrides.d);
            }

            public final int hashCode() {
                ResourceId resourceId = this.f83758a;
                int iC = j6.a.c(j6.a.c((resourceId == null ? 0 : resourceId.hashCode()) * 31, 31, this.f83759b), 31, this.f83760c);
                EmptyStateOverride emptyStateOverride = this.d;
                return iC + (emptyStateOverride != null ? emptyStateOverride.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83758a, i);
                dest.writeInt(this.f83759b ? 1 : 0);
                dest.writeInt(this.f83760c ? 1 : 0);
                EmptyStateOverride emptyStateOverride = this.d;
                if (emptyStateOverride == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    emptyStateOverride.writeToParcel(dest, i);
                }
            }

            public UiOverrides(ResourceId resourceId, boolean z, boolean z3, EmptyStateOverride emptyStateOverride) {
                this.f83758a = resourceId;
                this.f83759b = z;
                this.f83760c = z3;
                this.d = emptyStateOverride;
            }

            public /* synthetic */ UiOverrides(int i) {
                this(null, true, false, null);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenTransactionsList((RevPointsTransactionPageParams) parcel.readParcelable(OpenTransactionsList.class.getClassLoader()), UiOverrides.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenTransactionsList[i];
            }
        }

        public OpenTransactionsList(RevPointsTransactionPageParams pageParams, UiOverrides uiOverrides) {
            Intrinsics.checkNotNullParameter(pageParams, "pageParams");
            Intrinsics.checkNotNullParameter(uiOverrides, "uiOverrides");
            this.f83753a = pageParams;
            this.f83754b = uiOverrides;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenTransactionsList)) {
                return false;
            }
            OpenTransactionsList openTransactionsList = (OpenTransactionsList) obj2;
            return Intrinsics.f(this.f83753a, openTransactionsList.f83753a) && Intrinsics.f(this.f83754b, openTransactionsList.f83754b);
        }

        public final int hashCode() {
            return this.f83754b.hashCode() + (this.f83753a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83753a, i);
            this.f83754b.writeToParcel(dest, i);
        }

        public OpenTransactionsList() {
            this(new RevPointsTransactionPageParams(0, null, null, null, null, null, null, null, null, 511), new UiOverrides(0));
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/RevPointsFlowContract$Step$OpenTransactionsList$EmptyStateOverride;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EmptyStateOverride implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<EmptyStateOverride> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ResourceId f83755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ResourceId f83756b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ResourceId f83757c;
            public final ComplexImage d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EmptyStateOverride((ResourceId) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()), (ResourceId) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()), (ResourceId) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()), (ComplexImage) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EmptyStateOverride[i];
                }
            }

            public EmptyStateOverride(ResourceId resourceId, ResourceId resourceId2, ResourceId resourceId3, ComplexImage complexImage) {
                this.f83755a = resourceId;
                this.f83756b = resourceId2;
                this.f83757c = resourceId3;
                this.d = complexImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EmptyStateOverride)) {
                    return false;
                }
                EmptyStateOverride emptyStateOverride = (EmptyStateOverride) obj2;
                return Intrinsics.f(this.f83755a, emptyStateOverride.f83755a) && Intrinsics.f(this.f83756b, emptyStateOverride.f83756b) && Intrinsics.f(this.f83757c, emptyStateOverride.f83757c) && Intrinsics.f(this.d, emptyStateOverride.d);
            }

            public final int hashCode() {
                ResourceId resourceId = this.f83755a;
                int iHashCode = (resourceId == null ? 0 : resourceId.hashCode()) * 31;
                ResourceId resourceId2 = this.f83756b;
                int iHashCode2 = (iHashCode + (resourceId2 == null ? 0 : resourceId2.hashCode())) * 31;
                ResourceId resourceId3 = this.f83757c;
                int iHashCode3 = (iHashCode2 + (resourceId3 == null ? 0 : resourceId3.hashCode())) * 31;
                ComplexImage complexImage = this.d;
                return iHashCode3 + (complexImage != null ? complexImage.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83755a, i);
                dest.writeParcelable(this.f83756b, i);
                dest.writeParcelable(this.f83757c, i);
                dest.writeParcelable(this.d, i);
            }

            public EmptyStateOverride() {
                this(null, null, null, null);
            }
        }
    }
}
