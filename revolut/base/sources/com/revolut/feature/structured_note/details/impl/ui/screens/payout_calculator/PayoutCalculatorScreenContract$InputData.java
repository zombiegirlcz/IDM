package com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/screens/payout_calculator/PayoutCalculatorScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayoutCalculatorScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PayoutCalculatorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f88897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f88898c;
    public final BigDecimal d;
    public final BigDecimal e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayoutCalculatorScreenContract$InputData(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayoutCalculatorScreenContract$InputData[i];
        }
    }

    public PayoutCalculatorScreenContract$InputData(String ref2, BigDecimal performanceStart, BigDecimal performanceEnd, BigDecimal payoutRateStart, BigDecimal payoutRateEnd) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(performanceStart, "performanceStart");
        Intrinsics.checkNotNullParameter(performanceEnd, "performanceEnd");
        Intrinsics.checkNotNullParameter(payoutRateStart, "payoutRateStart");
        Intrinsics.checkNotNullParameter(payoutRateEnd, "payoutRateEnd");
        this.f88896a = ref2;
        this.f88897b = performanceStart;
        this.f88898c = performanceEnd;
        this.d = payoutRateStart;
        this.e = payoutRateEnd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayoutCalculatorScreenContract$InputData)) {
            return false;
        }
        PayoutCalculatorScreenContract$InputData payoutCalculatorScreenContract$InputData = (PayoutCalculatorScreenContract$InputData) obj2;
        return Intrinsics.f(this.f88896a, payoutCalculatorScreenContract$InputData.f88896a) && Intrinsics.f(this.f88897b, payoutCalculatorScreenContract$InputData.f88897b) && Intrinsics.f(this.f88898c, payoutCalculatorScreenContract$InputData.f88898c) && Intrinsics.f(this.d, payoutCalculatorScreenContract$InputData.d) && Intrinsics.f(this.e, payoutCalculatorScreenContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.d(this.d, t61.a.d(this.f88898c, t61.a.d(this.f88897b, this.f88896a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88896a);
        dest.writeSerializable(this.f88897b);
        dest.writeSerializable(this.f88898c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
