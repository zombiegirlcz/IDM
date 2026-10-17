package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.t;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EntitiesSummaryItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "Lxl2/t;", "", "Lxl2/a;", "Lxl2/u;", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntitiesSummaryItem implements BackendItem, t, xl2.a, u {

    @NotNull
    public static final Parcelable.Creator<EntitiesSummaryItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendEntitiesSummaryItem f63429c;
    public final EntityType d;
    public final boolean e;
    public final v9l.a f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(EntitiesSummaryItem.class, parcel, arrayList, iE, 1);
                }
            }
            return new EntitiesSummaryItem(string, arrayList, parcel.readInt() != 0 ? BackendEntitiesSummaryItem.CREATOR.createFromParcel(parcel) : null, (EntityType) parcel.readParcelable(EntitiesSummaryItem.class.getClassLoader()), parcel.readInt() != 0, 32);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntitiesSummaryItem[i];
        }
    }

    public EntitiesSummaryItem(String id10, List list, BackendEntitiesSummaryItem backendEntitiesSummaryItem, EntityType entityType, boolean z, v9l.a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        this.f63427a = id10;
        this.f63428b = list;
        this.f63429c = backendEntitiesSummaryItem;
        this.d = entityType;
        this.e = z;
        this.f = aVar;
    }

    public static EntitiesSummaryItem d(EntitiesSummaryItem entitiesSummaryItem, ArrayList arrayList, BackendEntitiesSummaryItem backendEntitiesSummaryItem, v9l.a aVar, int i) {
        String id10 = entitiesSummaryItem.f63427a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = entitiesSummaryItem.f63428b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            backendEntitiesSummaryItem = entitiesSummaryItem.f63429c;
        }
        BackendEntitiesSummaryItem backendEntitiesSummaryItem2 = backendEntitiesSummaryItem;
        EntityType entityType = entitiesSummaryItem.d;
        boolean z = entitiesSummaryItem.e;
        if ((i & 32) != 0) {
            aVar = entitiesSummaryItem.f;
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return new EntitiesSummaryItem(id10, list2, backendEntitiesSummaryItem2, entityType, z, aVar);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63427a() {
        return this.f63427a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntitiesSummaryItem)) {
            return false;
        }
        EntitiesSummaryItem entitiesSummaryItem = (EntitiesSummaryItem) obj2;
        return Intrinsics.f(this.f63427a, entitiesSummaryItem.f63427a) && Intrinsics.f(this.f63428b, entitiesSummaryItem.f63428b) && Intrinsics.f(this.f63429c, entitiesSummaryItem.f63429c) && Intrinsics.f(this.d, entitiesSummaryItem.d) && this.e == entitiesSummaryItem.e && Intrinsics.f(this.f, entitiesSummaryItem.f);
    }

    public final int hashCode() {
        int iHashCode = this.f63427a.hashCode() * 31;
        List list = this.f63428b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BackendEntitiesSummaryItem backendEntitiesSummaryItem = this.f63429c;
        int iC = j6.a.c((this.d.hashCode() + ((iHashCode2 + (backendEntitiesSummaryItem == null ? 0 : backendEntitiesSummaryItem.hashCode())) * 31)) * 31, 31, this.e);
        v9l.a aVar = this.f;
        return iC + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63427a);
        List list = this.f63428b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        BackendEntitiesSummaryItem backendEntitiesSummaryItem = this.f63429c;
        if (backendEntitiesSummaryItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            backendEntitiesSummaryItem.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ EntitiesSummaryItem(String str, List list, BackendEntitiesSummaryItem backendEntitiesSummaryItem, EntityType entityType, boolean z, int i) {
        this(str, list, (i & 4) != 0 ? null : backendEntitiesSummaryItem, entityType, z, (v9l.a) null);
    }
}
