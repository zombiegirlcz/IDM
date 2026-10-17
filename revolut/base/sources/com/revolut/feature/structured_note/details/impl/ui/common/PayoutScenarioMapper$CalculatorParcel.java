package com.revolut.feature.structured_note.details.impl.ui.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/common/PayoutScenarioMapper$CalculatorParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayoutScenarioMapper$CalculatorParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayoutScenarioMapper$CalculatorParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f88862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f88863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f88864c;
    public final BigDecimal d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayoutScenarioMapper$CalculatorParcel((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayoutScenarioMapper$CalculatorParcel[i];
        }
    }

    public PayoutScenarioMapper$CalculatorParcel(BigDecimal performanceStart, BigDecimal performanceEnd, BigDecimal payoutRateStart, BigDecimal payoutRateEnd) {
        Intrinsics.checkNotNullParameter(performanceStart, "performanceStart");
        Intrinsics.checkNotNullParameter(performanceEnd, "performanceEnd");
        Intrinsics.checkNotNullParameter(payoutRateStart, "payoutRateStart");
        Intrinsics.checkNotNullParameter(payoutRateEnd, "payoutRateEnd");
        this.f88862a = performanceStart;
        this.f88863b = performanceEnd;
        this.f88864c = payoutRateStart;
        this.d = payoutRateEnd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayoutScenarioMapper$CalculatorParcel)) {
            return false;
        }
        PayoutScenarioMapper$CalculatorParcel payoutScenarioMapper$CalculatorParcel = (PayoutScenarioMapper$CalculatorParcel) obj2;
        return Intrinsics.f(this.f88862a, payoutScenarioMapper$CalculatorParcel.f88862a) && Intrinsics.f(this.f88863b, payoutScenarioMapper$CalculatorParcel.f88863b) && Intrinsics.f(this.f88864c, payoutScenarioMapper$CalculatorParcel.f88864c) && Intrinsics.f(this.d, payoutScenarioMapper$CalculatorParcel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.d(this.f88864c, t61.a.d(this.f88863b, this.f88862a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88862a);
        dest.writeSerializable(this.f88863b);
        dest.writeSerializable(this.f88864c);
        dest.writeSerializable(this.d);
    }
}
