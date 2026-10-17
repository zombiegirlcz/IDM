package com.google.android.gms.common.server.response;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final HashMap f38261zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String f38262zac;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.zaa = i;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.f38257zab;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zalVar.f38258zac)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) zalVar.f38258zac.get(i3);
                map2.put(zamVar.f38259zab, zamVar.f38260zac);
            }
            map.put(str2, map2);
        }
        this.f38261zab = map;
        this.f38262zac = (String) Preconditions.checkNotNull(str);
        zad();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        for (String str : this.f38261zab.keySet()) {
            sb6.append(str);
            sb6.append(":\n");
            Map map = (Map) this.f38261zab.get(str);
            for (String str2 : map.keySet()) {
                d.C(sb6, "  ", str2, ": ");
                sb6.append(map.get(str2));
            }
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f38261zab.keySet()) {
            arrayList.add(new zal(str, (Map) this.f38261zab.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.f38262zac, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zaa() {
        return this.f38262zac;
    }

    public final Map zab(String str) {
        return (Map) this.f38261zab.get(str);
    }

    public final void zac() {
        for (String str : this.f38261zab.keySet()) {
            Map map = (Map) this.f38261zab.get(str);
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                map2.put(str2, ((FastJsonResponse.Field) map.get(str2)).zab());
            }
            this.f38261zab.put(str, map2);
        }
    }

    public final void zad() {
        Iterator it8 = this.f38261zab.keySet().iterator();
        while (it8.hasNext()) {
            Map map = (Map) this.f38261zab.get((String) it8.next());
            Iterator it9 = map.keySet().iterator();
            while (it9.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it9.next())).zai(this);
            }
        }
    }

    public final void zae(Class cls, Map map) {
        this.f38261zab.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(Class cls) {
        return this.f38261zab.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zan(Class cls) {
        this.zaa = 1;
        this.f38261zab = new HashMap();
        this.f38262zac = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
