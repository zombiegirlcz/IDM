package com.revolut.feature.payments.profile.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ew9.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/profile/api/navigation/PaymentProfileInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "ew9/b", "retail_feature_payments_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentProfileInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentProfileInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79620a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentProfileInputData(b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentProfileInputData[i];
        }
    }

    public PaymentProfileInputData(b step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f79620a = step;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF79620a() {
        return this.f79620a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PaymentProfileInputData) && this.f79620a == ((PaymentProfileInputData) obj2).f79620a;
    }

    public final int hashCode() {
        return this.f79620a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79620a.name());
    }
}
