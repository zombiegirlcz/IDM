package com.revolut.feature.transfer.core.api.ui.throubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferLocateInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferLocateInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferLocateInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hpf.a f92165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92166c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferLocateInputData(parcel.readString(), hpf.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferLocateInputData[i];
        }
    }

    public TransferLocateInputData(String transactionId, hpf.a type, String source) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f92164a = transactionId;
        this.f92165b = type;
        this.f92166c = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferLocateInputData)) {
            return false;
        }
        TransferLocateInputData transferLocateInputData = (TransferLocateInputData) obj2;
        return Intrinsics.f(this.f92164a, transferLocateInputData.f92164a) && this.f92165b == transferLocateInputData.f92165b && Intrinsics.f(this.f92166c, transferLocateInputData.f92166c);
    }

    public final int hashCode() {
        return this.f92166c.hashCode() + ((this.f92165b.hashCode() + (this.f92164a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92164a);
        dest.writeString(this.f92165b.name());
        dest.writeString(this.f92166c);
    }
}
