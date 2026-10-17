package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InitAssetTypes", "Alerts", "CompletedAlerts", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step$Alerts;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step$CompletedAlerts;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step$InitAssetTypes;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SharedAlertsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step$Alerts;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step;", "<init>", "()V", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Alerts extends SharedAlertsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Alerts f86706a = new Alerts();

        @NotNull
        public static final Parcelable.Creator<Alerts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Alerts.f86706a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Alerts[i];
            }
        }

        private Alerts() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step$CompletedAlerts;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompletedAlerts extends SharedAlertsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CompletedAlerts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavouritesAssetTypeKey f86707a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CompletedAlerts((FavouritesAssetTypeKey) parcel.readParcelable(CompletedAlerts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompletedAlerts[i];
            }
        }

        public CompletedAlerts(FavouritesAssetTypeKey assetTypeKey) {
            Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
            this.f86707a = assetTypeKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CompletedAlerts) && Intrinsics.f(this.f86707a, ((CompletedAlerts) obj2).f86707a);
        }

        public final int hashCode() {
            return this.f86707a.f86866a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86707a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step$InitAssetTypes;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$Step;", "<init>", "()V", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InitAssetTypes extends SharedAlertsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitAssetTypes f86708a = new InitAssetTypes();

        @NotNull
        public static final Parcelable.Creator<InitAssetTypes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InitAssetTypes.f86708a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitAssetTypes[i];
            }
        }

        private InitAssetTypes() {
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

    private SharedAlertsFlowContract$Step() {
    }
}
