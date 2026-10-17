package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaQuickFilter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreMegaQuickFilter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreMegaQuickFilter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f88567c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreMegaQuickFilter(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : x.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreMegaQuickFilter[i];
        }
    }

    public StoreMegaQuickFilter(String id10, String name, x xVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f88565a = id10;
        this.f88566b = name;
        this.f88567c = xVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreMegaQuickFilter)) {
            return false;
        }
        StoreMegaQuickFilter storeMegaQuickFilter = (StoreMegaQuickFilter) obj2;
        return Intrinsics.f(this.f88565a, storeMegaQuickFilter.f88565a) && Intrinsics.f(this.f88566b, storeMegaQuickFilter.f88566b) && this.f88567c == storeMegaQuickFilter.f88567c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f88565a.hashCode() * 31, 31, this.f88566b);
        x xVar = this.f88567c;
        return iC + (xVar == null ? 0 : xVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88565a);
        dest.writeString(this.f88566b);
        x xVar = this.f88567c;
        if (xVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(xVar.name());
        }
    }
}
