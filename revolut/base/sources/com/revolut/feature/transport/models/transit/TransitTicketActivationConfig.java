package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketActivationConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitTicketActivationConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransitTicketActivationConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f92718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f92719c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitTicketActivationConfig(parcel.readInt(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitTicketActivationConfig[i];
        }
    }

    public TransitTicketActivationConfig(int i, LocalDateTime attemptedAt, LocalDateTime activationCutoffTime) {
        Intrinsics.checkNotNullParameter(attemptedAt, "attemptedAt");
        Intrinsics.checkNotNullParameter(activationCutoffTime, "activationCutoffTime");
        this.f92717a = i;
        this.f92718b = attemptedAt;
        this.f92719c = activationCutoffTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitTicketActivationConfig)) {
            return false;
        }
        TransitTicketActivationConfig transitTicketActivationConfig = (TransitTicketActivationConfig) obj2;
        return this.f92717a == transitTicketActivationConfig.f92717a && Intrinsics.f(this.f92718b, transitTicketActivationConfig.f92718b) && Intrinsics.f(this.f92719c, transitTicketActivationConfig.f92719c);
    }

    public final int hashCode() {
        return this.f92719c.hashCode() + v7.i(this.f92718b, Integer.hashCode(this.f92717a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f92717a);
        dest.writeSerializable(this.f92718b);
        dest.writeSerializable(this.f92719c);
    }
}
