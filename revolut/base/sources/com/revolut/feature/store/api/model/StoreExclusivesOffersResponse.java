package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesOffersResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreExclusivesOffersResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreExclusivesOffersResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreResponseMeta f88517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f88518b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StoreResponseMeta storeResponseMetaCreateFromParcel = StoreResponseMeta.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreExclusivesTile.CREATOR, parcel, arrayList, iA, 1);
            }
            return new StoreExclusivesOffersResponse(storeResponseMetaCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreExclusivesOffersResponse[i];
        }
    }

    public StoreExclusivesOffersResponse(StoreResponseMeta meta, ArrayList tiles) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.f88517a = meta;
        this.f88518b = tiles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreExclusivesOffersResponse)) {
            return false;
        }
        StoreExclusivesOffersResponse storeExclusivesOffersResponse = (StoreExclusivesOffersResponse) obj2;
        return Intrinsics.f(this.f88517a, storeExclusivesOffersResponse.f88517a) && this.f88518b.equals(storeExclusivesOffersResponse.f88518b);
    }

    public final int hashCode() {
        return this.f88518b.hashCode() + (this.f88517a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f88517a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f88518b, dest);
        while (itY.hasNext()) {
            ((StoreExclusivesTile) itY.next()).writeToParcel(dest, i);
        }
    }
}
