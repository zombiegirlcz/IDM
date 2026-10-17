package com.revolut.feature_rev_points_pocket_api.navigation;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Withdrawn", "Added", "Upgraded", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData$Added;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData$Upgraded;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData$Withdrawn;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsPocketTransferApi$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData$Added;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Added extends RevPointsPocketTransferApi$OutputData {

        @NotNull
        public static final Parcelable.Creator<Added> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f97805a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Added((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Added[i];
            }
        }

        public Added(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f97805a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Added) && Intrinsics.f(this.f97805a, ((Added) obj2).f97805a);
        }

        public final int hashCode() {
            return this.f97805a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97805a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData$Upgraded;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Upgraded extends RevPointsPocketTransferApi$OutputData {

        @NotNull
        public static final Parcelable.Creator<Upgraded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPoints f97806a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upgraded((RevPoints) parcel.readParcelable(Upgraded.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upgraded[i];
            }
        }

        public Upgraded(RevPoints pointsYearly) {
            Intrinsics.checkNotNullParameter(pointsYearly, "pointsYearly");
            this.f97806a = pointsYearly;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Upgraded) && Intrinsics.f(this.f97806a, ((Upgraded) obj2).f97806a);
        }

        public final int hashCode() {
            return this.f97806a.f83960a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97806a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData$Withdrawn;", "Lcom/revolut/feature_rev_points_pocket_api/navigation/RevPointsPocketTransferApi$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdrawn extends RevPointsPocketTransferApi$OutputData {

        @NotNull
        public static final Parcelable.Creator<Withdrawn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f97807a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Withdrawn((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdrawn[i];
            }
        }

        public Withdrawn(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f97807a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Withdrawn) && Intrinsics.f(this.f97807a, ((Withdrawn) obj2).f97807a);
        }

        public final int hashCode() {
            return this.f97807a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97807a);
        }
    }

    private RevPointsPocketTransferApi$OutputData() {
    }
}
