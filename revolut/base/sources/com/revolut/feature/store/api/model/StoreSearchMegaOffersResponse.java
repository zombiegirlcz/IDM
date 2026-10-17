package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreSearchMegaOffersResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreSearchMegaOffersResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreSearchMegaOffersResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f88598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f88599c;
    public final List d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreMegaOfferListItem.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(StoreMegaOfferListItem.CREATOR, parcel, arrayList2, iA2, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iA3 = 0;
            while (iA3 != i3) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(StoreExclusivesTile.CREATOR, parcel, arrayList3, iA3, 1);
            }
            int i5 = parcel.readInt();
            boolean z = true;
            ArrayList arrayList4 = new ArrayList(i5);
            int iE = 0;
            while (iE != i5) {
                iE = j6.a.e(StoreSearchMegaOffersResponse.class, parcel, arrayList4, iE, 1);
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new StoreSearchMegaOffersResponse(arrayList, arrayList2, arrayList3, arrayList4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreSearchMegaOffersResponse[i];
        }
    }

    public StoreSearchMegaOffersResponse(List brands, ArrayList popularBrands, ArrayList products, List orders, boolean z) {
        Intrinsics.checkNotNullParameter(brands, "brands");
        Intrinsics.checkNotNullParameter(popularBrands, "popularBrands");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f88597a = brands;
        this.f88598b = popularBrands;
        this.f88599c = products;
        this.d = orders;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreSearchMegaOffersResponse)) {
            return false;
        }
        StoreSearchMegaOffersResponse storeSearchMegaOffersResponse = (StoreSearchMegaOffersResponse) obj2;
        return Intrinsics.f(this.f88597a, storeSearchMegaOffersResponse.f88597a) && this.f88598b.equals(storeSearchMegaOffersResponse.f88598b) && this.f88599c.equals(storeSearchMegaOffersResponse.f88599c) && Intrinsics.f(this.d, storeSearchMegaOffersResponse.d) && this.e == storeSearchMegaOffersResponse.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f88599c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f88598b, this.f88597a.hashCode() * 31, 31), 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f88597a, dest);
        while (itV.hasNext()) {
            ((StoreMegaOfferListItem) itV.next()).writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.f88598b, dest);
        while (itY.hasNext()) {
            ((StoreMegaOfferListItem) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f88599c, dest);
        while (itY2.hasNext()) {
            ((StoreExclusivesTile) itY2.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeInt(this.e ? 1 : 0);
    }
}
