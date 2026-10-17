package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreSoldOutProductOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreSoldOutProductOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreSoldOutProductOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f88605c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreSoldOutProductOffer(parcel.readString(), parcel.readString(), g0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreSoldOutProductOffer[i];
        }
    }

    public StoreSoldOutProductOffer(String id10, String str, g0 state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f88603a = id10;
        this.f88604b = str;
        this.f88605c = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreSoldOutProductOffer)) {
            return false;
        }
        StoreSoldOutProductOffer storeSoldOutProductOffer = (StoreSoldOutProductOffer) obj2;
        return Intrinsics.f(this.f88603a, storeSoldOutProductOffer.f88603a) && Intrinsics.f(this.f88604b, storeSoldOutProductOffer.f88604b) && this.f88605c == storeSoldOutProductOffer.f88605c;
    }

    public final int hashCode() {
        int iHashCode = this.f88603a.hashCode() * 31;
        String str = this.f88604b;
        return this.f88605c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88603a);
        dest.writeString(this.f88604b);
        dest.writeString(this.f88605c.name());
    }
}
