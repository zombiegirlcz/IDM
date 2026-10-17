package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/spare_change/impl/ui/screen/full_list_spare_change/RevPointsSpareChangeFullListStateMapper$DescriptionItem", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsSpareChangeFullListStateMapper$DescriptionItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsSpareChangeFullListStateMapper$DescriptionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f84162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f84163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f84164c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsSpareChangeFullListStateMapper$DescriptionItem((Clause) parcel.readParcelable(RevPointsSpareChangeFullListStateMapper$DescriptionItem.class.getClassLoader()), (Clause) parcel.readParcelable(RevPointsSpareChangeFullListStateMapper$DescriptionItem.class.getClassLoader()), (Image) parcel.readParcelable(RevPointsSpareChangeFullListStateMapper$DescriptionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsSpareChangeFullListStateMapper$DescriptionItem[i];
        }
    }

    public RevPointsSpareChangeFullListStateMapper$DescriptionItem(Clause title, Clause subtitle, Image icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f84162a = title;
        this.f84163b = subtitle;
        this.f84164c = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsSpareChangeFullListStateMapper$DescriptionItem)) {
            return false;
        }
        RevPointsSpareChangeFullListStateMapper$DescriptionItem revPointsSpareChangeFullListStateMapper$DescriptionItem = (RevPointsSpareChangeFullListStateMapper$DescriptionItem) obj2;
        return Intrinsics.f(this.f84162a, revPointsSpareChangeFullListStateMapper$DescriptionItem.f84162a) && Intrinsics.f(this.f84163b, revPointsSpareChangeFullListStateMapper$DescriptionItem.f84163b) && Intrinsics.f(this.f84164c, revPointsSpareChangeFullListStateMapper$DescriptionItem.f84164c);
    }

    public final int hashCode() {
        return this.f84164c.hashCode() + p.a.a(this.f84162a.hashCode() * 31, 31, this.f84163b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84162a, i);
        dest.writeParcelable(this.f84163b, i);
        dest.writeParcelable(this.f84164c, i);
    }
}
