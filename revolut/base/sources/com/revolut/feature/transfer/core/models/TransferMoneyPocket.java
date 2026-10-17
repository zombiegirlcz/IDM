package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.SourceAccount;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/TransferMoneyPocket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferMoneyPocket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferMoneyPocket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SourceAccount f92262b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferMoneyPocket((d) parcel.readSerializable(), (SourceAccount) parcel.readParcelable(TransferMoneyPocket.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferMoneyPocket[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferMoneyPocket() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferMoneyPocket)) {
            return false;
        }
        TransferMoneyPocket transferMoneyPocket = (TransferMoneyPocket) obj2;
        return Intrinsics.f(this.f92261a, transferMoneyPocket.f92261a) && Intrinsics.f(this.f92262b, transferMoneyPocket.f92262b);
    }

    public final int hashCode() {
        d dVar = this.f92261a;
        return this.f92262b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92261a);
        dest.writeParcelable(this.f92262b, i);
    }

    public TransferMoneyPocket(d dVar, SourceAccount sourceAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        this.f92261a = dVar;
        this.f92262b = sourceAccount;
    }

    public /* synthetic */ TransferMoneyPocket(d dVar, SourceAccount.Pocket pocket, int i) {
        this((i & 1) != 0 ? null : dVar, (i & 2) != 0 ? SourceAccount.Default.f92247a : pocket);
    }
}
