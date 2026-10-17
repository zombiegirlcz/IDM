package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr2.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/block_disallowed/MerchantBlockDisallowedControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MerchantBlockDisallowedControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MerchantBlockDisallowedControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f64243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64244c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MerchantBlockDisallowedControllerContract$InputData(parcel.readString(), (c) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MerchantBlockDisallowedControllerContract$InputData[i];
        }
    }

    public MerchantBlockDisallowedControllerContract$InputData(String merchantName, c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f64242a = merchantName;
        this.f64243b = cVar;
        this.f64244c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MerchantBlockDisallowedControllerContract$InputData)) {
            return false;
        }
        MerchantBlockDisallowedControllerContract$InputData merchantBlockDisallowedControllerContract$InputData = (MerchantBlockDisallowedControllerContract$InputData) obj2;
        return Intrinsics.f(this.f64242a, merchantBlockDisallowedControllerContract$InputData.f64242a) && Intrinsics.f(this.f64243b, merchantBlockDisallowedControllerContract$InputData.f64243b) && this.f64244c == merchantBlockDisallowedControllerContract$InputData.f64244c;
    }

    public final int hashCode() {
        int iHashCode = this.f64242a.hashCode() * 31;
        c cVar = this.f64243b;
        return Boolean.hashCode(this.f64244c) + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64242a);
        dest.writeSerializable(this.f64243b);
        dest.writeInt(this.f64244c ? 1 : 0);
    }
}
