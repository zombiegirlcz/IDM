package com.revolut.feature.rev_points.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Tab", "GiftCardsHome", "EarnHub", "RedeemHub", "Wrapped", "Custom", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Custom;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Default;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$EarnHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$GiftCardsHome;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$RedeemHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Tab;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Wrapped;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsOptInNextDestination implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Custom;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends RevPointsOptInNextDestination {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f83525a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom((NaviCommand) parcel.readParcelable(Custom.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
            this.f83525a = naviCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && Intrinsics.f(this.f83525a, ((Custom) obj2).f83525a);
        }

        public final int hashCode() {
            return this.f83525a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83525a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Default;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends RevPointsOptInNextDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f83526a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f83526a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$EarnHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarnHub extends RevPointsOptInNextDestination {

        @NotNull
        public static final Parcelable.Creator<EarnHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevPointsFlowDestination.EarnHubPendingAction f83528b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarnHub(parcel.readInt() != 0, (RevPointsFlowDestination.EarnHubPendingAction) parcel.readParcelable(EarnHub.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarnHub[i];
            }
        }

        public EarnHub(boolean z, RevPointsFlowDestination.EarnHubPendingAction pendingAction) {
            Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
            this.f83527a = z;
            this.f83528b = pendingAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EarnHub)) {
                return false;
            }
            EarnHub earnHub = (EarnHub) obj2;
            return this.f83527a == earnHub.f83527a && Intrinsics.f(this.f83528b, earnHub.f83528b);
        }

        public final int hashCode() {
            return this.f83528b.hashCode() + (Boolean.hashCode(this.f83527a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83527a ? 1 : 0);
            dest.writeParcelable(this.f83528b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$GiftCardsHome;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiftCardsHome extends RevPointsOptInNextDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiftCardsHome f83529a = new GiftCardsHome();

        @NotNull
        public static final Parcelable.Creator<GiftCardsHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiftCardsHome.f83529a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftCardsHome[i];
            }
        }

        private GiftCardsHome() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$RedeemHub;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedeemHub extends RevPointsOptInNextDestination {

        @NotNull
        public static final Parcelable.Creator<RedeemHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83530a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedeemHub(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RedeemHub[i];
            }
        }

        public RedeemHub(boolean z) {
            this.f83530a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RedeemHub) && this.f83530a == ((RedeemHub) obj2).f83530a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83530a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83530a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Tab;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Tab extends RevPointsOptInNextDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Tab f83531a = new Tab();

        @NotNull
        public static final Parcelable.Creator<Tab> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Tab.f83531a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tab[i];
            }
        }

        private Tab() {
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

    private RevPointsOptInNextDestination() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination$Wrapped;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInNextDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Wrapped extends RevPointsOptInNextDestination {

        @NotNull
        public static final Parcelable.Creator<Wrapped> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f83532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f83533b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Wrapped((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Wrapped[i];
            }
        }

        public Wrapped(LocalDate localDate, LocalDate localDate2) {
            this.f83532a = localDate;
            this.f83533b = localDate2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Wrapped)) {
                return false;
            }
            Wrapped wrapped = (Wrapped) obj2;
            return Intrinsics.f(this.f83532a, wrapped.f83532a) && Intrinsics.f(this.f83533b, wrapped.f83533b);
        }

        public final int hashCode() {
            LocalDate localDate = this.f83532a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.f83533b;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f83532a);
            dest.writeSerializable(this.f83533b);
        }

        public Wrapped() {
            this(null, null);
        }
    }
}
