package com.revolut.feature.transfer_reasons.models.reason;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonsSuggestion;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsSuggestion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsSuggestion> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f92442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferReasonsValues f92443c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferReasonsSuggestion(parcel.readString(), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : TransferReasonsValues.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsSuggestion[i];
        }
    }

    public TransferReasonsSuggestion(String transactionId, Date createdAt, TransferReasonsValues transferReasonsValues) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f92441a = transactionId;
        this.f92442b = createdAt;
        this.f92443c = transferReasonsValues;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsSuggestion)) {
            return false;
        }
        TransferReasonsSuggestion transferReasonsSuggestion = (TransferReasonsSuggestion) obj2;
        return Intrinsics.f(this.f92441a, transferReasonsSuggestion.f92441a) && Intrinsics.f(this.f92442b, transferReasonsSuggestion.f92442b) && Intrinsics.f(this.f92443c, transferReasonsSuggestion.f92443c);
    }

    public final int hashCode() {
        int iE = t61.a.e(this.f92442b, this.f92441a.hashCode() * 31, 31);
        TransferReasonsValues transferReasonsValues = this.f92443c;
        return iE + (transferReasonsValues == null ? 0 : transferReasonsValues.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92441a);
        dest.writeSerializable(this.f92442b);
        TransferReasonsValues transferReasonsValues = this.f92443c;
        if (transferReasonsValues == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferReasonsValues.writeToParcel(dest, i);
        }
    }
}
