package com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/suspicious_transaction/impl/ui/cancel/CancelScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancelScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CancelScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Screen.Cancel f105010b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancelScreenContract$InputData((SuspiciousTransactionDialog.Screen.Cancel) parcel.readParcelable(CancelScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancelScreenContract$InputData[i];
        }
    }

    public CancelScreenContract$InputData(SuspiciousTransactionDialog.Screen.Cancel screen, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f105009a = transactionId;
        this.f105010b = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CancelScreenContract$InputData)) {
            return false;
        }
        CancelScreenContract$InputData cancelScreenContract$InputData = (CancelScreenContract$InputData) obj2;
        return Intrinsics.f(this.f105009a, cancelScreenContract$InputData.f105009a) && Intrinsics.f(this.f105010b, cancelScreenContract$InputData.f105010b);
    }

    public final int hashCode() {
        return this.f105010b.hashCode() + (this.f105009a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105009a);
        dest.writeParcelable(this.f105010b, i);
    }
}
