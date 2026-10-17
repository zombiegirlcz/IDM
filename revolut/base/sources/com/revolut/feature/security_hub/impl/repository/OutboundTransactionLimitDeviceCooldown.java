package com.revolut.feature.security_hub.impl.repository;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/OutboundTransactionLimitDeviceCooldown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OutboundTransactionLimitDeviceCooldown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OutboundTransactionLimitDeviceCooldown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f85489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f85490b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OutboundTransactionLimitDeviceCooldown((Duration) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OutboundTransactionLimitDeviceCooldown[i];
        }
    }

    public OutboundTransactionLimitDeviceCooldown(Duration duration, LocalDateTime finishAt) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(finishAt, "finishAt");
        this.f85489a = duration;
        this.f85490b = finishAt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OutboundTransactionLimitDeviceCooldown)) {
            return false;
        }
        OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldown = (OutboundTransactionLimitDeviceCooldown) obj2;
        return Intrinsics.f(this.f85489a, outboundTransactionLimitDeviceCooldown.f85489a) && Intrinsics.f(this.f85490b, outboundTransactionLimitDeviceCooldown.f85490b);
    }

    public final int hashCode() {
        return this.f85490b.hashCode() + (this.f85489a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85489a);
        dest.writeSerializable(this.f85490b);
    }
}
