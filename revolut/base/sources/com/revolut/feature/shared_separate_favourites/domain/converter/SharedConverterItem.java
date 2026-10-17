package com.revolut.feature.shared_separate_favourites.domain.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/converter/SharedConverterItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedConverterItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SharedConverterItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f86892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f86893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86894c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedConverterItem(FavouritesAssetTypeKey.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable(), parcel.readString(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedConverterItem[i];
        }
    }

    public SharedConverterItem(FavouritesAssetTypeKey assetTypeKey, b currency, String str, d convertedAmount) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(convertedAmount, "convertedAmount");
        this.f86892a = assetTypeKey;
        this.f86893b = currency;
        this.f86894c = str;
        this.d = convertedAmount;
    }

    public static SharedConverterItem a(SharedConverterItem sharedConverterItem, d convertedAmount) {
        FavouritesAssetTypeKey assetTypeKey = sharedConverterItem.f86892a;
        b currency = sharedConverterItem.f86893b;
        String str = sharedConverterItem.f86894c;
        sharedConverterItem.getClass();
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(convertedAmount, "convertedAmount");
        return new SharedConverterItem(assetTypeKey, currency, str, convertedAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedConverterItem)) {
            return false;
        }
        SharedConverterItem sharedConverterItem = (SharedConverterItem) obj2;
        return Intrinsics.f(this.f86892a, sharedConverterItem.f86892a) && Intrinsics.f(this.f86893b, sharedConverterItem.f86893b) && Intrinsics.f(this.f86894c, sharedConverterItem.f86894c) && Intrinsics.f(this.d, sharedConverterItem.d);
    }

    public final int hashCode() {
        int iJ = l.j(this.f86893b, this.f86892a.f86866a.hashCode() * 31, 31);
        String str = this.f86894c;
        return this.d.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86892a.writeToParcel(dest, i);
        dest.writeSerializable(this.f86893b);
        dest.writeString(this.f86894c);
        dest.writeSerializable(this.d);
    }
}
