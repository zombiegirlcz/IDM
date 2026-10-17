package com.revolut.feature.shared_separate_favourites.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/FavouritesAssetDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FavouritesAssetDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FavouritesAssetDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86865c;
    public final FavouritesAssetTypeKey d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FavouritesAssetDetails(parcel.readString(), parcel.readString(), parcel.readString(), FavouritesAssetTypeKey.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FavouritesAssetDetails[i];
        }
    }

    public FavouritesAssetDetails(String assetId, String symbol, String name, FavouritesAssetTypeKey typeKey, boolean z) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        this.f86863a = assetId;
        this.f86864b = symbol;
        this.f86865c = name;
        this.d = typeKey;
        this.e = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF86863a() {
        return this.f86863a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FavouritesAssetDetails)) {
            return false;
        }
        FavouritesAssetDetails favouritesAssetDetails = (FavouritesAssetDetails) obj2;
        return Intrinsics.f(this.f86863a, favouritesAssetDetails.f86863a) && Intrinsics.f(this.f86864b, favouritesAssetDetails.f86864b) && Intrinsics.f(this.f86865c, favouritesAssetDetails.f86865c) && Intrinsics.f(this.d, favouritesAssetDetails.d) && this.e == favouritesAssetDetails.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f86863a.hashCode() * 31, 31, this.f86864b), 31, this.f86865c), 31, this.d.f86866a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86863a);
        dest.writeString(this.f86864b);
        dest.writeString(this.f86865c);
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
