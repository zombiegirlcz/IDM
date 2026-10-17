package com.revolut.feature_crypto_order_details.impl.ui.pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoOrderDetailsPagerFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoOrderDetailsPagerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOrderDetailsInputData f96664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f96666c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoOrderDetailsPagerFlowContract$InputData((CryptoOrderDetailsInputData) parcel.readParcelable(CryptoOrderDetailsPagerFlowContract$InputData.class.getClassLoader()), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoOrderDetailsPagerFlowContract$InputData[i];
        }
    }

    public CryptoOrderDetailsPagerFlowContract$InputData(CryptoOrderDetailsInputData selectedOrderInputData, String searchQuery, b bVar) {
        Intrinsics.checkNotNullParameter(selectedOrderInputData, "selectedOrderInputData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f96664a = selectedOrderInputData;
        this.f96665b = searchQuery;
        this.f96666c = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoOrderDetailsPagerFlowContract$InputData)) {
            return false;
        }
        CryptoOrderDetailsPagerFlowContract$InputData cryptoOrderDetailsPagerFlowContract$InputData = (CryptoOrderDetailsPagerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f96664a, cryptoOrderDetailsPagerFlowContract$InputData.f96664a) && Intrinsics.f(this.f96665b, cryptoOrderDetailsPagerFlowContract$InputData.f96665b) && Intrinsics.f(this.f96666c, cryptoOrderDetailsPagerFlowContract$InputData.f96666c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f96664a.hashCode() * 31, 31, this.f96665b);
        b bVar = this.f96666c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96664a, i);
        dest.writeString(this.f96665b);
        dest.writeSerializable(this.f96666c);
    }
}
