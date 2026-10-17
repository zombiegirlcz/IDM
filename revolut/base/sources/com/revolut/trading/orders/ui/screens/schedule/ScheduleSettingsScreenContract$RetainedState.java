package com.revolut.trading.orders.ui.screens.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/screens/schedule/ScheduleSettingsScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScheduleSettingsScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<ScheduleSettingsScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f107061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sel.a f107062b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScheduleSettingsScreenContract$RetainedState((LocalDate) parcel.readSerializable(), sel.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScheduleSettingsScreenContract$RetainedState[i];
        }
    }

    public ScheduleSettingsScreenContract$RetainedState(LocalDate startDate, sel.a period) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f107061a = startDate;
        this.f107062b = period;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScheduleSettingsScreenContract$RetainedState)) {
            return false;
        }
        ScheduleSettingsScreenContract$RetainedState scheduleSettingsScreenContract$RetainedState = (ScheduleSettingsScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f107061a, scheduleSettingsScreenContract$RetainedState.f107061a) && this.f107062b == scheduleSettingsScreenContract$RetainedState.f107062b;
    }

    public final int hashCode() {
        return this.f107062b.hashCode() + (this.f107061a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f107061a);
        dest.writeString(this.f107062b.name());
    }
}
