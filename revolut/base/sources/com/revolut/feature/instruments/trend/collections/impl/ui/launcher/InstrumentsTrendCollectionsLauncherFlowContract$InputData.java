package com.revolut.feature.instruments.trend.collections.impl.ui.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ph7.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/instruments/trend/collections/impl/ui/launcher/InstrumentsTrendCollectionsLauncherFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentsTrendCollectionsLauncherFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InstrumentsTrendCollectionsLauncherFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsTrendCollectionId f74920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f74921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f74922c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            InstrumentsTrendCollectionId instrumentsTrendCollectionId = (InstrumentsTrendCollectionId) j6.a.f(parcel, "parcel", InstrumentsTrendCollectionsLauncherFlowContract$InputData.class);
            LinkedHashMap linkedHashMap = null;
            c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(ph7.b.valueOf(parcel.readString()), parcel.readParcelable(InstrumentsTrendCollectionsLauncherFlowContract$InputData.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new InstrumentsTrendCollectionsLauncherFlowContract$InputData(instrumentsTrendCollectionId, linkedHashMap, cVarValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsTrendCollectionsLauncherFlowContract$InputData[i];
        }
    }

    public InstrumentsTrendCollectionsLauncherFlowContract$InputData(InstrumentsTrendCollectionId collectionId, Map map, c cVar) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        this.f74920a = collectionId;
        this.f74921b = cVar;
        this.f74922c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentsTrendCollectionsLauncherFlowContract$InputData)) {
            return false;
        }
        InstrumentsTrendCollectionsLauncherFlowContract$InputData instrumentsTrendCollectionsLauncherFlowContract$InputData = (InstrumentsTrendCollectionsLauncherFlowContract$InputData) obj2;
        return Intrinsics.f(this.f74920a, instrumentsTrendCollectionsLauncherFlowContract$InputData.f74920a) && this.f74921b == instrumentsTrendCollectionsLauncherFlowContract$InputData.f74921b && Intrinsics.f(this.f74922c, instrumentsTrendCollectionsLauncherFlowContract$InputData.f74922c);
    }

    public final int hashCode() {
        int iHashCode = this.f74920a.hashCode() * 31;
        c cVar = this.f74921b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Map map = this.f74922c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74920a, i);
        c cVar = this.f74921b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        Map map = this.f74922c;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            dest.writeString(((ph7.b) entry.getKey()).name());
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
