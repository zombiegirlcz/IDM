package com.revolut.feature.rev_points.impl.ui.opt_in.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/opt_in/screen/RevPointsOptInScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsOptInScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsOptInScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsOptInSource f83817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83818b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsOptInScreenContract$InputData((RevPointsOptInSource) parcel.readParcelable(RevPointsOptInScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsOptInScreenContract$InputData[i];
        }
    }

    public RevPointsOptInScreenContract$InputData(RevPointsOptInSource optInSource, boolean z) {
        Intrinsics.checkNotNullParameter(optInSource, "optInSource");
        this.f83817a = optInSource;
        this.f83818b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsOptInScreenContract$InputData)) {
            return false;
        }
        RevPointsOptInScreenContract$InputData revPointsOptInScreenContract$InputData = (RevPointsOptInScreenContract$InputData) obj2;
        return Intrinsics.f(this.f83817a, revPointsOptInScreenContract$InputData.f83817a) && this.f83818b == revPointsOptInScreenContract$InputData.f83818b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83818b) + (this.f83817a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83817a, i);
        dest.writeInt(this.f83818b ? 1 : 0);
    }
}
