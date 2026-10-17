package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
public class EddystoneUid {
    public static final int INSTANCE_LENGTH = 6;
    public static final int LENGTH = 16;
    public static final int NAMESPACE_LENGTH = 10;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final com.google.android.gms.nearby.messages.internal.zzg f48007zza;

    public EddystoneUid(@NonNull String str) {
        this(com.google.android.gms.nearby.messages.internal.zzc.zzd(str));
    }

    @NonNull
    public static EddystoneUid from(@NonNull Message message) {
        Preconditions.checkArgument(message.zza("__eddystone_uid"), "Message type '" + message.getType() + "' is not Message.MESSAGE_TYPE_EDDYSTONE_UID.");
        return new EddystoneUid(message.getContent());
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof EddystoneUid) {
            return Objects.equal(this.f48007zza, ((EddystoneUid) obj2).f48007zza);
        }
        return false;
    }

    @NonNull
    public String getHex() {
        return this.f48007zza.zza();
    }

    @NonNull
    public String getInstance() {
        byte[] bArrZzc = this.f48007zza.zzc();
        if (bArrZzc.length < 16) {
            return null;
        }
        return com.google.android.gms.nearby.messages.internal.zzc.zzb(Arrays.copyOfRange(bArrZzc, 10, 16));
    }

    @NonNull
    public String getNamespace() {
        return com.google.android.gms.nearby.messages.internal.zzc.zzb(Arrays.copyOfRange(this.f48007zza.zzc(), 0, 10));
    }

    public int hashCode() {
        return Objects.hashCode(this.f48007zza);
    }

    @NonNull
    public String toString() {
        return a.p("EddystoneUid{id=", getHex(), "}");
    }

    public EddystoneUid(@NonNull String str, @NonNull String str2) {
        this.f48007zza = new com.google.android.gms.nearby.messages.internal.zzg(str, str2);
    }

    public EddystoneUid(@NonNull byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 16, "Bytes must be a namespace plus instance (16 bytes).");
        this.f48007zza = new com.google.android.gms.nearby.messages.internal.zzg(bArr);
    }
}
