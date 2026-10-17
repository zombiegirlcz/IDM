package com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uc3.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cashback/impl/ui/yourcashback/cashback_product/CashbackProductScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashbackProductScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CashbackProductScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f65720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65721b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashbackProductScreenContract$InputData(d.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashbackProductScreenContract$InputData[i];
        }
    }

    public CashbackProductScreenContract$InputData(d cashbackSourceType, boolean z) {
        Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
        this.f65720a = cashbackSourceType;
        this.f65721b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashbackProductScreenContract$InputData)) {
            return false;
        }
        CashbackProductScreenContract$InputData cashbackProductScreenContract$InputData = (CashbackProductScreenContract$InputData) obj2;
        return this.f65720a == cashbackProductScreenContract$InputData.f65720a && this.f65721b == cashbackProductScreenContract$InputData.f65721b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65721b) + (this.f65720a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65720a.name());
        dest.writeInt(this.f65721b ? 1 : 0);
    }
}
