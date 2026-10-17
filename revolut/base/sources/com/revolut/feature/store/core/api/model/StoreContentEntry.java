package com.revolut.feature.store.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/core/api/model/StoreContentEntry;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreContentEntry implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreContentEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1e.a f88627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88628b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreContentEntry(v1e.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreContentEntry[i];
        }
    }

    public StoreContentEntry(v1e.a iconRef, String text) {
        Intrinsics.checkNotNullParameter(iconRef, "iconRef");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f88627a = iconRef;
        this.f88628b = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreContentEntry)) {
            return false;
        }
        StoreContentEntry storeContentEntry = (StoreContentEntry) obj2;
        return this.f88627a == storeContentEntry.f88627a && Intrinsics.f(this.f88628b, storeContentEntry.f88628b);
    }

    public final int hashCode() {
        return this.f88628b.hashCode() + (this.f88627a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88627a.name());
        dest.writeString(this.f88628b);
    }
}
