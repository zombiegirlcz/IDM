package com.google.android.gms.internal.fido;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String[] f39454zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfn f39455zzb;

    static {
        zzfn zzfoVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzfoVar = new zzfo();
                break;
            }
            zzfoVar = null;
            try {
                zzfoVar = (zzfn) Class.forName(f39454zza[i]).asSubclass(zzfn.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzfoVar != null) {
                break;
            } else {
                i++;
            }
        }
        f39455zzb = zzfoVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i) {
        zzfk.zza(cls, "target");
        return f39455zzb.zza(cls, 2);
    }
}
