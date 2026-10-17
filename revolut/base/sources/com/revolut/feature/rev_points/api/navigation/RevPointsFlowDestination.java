package com.revolut.feature.rev_points.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.feature.rev_points.models.ChallengeId;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.p;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0007\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "EarnHubPendingAction", "StartType", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevPointsFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f83493b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction;", "Landroid/os/Parcelable;", "<init>", "()V", "None", "OpenSpareChange", "OpenPointsBuying", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction$None;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction$OpenPointsBuying;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction$OpenSpareChange;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class EarnHubPendingAction implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction$None;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class None extends EarnHubPendingAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final None f83494a = new None();

            @NotNull
            public static final Parcelable.Creator<None> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.f83494a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new None[i];
                }
            }

            private None() {
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

        private EarnHubPendingAction() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction$OpenPointsBuying;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenPointsBuying extends EarnHubPendingAction {

            @NotNull
            public static final Parcelable.Creator<OpenPointsBuying> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f83495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f83496b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenPointsBuying(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenPointsBuying[i];
                }
            }

            public OpenPointsBuying(Integer num, boolean z) {
                this.f83495a = num;
                this.f83496b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenPointsBuying)) {
                    return false;
                }
                OpenPointsBuying openPointsBuying = (OpenPointsBuying) obj2;
                return Intrinsics.f(this.f83495a, openPointsBuying.f83495a) && this.f83496b == openPointsBuying.f83496b;
            }

            public final int hashCode() {
                Integer num = this.f83495a;
                return Boolean.hashCode(this.f83496b) + ((num == null ? 0 : num.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f83495a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
                dest.writeInt(this.f83496b ? 1 : 0);
            }

            public OpenPointsBuying() {
                this(null, false);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction$OpenSpareChange;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$EarnHubPendingAction;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenSpareChange extends EarnHubPendingAction {

            @NotNull
            public static final Parcelable.Creator<OpenSpareChange> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f83497a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenSpareChange(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenSpareChange[i];
                }
            }

            public OpenSpareChange(Integer num) {
                this.f83497a = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenSpareChange) && Intrinsics.f(this.f83497a, ((OpenSpareChange) obj2).f83497a);
            }

            public final int hashCode() {
                Integer num = this.f83497a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f83497a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }

            public OpenSpareChange() {
                this(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f83498a;

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
            this.f83498a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f83498a, ((InputData) obj2).f83498a);
        }

        public final int hashCode() {
            return this.f83498a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83498a, i);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenTransactionList", "OpenRevPointsTransactionDetails", "OpenRevPointsTransactionDetailsByTransactionId", "OpenChallengesDetails", "OpenChallengesGrid", "OpenUpsellSelectPlan", "OpenRedeemHub", "OpenEarnHub", "OpenLearnScreen", "OpenRelatedTransactionsBottomSheet", "OpenChallengeDetailsBottomSheet", "OpenRevPointsExpiryHome", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenChallengeDetailsBottomSheet;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenChallengesDetails;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenChallengesGrid;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenEarnHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenLearnScreen;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRedeemHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRelatedTransactionsBottomSheet;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRevPointsExpiryHome;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRevPointsTransactionDetails;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRevPointsTransactionDetailsByTransactionId;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenTransactionList;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenUpsellSelectPlan;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenChallengeDetailsBottomSheet;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenChallengeDetailsBottomSheet extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenChallengeDetailsBottomSheet> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83499a;

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
                this.f83499a = challengeId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF83499a() {
                return this.f83499a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenChallengeDetailsBottomSheet) && Intrinsics.f(this.f83499a, ((OpenChallengeDetailsBottomSheet) obj2).f83499a);
            }

            public final int hashCode() {
                return this.f83499a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83499a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenChallengesDetails;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenChallengesDetails extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenChallengesDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChallengeId f83500a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenChallengesDetails((ChallengeId) parcel.readParcelable(OpenChallengesDetails.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenChallengesDetails[i];
                }
            }

            public OpenChallengesDetails(ChallengeId challengeId) {
                Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                this.f83500a = challengeId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ChallengeId getF83500a() {
                return this.f83500a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenChallengesDetails) && Intrinsics.f(this.f83500a, ((OpenChallengesDetails) obj2).f83500a);
            }

            public final int hashCode() {
                return this.f83500a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83500a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenChallengesGrid;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenChallengesGrid extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenChallengesGrid> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChallengeId f83501a;

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
                this.f83501a = challengeId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ChallengeId getF83501a() {
                return this.f83501a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenChallengesGrid) && Intrinsics.f(this.f83501a, ((OpenChallengesGrid) obj2).f83501a);
            }

            public final int hashCode() {
                ChallengeId challengeId = this.f83501a;
                if (challengeId == null) {
                    return 0;
                }
                return challengeId.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83501a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenEarnHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenEarnHub extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenEarnHub> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f83502a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final EarnHubPendingAction f83503b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenEarnHub(parcel.readInt() != 0, (EarnHubPendingAction) parcel.readParcelable(OpenEarnHub.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenEarnHub[i];
                }
            }

            public OpenEarnHub() {
                this(3);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF83502a() {
                return this.f83502a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EarnHubPendingAction getF83503b() {
                return this.f83503b;
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
                return this.f83502a == openEarnHub.f83502a && Intrinsics.f(this.f83503b, openEarnHub.f83503b);
            }

            public final int hashCode() {
                return this.f83503b.hashCode() + (Boolean.hashCode(this.f83502a) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f83502a ? 1 : 0);
                dest.writeParcelable(this.f83503b, i);
            }

            public OpenEarnHub(boolean z, EarnHubPendingAction pendingAction) {
                Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
                this.f83502a = z;
                this.f83503b = pendingAction;
            }

            public /* synthetic */ OpenEarnHub(int i) {
                this(false, EarnHubPendingAction.None.f83494a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenLearnScreen;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenLearnScreen extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenLearnScreen> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p f83504a;

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
                this.f83504a = learnType;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final p getF83504a() {
                return this.f83504a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenLearnScreen) && this.f83504a == ((OpenLearnScreen) obj2).f83504a;
            }

            public final int hashCode() {
                return this.f83504a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83504a.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRelatedTransactionsBottomSheet;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenRelatedTransactionsBottomSheet extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenRelatedTransactionsBottomSheet> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f83506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RevPoints f83507b;

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
                this.f83506a = relatedLoyaltyTransactionIds;
                this.f83507b = totalEarnedPoints;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getF83506a() {
                return this.f83506a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final RevPoints getF83507b() {
                return this.f83507b;
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
                return Intrinsics.f(this.f83506a, openRelatedTransactionsBottomSheet.f83506a) && Intrinsics.f(this.f83507b, openRelatedTransactionsBottomSheet.f83507b);
            }

            public final int hashCode() {
                return this.f83507b.f83960a.hashCode() + (this.f83506a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeStringList(this.f83506a);
                dest.writeParcelable(this.f83507b, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRevPointsExpiryHome;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class OpenRevPointsExpiryHome extends StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OpenRevPointsExpiryHome f83508a = new OpenRevPointsExpiryHome();

            @NotNull
            public static final Parcelable.Creator<OpenRevPointsExpiryHome> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OpenRevPointsExpiryHome.f83508a;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRevPointsTransactionDetails;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenRevPointsTransactionDetails extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenRevPointsTransactionDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RevPointsTransaction f83509a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f83510b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f83511c;
            public final RevPointsTransactionPageParams d;
            public final boolean e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    RevPointsTransaction revPointsTransaction = (RevPointsTransaction) parcel.readParcelable(OpenRevPointsTransactionDetails.class.getClassLoader());
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new OpenRevPointsTransactionDetails(revPointsTransaction, null, z3, (RevPointsTransactionPageParams) parcel.readParcelable(OpenRevPointsTransactionDetails.class.getClassLoader()), parcel.readInt() != 0 ? true : z, 2);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenRevPointsTransactionDetails[i];
                }
            }

            public OpenRevPointsTransactionDetails(RevPointsTransaction revPointsTransaction, List list, boolean z, RevPointsTransactionPageParams revPointsTransactionPageParams, boolean z3, int i) {
                List transactionsList = (i & 2) != 0 ? f0.f322471a : list;
                boolean z4 = (i & 4) != 0 ? false : z;
                RevPointsTransactionPageParams pageParams = (i & 8) != 0 ? new RevPointsTransactionPageParams(0, null, null, null, null, null, null, null, null, 511) : revPointsTransactionPageParams;
                boolean z6 = (i & 16) == 0 ? z3 : false;
                Intrinsics.checkNotNullParameter(revPointsTransaction, "revPointsTransaction");
                Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
                Intrinsics.checkNotNullParameter(pageParams, "pageParams");
                this.f83509a = revPointsTransaction;
                this.f83510b = transactionsList;
                this.f83511c = z4;
                this.d = pageParams;
                this.e = z6;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final RevPointsTransactionPageParams getD() {
                return this.d;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final RevPointsTransaction getF83509a() {
                return this.f83509a;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final List getF83510b() {
                return this.f83510b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getF83511c() {
                return this.f83511c;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenRevPointsTransactionDetails)) {
                    return false;
                }
                OpenRevPointsTransactionDetails openRevPointsTransactionDetails = (OpenRevPointsTransactionDetails) obj2;
                return Intrinsics.f(this.f83509a, openRevPointsTransactionDetails.f83509a) && Intrinsics.f(this.f83510b, openRevPointsTransactionDetails.f83510b) && this.f83511c == openRevPointsTransactionDetails.f83511c && Intrinsics.f(this.d, openRevPointsTransactionDetails.d) && this.e == openRevPointsTransactionDetails.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + ((this.d.hashCode() + j6.a.c(p.a.d(this.f83509a.hashCode() * 31, 31, this.f83510b), 31, this.f83511c)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83509a, i);
                dest.writeInt(this.f83511c ? 1 : 0);
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRevPointsTransactionDetailsByTransactionId;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenRevPointsTransactionDetailsByTransactionId extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenRevPointsTransactionDetailsByTransactionId> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83512a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenRevPointsTransactionDetailsByTransactionId(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenRevPointsTransactionDetailsByTransactionId[i];
                }
            }

            public OpenRevPointsTransactionDetailsByTransactionId(String revPointsTransactionId) {
                Intrinsics.checkNotNullParameter(revPointsTransactionId, "revPointsTransactionId");
                this.f83512a = revPointsTransactionId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF83512a() {
                return this.f83512a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenRevPointsTransactionDetailsByTransactionId) && Intrinsics.f(this.f83512a, ((OpenRevPointsTransactionDetailsByTransactionId) obj2).f83512a);
            }

            public final int hashCode() {
                return this.f83512a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83512a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenTransactionList;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "UiOverrides", "EmptyStateOverride", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenTransactionList extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenTransactionList> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RevPointsTransactionPageParams f83513a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UiOverrides f83514b;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenTransactionList$UiOverrides;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class UiOverrides implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<UiOverrides> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ResourceId f83518a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f83519b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f83520c;
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

                /* JADX WARN: Multi-variable type inference failed */
                public UiOverrides() {
                    this(null, 0 == true ? 1 : 0, 15);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final EmptyStateOverride getD() {
                    return this.d;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final boolean getF83520c() {
                    return this.f83520c;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final boolean getF83519b() {
                    return this.f83519b;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final ResourceId getF83518a() {
                    return this.f83518a;
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
                    return Intrinsics.f(this.f83518a, uiOverrides.f83518a) && this.f83519b == uiOverrides.f83519b && this.f83520c == uiOverrides.f83520c && Intrinsics.f(this.d, uiOverrides.d);
                }

                public final int hashCode() {
                    ResourceId resourceId = this.f83518a;
                    int iC = j6.a.c(j6.a.c((resourceId == null ? 0 : resourceId.hashCode()) * 31, 31, this.f83519b), 31, this.f83520c);
                    EmptyStateOverride emptyStateOverride = this.d;
                    return iC + (emptyStateOverride != null ? emptyStateOverride.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f83518a, i);
                    dest.writeInt(this.f83519b ? 1 : 0);
                    dest.writeInt(this.f83520c ? 1 : 0);
                    EmptyStateOverride emptyStateOverride = this.d;
                    if (emptyStateOverride == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        emptyStateOverride.writeToParcel(dest, i);
                    }
                }

                public UiOverrides(ResourceId resourceId, boolean z, boolean z3, EmptyStateOverride emptyStateOverride) {
                    this.f83518a = resourceId;
                    this.f83519b = z;
                    this.f83520c = z3;
                    this.d = emptyStateOverride;
                }

                public /* synthetic */ UiOverrides(ResourceId.IntResourceId intResourceId, EmptyStateOverride emptyStateOverride, int i) {
                    this((i & 1) != 0 ? null : intResourceId, (i & 2) != 0, (i & 4) == 0, (i & 8) != 0 ? null : emptyStateOverride);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenTransactionList((RevPointsTransactionPageParams) parcel.readParcelable(OpenTransactionList.class.getClassLoader()), UiOverrides.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenTransactionList[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OpenTransactionList() {
                this(null, 0 == true ? 1 : 0, 3);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final RevPointsTransactionPageParams getF83513a() {
                return this.f83513a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final UiOverrides getF83514b() {
                return this.f83514b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenTransactionList)) {
                    return false;
                }
                OpenTransactionList openTransactionList = (OpenTransactionList) obj2;
                return Intrinsics.f(this.f83513a, openTransactionList.f83513a) && Intrinsics.f(this.f83514b, openTransactionList.f83514b);
            }

            public final int hashCode() {
                return this.f83514b.hashCode() + (this.f83513a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83513a, i);
                this.f83514b.writeToParcel(dest, i);
            }

            public OpenTransactionList(RevPointsTransactionPageParams pageParams, UiOverrides uiOverrides) {
                Intrinsics.checkNotNullParameter(pageParams, "pageParams");
                Intrinsics.checkNotNullParameter(uiOverrides, "uiOverrides");
                this.f83513a = pageParams;
                this.f83514b = uiOverrides;
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenTransactionList$EmptyStateOverride;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class EmptyStateOverride implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<EmptyStateOverride> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ResourceId f83515a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ResourceId f83516b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ResourceId f83517c;
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
                    this.f83515a = resourceId;
                    this.f83516b = resourceId2;
                    this.f83517c = resourceId3;
                    this.d = complexImage;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final ResourceId getF83517c() {
                    return this.f83517c;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final ResourceId getF83516b() {
                    return this.f83516b;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final ComplexImage getD() {
                    return this.d;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final ResourceId getF83515a() {
                    return this.f83515a;
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
                    return Intrinsics.f(this.f83515a, emptyStateOverride.f83515a) && Intrinsics.f(this.f83516b, emptyStateOverride.f83516b) && Intrinsics.f(this.f83517c, emptyStateOverride.f83517c) && Intrinsics.f(this.d, emptyStateOverride.d);
                }

                public final int hashCode() {
                    ResourceId resourceId = this.f83515a;
                    int iHashCode = (resourceId == null ? 0 : resourceId.hashCode()) * 31;
                    ResourceId resourceId2 = this.f83516b;
                    int iHashCode2 = (iHashCode + (resourceId2 == null ? 0 : resourceId2.hashCode())) * 31;
                    ResourceId resourceId3 = this.f83517c;
                    int iHashCode3 = (iHashCode2 + (resourceId3 == null ? 0 : resourceId3.hashCode())) * 31;
                    ComplexImage complexImage = this.d;
                    return iHashCode3 + (complexImage != null ? complexImage.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f83515a, i);
                    dest.writeParcelable(this.f83516b, i);
                    dest.writeParcelable(this.f83517c, i);
                    dest.writeParcelable(this.d, i);
                }

                public EmptyStateOverride() {
                    this(null, null, null, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public /* synthetic */ OpenTransactionList(RevPointsTransactionPageParams revPointsTransactionPageParams, UiOverrides uiOverrides, int i) {
                this((i & 1) != 0 ? new RevPointsTransactionPageParams(0, null, null, null, null, null, null, null, null, 511) : revPointsTransactionPageParams, (i & 2) != 0 ? new UiOverrides(null, 0 == true ? 1 : 0, 15) : uiOverrides);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenUpsellSelectPlan;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class OpenUpsellSelectPlan extends StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OpenUpsellSelectPlan f83521a = new OpenUpsellSelectPlan();

            @NotNull
            public static final Parcelable.Creator<OpenUpsellSelectPlan> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OpenUpsellSelectPlan.f83521a;
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

        private StartType() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType$OpenRedeemHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenRedeemHub extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenRedeemHub> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f83505a;

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
                this.f83505a = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF83505a() {
                return this.f83505a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenRedeemHub) && this.f83505a == ((OpenRedeemHub) obj2).f83505a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f83505a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f83505a ? 1 : 0);
            }

            public OpenRedeemHub() {
                this(false);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsFlowDestination((StartType) parcel.readParcelable(RevPointsFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevPointsFlowDestination(StartType startType) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f83493b = startType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final StartType getF83493b() {
        return this.f83493b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevPointsFlowDestination) && Intrinsics.f(this.f83493b, ((RevPointsFlowDestination) obj2).f83493b);
    }

    public final int hashCode() {
        return this.f83493b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83493b, i);
    }
}
