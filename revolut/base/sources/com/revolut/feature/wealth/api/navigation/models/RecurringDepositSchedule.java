package com.revolut.feature.wealth.api.navigation.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import k4l.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/navigation/models/RecurringDepositSchedule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringDepositSchedule implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecurringDepositSchedule> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f95324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f95325b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringDepositSchedule((LocalDate) parcel.readSerializable(), c0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringDepositSchedule[i];
        }
    }

    public RecurringDepositSchedule(LocalDate startDate, c0 period) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f95324a = period;
        this.f95325b = startDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringDepositSchedule)) {
            return false;
        }
        RecurringDepositSchedule recurringDepositSchedule = (RecurringDepositSchedule) obj2;
        return this.f95324a == recurringDepositSchedule.f95324a && Intrinsics.f(this.f95325b, recurringDepositSchedule.f95325b);
    }

    public final int hashCode() {
        return this.f95325b.hashCode() + (this.f95324a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95324a.name());
        dest.writeSerializable(this.f95325b);
    }
}
