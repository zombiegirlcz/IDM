package com.revolut.feature.selfserve.entity.config.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/models/EntityAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "zxc/a", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntityAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EntityAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zxc.a f85832c;
    public final String d;
    public final int e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntityAction(parcel.readString(), parcel.readString(), zxc.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntityAction[i];
        }
    }

    public EntityAction(String title, String subtitle, zxc.a status, String deepLink, int i, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f85830a = title;
        this.f85831b = subtitle;
        this.f85832c = status;
        this.d = deepLink;
        this.e = i;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntityAction)) {
            return false;
        }
        EntityAction entityAction = (EntityAction) obj2;
        return Intrinsics.f(this.f85830a, entityAction.f85830a) && Intrinsics.f(this.f85831b, entityAction.f85831b) && this.f85832c == entityAction.f85832c && Intrinsics.f(this.d, entityAction.d) && this.e == entityAction.e && Intrinsics.f(this.f, entityAction.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, p.a.c((this.f85832c.hashCode() + p.a.c(this.f85830a.hashCode() * 31, 31, this.f85831b)) * 31, 31, this.d), 31);
        String str = this.f;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85830a);
        dest.writeString(this.f85831b);
        dest.writeString(this.f85832c.name());
        dest.writeString(this.d);
        dest.writeInt(this.e);
        dest.writeString(this.f);
    }
}
