package com.revolut.feature.exchange.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/TakeProfitStopLoss;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TakeProfitStopLoss implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TakeProfitStopLoss> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f72159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f72160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f72161c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TakeProfitStopLoss(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TakeProfitStopLoss[i];
        }
    }

    public TakeProfitStopLoss(boolean z, Double d, Double d5) {
        this.f72159a = z;
        this.f72160b = d;
        this.f72161c = d5;
    }

    public static TakeProfitStopLoss a(TakeProfitStopLoss takeProfitStopLoss, int i) {
        boolean z = (i & 1) != 0 ? takeProfitStopLoss.f72159a : true;
        Double d = (i & 2) != 0 ? takeProfitStopLoss.f72160b : null;
        Double d5 = (i & 4) != 0 ? takeProfitStopLoss.f72161c : null;
        takeProfitStopLoss.getClass();
        return new TakeProfitStopLoss(z, d, d5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TakeProfitStopLoss)) {
            return false;
        }
        TakeProfitStopLoss takeProfitStopLoss = (TakeProfitStopLoss) obj2;
        return this.f72159a == takeProfitStopLoss.f72159a && Intrinsics.f(this.f72160b, takeProfitStopLoss.f72160b) && Intrinsics.f(this.f72161c, takeProfitStopLoss.f72161c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f72159a) * 31;
        Double d = this.f72160b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f72161c;
        return iHashCode2 + (d5 != null ? d5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f72159a ? 1 : 0);
        Double d = this.f72160b;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        Double d5 = this.f72161c;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
        }
    }

    public /* synthetic */ TakeProfitStopLoss() {
        this(true, null, null);
    }
}
