package com.revolut.feature.transfer.core.api.ui.throubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferTroubleshooterInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferTroubleshooterInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferTroubleshooterType f92174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92175c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferTroubleshooterInputData(parcel.readString(), (TransferTroubleshooterType) parcel.readParcelable(TransferTroubleshooterInputData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferTroubleshooterInputData[i];
        }
    }

    public TransferTroubleshooterInputData(String transactionId, TransferTroubleshooterType type, String source, String str) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f92173a = transactionId;
        this.f92174b = type;
        this.f92175c = source;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferTroubleshooterInputData)) {
            return false;
        }
        TransferTroubleshooterInputData transferTroubleshooterInputData = (TransferTroubleshooterInputData) obj2;
        return Intrinsics.f(this.f92173a, transferTroubleshooterInputData.f92173a) && Intrinsics.f(this.f92174b, transferTroubleshooterInputData.f92174b) && Intrinsics.f(this.f92175c, transferTroubleshooterInputData.f92175c) && Intrinsics.f(this.d, transferTroubleshooterInputData.d);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f92174b.hashCode() + (this.f92173a.hashCode() * 31)) * 31, 31, this.f92175c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92173a);
        dest.writeParcelable(this.f92174b, i);
        dest.writeString(this.f92175c);
        dest.writeString(this.d);
    }
}
