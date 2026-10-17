package com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/common/screen/asset_type_chooser/SharedFavouritesAssetTypeChooserScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedFavouritesAssetTypeChooserScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SharedFavouritesAssetTypeChooserScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f86830a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SharedFavouritesAssetTypeChooserScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new SharedFavouritesAssetTypeChooserScreenContract$InputData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedFavouritesAssetTypeChooserScreenContract$InputData[i];
        }
    }

    public SharedFavouritesAssetTypeChooserScreenContract$InputData(List assetTypeKeys) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        this.f86830a = assetTypeKeys;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SharedFavouritesAssetTypeChooserScreenContract$InputData) && Intrinsics.f(this.f86830a, ((SharedFavouritesAssetTypeChooserScreenContract$InputData) obj2).f86830a);
    }

    public final int hashCode() {
        return this.f86830a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f86830a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
