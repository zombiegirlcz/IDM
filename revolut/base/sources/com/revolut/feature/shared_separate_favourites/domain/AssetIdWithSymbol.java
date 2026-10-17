package com.revolut.feature.shared_separate_favourites.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/AssetIdWithSymbol;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetIdWithSymbol implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetIdWithSymbol> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86862b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetIdWithSymbol(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AssetIdWithSymbol[i];
        }
    }

    public AssetIdWithSymbol(String assetId, String symbol) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f86861a = assetId;
        this.f86862b = symbol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AssetIdWithSymbol)) {
            return false;
        }
        AssetIdWithSymbol assetIdWithSymbol = (AssetIdWithSymbol) obj2;
        return Intrinsics.f(this.f86861a, assetIdWithSymbol.f86861a) && Intrinsics.f(this.f86862b, assetIdWithSymbol.f86862b);
    }

    public final int hashCode() {
        return this.f86862b.hashCode() + (this.f86861a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86861a);
        dest.writeString(this.f86862b);
    }
}
