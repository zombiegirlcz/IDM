package com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreenContract$Mode", "Landroid/os/Parcelable;", "<init>", "()V", "Info", "Confirmation", "Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreenContract$Mode$Confirmation;", "Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreenContract$Mode$Info;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsPocketDowngradeScreenContract$Mode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreenContract$Mode$Confirmation;", "Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends RevPointsPocketDowngradeScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPoints f97822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevPoints f97823b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((RevPoints) parcel.readParcelable(Confirmation.class.getClassLoader()), (RevPoints) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(RevPoints pointsBefore, RevPoints revPoints) {
            Intrinsics.checkNotNullParameter(pointsBefore, "pointsBefore");
            this.f97822a = pointsBefore;
            this.f97823b = revPoints;
        }

        @Override // com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$Mode
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RevPoints getF97825b() {
            return this.f97823b;
        }

        @Override // com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$Mode
        /* JADX INFO: renamed from: b, reason: from getter */
        public final RevPoints getF97824a() {
            return this.f97822a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f97822a, confirmation.f97822a) && Intrinsics.f(this.f97823b, confirmation.f97823b);
        }

        public final int hashCode() {
            int iHashCode = this.f97822a.f83960a.hashCode() * 31;
            RevPoints revPoints = this.f97823b;
            return iHashCode + (revPoints == null ? 0 : revPoints.f83960a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97822a, i);
            dest.writeParcelable(this.f97823b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreenContract$Mode$Info;", "Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info extends RevPointsPocketDowngradeScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPoints f97824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevPoints f97825b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info((RevPoints) parcel.readParcelable(Info.class.getClassLoader()), (RevPoints) parcel.readParcelable(Info.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(RevPoints pointsBefore, RevPoints revPoints) {
            Intrinsics.checkNotNullParameter(pointsBefore, "pointsBefore");
            this.f97824a = pointsBefore;
            this.f97825b = revPoints;
        }

        @Override // com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$Mode
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RevPoints getF97825b() {
            return this.f97825b;
        }

        @Override // com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$Mode
        /* JADX INFO: renamed from: b, reason: from getter */
        public final RevPoints getF97824a() {
            return this.f97824a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Info)) {
                return false;
            }
            Info info = (Info) obj2;
            return Intrinsics.f(this.f97824a, info.f97824a) && Intrinsics.f(this.f97825b, info.f97825b);
        }

        public final int hashCode() {
            int iHashCode = this.f97824a.f83960a.hashCode() * 31;
            RevPoints revPoints = this.f97825b;
            return iHashCode + (revPoints == null ? 0 : revPoints.f83960a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97824a, i);
            dest.writeParcelable(this.f97825b, i);
        }
    }

    private RevPointsPocketDowngradeScreenContract$Mode() {
    }

    /* JADX INFO: renamed from: a */
    public abstract RevPoints getF97825b();

    /* JADX INFO: renamed from: b */
    public abstract RevPoints getF97824a();
}
