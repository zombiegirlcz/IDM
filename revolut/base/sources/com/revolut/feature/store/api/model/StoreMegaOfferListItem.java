package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaOfferListItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreMegaOfferListItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreMegaOfferListItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88563c;
    public final String d;
    public final StoreLogoBadge e;
    public final StoreMegaOffer f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreMegaOfferListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StoreLogoBadge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoreMegaOffer.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreMegaOfferListItem[i];
        }
    }

    public StoreMegaOfferListItem(String id10, String title, String str, String logoUrl, StoreLogoBadge storeLogoBadge, StoreMegaOffer storeMegaOffer) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f88561a = id10;
        this.f88562b = title;
        this.f88563c = str;
        this.d = logoUrl;
        this.e = storeLogoBadge;
        this.f = storeMegaOffer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreMegaOfferListItem)) {
            return false;
        }
        StoreMegaOfferListItem storeMegaOfferListItem = (StoreMegaOfferListItem) obj2;
        return Intrinsics.f(this.f88561a, storeMegaOfferListItem.f88561a) && Intrinsics.f(this.f88562b, storeMegaOfferListItem.f88562b) && Intrinsics.f(this.f88563c, storeMegaOfferListItem.f88563c) && Intrinsics.f(this.d, storeMegaOfferListItem.d) && Intrinsics.f(this.e, storeMegaOfferListItem.e) && Intrinsics.f(this.f, storeMegaOfferListItem.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f88561a.hashCode() * 31, 31, this.f88562b);
        String str = this.f88563c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        StoreLogoBadge storeLogoBadge = this.e;
        int iHashCode = (iC2 + (storeLogoBadge == null ? 0 : storeLogoBadge.hashCode())) * 31;
        StoreMegaOffer storeMegaOffer = this.f;
        return iHashCode + (storeMegaOffer != null ? storeMegaOffer.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88561a);
        dest.writeString(this.f88562b);
        dest.writeString(this.f88563c);
        dest.writeString(this.d);
        StoreLogoBadge storeLogoBadge = this.e;
        if (storeLogoBadge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeLogoBadge.writeToParcel(dest, i);
        }
        StoreMegaOffer storeMegaOffer = this.f;
        if (storeMegaOffer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeMegaOffer.writeToParcel(dest, i);
        }
    }
}
