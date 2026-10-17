package com.revolut.feature.selfserve.entity.config.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zxc.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/models/EntityProgressStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "zxc/b", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntityProgressStep implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EntityProgressStep> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f85842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f85843c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntityProgressStep(parcel.readString(), b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntityProgressStep[i];
        }
    }

    public EntityProgressStep(String title, b progress, Long l2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f85841a = title;
        this.f85842b = progress;
        this.f85843c = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntityProgressStep)) {
            return false;
        }
        EntityProgressStep entityProgressStep = (EntityProgressStep) obj2;
        return Intrinsics.f(this.f85841a, entityProgressStep.f85841a) && this.f85842b == entityProgressStep.f85842b && Intrinsics.f(this.f85843c, entityProgressStep.f85843c);
    }

    public final int hashCode() {
        int iHashCode = (this.f85842b.hashCode() + (this.f85841a.hashCode() * 31)) * 31;
        Long l2 = this.f85843c;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85841a);
        dest.writeString(this.f85842b.name());
        Long l2 = this.f85843c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
    }
}
