package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjg extends Exception {
    public zzjg() {
    }

    public zzjg(String str) {
        super(str);
    }

    public zzjg(String str, Throwable th10) {
        super("ContentProvider query failed", th10);
    }
}
