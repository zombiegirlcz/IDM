package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreMegaFilterSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreMegaFilterSelection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreMegaFilterSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreMegaFilter f88543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88544b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StoreMegaFilter storeMegaFilterCreateFromParcel = StoreMegaFilter.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreMegaFilter.StoreMegaFilterValue.CREATOR, parcel, arrayList, iA, 1);
            }
            return new StoreMegaFilterSelection(storeMegaFilterCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreMegaFilterSelection[i];
        }
    }

    public StoreMegaFilterSelection(StoreMegaFilter filter, List values) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f88543a = filter;
        this.f88544b = values;
    }

    public static StoreMegaFilterSelection a(StoreMegaFilterSelection storeMegaFilterSelection, List values) {
        StoreMegaFilter filter = storeMegaFilterSelection.f88543a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(values, "values");
        return new StoreMegaFilterSelection(filter, values);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreMegaFilterSelection)) {
            return false;
        }
        StoreMegaFilterSelection storeMegaFilterSelection = (StoreMegaFilterSelection) obj2;
        return Intrinsics.f(this.f88543a, storeMegaFilterSelection.f88543a) && Intrinsics.f(this.f88544b, storeMegaFilterSelection.f88544b);
    }

    public final int hashCode() {
        return this.f88544b.hashCode() + (this.f88543a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f88543a.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f88544b, dest);
        while (itV.hasNext()) {
            ((StoreMegaFilter.StoreMegaFilterValue) itV.next()).writeToParcel(dest, i);
        }
    }
}
