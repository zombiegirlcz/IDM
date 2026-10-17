package com.revolut.feature.topup_screen.impl.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import cue.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/destination/ThreeDsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreeDsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ThreeDsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f90587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90589c;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThreeDsDestination((d) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThreeDsDestination[i];
        }
    }

    public ThreeDsDestination(d paymentInfo, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
        this.f90587a = paymentInfo;
        this.f90588b = z;
        this.f90589c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThreeDsDestination)) {
            return false;
        }
        ThreeDsDestination threeDsDestination = (ThreeDsDestination) obj2;
        return Intrinsics.f(this.f90587a, threeDsDestination.f90587a) && this.f90588b == threeDsDestination.f90588b && this.f90589c == threeDsDestination.f90589c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90589c) + j6.a.c(this.f90587a.hashCode() * 31, 31, this.f90588b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90587a);
        dest.writeInt(this.f90588b ? 1 : 0);
        dest.writeInt(this.f90589c ? 1 : 0);
    }
}
