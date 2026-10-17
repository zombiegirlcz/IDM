package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionConfirmationDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionConfirmationDialog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionConfirmationDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionConfirmDialog f104930a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SuspiciousTransactionConfirmationDialog(parcel.readInt() == 0 ? null : SuspiciousTransactionConfirmDialog.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionConfirmationDialog[i];
        }
    }

    public SuspiciousTransactionConfirmationDialog(SuspiciousTransactionConfirmDialog suspiciousTransactionConfirmDialog) {
        this.f104930a = suspiciousTransactionConfirmDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SuspiciousTransactionConfirmationDialog) && Intrinsics.f(this.f104930a, ((SuspiciousTransactionConfirmationDialog) obj2).f104930a);
    }

    public final int hashCode() {
        SuspiciousTransactionConfirmDialog suspiciousTransactionConfirmDialog = this.f104930a;
        if (suspiciousTransactionConfirmDialog == null) {
            return 0;
        }
        return suspiciousTransactionConfirmDialog.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        SuspiciousTransactionConfirmDialog suspiciousTransactionConfirmDialog = this.f104930a;
        if (suspiciousTransactionConfirmDialog == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionConfirmDialog.writeToParcel(dest, i);
        }
    }
}
