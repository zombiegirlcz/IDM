package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionBannerAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionBannerAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionBannerAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SuspiciousTransactionBannerPrompt f104921c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SuspiciousTransactionBannerAction(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuspiciousTransactionBannerPrompt.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionBannerAction[i];
        }
    }

    public SuspiciousTransactionBannerAction(String title, String str, SuspiciousTransactionBannerPrompt suspiciousTransactionBannerPrompt) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104919a = title;
        this.f104920b = str;
        this.f104921c = suspiciousTransactionBannerPrompt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SuspiciousTransactionBannerAction)) {
            return false;
        }
        SuspiciousTransactionBannerAction suspiciousTransactionBannerAction = (SuspiciousTransactionBannerAction) obj2;
        return Intrinsics.f(this.f104919a, suspiciousTransactionBannerAction.f104919a) && Intrinsics.f(this.f104920b, suspiciousTransactionBannerAction.f104920b) && Intrinsics.f(this.f104921c, suspiciousTransactionBannerAction.f104921c);
    }

    public final int hashCode() {
        int iHashCode = this.f104919a.hashCode() * 31;
        String str = this.f104920b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SuspiciousTransactionBannerPrompt suspiciousTransactionBannerPrompt = this.f104921c;
        return iHashCode2 + (suspiciousTransactionBannerPrompt != null ? suspiciousTransactionBannerPrompt.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104919a);
        dest.writeString(this.f104920b);
        SuspiciousTransactionBannerPrompt suspiciousTransactionBannerPrompt = this.f104921c;
        if (suspiciousTransactionBannerPrompt == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionBannerPrompt.writeToParcel(dest, i);
        }
    }
}
