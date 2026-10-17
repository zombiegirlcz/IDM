package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import f8l.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/Asset;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Asset implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Asset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f104719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f104721c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Asset(c.valueOf(parcel.readString()), parcel.readString(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Asset[i];
        }
    }

    public Asset(c assetType, String symbol, xi0.b ref2) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f104719a = assetType;
        this.f104720b = symbol;
        this.f104721c = ref2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj2;
        return this.f104719a == asset.f104719a && Intrinsics.f(this.f104720b, asset.f104720b) && Intrinsics.f(this.f104721c, asset.f104721c);
    }

    public final int hashCode() {
        return this.f104721c.hashCode() + p.a.c(this.f104719a.hashCode() * 31, 31, this.f104720b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104719a.name());
        dest.writeString(this.f104720b);
        dest.writeSerializable(this.f104721c);
    }
}
