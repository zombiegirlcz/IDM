package com.revolut.retail.feature.api.custom_assets.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vzi.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/custom_assets/models/ValueHistoryEntry;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ValueHistoryEntry implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ValueHistoryEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f99233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f99234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f99235c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ValueHistoryEntry((LocalDate) parcel.readSerializable(), (d) parcel.readSerializable(), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ValueHistoryEntry[i];
        }
    }

    public ValueHistoryEntry(LocalDate date, d value, i source) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f99233a = date;
        this.f99234b = value;
        this.f99235c = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ValueHistoryEntry)) {
            return false;
        }
        ValueHistoryEntry valueHistoryEntry = (ValueHistoryEntry) obj2;
        return Intrinsics.f(this.f99233a, valueHistoryEntry.f99233a) && Intrinsics.f(this.f99234b, valueHistoryEntry.f99234b) && this.f99235c == valueHistoryEntry.f99235c;
    }

    public final int hashCode() {
        return this.f99235c.hashCode() + v7.c(this.f99233a.hashCode() * 31, 31, this.f99234b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99233a);
        dest.writeSerializable(this.f99234b);
        dest.writeString(this.f99235c.name());
    }
}
