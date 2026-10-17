package com.revolut.feature.rev_points.impl.ui.points_expiry.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/points_expiry/details/RevPointsExpiryDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsExpiryDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsExpiryDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f83828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83829b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(RevPointsExpiryDetailsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new RevPointsExpiryDetailsScreenContract$InputData(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsExpiryDetailsScreenContract$InputData[i];
        }
    }

    public RevPointsExpiryDetailsScreenContract$InputData(ArrayList issuedPoints, boolean z) {
        Intrinsics.checkNotNullParameter(issuedPoints, "issuedPoints");
        this.f83828a = issuedPoints;
        this.f83829b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsExpiryDetailsScreenContract$InputData)) {
            return false;
        }
        RevPointsExpiryDetailsScreenContract$InputData revPointsExpiryDetailsScreenContract$InputData = (RevPointsExpiryDetailsScreenContract$InputData) obj2;
        return this.f83828a.equals(revPointsExpiryDetailsScreenContract$InputData.f83828a) && this.f83829b == revPointsExpiryDetailsScreenContract$InputData.f83829b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83829b) + (this.f83828a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ArrayList arrayList = this.f83828a;
        dest.writeInt(arrayList.size());
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            dest.writeParcelable((Parcelable) it8.next(), i);
        }
        dest.writeInt(this.f83829b ? 1 : 0);
    }
}
