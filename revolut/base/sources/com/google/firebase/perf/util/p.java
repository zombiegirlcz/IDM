package com.google.firebase.perf.util;

import ch.qos.logback.core.util.FileSize;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public abstract class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p BYTES;
    public static final p GIGABYTES;
    public static final p KILOBYTES;
    public static final p MEGABYTES;
    public static final p TERABYTES;
    long numBytes;

    static {
        k kVar = new k("TERABYTES", 0, 1099511627776L);
        TERABYTES = kVar;
        l lVar = new l("GIGABYTES", 1, FileSize.GB_COEFFICIENT);
        GIGABYTES = lVar;
        m mVar = new m("MEGABYTES", 2, FileSize.MB_COEFFICIENT);
        MEGABYTES = mVar;
        n nVar = new n("KILOBYTES", 3, FileSize.KB_COEFFICIENT);
        KILOBYTES = nVar;
        o oVar = new o("BYTES", 4, 1L);
        BYTES = oVar;
        $VALUES = new p[]{kVar, lVar, mVar, nVar, oVar};
    }

    public p(String str, int i, long j2) {
        this.numBytes = j2;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final long a(long j2) {
        return (j2 * this.numBytes) / KILOBYTES.numBytes;
    }
}
