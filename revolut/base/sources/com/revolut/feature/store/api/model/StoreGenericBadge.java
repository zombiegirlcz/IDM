package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreGenericBadge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreGenericBadge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreGenericBadge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f88522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88524c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreGenericBadge(t.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreGenericBadge[i];
        }
    }

    public StoreGenericBadge(t theme, String str, String str2) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f88522a = theme;
        this.f88523b = str;
        this.f88524c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreGenericBadge)) {
            return false;
        }
        StoreGenericBadge storeGenericBadge = (StoreGenericBadge) obj2;
        return this.f88522a == storeGenericBadge.f88522a && Intrinsics.f(this.f88523b, storeGenericBadge.f88523b) && Intrinsics.f(this.f88524c, storeGenericBadge.f88524c);
    }

    public final int hashCode() {
        int iHashCode = this.f88522a.hashCode() * 31;
        String str = this.f88523b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88524c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88522a.name());
        dest.writeString(this.f88523b);
        dest.writeString(this.f88524c);
    }
}
