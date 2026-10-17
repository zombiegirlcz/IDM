package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common;

import android.os.Parcel;
import android.os.Parcelable;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/common/SmartEstimationAccess;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SmartEstimationAccess implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f87945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87947c;
    public final int d;
    public final boolean e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f87948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f87949h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f87950j;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<SmartEstimationAccess> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SmartEstimationAccess(w0.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SmartEstimationAccess[i];
        }
    }

    public SmartEstimationAccess(w0 planTier, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f87945a = planTier;
        this.f87946b = i;
        this.f87947c = i2;
        this.d = i3;
        this.e = z;
        int i5 = i2 - i;
        i5 = i5 < 0 ? 0 : i5;
        this.f = i5;
        boolean z3 = i2 == 0;
        this.f87948g = z3;
        this.f87949h = !z3 && i5 == 0;
        this.i = !z3 && i5 > 0;
        this.f87950j = i3 > i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SmartEstimationAccess)) {
            return false;
        }
        SmartEstimationAccess smartEstimationAccess = (SmartEstimationAccess) obj2;
        return this.f87945a == smartEstimationAccess.f87945a && this.f87946b == smartEstimationAccess.f87946b && this.f87947c == smartEstimationAccess.f87947c && this.d == smartEstimationAccess.d && this.e == smartEstimationAccess.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f87947c, j6.a.b(this.f87946b, this.f87945a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87945a.name());
        dest.writeInt(this.f87946b);
        dest.writeInt(this.f87947c);
        dest.writeInt(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
