package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/TransactionCell;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionCell implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransactionCell> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f104980c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionCell(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionCell[i];
        }
    }

    public TransactionCell(String initials, Long l2, String title, String amount) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f104978a = initials;
        this.f104979b = title;
        this.f104980c = l2;
        this.d = amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionCell)) {
            return false;
        }
        TransactionCell transactionCell = (TransactionCell) obj2;
        return Intrinsics.f(this.f104978a, transactionCell.f104978a) && Intrinsics.f(this.f104979b, transactionCell.f104979b) && Intrinsics.f(this.f104980c, transactionCell.f104980c) && Intrinsics.f(this.d, transactionCell.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f104978a.hashCode() * 31, 31, this.f104979b);
        Long l2 = this.f104980c;
        return this.d.hashCode() + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104978a);
        dest.writeString(this.f104979b);
        Long l2 = this.f104980c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.d);
    }
}
