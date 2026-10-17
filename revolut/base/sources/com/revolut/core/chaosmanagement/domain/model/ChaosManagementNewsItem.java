package com.revolut.core.chaosmanagement.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nd0.b;
import nd0.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/chaosmanagement/domain/model/ChaosManagementNewsItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "nd0/b", "core_chaos_management_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChaosManagementNewsItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChaosManagementNewsItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51354c;
    public final String d;
    public final String e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f51355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f51356h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChaosManagementNewsItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChaosManagementNewsItem[i];
        }
    }

    public ChaosManagementNewsItem(String id10, String title, String subtitle, String iconUrl, String destination, b state, DateTime createdDate, c type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f51352a = id10;
        this.f51353b = title;
        this.f51354c = subtitle;
        this.d = iconUrl;
        this.e = destination;
        this.f = state;
        this.f51355g = createdDate;
        this.f51356h = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChaosManagementNewsItem)) {
            return false;
        }
        ChaosManagementNewsItem chaosManagementNewsItem = (ChaosManagementNewsItem) obj2;
        return Intrinsics.f(this.f51352a, chaosManagementNewsItem.f51352a) && Intrinsics.f(this.f51353b, chaosManagementNewsItem.f51353b) && Intrinsics.f(this.f51354c, chaosManagementNewsItem.f51354c) && Intrinsics.f(this.d, chaosManagementNewsItem.d) && Intrinsics.f(this.e, chaosManagementNewsItem.e) && this.f == chaosManagementNewsItem.f && Intrinsics.f(this.f51355g, chaosManagementNewsItem.f51355g) && this.f51356h == chaosManagementNewsItem.f51356h;
    }

    public final int hashCode() {
        return this.f51356h.hashCode() + m72.b.f(this.f51355g, (this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f51352a.hashCode() * 31, 31, this.f51353b), 31, this.f51354c), 31, this.d), 31, this.e)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51352a);
        dest.writeString(this.f51353b);
        dest.writeString(this.f51354c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f51355g);
        dest.writeString(this.f51356h.name());
    }
}
