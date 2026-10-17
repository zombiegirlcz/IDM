package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaFiltersResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreMegaFiltersResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreMegaFiltersResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f88545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88546b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(StoreMegaFilter.CREATOR, parcel, arrayList2, iA2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreMegaQuickFilter.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList = arrayList3;
            }
            return new StoreMegaFiltersResponse(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreMegaFiltersResponse[i];
        }
    }

    public StoreMegaFiltersResponse(ArrayList filters, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f88545a = filters;
        this.f88546b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreMegaFiltersResponse)) {
            return false;
        }
        StoreMegaFiltersResponse storeMegaFiltersResponse = (StoreMegaFiltersResponse) obj2;
        return this.f88545a.equals(storeMegaFiltersResponse.f88545a) && Intrinsics.f(this.f88546b, storeMegaFiltersResponse.f88546b);
    }

    public final int hashCode() {
        int iHashCode = this.f88545a.hashCode() * 31;
        List list = this.f88546b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f88545a, dest);
        while (itY.hasNext()) {
            ((StoreMegaFilter) itY.next()).writeToParcel(dest, i);
        }
        List list = this.f88546b;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((StoreMegaQuickFilter) itQ.next()).writeToParcel(dest, i);
        }
    }
}
