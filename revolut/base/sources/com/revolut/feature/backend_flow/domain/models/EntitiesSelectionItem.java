package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EntitiesSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendEntityItem;", "Lcom/revolut/feature/backend_flow/domain/models/SelectableItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntitiesSelectionItem implements InputItem, BackendEntityItem, SelectableItem<String> {

    @NotNull
    public static final Parcelable.Creator<EntitiesSelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityType f63424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63425c;
    public final Set d;
    public final SelectionStyle e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f63426g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iA;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            EntityType entityType = (EntityType) parcel.readParcelable(EntitiesSelectionItem.class.getClassLoader());
            boolean z = false;
            if (parcel.readInt() != 0) {
                iA = 0;
                z = true;
            } else {
                iA = 0;
            }
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA2 = iA;
            while (iA2 != i) {
                iA2 = o.a(parcel, linkedHashSet, iA2, 1);
            }
            SelectionStyle selectionStyle = (SelectionStyle) parcel.readParcelable(EntitiesSelectionItem.class.getClassLoader());
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet2, iA, 1);
            }
            return new EntitiesSelectionItem(string, entityType, z, linkedHashSet, selectionStyle, null, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntitiesSelectionItem[i];
        }
    }

    public EntitiesSelectionItem(String id10, EntityType entityType, boolean z, Set selected, SelectionStyle style, List list, Set preselectedEntities) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(preselectedEntities, "preselectedEntities");
        this.f63423a = id10;
        this.f63424b = entityType;
        this.f63425c = z;
        this.d = selected;
        this.e = style;
        this.f = list;
        this.f63426g = preselectedEntities;
    }

    public static EntitiesSelectionItem d(EntitiesSelectionItem entitiesSelectionItem, Set set, List list, int i) {
        String id10 = entitiesSelectionItem.f63423a;
        EntityType entityType = entitiesSelectionItem.f63424b;
        boolean z = entitiesSelectionItem.f63425c;
        if ((i & 8) != 0) {
            set = entitiesSelectionItem.d;
        }
        Set selected = set;
        SelectionStyle style = entitiesSelectionItem.e;
        if ((i & 32) != 0) {
            list = entitiesSelectionItem.f;
        }
        Set preselectedEntities = entitiesSelectionItem.f63426g;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(preselectedEntities, "preselectedEntities");
        return new EntitiesSelectionItem(id10, entityType, z, selected, style, list, preselectedEntities);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectableItem
    public final SelectableItem D1(Set selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        return d(this, selected, null, LDSFile.EF_SOD_TAG);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63711a() {
        return this.f63423a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    public final BackendEntityItem c3(List list) {
        return d(this, null, list, 95);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63705b() {
        return this.f63425c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntitiesSelectionItem)) {
            return false;
        }
        EntitiesSelectionItem entitiesSelectionItem = (EntitiesSelectionItem) obj2;
        return Intrinsics.f(this.f63423a, entitiesSelectionItem.f63423a) && Intrinsics.f(this.f63424b, entitiesSelectionItem.f63424b) && this.f63425c == entitiesSelectionItem.f63425c && Intrinsics.f(this.d, entitiesSelectionItem.d) && Intrinsics.f(this.e, entitiesSelectionItem.e) && Intrinsics.f(this.f, entitiesSelectionItem.f) && Intrinsics.f(this.f63426g, entitiesSelectionItem.f63426g);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    /* JADX INFO: renamed from: getEntities, reason: from getter */
    public final List getF63432c() {
        return this.f;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63423a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectableItem
    /* JADX INFO: renamed from: h, reason: from getter */
    public final SelectionStyle getF63707g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.f(j6.a.c((this.f63424b.hashCode() + (this.f63423a.hashCode() * 31)) * 31, 31, this.f63425c), 31, this.d)) * 31;
        List list = this.f;
        return this.f63426g.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectableItem
    /* JADX INFO: renamed from: p4, reason: from getter */
    public final Set getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63423a);
        dest.writeParcelable(this.f63424b, i);
        dest.writeInt(this.f63425c ? 1 : 0);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeParcelable(this.e, i);
        Iterator itV2 = n.v(this.f63426g, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendEntityItem
    /* JADX INFO: renamed from: z6, reason: from getter */
    public final EntityType getF63431b() {
        return this.f63424b;
    }
}
