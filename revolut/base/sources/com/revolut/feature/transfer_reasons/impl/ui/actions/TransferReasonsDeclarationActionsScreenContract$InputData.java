package com.revolut.feature.transfer_reasons.impl.ui.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/actions/TransferReasonsDeclarationActionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsDeclarationActionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsDeclarationActionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ttf.a f92372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92373c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferReasonsDeclarationActionsScreenContract$InputData(parcel.readString(), (ttf.a) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsDeclarationActionsScreenContract$InputData[i];
        }
    }

    public TransferReasonsDeclarationActionsScreenContract$InputData(String transactionId, ttf.a transactionTransferReasons, String pocketId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionTransferReasons, "transactionTransferReasons");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f92371a = transactionId;
        this.f92372b = transactionTransferReasons;
        this.f92373c = pocketId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsDeclarationActionsScreenContract$InputData)) {
            return false;
        }
        TransferReasonsDeclarationActionsScreenContract$InputData transferReasonsDeclarationActionsScreenContract$InputData = (TransferReasonsDeclarationActionsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92371a, transferReasonsDeclarationActionsScreenContract$InputData.f92371a) && Intrinsics.f(this.f92372b, transferReasonsDeclarationActionsScreenContract$InputData.f92372b) && Intrinsics.f(this.f92373c, transferReasonsDeclarationActionsScreenContract$InputData.f92373c);
    }

    public final int hashCode() {
        return this.f92373c.hashCode() + ((this.f92372b.hashCode() + (this.f92371a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92371a);
        dest.writeSerializable(this.f92372b);
        dest.writeString(this.f92373c);
    }
}
