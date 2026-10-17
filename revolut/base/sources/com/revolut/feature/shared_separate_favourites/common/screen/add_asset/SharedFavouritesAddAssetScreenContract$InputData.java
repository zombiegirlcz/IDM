package com.revolut.feature.shared_separate_favourites.common.screen.add_asset;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfd.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/shared_separate_favourites/common/screen/add_asset/SharedFavouritesAddAssetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "yfd/n", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedFavouritesAddAssetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SharedFavouritesAddAssetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f86809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f86810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f86811c;
    public final SharedFavouritesAddAssetScreenContract$AssetSelectionInfo d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedFavouritesAddAssetScreenContract$InputData((FavouritesAssetTypeKey) parcel.readParcelable(SharedFavouritesAddAssetScreenContract$InputData.class.getClassLoader()), (xi0.b) parcel.readSerializable(), n.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SharedFavouritesAddAssetScreenContract$AssetSelectionInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedFavouritesAddAssetScreenContract$InputData[i];
        }
    }

    public SharedFavouritesAddAssetScreenContract$InputData(FavouritesAssetTypeKey assetTypeKey, xi0.b bVar, n selectMode, SharedFavouritesAddAssetScreenContract$AssetSelectionInfo sharedFavouritesAddAssetScreenContract$AssetSelectionInfo) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(selectMode, "selectMode");
        this.f86809a = assetTypeKey;
        this.f86810b = bVar;
        this.f86811c = selectMode;
        this.d = sharedFavouritesAddAssetScreenContract$AssetSelectionInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedFavouritesAddAssetScreenContract$InputData)) {
            return false;
        }
        SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData = (SharedFavouritesAddAssetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86809a, sharedFavouritesAddAssetScreenContract$InputData.f86809a) && Intrinsics.f(this.f86810b, sharedFavouritesAddAssetScreenContract$InputData.f86810b) && this.f86811c == sharedFavouritesAddAssetScreenContract$InputData.f86811c && Intrinsics.f(this.d, sharedFavouritesAddAssetScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f86809a.f86866a.hashCode() * 31;
        xi0.b bVar = this.f86810b;
        int iHashCode2 = (this.f86811c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        SharedFavouritesAddAssetScreenContract$AssetSelectionInfo sharedFavouritesAddAssetScreenContract$AssetSelectionInfo = this.d;
        return iHashCode2 + (sharedFavouritesAddAssetScreenContract$AssetSelectionInfo != null ? sharedFavouritesAddAssetScreenContract$AssetSelectionInfo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86809a, i);
        dest.writeSerializable(this.f86810b);
        dest.writeString(this.f86811c.name());
        SharedFavouritesAddAssetScreenContract$AssetSelectionInfo sharedFavouritesAddAssetScreenContract$AssetSelectionInfo = this.d;
        if (sharedFavouritesAddAssetScreenContract$AssetSelectionInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sharedFavouritesAddAssetScreenContract$AssetSelectionInfo.writeToParcel(dest, i);
        }
    }
}
