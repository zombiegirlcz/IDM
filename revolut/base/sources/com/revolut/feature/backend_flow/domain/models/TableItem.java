package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/TableItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "Lxl2/u;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TableItem implements BackendItem, u {

    @NotNull
    public static final Parcelable.Creator<TableItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f63674b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TableRowItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TableItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TableItem[i];
        }
    }

    public TableItem(String id10, ArrayList items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f63673a = id10;
        this.f63674b = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TableItem)) {
            return false;
        }
        TableItem tableItem = (TableItem) obj2;
        return Intrinsics.f(this.f63673a, tableItem.f63673a) && this.f63674b.equals(tableItem.f63674b);
    }

    public final int hashCode() {
        return this.f63674b.hashCode() + (this.f63673a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63673a);
        Iterator itY = j6.a.y(this.f63674b, dest);
        while (itY.hasNext()) {
            ((TableRowItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
