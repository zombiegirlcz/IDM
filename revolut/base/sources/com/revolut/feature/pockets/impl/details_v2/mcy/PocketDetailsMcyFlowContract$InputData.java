package com.revolut.feature.pockets.impl.details_v2.mcy;

import android.os.Parcel;
import android.os.Parcelable;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/mcy/PocketDetailsMcyFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketDetailsMcyFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PocketDetailsMcyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f80824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f80825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80826c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketDetailsMcyFlowContract$InputData((xi0.b) parcel.readSerializable(), l.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketDetailsMcyFlowContract$InputData[i];
        }
    }

    public PocketDetailsMcyFlowContract$InputData(xi0.b currency, l pocketType, String walletId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f80824a = currency;
        this.f80825b = pocketType;
        this.f80826c = walletId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketDetailsMcyFlowContract$InputData)) {
            return false;
        }
        PocketDetailsMcyFlowContract$InputData pocketDetailsMcyFlowContract$InputData = (PocketDetailsMcyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f80824a, pocketDetailsMcyFlowContract$InputData.f80824a) && this.f80825b == pocketDetailsMcyFlowContract$InputData.f80825b && Intrinsics.f(this.f80826c, pocketDetailsMcyFlowContract$InputData.f80826c);
    }

    public final int hashCode() {
        return this.f80826c.hashCode() + t61.a.c(this.f80825b, this.f80824a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80824a);
        dest.writeString(this.f80825b.name());
        dest.writeString(this.f80826c);
    }
}
