package com.revolut.feature.blocked_merchants.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr2.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantDisallowedDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlockMerchantDisallowedDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BlockMerchantDisallowedDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f64208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64209c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BlockMerchantDisallowedDestination(parcel.readString(), (c) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlockMerchantDisallowedDestination[i];
        }
    }

    public BlockMerchantDisallowedDestination(String merchantName, c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f64207a = merchantName;
        this.f64208b = cVar;
        this.f64209c = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF64209c() {
        return this.f64209c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getF64208b() {
        return this.f64208b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF64207a() {
        return this.f64207a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BlockMerchantDisallowedDestination)) {
            return false;
        }
        BlockMerchantDisallowedDestination blockMerchantDisallowedDestination = (BlockMerchantDisallowedDestination) obj2;
        return Intrinsics.f(this.f64207a, blockMerchantDisallowedDestination.f64207a) && Intrinsics.f(this.f64208b, blockMerchantDisallowedDestination.f64208b) && this.f64209c == blockMerchantDisallowedDestination.f64209c;
    }

    public final int hashCode() {
        int iHashCode = this.f64207a.hashCode() * 31;
        c cVar = this.f64208b;
        return Boolean.hashCode(this.f64209c) + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64207a);
        dest.writeSerializable(this.f64208b);
        dest.writeInt(this.f64209c ? 1 : 0);
    }
}
