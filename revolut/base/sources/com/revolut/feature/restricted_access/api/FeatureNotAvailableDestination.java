package com.revolut.feature.restricted_access.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "Action", "feature_restricted_access_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureNotAvailableDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<FeatureNotAvailableDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f82016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f82017c;
    public final Clause d;
    public final Action e;
    public final Action f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82018g;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Close", "NavigateToMain", "OpenDeeplink", "NavigateToDestination", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$Close;", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$NavigateToDestination;", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$NavigateToMain;", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$OpenDeeplink;", "feature_restricted_access_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Action implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$Close;", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action;", "<init>", "()V", "feature_restricted_access_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Close extends Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Close f82019a = new Close();

            @NotNull
            public static final Parcelable.Creator<Close> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Close.f82019a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Close[i];
                }
            }

            private Close() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$NavigateToDestination;", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action;", "", "toString", "()Ljava/lang/String;", "feature_restricted_access_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigateToDestination extends Action {

            @NotNull
            public static final Parcelable.Creator<NavigateToDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ParcelableDestination f82020a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigateToDestination((ParcelableDestination) parcel.readParcelable(NavigateToDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigateToDestination[i];
                }
            }

            public NavigateToDestination(ParcelableDestination destination) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                this.f82020a = destination;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigateToDestination) && Intrinsics.f(this.f82020a, ((NavigateToDestination) obj2).f82020a);
            }

            public final int hashCode() {
                return this.f82020a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f82020a, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$NavigateToMain;", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action;", "<init>", "()V", "feature_restricted_access_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NavigateToMain extends Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NavigateToMain f82021a = new NavigateToMain();

            @NotNull
            public static final Parcelable.Creator<NavigateToMain> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NavigateToMain.f82021a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigateToMain[i];
                }
            }

            private NavigateToMain() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action$OpenDeeplink;", "Lcom/revolut/feature/restricted_access/api/FeatureNotAvailableDestination$Action;", "", "toString", "()Ljava/lang/String;", "feature_restricted_access_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenDeeplink extends Action {

            @NotNull
            public static final Parcelable.Creator<OpenDeeplink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Action f82023b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenDeeplink(parcel.readString(), (Action) parcel.readParcelable(OpenDeeplink.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenDeeplink[i];
                }
            }

            public OpenDeeplink(String deeplink, Action fallback) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                Intrinsics.checkNotNullParameter(fallback, "fallback");
                this.f82022a = deeplink;
                this.f82023b = fallback;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenDeeplink)) {
                    return false;
                }
                OpenDeeplink openDeeplink = (OpenDeeplink) obj2;
                return Intrinsics.f(this.f82022a, openDeeplink.f82022a) && Intrinsics.f(this.f82023b, openDeeplink.f82023b);
            }

            public final int hashCode() {
                return this.f82023b.hashCode() + (this.f82022a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82022a);
                dest.writeParcelable(this.f82023b, i);
            }
        }

        private Action() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeatureNotAvailableDestination((Clause) parcel.readParcelable(FeatureNotAvailableDestination.class.getClassLoader()), (Clause) parcel.readParcelable(FeatureNotAvailableDestination.class.getClassLoader()), (Clause) parcel.readParcelable(FeatureNotAvailableDestination.class.getClassLoader()), (Action) parcel.readParcelable(FeatureNotAvailableDestination.class.getClassLoader()), (Action) parcel.readParcelable(FeatureNotAvailableDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeatureNotAvailableDestination[i];
        }
    }

    public FeatureNotAvailableDestination() {
        this((TextClause) null, (Clause) null, (TextLocalisedClause) null, (Action) null, (Action) null, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeatureNotAvailableDestination)) {
            return false;
        }
        FeatureNotAvailableDestination featureNotAvailableDestination = (FeatureNotAvailableDestination) obj2;
        return Intrinsics.f(this.f82016b, featureNotAvailableDestination.f82016b) && Intrinsics.f(this.f82017c, featureNotAvailableDestination.f82017c) && Intrinsics.f(this.d, featureNotAvailableDestination.d) && Intrinsics.f(this.e, featureNotAvailableDestination.e) && Intrinsics.f(this.f, featureNotAvailableDestination.f) && this.f82018g == featureNotAvailableDestination.f82018g;
    }

    public final int hashCode() {
        Clause clause = this.f82016b;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f82017c;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Action action = this.e;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.f;
        return Boolean.hashCode(this.f82018g) + ((iHashCode4 + (action2 != null ? action2.hashCode() : 0)) * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF82018g() {
        return this.f82018g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82016b, i);
        dest.writeParcelable(this.f82017c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f82018g ? 1 : 0);
    }

    public /* synthetic */ FeatureNotAvailableDestination(TextClause textClause, Clause clause, TextLocalisedClause textLocalisedClause, Action action, Action action2, int i) {
        this((i & 1) != 0 ? null : textClause, (i & 2) != 0 ? null : clause, (i & 4) != 0 ? null : textLocalisedClause, (i & 8) != 0 ? null : action, (i & 16) != 0 ? null : action2, (i & 32) == 0);
    }

    public FeatureNotAvailableDestination(Clause clause, Clause clause2, Clause clause3, Action action, Action action2, boolean z) {
        super(IOData$EmptyInput.f98299a);
        this.f82016b = clause;
        this.f82017c = clause2;
        this.d = clause3;
        this.e = action;
        this.f = action2;
        this.f82018g = z;
    }
}
