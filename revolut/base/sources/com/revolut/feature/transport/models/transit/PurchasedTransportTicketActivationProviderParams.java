package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransportTicketActivationProviderParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PurchasedTransportTicketActivationProviderParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PurchasedTransportTicketActivationProviderParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92705c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PurchasedTransportTicketActivationProviderParams(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PurchasedTransportTicketActivationProviderParams[i];
        }
    }

    public PurchasedTransportTicketActivationProviderParams(int i, long j2, long j3) {
        this.f92703a = i;
        this.f92704b = j2;
        this.f92705c = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PurchasedTransportTicketActivationProviderParams)) {
            return false;
        }
        PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams = (PurchasedTransportTicketActivationProviderParams) obj2;
        return this.f92703a == purchasedTransportTicketActivationProviderParams.f92703a && this.f92704b == purchasedTransportTicketActivationProviderParams.f92704b && this.f92705c == purchasedTransportTicketActivationProviderParams.f92705c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f92705c) + a0.d.c(Integer.hashCode(this.f92703a) * 31, 31, this.f92704b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f92703a);
        dest.writeLong(this.f92704b);
        dest.writeLong(this.f92705c);
    }
}
