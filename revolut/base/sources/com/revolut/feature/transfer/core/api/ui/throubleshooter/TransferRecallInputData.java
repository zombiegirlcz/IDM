package com.revolut.feature.transfer.core.api.ui.throubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferRecallInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferRecallInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferRecallInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hpf.a f92169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92170c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferRecallInputData(parcel.readString(), hpf.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferRecallInputData[i];
        }
    }

    public TransferRecallInputData(String transactionId, hpf.a type, String source) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f92168a = transactionId;
        this.f92169b = type;
        this.f92170c = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferRecallInputData)) {
            return false;
        }
        TransferRecallInputData transferRecallInputData = (TransferRecallInputData) obj2;
        return Intrinsics.f(this.f92168a, transferRecallInputData.f92168a) && this.f92169b == transferRecallInputData.f92169b && Intrinsics.f(this.f92170c, transferRecallInputData.f92170c);
    }

    public final int hashCode() {
        return this.f92170c.hashCode() + ((this.f92169b.hashCode() + (this.f92168a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92168a);
        dest.writeString(this.f92169b.name());
        dest.writeString(this.f92170c);
    }
}
