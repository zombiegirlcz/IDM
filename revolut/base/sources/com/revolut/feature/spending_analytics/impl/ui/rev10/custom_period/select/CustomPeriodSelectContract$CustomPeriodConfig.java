package com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mpd.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/select/CustomPeriodSelectContract$CustomPeriodConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomPeriodSelectContract$CustomPeriodConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomPeriodSelectContract$CustomPeriodConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f87675b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomPeriodSelectContract$CustomPeriodConfig(parcel.readInt() != 0, c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomPeriodSelectContract$CustomPeriodConfig[i];
        }
    }

    public CustomPeriodSelectContract$CustomPeriodConfig(boolean z, c initialField) {
        Intrinsics.checkNotNullParameter(initialField, "initialField");
        this.f87674a = z;
        this.f87675b = initialField;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomPeriodSelectContract$CustomPeriodConfig)) {
            return false;
        }
        CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig = (CustomPeriodSelectContract$CustomPeriodConfig) obj2;
        return this.f87674a == customPeriodSelectContract$CustomPeriodConfig.f87674a && this.f87675b == customPeriodSelectContract$CustomPeriodConfig.f87675b;
    }

    public final int hashCode() {
        return this.f87675b.hashCode() + (Boolean.hashCode(this.f87674a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f87674a ? 1 : 0);
        dest.writeString(this.f87675b.name());
    }
}
