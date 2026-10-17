package com.revolut.feature.shared_separate_favourites.common.screen.init;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/common/screen/init/SharedFavouritesInitScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedFavouritesInitScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SharedFavouritesInitScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f86840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86841b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = d.e(SharedFavouritesInitScreenContract$InputData.class, parcel, linkedHashSet2, iE2, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i2);
                while (iE != i2) {
                    iE = d.e(SharedFavouritesInitScreenContract$InputData.class, parcel, linkedHashSet3, iE, 1);
                }
                linkedHashSet = linkedHashSet3;
            }
            return new SharedFavouritesInitScreenContract$InputData(linkedHashSet2, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedFavouritesInitScreenContract$InputData[i];
        }
    }

    public SharedFavouritesInitScreenContract$InputData(Set initialSelectedAssetTypes, Set set) {
        Intrinsics.checkNotNullParameter(initialSelectedAssetTypes, "initialSelectedAssetTypes");
        this.f86840a = initialSelectedAssetTypes;
        this.f86841b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedFavouritesInitScreenContract$InputData)) {
            return false;
        }
        SharedFavouritesInitScreenContract$InputData sharedFavouritesInitScreenContract$InputData = (SharedFavouritesInitScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86840a, sharedFavouritesInitScreenContract$InputData.f86840a) && Intrinsics.f(this.f86841b, sharedFavouritesInitScreenContract$InputData.f86841b);
    }

    public final int hashCode() {
        int iHashCode = this.f86840a.hashCode() * 31;
        Set set = this.f86841b;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f86840a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Set set = this.f86841b;
        if (set == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = e.q(dest, 1, set);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
