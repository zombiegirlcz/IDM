package com.revolut.feature.credit.card.impl.ui.fee_waiver;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import hha.w0;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/fee_waiver/FeeWaiverBottomDialogScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeeWaiverBottomDialogScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FeeWaiverBottomDialogScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f69293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f69295c;
    public final LocalDate d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeWaiverBottomDialogScreenContract$InputData(w0.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeeWaiverBottomDialogScreenContract$InputData[i];
        }
    }

    public FeeWaiverBottomDialogScreenContract$InputData(w0 planTier, d threshold, d spent, LocalDate statementDate, boolean z) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(statementDate, "statementDate");
        this.f69293a = planTier;
        this.f69294b = threshold;
        this.f69295c = spent;
        this.d = statementDate;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeeWaiverBottomDialogScreenContract$InputData)) {
            return false;
        }
        FeeWaiverBottomDialogScreenContract$InputData feeWaiverBottomDialogScreenContract$InputData = (FeeWaiverBottomDialogScreenContract$InputData) obj2;
        return this.f69293a == feeWaiverBottomDialogScreenContract$InputData.f69293a && Intrinsics.f(this.f69294b, feeWaiverBottomDialogScreenContract$InputData.f69294b) && Intrinsics.f(this.f69295c, feeWaiverBottomDialogScreenContract$InputData.f69295c) && Intrinsics.f(this.d, feeWaiverBottomDialogScreenContract$InputData.d) && this.e == feeWaiverBottomDialogScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + y.a(v7.c(v7.c(this.f69293a.hashCode() * 31, 31, this.f69294b), 31, this.f69295c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69293a.name());
        dest.writeSerializable(this.f69294b);
        dest.writeSerializable(this.f69295c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
