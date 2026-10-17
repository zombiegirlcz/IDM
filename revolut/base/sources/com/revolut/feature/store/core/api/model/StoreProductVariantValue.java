package com.revolut.feature.store.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/core/api/model/StoreProductVariantValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreProductVariantValue implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreProductVariantValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f88650c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreProductVariantValue(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreProductVariantValue[i];
        }
    }

    public StoreProductVariantValue(String str, Integer num, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88648a = str;
        this.f88649b = value;
        this.f88650c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreProductVariantValue)) {
            return false;
        }
        StoreProductVariantValue storeProductVariantValue = (StoreProductVariantValue) obj2;
        return Intrinsics.f(this.f88648a, storeProductVariantValue.f88648a) && Intrinsics.f(this.f88649b, storeProductVariantValue.f88649b) && Intrinsics.f(this.f88650c, storeProductVariantValue.f88650c);
    }

    public final int hashCode() {
        String str = this.f88648a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f88649b);
        Integer num = this.f88650c;
        return iC + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88648a);
        dest.writeString(this.f88649b);
        Integer num = this.f88650c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
