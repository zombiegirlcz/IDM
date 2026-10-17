package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionConfirmDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionConfirmDialog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionConfirmDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SuspiciousTransactionBannerAction f104929c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SuspiciousTransactionConfirmDialog(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuspiciousTransactionBannerAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionConfirmDialog[i];
        }
    }

    public SuspiciousTransactionConfirmDialog(String title, String str, SuspiciousTransactionBannerAction suspiciousTransactionBannerAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104927a = title;
        this.f104928b = str;
        this.f104929c = suspiciousTransactionBannerAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SuspiciousTransactionConfirmDialog)) {
            return false;
        }
        SuspiciousTransactionConfirmDialog suspiciousTransactionConfirmDialog = (SuspiciousTransactionConfirmDialog) obj2;
        return Intrinsics.f(this.f104927a, suspiciousTransactionConfirmDialog.f104927a) && Intrinsics.f(this.f104928b, suspiciousTransactionConfirmDialog.f104928b) && Intrinsics.f(this.f104929c, suspiciousTransactionConfirmDialog.f104929c);
    }

    public final int hashCode() {
        int iHashCode = this.f104927a.hashCode() * 31;
        String str = this.f104928b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SuspiciousTransactionBannerAction suspiciousTransactionBannerAction = this.f104929c;
        return iHashCode2 + (suspiciousTransactionBannerAction != null ? suspiciousTransactionBannerAction.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104927a);
        dest.writeString(this.f104928b);
        SuspiciousTransactionBannerAction suspiciousTransactionBannerAction = this.f104929c;
        if (suspiciousTransactionBannerAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionBannerAction.writeToParcel(dest, i);
        }
    }
}
