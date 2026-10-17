package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EntitiesListItem;", "Lxl2/u;", "Lcom/revolut/feature/backend_flow/domain/models/BackendEntityItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntitiesListItem implements u, BackendEntityItem {

    @NotNull
    public static final Parcelable.Creator<EntitiesListItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityType f63421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63422c;
    public final Integer d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntitiesListItem(parcel.readString(), (EntityType) parcel.readParcelable(EntitiesListItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntitiesListItem[i];
        }
    }

    public EntitiesListItem(String id10, EntityType entityType, String str, Integer num, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        this.f63420a = id10;
        this.f63421b = entityType;
        this.f63422c = str;
        this.d = num;
        this.e = list;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63420a() {
        return this.f63420a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    public final BackendEntityItem c3(List list) {
        String id10 = this.f63420a;
        Intrinsics.checkNotNullParameter(id10, "id");
        EntityType entityType = this.f63421b;
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return new EntitiesListItem(id10, entityType, this.f63422c, this.d, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntitiesListItem)) {
            return false;
        }
        EntitiesListItem entitiesListItem = (EntitiesListItem) obj2;
        return Intrinsics.f(this.f63420a, entitiesListItem.f63420a) && Intrinsics.f(this.f63421b, entitiesListItem.f63421b) && Intrinsics.f(this.f63422c, entitiesListItem.f63422c) && Intrinsics.f(this.d, entitiesListItem.d) && Intrinsics.f(this.e, entitiesListItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    /* JADX INFO: renamed from: getEntities, reason: from getter */
    public final List getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f63421b.hashCode() + (this.f63420a.hashCode() * 31)) * 31;
        String str = this.f63422c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63420a);
        dest.writeParcelable(this.f63421b, i);
        dest.writeString(this.f63422c);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    /* JADX INFO: renamed from: z6, reason: from getter */
    public final EntityType getF63421b() {
        return this.f63421b;
    }
}
