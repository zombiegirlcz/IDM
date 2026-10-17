package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.t;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/TransactionCellItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "Lxl2/u;", "Lxl2/t;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionCellItem implements BackendItem, u, t {

    @NotNull
    public static final Parcelable.Creator<TransactionCellItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63703c;
    public final v9l.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionCellItem(parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionCellItem[i];
        }
    }

    public TransactionCellItem(String id10, String transactionId, String str, v9l.a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f63701a = id10;
        this.f63702b = transactionId;
        this.f63703c = str;
        this.d = aVar;
    }

    public static TransactionCellItem d(TransactionCellItem transactionCellItem, v9l.a aVar) {
        String id10 = transactionCellItem.f63701a;
        String transactionId = transactionCellItem.f63702b;
        String str = transactionCellItem.f63703c;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new TransactionCellItem(id10, transactionId, str, aVar);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63701a() {
        return this.f63701a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionCellItem)) {
            return false;
        }
        TransactionCellItem transactionCellItem = (TransactionCellItem) obj2;
        return Intrinsics.f(this.f63701a, transactionCellItem.f63701a) && Intrinsics.f(this.f63702b, transactionCellItem.f63702b) && Intrinsics.f(this.f63703c, transactionCellItem.f63703c) && Intrinsics.f(this.d, transactionCellItem.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63701a.hashCode() * 31, 31, this.f63702b);
        String str = this.f63703c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        v9l.a aVar = this.d;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63701a);
        dest.writeString(this.f63702b);
        dest.writeString(this.f63703c);
    }
}
