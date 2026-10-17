package com.revolut.shared.feature.wealth.models.instrument;

import android.os.Parcel;
import android.os.Parcelable;
import ej0.b;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/instrument/OptionTickerDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OptionTickerDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionTickerDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f105128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f105129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f105130c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f105131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f105132h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BigDecimal f105133j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BigDecimal f105134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BigDecimal f105135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f105136n;
    public final BigDecimal o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f105137p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionTickerDetails((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OptionTickerDetails[i];
        }
    }

    public OptionTickerDetails(b bVar, Long l2, b bVar2, Integer num, Integer num2, Integer num3, Integer num4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, b bVar3, BigDecimal bigDecimal7, Integer num5) {
        this.f105128a = bVar;
        this.f105129b = l2;
        this.f105130c = bVar2;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.f105131g = num4;
        this.f105132h = bigDecimal;
        this.i = bigDecimal2;
        this.f105133j = bigDecimal3;
        this.k = bigDecimal4;
        this.f105134l = bigDecimal5;
        this.f105135m = bigDecimal6;
        this.f105136n = bVar3;
        this.o = bigDecimal7;
        this.f105137p = num5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OptionTickerDetails)) {
            return false;
        }
        OptionTickerDetails optionTickerDetails = (OptionTickerDetails) obj2;
        return Intrinsics.f(this.f105128a, optionTickerDetails.f105128a) && Intrinsics.f(this.f105129b, optionTickerDetails.f105129b) && Intrinsics.f(this.f105130c, optionTickerDetails.f105130c) && Intrinsics.f(this.d, optionTickerDetails.d) && Intrinsics.f(this.e, optionTickerDetails.e) && Intrinsics.f(this.f, optionTickerDetails.f) && Intrinsics.f(this.f105131g, optionTickerDetails.f105131g) && Intrinsics.f(this.f105132h, optionTickerDetails.f105132h) && Intrinsics.f(this.i, optionTickerDetails.i) && Intrinsics.f(this.f105133j, optionTickerDetails.f105133j) && Intrinsics.f(this.k, optionTickerDetails.k) && Intrinsics.f(this.f105134l, optionTickerDetails.f105134l) && Intrinsics.f(this.f105135m, optionTickerDetails.f105135m) && Intrinsics.f(this.f105136n, optionTickerDetails.f105136n) && Intrinsics.f(this.o, optionTickerDetails.o) && Intrinsics.f(this.f105137p, optionTickerDetails.f105137p);
    }

    public final int hashCode() {
        b bVar = this.f105128a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Long l2 = this.f105129b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        b bVar2 = this.f105130c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f105131g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BigDecimal bigDecimal = this.f105132h;
        int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.i;
        int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f105133j;
        int iHashCode10 = (iHashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.k;
        int iHashCode11 = (iHashCode10 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.f105134l;
        int iHashCode12 = (iHashCode11 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.f105135m;
        int iHashCode13 = (iHashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        b bVar3 = this.f105136n;
        int iHashCode14 = (iHashCode13 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.o;
        int iHashCode15 = (iHashCode14 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        Integer num5 = this.f105137p;
        return iHashCode15 + (num5 != null ? num5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105128a);
        Long l2 = this.f105129b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeSerializable(this.f105130c);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.f;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        Integer num4 = this.f105131g;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num4);
        }
        dest.writeSerializable(this.f105132h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f105133j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f105134l);
        dest.writeSerializable(this.f105135m);
        dest.writeSerializable(this.f105136n);
        dest.writeSerializable(this.o);
        Integer num5 = this.f105137p;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num5);
        }
    }
}
