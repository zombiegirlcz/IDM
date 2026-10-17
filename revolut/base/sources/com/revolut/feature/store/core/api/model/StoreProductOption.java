package com.revolut.feature.store.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/core/api/model/StoreProductOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreProductOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreProductOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f88640c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreProductOption(parcel.readInt(), (RevPoints) parcel.readParcelable(StoreProductOption.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreProductOption[i];
        }
    }

    public StoreProductOption(int i, RevPoints points, String str) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f88638a = str;
        this.f88639b = i;
        this.f88640c = points;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreProductOption)) {
            return false;
        }
        StoreProductOption storeProductOption = (StoreProductOption) obj2;
        return Intrinsics.f(this.f88638a, storeProductOption.f88638a) && this.f88639b == storeProductOption.f88639b && Intrinsics.f(this.f88640c, storeProductOption.f88640c);
    }

    public final int hashCode() {
        String str = this.f88638a;
        return this.f88640c.f83960a.hashCode() + j6.a.b(this.f88639b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88638a);
        dest.writeInt(this.f88639b);
        dest.writeParcelable(this.f88640c, i);
    }
}
