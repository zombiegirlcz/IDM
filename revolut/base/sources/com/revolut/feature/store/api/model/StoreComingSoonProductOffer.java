package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreComingSoonProductOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreComingSoonProductOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreComingSoonProductOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88470b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreComingSoonProductOffer(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreComingSoonProductOffer[i];
        }
    }

    public StoreComingSoonProductOffer(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f88469a = id10;
        this.f88470b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreComingSoonProductOffer)) {
            return false;
        }
        StoreComingSoonProductOffer storeComingSoonProductOffer = (StoreComingSoonProductOffer) obj2;
        return Intrinsics.f(this.f88469a, storeComingSoonProductOffer.f88469a) && Intrinsics.f(this.f88470b, storeComingSoonProductOffer.f88470b);
    }

    public final int hashCode() {
        int iHashCode = this.f88469a.hashCode() * 31;
        String str = this.f88470b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88469a);
        dest.writeString(this.f88470b);
    }
}
