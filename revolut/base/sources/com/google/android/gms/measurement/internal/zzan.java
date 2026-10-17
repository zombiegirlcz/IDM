package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
enum zzan {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final char f46882zzl;

    zzan(char c2) {
        this.f46882zzl = c2;
    }

    public static zzan zzb(char c2) {
        for (zzan zzanVar : values()) {
            if (zzanVar.f46882zzl == c2) {
                return zzanVar;
            }
        }
        return UNSET;
    }
}
