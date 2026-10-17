package com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentsCollectionFiltersControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InstrumentsCollectionFiltersControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionType f95614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f95616c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            InstrumentsCollectionType instrumentsCollectionType = (InstrumentsCollectionType) j6.a.f(parcel, "parcel", InstrumentsCollectionFiltersControllerContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(InstrumentsCollectionFiltersControllerContract$InputData.class, parcel, arrayList, iE2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(InstrumentsCollectionFiltersControllerContract$InputData.class, parcel, arrayList2, iE, 1);
            }
            return new InstrumentsCollectionFiltersControllerContract$InputData(instrumentsCollectionType, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsCollectionFiltersControllerContract$InputData[i];
        }
    }

    public InstrumentsCollectionFiltersControllerContract$InputData(InstrumentsCollectionType collectionType, List defaultFilters, List filters) {
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(defaultFilters, "defaultFilters");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f95614a = collectionType;
        this.f95615b = defaultFilters;
        this.f95616c = filters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentsCollectionFiltersControllerContract$InputData)) {
            return false;
        }
        InstrumentsCollectionFiltersControllerContract$InputData instrumentsCollectionFiltersControllerContract$InputData = (InstrumentsCollectionFiltersControllerContract$InputData) obj2;
        return Intrinsics.f(this.f95614a, instrumentsCollectionFiltersControllerContract$InputData.f95614a) && Intrinsics.f(this.f95615b, instrumentsCollectionFiltersControllerContract$InputData.f95615b) && Intrinsics.f(this.f95616c, instrumentsCollectionFiltersControllerContract$InputData.f95616c);
    }

    public final int hashCode() {
        return this.f95616c.hashCode() + p.a.d(this.f95614a.hashCode() * 31, 31, this.f95615b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95614a, i);
        Iterator itV = p.a.v(this.f95615b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f95616c, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
