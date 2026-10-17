package com.revolut.shared.feature.wealth.models.screener;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.g;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedFilter;", "Landroid/os/Parcelable;", "Range", "Options", "Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedFilter$Options;", "Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedFilter$Range;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScreenerSelectedFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedFilter$Options;", "Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedFilter;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Options implements ScreenerSelectedFilter {

        @NotNull
        public static final Parcelable.Creator<Options> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f105165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105166b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Options(g.valueOf(parcel.readString()), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Options[i];
            }
        }

        public Options(g metric, List values) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(values, "values");
            this.f105165a = metric;
            this.f105166b = values;
        }

        @Override // com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter
        /* JADX INFO: renamed from: I7, reason: from getter */
        public final g getF105167a() {
            return this.f105165a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Options)) {
                return false;
            }
            Options options = (Options) obj2;
            return this.f105165a == options.f105165a && Intrinsics.f(this.f105166b, options.f105166b);
        }

        public final int hashCode() {
            return this.f105166b.hashCode() + (this.f105165a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105165a.name());
            dest.writeStringList(this.f105166b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedFilter$Range;", "Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedFilter;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Range implements ScreenerSelectedFilter {

        @NotNull
        public static final Parcelable.Creator<Range> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f105167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f105168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f105169c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Range(g.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Range[i];
            }
        }

        public Range(g metric, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            this.f105167a = metric;
            this.f105168b = bigDecimal;
            this.f105169c = bigDecimal2;
        }

        @Override // com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter
        /* JADX INFO: renamed from: I7, reason: from getter */
        public final g getF105167a() {
            return this.f105167a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Range)) {
                return false;
            }
            Range range = (Range) obj2;
            return this.f105167a == range.f105167a && Intrinsics.f(this.f105168b, range.f105168b) && Intrinsics.f(this.f105169c, range.f105169c);
        }

        public final int hashCode() {
            int iHashCode = this.f105167a.hashCode() * 31;
            BigDecimal bigDecimal = this.f105168b;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.f105169c;
            return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105167a.name());
            dest.writeSerializable(this.f105168b);
            dest.writeSerializable(this.f105169c);
        }
    }

    /* JADX INFO: renamed from: I7 */
    g getF105167a();
}
