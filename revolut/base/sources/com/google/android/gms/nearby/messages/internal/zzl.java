package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public final class zzl extends zzc {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzl(UUID uuid, Short sh10, Short sh11) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((sh10 == null ? 0 : 2) + 16 + (sh11 == null ? 0 : 2));
        byteBufferAllocate.putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits());
        if (sh10 != null) {
            byteBufferAllocate.putShort(sh10.shortValue());
        }
        if (sh11 != null) {
            byteBufferAllocate.putShort(sh11.shortValue());
        }
        byte[] bArrArray = byteBufferAllocate.array();
        zzh(bArrArray);
        super(bArrArray);
    }

    private static byte[] zzh(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (length != 16 && length != 18 && length != 20) {
            z = false;
        }
        Preconditions.checkArgument(z, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        return bArr;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzc
    public final String toString() {
        return "IBeaconIdPrefix{proximityUuid=" + zzg().toString() + ", major=" + zze() + ", minor=" + zzf() + "}";
    }

    public final Short zze() {
        byte[] bArrZzc = zzc();
        if (bArrZzc.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(bArrZzc).getShort(16));
        }
        return null;
    }

    public final Short zzf() {
        byte[] bArrZzc = zzc();
        if (bArrZzc.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(bArrZzc).getShort(18));
        }
        return null;
    }

    public final UUID zzg() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzc());
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(byte[] bArr) {
        super(bArr);
        zzh(bArr);
    }
}
