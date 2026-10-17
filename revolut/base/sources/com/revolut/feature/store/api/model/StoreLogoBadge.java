package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreLogoBadge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreLogoBadge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreLogoBadge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw0.a f88534b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreLogoBadge(parcel.readString(), parcel.readInt() == 0 ? null : dw0.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreLogoBadge[i];
        }
    }

    public StoreLogoBadge(String str, dw0.a aVar) {
        this.f88533a = str;
        this.f88534b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreLogoBadge)) {
            return false;
        }
        StoreLogoBadge storeLogoBadge = (StoreLogoBadge) obj2;
        return Intrinsics.f(this.f88533a, storeLogoBadge.f88533a) && this.f88534b == storeLogoBadge.f88534b;
    }

    public final int hashCode() {
        String str = this.f88533a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        dw0.a aVar = this.f88534b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88533a);
        dw0.a aVar = this.f88534b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
