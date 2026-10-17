package com.revolut.feature.recurring_buys.schedule.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import hua.c;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurring_buys/schedule/api/models/RecurringBuySettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_recurring_buys_schedule_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringBuySettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecurringBuySettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f81644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f81645b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringBuySettings((LocalDate) parcel.readSerializable(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringBuySettings[i];
        }
    }

    public RecurringBuySettings() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringBuySettings)) {
            return false;
        }
        RecurringBuySettings recurringBuySettings = (RecurringBuySettings) obj2;
        return Intrinsics.f(this.f81644a, recurringBuySettings.f81644a) && this.f81645b == recurringBuySettings.f81645b;
    }

    public final int hashCode() {
        return this.f81645b.hashCode() + (this.f81644a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81644a);
        dest.writeString(this.f81645b.name());
    }

    public RecurringBuySettings(LocalDate startDate, c periodType) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        this.f81644a = startDate;
        this.f81645b = periodType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecurringBuySettings(int i) {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this(localDateNow, c.WEEKLY);
    }
}
