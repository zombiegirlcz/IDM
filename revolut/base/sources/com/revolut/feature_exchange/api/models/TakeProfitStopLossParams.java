package com.revolut.feature_exchange.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0i.c;
import wd6.e;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature_exchange/api/models/TakeProfitStopLossParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "r0i/c", "r0i/b", "a", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TakeProfitStopLossParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f96825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f96826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f96827c;
    public final float d;
    public final e e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f96828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TakeProfitStopLoss f96829h;
    public final Float i;

    @NotNull
    public static final Parcelable.Creator<TakeProfitStopLossParams> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TakeProfitStopLossParams((xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), c.valueOf(parcel.readString()), parcel.readFloat(), e.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (TakeProfitStopLoss) parcel.readParcelable(TakeProfitStopLossParams.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TakeProfitStopLossParams[i];
        }
    }

    public TakeProfitStopLossParams(xi0.b displayCurrency, xi0.b chartCurrency, c limitType, float f, e exchangeMode, d topMoney, d bottomMoney, TakeProfitStopLoss takeProfitStopLoss, Float f4) {
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(chartCurrency, "chartCurrency");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(topMoney, "topMoney");
        Intrinsics.checkNotNullParameter(bottomMoney, "bottomMoney");
        this.f96825a = displayCurrency;
        this.f96826b = chartCurrency;
        this.f96827c = limitType;
        this.d = f;
        this.e = exchangeMode;
        this.f = topMoney;
        this.f96828g = bottomMoney;
        this.f96829h = takeProfitStopLoss;
        this.i = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TakeProfitStopLossParams)) {
            return false;
        }
        TakeProfitStopLossParams takeProfitStopLossParams = (TakeProfitStopLossParams) obj2;
        return Intrinsics.f(this.f96825a, takeProfitStopLossParams.f96825a) && Intrinsics.f(this.f96826b, takeProfitStopLossParams.f96826b) && this.f96827c == takeProfitStopLossParams.f96827c && Float.compare(this.d, takeProfitStopLossParams.d) == 0 && this.e == takeProfitStopLossParams.e && Intrinsics.f(this.f, takeProfitStopLossParams.f) && Intrinsics.f(this.f96828g, takeProfitStopLossParams.f96828g) && Intrinsics.f(this.f96829h, takeProfitStopLossParams.f96829h) && Intrinsics.f(this.i, takeProfitStopLossParams.i);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(y.g(this.e, m72.b.b(this.d, (this.f96827c.hashCode() + l.j(this.f96826b, this.f96825a.hashCode() * 31, 31)) * 31, 31), 31), 31, this.f), 31, this.f96828g);
        TakeProfitStopLoss takeProfitStopLoss = this.f96829h;
        int iHashCode = (iC + (takeProfitStopLoss == null ? 0 : takeProfitStopLoss.hashCode())) * 31;
        Float f = this.i;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96825a);
        dest.writeSerializable(this.f96826b);
        dest.writeString(this.f96827c.name());
        dest.writeFloat(this.d);
        dest.writeString(this.e.name());
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f96828g);
        dest.writeParcelable(this.f96829h, i);
        Float f = this.i;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
    }
}
