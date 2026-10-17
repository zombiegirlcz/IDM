package com.revolut.feature.credit.card.impl.ui.cancellation.skip;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/skip/SkipRepaymentConfirmationDialogScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SkipRepaymentConfirmationDialogScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SkipRepaymentConfirmationDialogScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f69163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f69164b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SkipRepaymentConfirmationDialogScreenContract$InputData((d) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SkipRepaymentConfirmationDialogScreenContract$InputData[i];
        }
    }

    public SkipRepaymentConfirmationDialogScreenContract$InputData(d repaymentAmount, b countryCode) {
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f69163a = repaymentAmount;
        this.f69164b = countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SkipRepaymentConfirmationDialogScreenContract$InputData)) {
            return false;
        }
        SkipRepaymentConfirmationDialogScreenContract$InputData skipRepaymentConfirmationDialogScreenContract$InputData = (SkipRepaymentConfirmationDialogScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69163a, skipRepaymentConfirmationDialogScreenContract$InputData.f69163a) && Intrinsics.f(this.f69164b, skipRepaymentConfirmationDialogScreenContract$InputData.f69164b);
    }

    public final int hashCode() {
        return this.f69164b.f297794a.hashCode() + (this.f69163a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69163a);
        dest.writeSerializable(this.f69164b);
    }
}
