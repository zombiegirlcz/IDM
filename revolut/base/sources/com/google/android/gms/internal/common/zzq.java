package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzq {
    public static final CharSequence zza(Object obj2, String str) {
        Objects.requireNonNull(obj2);
        return obj2 instanceof CharSequence ? (CharSequence) obj2 : obj2.toString();
    }
}
