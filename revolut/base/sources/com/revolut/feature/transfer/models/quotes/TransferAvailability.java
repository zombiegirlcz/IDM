package com.revolut.feature.transfer.models.quotes;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nrf.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/models/quotes/TransferAvailability;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "nrf/b", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferAvailability implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferAvailability> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferAvailabilityReason f92277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92278c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferAvailability(b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TransferAvailabilityReason.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferAvailability[i];
        }
    }

    public TransferAvailability(b type, TransferAvailabilityReason transferAvailabilityReason, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f92276a = type;
        this.f92277b = transferAvailabilityReason;
        this.f92278c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferAvailability)) {
            return false;
        }
        TransferAvailability transferAvailability = (TransferAvailability) obj2;
        return this.f92276a == transferAvailability.f92276a && Intrinsics.f(this.f92277b, transferAvailability.f92277b) && Intrinsics.f(this.f92278c, transferAvailability.f92278c);
    }

    public final int hashCode() {
        int iHashCode = this.f92276a.hashCode() * 31;
        TransferAvailabilityReason transferAvailabilityReason = this.f92277b;
        int iHashCode2 = (iHashCode + (transferAvailabilityReason == null ? 0 : transferAvailabilityReason.hashCode())) * 31;
        String str = this.f92278c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92276a.name());
        TransferAvailabilityReason transferAvailabilityReason = this.f92277b;
        if (transferAvailabilityReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferAvailabilityReason.writeToParcel(dest, i);
        }
        dest.writeString(this.f92278c);
    }
}
