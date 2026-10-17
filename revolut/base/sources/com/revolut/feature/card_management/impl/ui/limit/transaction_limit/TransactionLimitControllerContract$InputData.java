package com.revolut.feature.card_management.impl.ui.limit.transaction_limit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import i93.e;
import i93.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_management/impl/ui/limit/transaction_limit/TransactionLimitControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionLimitControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionLimitControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f64917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f64919c;
    public final l d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionLimitControllerContract$InputData(c.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), (l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionLimitControllerContract$InputData[i];
        }
    }

    public TransactionLimitControllerContract$InputData(c flowType, String cardId, e cardSettingsType, l transactionLimit) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        this.f64917a = flowType;
        this.f64918b = cardId;
        this.f64919c = cardSettingsType;
        this.d = transactionLimit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionLimitControllerContract$InputData)) {
            return false;
        }
        TransactionLimitControllerContract$InputData transactionLimitControllerContract$InputData = (TransactionLimitControllerContract$InputData) obj2;
        return this.f64917a == transactionLimitControllerContract$InputData.f64917a && Intrinsics.f(this.f64918b, transactionLimitControllerContract$InputData.f64918b) && this.f64919c == transactionLimitControllerContract$InputData.f64919c && Intrinsics.f(this.d, transactionLimitControllerContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f64919c.hashCode() + p.a.c(this.f64917a.hashCode() * 31, 31, this.f64918b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64917a.name());
        dest.writeString(this.f64918b);
        dest.writeString(this.f64919c.name());
        dest.writeSerializable(this.d);
    }
}
