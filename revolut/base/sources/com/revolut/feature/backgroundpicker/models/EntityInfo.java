package com.revolut.feature.backgroundpicker.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md6.d;
import md6.e;
import md6.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/EntityInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntityInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EntityInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f63815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f63816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f63817c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntityInfo(e.valueOf(parcel.readString()), f.valueOf(parcel.readString()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntityInfo[i];
        }
    }

    public EntityInfo(e accountType, f balanceType, d accountState) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        this.f63815a = accountType;
        this.f63816b = balanceType;
        this.f63817c = accountState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntityInfo)) {
            return false;
        }
        EntityInfo entityInfo = (EntityInfo) obj2;
        return this.f63815a == entityInfo.f63815a && this.f63816b == entityInfo.f63816b && this.f63817c == entityInfo.f63817c;
    }

    public final int hashCode() {
        return this.f63817c.hashCode() + ((this.f63816b.hashCode() + (this.f63815a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63815a.name());
        dest.writeString(this.f63816b.name());
        dest.writeString(this.f63817c.name());
    }

    public /* synthetic */ EntityInfo(e eVar, f fVar, d dVar, int i) {
        this(eVar, (i & 2) != 0 ? f.SIMPLE : fVar, (i & 4) != 0 ? d.OPENED : dVar);
    }
}
