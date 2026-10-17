package com.revolut.feature.rev_points.api.navigation.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/api/navigation/descriptor/LifestyleRevPointsOptInController$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LifestyleRevPointsOptInController$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LifestyleRevPointsOptInController$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsOptInSource f83542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83544c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) parcel.readParcelable(LifestyleRevPointsOptInController$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LifestyleRevPointsOptInController$InputData[i];
        }
    }

    public LifestyleRevPointsOptInController$InputData(RevPointsOptInSource optInSource, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(optInSource, "optInSource");
        this.f83542a = optInSource;
        this.f83543b = z;
        this.f83544c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LifestyleRevPointsOptInController$InputData)) {
            return false;
        }
        LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = (LifestyleRevPointsOptInController$InputData) obj2;
        return Intrinsics.f(this.f83542a, lifestyleRevPointsOptInController$InputData.f83542a) && this.f83543b == lifestyleRevPointsOptInController$InputData.f83543b && this.f83544c == lifestyleRevPointsOptInController$InputData.f83544c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83544c) + j6.a.c(this.f83542a.hashCode() * 31, 31, this.f83543b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83542a, i);
        dest.writeInt(this.f83543b ? 1 : 0);
        dest.writeInt(this.f83544c ? 1 : 0);
    }

    public /* synthetic */ LifestyleRevPointsOptInController$InputData(RevPointsOptInSource revPointsOptInSource, boolean z, int i) {
        this(revPointsOptInSource, (i & 2) != 0 ? true : z, false);
    }
}
