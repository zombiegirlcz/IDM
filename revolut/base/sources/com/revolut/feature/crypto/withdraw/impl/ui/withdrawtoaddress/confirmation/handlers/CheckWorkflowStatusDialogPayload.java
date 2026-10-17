package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import bgf.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/confirmation/handlers/CheckWorkflowStatusDialogPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckWorkflowStatusDialogPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckWorkflowStatusDialogPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f71170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71171b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckWorkflowStatusDialogPayload((h) parcel.readValue(CheckWorkflowStatusDialogPayload.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckWorkflowStatusDialogPayload[i];
        }
    }

    public CheckWorkflowStatusDialogPayload(h transactionWorkflow, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f71170a = transactionWorkflow;
        this.f71171b = transactionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckWorkflowStatusDialogPayload)) {
            return false;
        }
        CheckWorkflowStatusDialogPayload checkWorkflowStatusDialogPayload = (CheckWorkflowStatusDialogPayload) obj2;
        return Intrinsics.f(this.f71170a, checkWorkflowStatusDialogPayload.f71170a) && Intrinsics.f(this.f71171b, checkWorkflowStatusDialogPayload.f71171b);
    }

    public final int hashCode() {
        return this.f71171b.hashCode() + (this.f71170a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeValue(this.f71170a);
        dest.writeString(this.f71171b);
    }
}
