package com.revolut.feature.selfserve.entity.config.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/models/EntityConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntityConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EntityConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f85835c;
    public final List d;
    public final List e;
    public final EntityProgress f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(EntityAction.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EntityInfo.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new EntityConfig(string, string2, arrayList, arrayList2, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : EntityProgress.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntityConfig[i];
        }
    }

    public EntityConfig(String title, String description, ArrayList actions, List moreInfo, List list, EntityProgress entityProgress) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(moreInfo, "moreInfo");
        this.f85833a = title;
        this.f85834b = description;
        this.f85835c = actions;
        this.d = moreInfo;
        this.e = list;
        this.f = entityProgress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntityConfig)) {
            return false;
        }
        EntityConfig entityConfig = (EntityConfig) obj2;
        return Intrinsics.f(this.f85833a, entityConfig.f85833a) && Intrinsics.f(this.f85834b, entityConfig.f85834b) && this.f85835c.equals(entityConfig.f85835c) && Intrinsics.f(this.d, entityConfig.d) && Intrinsics.f(this.e, entityConfig.e) && Intrinsics.f(this.f, entityConfig.f);
    }

    public final int hashCode() {
        int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f85835c, p.a.c(this.f85833a.hashCode() * 31, 31, this.f85834b), 31), 31, this.d);
        List list = this.e;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        EntityProgress entityProgress = this.f;
        return iHashCode + (entityProgress != null ? entityProgress.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85833a);
        dest.writeString(this.f85834b);
        Iterator itY = j6.a.y(this.f85835c, dest);
        while (itY.hasNext()) {
            ((EntityAction) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((EntityInfo) itV.next()).writeToParcel(dest, i);
        }
        dest.writeStringList(this.e);
        EntityProgress entityProgress = this.f;
        if (entityProgress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            entityProgress.writeToParcel(dest, i);
        }
    }
}
