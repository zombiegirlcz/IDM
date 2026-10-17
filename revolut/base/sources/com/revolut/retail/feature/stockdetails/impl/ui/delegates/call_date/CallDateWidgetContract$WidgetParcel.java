package com.revolut.retail.feature.stockdetails.impl.ui.delegates.call_date;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/delegates/call_date/CallDateWidgetContract$WidgetParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CallDateWidgetContract$WidgetParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CallDateWidgetContract$WidgetParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f103815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f103816c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CallDateWidgetContract$WidgetParcel(parcel.readString(), (LocalDate) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CallDateWidgetContract$WidgetParcel[i];
        }
    }

    public CallDateWidgetContract$WidgetParcel(String ref2, LocalDate callDate, d callPrice) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(callDate, "callDate");
        Intrinsics.checkNotNullParameter(callPrice, "callPrice");
        this.f103814a = ref2;
        this.f103815b = callDate;
        this.f103816c = callPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CallDateWidgetContract$WidgetParcel)) {
            return false;
        }
        CallDateWidgetContract$WidgetParcel callDateWidgetContract$WidgetParcel = (CallDateWidgetContract$WidgetParcel) obj2;
        return Intrinsics.f(this.f103814a, callDateWidgetContract$WidgetParcel.f103814a) && Intrinsics.f(this.f103815b, callDateWidgetContract$WidgetParcel.f103815b) && Intrinsics.f(this.f103816c, callDateWidgetContract$WidgetParcel.f103816c);
    }

    public final int hashCode() {
        return this.f103816c.hashCode() + y.a(this.f103814a.hashCode() * 31, 31, this.f103815b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103814a);
        dest.writeSerializable(this.f103815b);
        dest.writeSerializable(this.f103816c);
    }
}
