package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmQuoteRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmQuoteRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmQuoteRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f62228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f62229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f62230c;
    public final long d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmQuoteRate(parcel.readDouble(), parcel.readLong(), (b) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmQuoteRate[i];
        }
    }

    public ApmQuoteRate(double d, long j2, b from, b to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f62228a = d;
        this.f62229b = from;
        this.f62230c = to6;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmQuoteRate)) {
            return false;
        }
        ApmQuoteRate apmQuoteRate = (ApmQuoteRate) obj2;
        return Double.compare(this.f62228a, apmQuoteRate.f62228a) == 0 && Intrinsics.f(this.f62229b, apmQuoteRate.f62229b) && Intrinsics.f(this.f62230c, apmQuoteRate.f62230c) && this.d == apmQuoteRate.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + l.j(this.f62230c, l.j(this.f62229b, Double.hashCode(this.f62228a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f62228a);
        dest.writeSerializable(this.f62229b);
        dest.writeSerializable(this.f62230c);
        dest.writeLong(this.d);
    }
}
