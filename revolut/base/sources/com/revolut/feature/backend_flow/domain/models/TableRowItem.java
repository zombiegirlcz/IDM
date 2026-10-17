package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/TableRowItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TableRowItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TableRowItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63677c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TableRowItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TableRowItem[i];
        }
    }

    public TableRowItem(String id10, String title, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f63675a = id10;
        this.f63676b = title;
        this.f63677c = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TableRowItem)) {
            return false;
        }
        TableRowItem tableRowItem = (TableRowItem) obj2;
        return Intrinsics.f(this.f63675a, tableRowItem.f63675a) && Intrinsics.f(this.f63676b, tableRowItem.f63676b) && Intrinsics.f(this.f63677c, tableRowItem.f63677c);
    }

    public final int hashCode() {
        return this.f63677c.hashCode() + p.a.c(this.f63675a.hashCode() * 31, 31, this.f63676b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63675a);
        dest.writeString(this.f63676b);
        dest.writeString(this.f63677c);
    }
}
