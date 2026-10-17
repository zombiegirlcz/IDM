package com.revolut.feature.rev_points.impl.ui.earn;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreenContract$PendingAction;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsEarnScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsEarnScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsEarnScreenContract$PendingAction f83792b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsEarnScreenContract$InputData(parcel.readInt() != 0, (RevPointsEarnScreenContract$PendingAction) parcel.readParcelable(RevPointsEarnScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsEarnScreenContract$InputData[i];
        }
    }

    public RevPointsEarnScreenContract$InputData(boolean z, RevPointsEarnScreenContract$PendingAction pendingAction) {
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        this.f83791a = z;
        this.f83792b = pendingAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsEarnScreenContract$InputData)) {
            return false;
        }
        RevPointsEarnScreenContract$InputData revPointsEarnScreenContract$InputData = (RevPointsEarnScreenContract$InputData) obj2;
        return this.f83791a == revPointsEarnScreenContract$InputData.f83791a && Intrinsics.f(this.f83792b, revPointsEarnScreenContract$InputData.f83792b);
    }

    public final int hashCode() {
        return this.f83792b.hashCode() + (Boolean.hashCode(this.f83791a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f83791a ? 1 : 0);
        dest.writeParcelable(this.f83792b, i);
    }

    public RevPointsEarnScreenContract$InputData() {
        this(false, RevPointsEarnScreenContract$PendingAction.None.f83793a);
    }
}
