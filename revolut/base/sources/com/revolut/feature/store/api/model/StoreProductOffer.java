package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreProductOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreProductOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreProductOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88575c;
    public final RevPoints d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreProductOffer((RevPoints) parcel.readParcelable(StoreProductOffer.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreProductOffer[i];
        }
    }

    public StoreProductOffer(RevPoints points, String id10, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f88573a = id10;
        this.f88574b = str;
        this.f88575c = str2;
        this.d = points;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreProductOffer)) {
            return false;
        }
        StoreProductOffer storeProductOffer = (StoreProductOffer) obj2;
        return Intrinsics.f(this.f88573a, storeProductOffer.f88573a) && Intrinsics.f(this.f88574b, storeProductOffer.f88574b) && Intrinsics.f(this.f88575c, storeProductOffer.f88575c) && Intrinsics.f(this.d, storeProductOffer.d) && Intrinsics.f(this.e, storeProductOffer.e);
    }

    public final int hashCode() {
        int iHashCode = this.f88573a.hashCode() * 31;
        String str = this.f88574b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88575c;
        int iC = v7.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d.f83960a);
        String str3 = this.e;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88573a);
        dest.writeString(this.f88574b);
        dest.writeString(this.f88575c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }
}
