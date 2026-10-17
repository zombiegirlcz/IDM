package com.revolut.feature.revolutpay.api.shared.domain.models.revpoints;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/RevPoints;", "Landroid/os/Parcelable;", "Companion", "a", "amount", "", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPoints implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84427a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPoints> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static long a(BigDecimal majorUnits) {
            Intrinsics.checkNotNullParameter(majorUnits, "majorUnits");
            return majorUnits.movePointRight(6).setScale(0, RoundingMode.HALF_EVEN).longValue();
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPoints(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPoints[i];
        }
    }

    public /* synthetic */ RevPoints(long j2) {
        this.f84427a = j2;
    }

    public static final boolean a(long j2, long j3) {
        return j2 == j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof RevPoints) {
            return this.f84427a == ((RevPoints) obj2).f84427a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f84427a);
    }

    public final String toString() {
        return a.n(this.f84427a, "RevPoints(amount=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f84427a);
    }
}
