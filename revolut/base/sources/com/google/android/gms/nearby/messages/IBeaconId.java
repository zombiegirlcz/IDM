package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.internal.zzl;
import j6.a;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class IBeaconId {
    public static final int LENGTH = 20;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzl f48008zza;

    public IBeaconId(@NonNull UUID uuid, short s2, short s3) {
        this.f48008zza = new zzl(uuid, Short.valueOf(s2), Short.valueOf(s3));
    }

    @NonNull
    public static IBeaconId from(@NonNull Message message) {
        Preconditions.checkArgument(message.zza("__i_beacon_id"), "Message type '" + message.getType() + "' is not Message.MESSAGE_TYPE_I_BEACON_ID");
        return new IBeaconId(message.getContent());
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof IBeaconId) {
            return Objects.equal(this.f48008zza, ((IBeaconId) obj2).f48008zza);
        }
        return false;
    }

    public short getMajor() {
        return this.f48008zza.zze().shortValue();
    }

    public short getMinor() {
        return this.f48008zza.zzf().shortValue();
    }

    @NonNull
    public UUID getProximityUuid() {
        return this.f48008zza.zzg();
    }

    public int hashCode() {
        return Objects.hashCode(this.f48008zza);
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(getProximityUuid());
        short major = getMajor();
        return a.v(v0.a.k(major, "IBeaconId{proximityUuid=", strValueOf, ", major=", ", minor="), "}", getMinor());
    }

    public IBeaconId(@NonNull byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 20, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        this.f48008zza = new zzl(bArr);
    }
}
