package com.revolut.feature.shared_separate_favourites.common.screen.add_asset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/common/screen/add_asset/SharedFavouritesAddAssetScreenContract$AssetSelectionInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedFavouritesAddAssetScreenContract$AssetSelectionInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SharedFavouritesAddAssetScreenContract$AssetSelectionInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86808b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedFavouritesAddAssetScreenContract$AssetSelectionInfo(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedFavouritesAddAssetScreenContract$AssetSelectionInfo[i];
        }
    }

    public SharedFavouritesAddAssetScreenContract$AssetSelectionInfo(int i, int i2) {
        this.f86807a = i;
        this.f86808b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedFavouritesAddAssetScreenContract$AssetSelectionInfo)) {
            return false;
        }
        SharedFavouritesAddAssetScreenContract$AssetSelectionInfo sharedFavouritesAddAssetScreenContract$AssetSelectionInfo = (SharedFavouritesAddAssetScreenContract$AssetSelectionInfo) obj2;
        return this.f86807a == sharedFavouritesAddAssetScreenContract$AssetSelectionInfo.f86807a && this.f86808b == sharedFavouritesAddAssetScreenContract$AssetSelectionInfo.f86808b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86808b) + (Integer.hashCode(this.f86807a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f86807a);
        dest.writeInt(this.f86808b);
    }
}
