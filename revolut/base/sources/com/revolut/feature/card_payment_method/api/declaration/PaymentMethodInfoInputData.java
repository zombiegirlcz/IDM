package com.revolut.feature.card_payment_method.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w33.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_payment_method/api/declaration/PaymentMethodInfoInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "w33/b", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentMethodInfoInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentMethodInfoInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f65241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f65242b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethodInfoInputData(b.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(PaymentMethodInfoInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentMethodInfoInputData[i];
        }
    }

    public PaymentMethodInfoInputData(b pocketType, AccountId accountId) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f65241a = pocketType;
        this.f65242b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentMethodInfoInputData)) {
            return false;
        }
        PaymentMethodInfoInputData paymentMethodInfoInputData = (PaymentMethodInfoInputData) obj2;
        return this.f65241a == paymentMethodInfoInputData.f65241a && Intrinsics.f(this.f65242b, paymentMethodInfoInputData.f65242b);
    }

    public final int hashCode() {
        return this.f65242b.hashCode() + (this.f65241a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65241a.name());
        dest.writeParcelable(this.f65242b, i);
    }
}
