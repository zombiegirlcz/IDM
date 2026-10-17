package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendEntitiesSummaryItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendEntitiesSummaryItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendEntitiesSummaryItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63262c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendEntitiesSummaryItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendEntitiesSummaryItem[i];
        }
    }

    public BackendEntitiesSummaryItem(String title, String subtitle, String iconEntityId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconEntityId, "iconEntityId");
        this.f63260a = title;
        this.f63261b = subtitle;
        this.f63262c = iconEntityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendEntitiesSummaryItem)) {
            return false;
        }
        BackendEntitiesSummaryItem backendEntitiesSummaryItem = (BackendEntitiesSummaryItem) obj2;
        return Intrinsics.f(this.f63260a, backendEntitiesSummaryItem.f63260a) && Intrinsics.f(this.f63261b, backendEntitiesSummaryItem.f63261b) && Intrinsics.f(this.f63262c, backendEntitiesSummaryItem.f63262c);
    }

    public final int hashCode() {
        return this.f63262c.hashCode() + p.a.c(this.f63260a.hashCode() * 31, 31, this.f63261b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63260a);
        dest.writeString(this.f63261b);
        dest.writeString(this.f63262c);
    }
}
