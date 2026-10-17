package com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_add_to_googlepay/impl/verification/otp/card_security/GooglePayCardSecurityScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayCardSecurityScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GooglePayCardSecurityScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f64498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64499b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayCardSecurityScreenContract$InputData((f0) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GooglePayCardSecurityScreenContract$InputData[i];
        }
    }

    public GooglePayCardSecurityScreenContract$InputData(f0 card, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f64498a = card;
        this.f64499b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GooglePayCardSecurityScreenContract$InputData)) {
            return false;
        }
        GooglePayCardSecurityScreenContract$InputData googlePayCardSecurityScreenContract$InputData = (GooglePayCardSecurityScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64498a, googlePayCardSecurityScreenContract$InputData.f64498a) && this.f64499b == googlePayCardSecurityScreenContract$InputData.f64499b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64499b) + (this.f64498a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64498a);
        dest.writeInt(this.f64499b ? 1 : 0);
    }
}
