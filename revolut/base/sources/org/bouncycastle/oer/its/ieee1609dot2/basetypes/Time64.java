package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class Time64 extends UINT64 {
    public static long etsiEpochMicros = Time32.etsiEpochMillis * 1000;

    public Time64(long j2) {
        this(BigInteger.valueOf(j2));
    }

    public static Time64 getInstance(Object obj2) {
        if (obj2 instanceof UINT64) {
            return new Time64((UINT64) obj2);
        }
        if (obj2 != null) {
            return new Time64(ASN1Integer.getInstance(obj2).getValue());
        }
        return null;
    }

    public static Time64 now() {
        return new Time64((System.currentTimeMillis() * 1000) - etsiEpochMicros);
    }

    public static Time64 ofUnixMillis(long j2) {
        return new Time64((j2 * 1000) - etsiEpochMicros);
    }

    public long toUnixMillis() {
        return (BigIntegers.longValueExact(getValue()) + etsiEpochMicros) / 1000;
    }

    public Time64(BigInteger bigInteger) {
        super(bigInteger);
    }

    public Time64(UINT64 uint64) {
        this(uint64.getValue());
    }
}
