package com.revolut.feature.paynow.impl.screens.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/paynow/impl/screens/qr/PayNowQrScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_paynow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayNowQrScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PayNowQrScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80300b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayNowQrScreenContract$InputData((d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayNowQrScreenContract$InputData[i];
        }
    }

    public PayNowQrScreenContract$InputData(d dVar, boolean z) {
        this.f80299a = dVar;
        this.f80300b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayNowQrScreenContract$InputData)) {
            return false;
        }
        PayNowQrScreenContract$InputData payNowQrScreenContract$InputData = (PayNowQrScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80299a, payNowQrScreenContract$InputData.f80299a) && this.f80300b == payNowQrScreenContract$InputData.f80300b;
    }

    public final int hashCode() {
        d dVar = this.f80299a;
        return Boolean.hashCode(this.f80300b) + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80299a);
        dest.writeInt(this.f80300b ? 1 : 0);
    }

    public PayNowQrScreenContract$InputData() {
        this(null, false);
    }
}
