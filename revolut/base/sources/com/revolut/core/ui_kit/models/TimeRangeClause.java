package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeRangeClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimeRangeClause implements Clause, fa {

    @NotNull
    public static final Parcelable.Creator<TimeRangeClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneId f57982c;
    public final Style d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimeRangeClause(parcel.readLong(), parcel.readLong(), (ZoneId) parcel.readSerializable(), (Style) parcel.readParcelable(TimeRangeClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimeRangeClause[i];
        }
    }

    public TimeRangeClause(long j2, long j3, ZoneId zoneId, Style style) {
        this.f57980a = j2;
        this.f57981b = j3;
        this.f57982c = zoneId;
        this.d = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF57981b() {
        return this.f57981b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getF57980a() {
        return this.f57980a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneId getF57982c() {
        return this.f57982c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TimeRangeClause)) {
            return false;
        }
        TimeRangeClause timeRangeClause = (TimeRangeClause) obj2;
        return this.f57980a == timeRangeClause.f57980a && this.f57981b == timeRangeClause.f57981b && Intrinsics.f(this.f57982c, timeRangeClause.f57982c) && Intrinsics.f(this.d, timeRangeClause.d);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getD() {
        return this.d;
    }

    public final int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.f57980a) * 31, 31, this.f57981b);
        ZoneId zoneId = this.f57982c;
        int iHashCode = (iC + (zoneId == null ? 0 : zoneId.hashCode())) * 31;
        Style style = this.d;
        return iHashCode + (style != null ? style.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f57980a);
        dest.writeLong(this.f57981b);
        dest.writeSerializable(this.f57982c);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ TimeRangeClause(long j2, long j3, ZoneId zoneId, Custom custom, int i) {
        this(j2, j3, (i & 4) != 0 ? null : zoneId, (i & 8) != 0 ? null : custom);
    }
}
