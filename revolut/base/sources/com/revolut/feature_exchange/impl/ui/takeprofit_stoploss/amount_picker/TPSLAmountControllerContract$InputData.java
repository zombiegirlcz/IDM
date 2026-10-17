package com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0i.c;
import wd6.e;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/takeprofit_stoploss/amount_picker/TPSLAmountControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TPSLAmountControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TPSLAmountControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3i.a f96977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f96979c;
    public final b d;
    public final int e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f96980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f96981h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f96982j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TPSLAmountControllerContract$InputData(g3i.a.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong(), (b) parcel.readSerializable(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), (b) parcel.readSerializable(), c.valueOf(parcel.readString()), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TPSLAmountControllerContract$InputData[i];
        }
    }

    public TPSLAmountControllerContract$InputData(g3i.a type, long j2, long j3, b currency, int i, float f, float f4, b referencedCurrency, c orderType, e exchangeMode) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f96977a = type;
        this.f96978b = j2;
        this.f96979c = j3;
        this.d = currency;
        this.e = i;
        this.f = f;
        this.f96980g = f4;
        this.f96981h = referencedCurrency;
        this.i = orderType;
        this.f96982j = exchangeMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TPSLAmountControllerContract$InputData)) {
            return false;
        }
        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = (TPSLAmountControllerContract$InputData) obj2;
        return this.f96977a == tPSLAmountControllerContract$InputData.f96977a && this.f96978b == tPSLAmountControllerContract$InputData.f96978b && this.f96979c == tPSLAmountControllerContract$InputData.f96979c && Intrinsics.f(this.d, tPSLAmountControllerContract$InputData.d) && this.e == tPSLAmountControllerContract$InputData.e && Float.compare(this.f, tPSLAmountControllerContract$InputData.f) == 0 && Float.compare(this.f96980g, tPSLAmountControllerContract$InputData.f96980g) == 0 && Intrinsics.f(this.f96981h, tPSLAmountControllerContract$InputData.f96981h) && this.i == tPSLAmountControllerContract$InputData.i && this.f96982j == tPSLAmountControllerContract$InputData.f96982j;
    }

    public final int hashCode() {
        return this.f96982j.hashCode() + ((this.i.hashCode() + l.j(this.f96981h, m72.b.b(this.f96980g, m72.b.b(this.f, j6.a.b(this.e, l.j(this.d, d.c(d.c(this.f96977a.hashCode() * 31, 31, this.f96978b), 31, this.f96979c), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96977a.name());
        dest.writeLong(this.f96978b);
        dest.writeLong(this.f96979c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e);
        dest.writeFloat(this.f);
        dest.writeFloat(this.f96980g);
        dest.writeSerializable(this.f96981h);
        dest.writeString(this.i.name());
        dest.writeString(this.f96982j.name());
    }
}
