package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public enum zzkm implements zzmf {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final int f40388zzg;

    zzkm(int i) {
        this.f40388zzg = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f40388zzg;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
