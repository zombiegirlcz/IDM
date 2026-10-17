package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.t;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EntityCellItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendEntityItem;", "Lxl2/t;", "", "Lxl2/u;", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntityCellItem implements BackendEntityItem, t, u {

    @NotNull
    public static final Parcelable.Creator<EntityCellItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityType f63431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63432c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntityCellItem(parcel.readString(), (EntityType) parcel.readParcelable(EntityCellItem.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntityCellItem[i];
        }
    }

    public EntityCellItem(String id10, EntityType entityType, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        this.f63430a = id10;
        this.f63431b = entityType;
        this.f63432c = list;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63430a() {
        return this.f63430a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    public final BackendEntityItem c3(List list) {
        String id10 = this.f63430a;
        Intrinsics.checkNotNullParameter(id10, "id");
        EntityType entityType = this.f63431b;
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return new EntityCellItem(id10, entityType, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntityCellItem)) {
            return false;
        }
        EntityCellItem entityCellItem = (EntityCellItem) obj2;
        return Intrinsics.f(this.f63430a, entityCellItem.f63430a) && Intrinsics.f(this.f63431b, entityCellItem.f63431b) && Intrinsics.f(this.f63432c, entityCellItem.f63432c);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    /* JADX INFO: renamed from: getEntities, reason: from getter */
    public final List getF63432c() {
        return this.f63432c;
    }

    public final int hashCode() {
        int iHashCode = (this.f63431b.hashCode() + (this.f63430a.hashCode() * 31)) * 31;
        List list = this.f63432c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63430a);
        dest.writeParcelable(this.f63431b, i);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    /* JADX INFO: renamed from: z6, reason: from getter */
    public final EntityType getF63431b() {
        return this.f63431b;
    }
}
