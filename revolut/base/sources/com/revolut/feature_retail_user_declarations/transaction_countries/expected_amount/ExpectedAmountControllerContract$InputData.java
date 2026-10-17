package com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/transaction_countries/expected_amount/ExpectedAmountControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpectedAmountControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExpectedAmountControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f97765b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpectedAmountControllerContract$InputData((b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpectedAmountControllerContract$InputData[i];
        }
    }

    public ExpectedAmountControllerContract$InputData(b countryCode, xi0.b currency) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f97764a = countryCode;
        this.f97765b = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpectedAmountControllerContract$InputData)) {
            return false;
        }
        ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = (ExpectedAmountControllerContract$InputData) obj2;
        return Intrinsics.f(this.f97764a, expectedAmountControllerContract$InputData.f97764a) && Intrinsics.f(this.f97765b, expectedAmountControllerContract$InputData.f97765b);
    }

    public final int hashCode() {
        return this.f97765b.hashCode() + (this.f97764a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97764a);
        dest.writeSerializable(this.f97765b);
    }
}
