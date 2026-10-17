package com.revolut.feature.shared_separate_favourites.domain.chart;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRatePoint;", "Landroid/os/Parcelable;", "<init>", "()V", "Line", "Candle", "Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRatePoint$Candle;", "Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRatePoint$Line;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChartRatePoint implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRatePoint$Candle;", "Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRatePoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Candle extends ChartRatePoint {

        @NotNull
        public static final Parcelable.Creator<Candle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f86884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f86885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f86886c;
        public final BigDecimal d;
        public final BigDecimal e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Candle((DateTime) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Candle[i];
            }
        }

        public Candle(DateTime start, BigDecimal open, BigDecimal high, BigDecimal low, BigDecimal close) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(open, "open");
            Intrinsics.checkNotNullParameter(high, "high");
            Intrinsics.checkNotNullParameter(low, "low");
            Intrinsics.checkNotNullParameter(close, "close");
            this.f86884a = start;
            this.f86885b = open;
            this.f86886c = high;
            this.d = low;
            this.e = close;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.chart.ChartRatePoint
        /* JADX INFO: renamed from: b, reason: from getter */
        public final DateTime getF86887a() {
            return this.f86884a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Candle)) {
                return false;
            }
            Candle candle = (Candle) obj2;
            return Intrinsics.f(this.f86884a, candle.f86884a) && Intrinsics.f(this.f86885b, candle.f86885b) && Intrinsics.f(this.f86886c, candle.f86886c) && Intrinsics.f(this.d, candle.d) && Intrinsics.f(this.e, candle.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + t61.a.d(this.d, t61.a.d(this.f86886c, t61.a.d(this.f86885b, this.f86884a.hashCode() * 31, 31), 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86884a);
            dest.writeSerializable(this.f86885b);
            dest.writeSerializable(this.f86886c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRatePoint$Line;", "Lcom/revolut/feature/shared_separate_favourites/domain/chart/ChartRatePoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Line extends ChartRatePoint {

        @NotNull
        public static final Parcelable.Creator<Line> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f86887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f86888b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Line((DateTime) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Line[i];
            }
        }

        public Line(DateTime start, BigDecimal rate) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f86887a = start;
            this.f86888b = rate;
        }

        @Override // com.revolut.feature.shared_separate_favourites.domain.chart.ChartRatePoint
        /* JADX INFO: renamed from: b, reason: from getter */
        public final DateTime getF86887a() {
            return this.f86887a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Line)) {
                return false;
            }
            Line line = (Line) obj2;
            return Intrinsics.f(this.f86887a, line.f86887a) && Intrinsics.f(this.f86888b, line.f86888b);
        }

        public final int hashCode() {
            return this.f86888b.hashCode() + (this.f86887a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86887a);
            dest.writeSerializable(this.f86888b);
        }
    }

    private ChartRatePoint() {
    }

    public final BigDecimal a() {
        if (this instanceof Line) {
            return ((Line) this).f86888b;
        }
        if (this instanceof Candle) {
            return ((Candle) this).e;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public abstract DateTime getF86887a();
}
