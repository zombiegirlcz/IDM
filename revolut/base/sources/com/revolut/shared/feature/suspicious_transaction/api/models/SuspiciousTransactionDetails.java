package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import gal.f;
import gal.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f104931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f104933c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SuspiciousTransactionDetails(g.valueOf(parcel.readString()), parcel.readString(), f.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionDetails[i];
        }
    }

    public SuspiciousTransactionDetails(g status, String transactionId, f flowType) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f104931a = status;
        this.f104932b = transactionId;
        this.f104933c = flowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SuspiciousTransactionDetails)) {
            return false;
        }
        SuspiciousTransactionDetails suspiciousTransactionDetails = (SuspiciousTransactionDetails) obj2;
        return this.f104931a == suspiciousTransactionDetails.f104931a && Intrinsics.f(this.f104932b, suspiciousTransactionDetails.f104932b) && this.f104933c == suspiciousTransactionDetails.f104933c;
    }

    public final int hashCode() {
        return this.f104933c.hashCode() + p.a.c(this.f104931a.hashCode() * 31, 31, this.f104932b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104931a.name());
        dest.writeString(this.f104932b);
        dest.writeString(this.f104933c.name());
    }
}
