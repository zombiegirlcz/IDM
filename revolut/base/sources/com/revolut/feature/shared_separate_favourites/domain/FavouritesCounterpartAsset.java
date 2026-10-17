package com.revolut.feature.shared_separate_favourites.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/FavouritesCounterpartAsset;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FavouritesCounterpartAsset implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FavouritesCounterpartAsset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86869c;
    public final d d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FavouritesCounterpartAsset(parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FavouritesCounterpartAsset[i];
        }
    }

    public FavouritesCounterpartAsset(String assetId, String symbol, String name, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f86867a = assetId;
        this.f86868b = symbol;
        this.f86869c = name;
        this.d = dVar;
        this.e = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FavouritesCounterpartAsset)) {
            return false;
        }
        FavouritesCounterpartAsset favouritesCounterpartAsset = (FavouritesCounterpartAsset) obj2;
        return Intrinsics.f(this.f86867a, favouritesCounterpartAsset.f86867a) && Intrinsics.f(this.f86868b, favouritesCounterpartAsset.f86868b) && Intrinsics.f(this.f86869c, favouritesCounterpartAsset.f86869c) && Intrinsics.f(this.d, favouritesCounterpartAsset.d) && Intrinsics.f(this.e, favouritesCounterpartAsset.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f86867a.hashCode() * 31, 31, this.f86868b), 31, this.f86869c);
        d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.e;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86867a);
        dest.writeString(this.f86868b);
        dest.writeString(this.f86869c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
