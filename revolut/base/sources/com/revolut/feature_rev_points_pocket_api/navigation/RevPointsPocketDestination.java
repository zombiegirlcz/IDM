package com.revolut.feature_rev_points_pocket_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Onboarding", "RevPointsPocketDetails", "RevPointsAddMoneyDestination", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$RevPointsAddMoneyDestination;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$RevPointsPocketDetails;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsPocketDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionAnimation f97797a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination;", "", "toString", "()Ljava/lang/String;", "Mode", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding extends RevPointsPocketDestination {

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Mode f97798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransitionAnimation f97799c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding$Mode;", "Landroid/os/Parcelable;", "<init>", "()V", "OptIn", "Boost", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding$Mode$Boost;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding$Mode$OptIn;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Mode implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding$Mode$Boost;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding$Mode;", "<init>", "()V", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Boost extends Mode {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Boost f97800a = new Boost();

                @NotNull
                public static final Parcelable.Creator<Boost> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Boost.f97800a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Boost[i];
                    }
                }

                private Boost() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding$Mode$OptIn;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$Onboarding$Mode;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OptIn extends Mode {

                @NotNull
                public static final Parcelable.Creator<OptIn> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f97801a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final RevPointsOptInSource f97802b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new OptIn((RevPointsOptInSource) parcel.readParcelable(OptIn.class.getClassLoader()), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new OptIn[i];
                    }
                }

                public OptIn(RevPointsOptInSource revPointsOptInSource, boolean z) {
                    Intrinsics.checkNotNullParameter(revPointsOptInSource, "revPointsOptInSource");
                    this.f97801a = z;
                    this.f97802b = revPointsOptInSource;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof OptIn)) {
                        return false;
                    }
                    OptIn optIn = (OptIn) obj2;
                    return this.f97801a == optIn.f97801a && Intrinsics.f(this.f97802b, optIn.f97802b);
                }

                public final int hashCode() {
                    return this.f97802b.hashCode() + (Boolean.hashCode(this.f97801a) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f97801a ? 1 : 0);
                    dest.writeParcelable(this.f97802b, i);
                }
            }

            private Mode() {
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarding((Mode) parcel.readParcelable(Onboarding.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(Onboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Onboarding(Mode mode, TransitionAnimation transitionAnimation) {
            super(transitionAnimation);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f97798b = mode;
            this.f97799c = transitionAnimation;
        }

        @Override // com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination, aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF97797a() {
            return this.f97799c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Mode getF97798b() {
            return this.f97798b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) obj2;
            return Intrinsics.f(this.f97798b, onboarding.f97798b) && Intrinsics.f(this.f97799c, onboarding.f97799c);
        }

        public final int hashCode() {
            int iHashCode = this.f97798b.hashCode() * 31;
            TransitionAnimation transitionAnimation = this.f97799c;
            return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97798b, i);
            dest.writeParcelable(this.f97799c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$RevPointsAddMoneyDestination;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsAddMoneyDestination extends RevPointsPocketDestination {

        @NotNull
        public static final Parcelable.Creator<RevPointsAddMoneyDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97803b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsAddMoneyDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsAddMoneyDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsAddMoneyDestination(String pocketId) {
            super(null);
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f97803b = pocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsAddMoneyDestination) && Intrinsics.f(this.f97803b, ((RevPointsAddMoneyDestination) obj2).f97803b);
        }

        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF97803b() {
            return this.f97803b;
        }

        public final int hashCode() {
            return this.f97803b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97803b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination$RevPointsPocketDetails;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketDestination;", "<init>", "()V", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsPocketDetails extends RevPointsPocketDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RevPointsPocketDetails f97804b = new RevPointsPocketDetails(null);

        @NotNull
        public static final Parcelable.Creator<RevPointsPocketDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsPocketDetails.f97804b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsPocketDetails[i];
            }
        }

        private RevPointsPocketDetails() {
            super(null);
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

    public RevPointsPocketDestination(TransitionAnimation transitionAnimation) {
        this.f97797a = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public TransitionAnimation getF97797a() {
        return this.f97797a;
    }
}
