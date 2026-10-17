package com.revolut.feature.shared_separate_favourites.domain.chart;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ngd.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChartRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChartRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f86881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f86882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f86883c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Pair pair = (Pair) parcel.readSerializable();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ChartRate.class, parcel, arrayList, iE, 1);
            }
            return new ChartRate(pair, bigDecimal, arrayList, b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChartRate[i];
        }
    }

    public ChartRate(Pair assetPair, BigDecimal previousRangeCloseRate, ArrayList points, b type) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(previousRangeCloseRate, "previousRangeCloseRate");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f86881a = assetPair;
        this.f86882b = previousRangeCloseRate;
        this.f86883c = points;
        this.d = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChartRate)) {
            return false;
        }
        ChartRate chartRate = (ChartRate) obj2;
        return Intrinsics.f(this.f86881a, chartRate.f86881a) && Intrinsics.f(this.f86882b, chartRate.f86882b) && this.f86883c.equals(chartRate.f86883c) && this.d == chartRate.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f86883c, t61.a.d(this.f86882b, this.f86881a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f86881a);
        dest.writeSerializable(this.f86882b);
        Iterator itY = j6.a.y(this.f86883c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeString(this.d.name());
    }
}
