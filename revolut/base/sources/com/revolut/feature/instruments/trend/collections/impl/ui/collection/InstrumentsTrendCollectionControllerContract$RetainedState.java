package com.revolut.feature.instruments.trend.collections.impl.ui.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ph7.b;
import ph7.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentsTrendCollectionControllerContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<InstrumentsTrendCollectionControllerContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f74910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f74911b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(b.valueOf(parcel.readString()), parcel.readParcelable(InstrumentsTrendCollectionControllerContract$RetainedState.class.getClassLoader()));
            }
            return new InstrumentsTrendCollectionControllerContract$RetainedState(linkedHashMap, parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsTrendCollectionControllerContract$RetainedState[i];
        }
    }

    public InstrumentsTrendCollectionControllerContract$RetainedState(Map selectedFilters, c cVar) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f74910a = selectedFilters;
        this.f74911b = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentsTrendCollectionControllerContract$RetainedState)) {
            return false;
        }
        InstrumentsTrendCollectionControllerContract$RetainedState instrumentsTrendCollectionControllerContract$RetainedState = (InstrumentsTrendCollectionControllerContract$RetainedState) obj2;
        return Intrinsics.f(this.f74910a, instrumentsTrendCollectionControllerContract$RetainedState.f74910a) && this.f74911b == instrumentsTrendCollectionControllerContract$RetainedState.f74911b;
    }

    public final int hashCode() {
        int iHashCode = this.f74910a.hashCode() * 31;
        c cVar = this.f74911b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itZ = j6.a.z(this.f74910a, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString(((b) entry.getKey()).name());
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
        c cVar = this.f74911b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
