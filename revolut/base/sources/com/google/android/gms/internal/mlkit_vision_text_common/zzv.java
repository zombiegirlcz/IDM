package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f45032zza = "\n";

    private zzv(String str) {
    }

    public static zzv zza(String str) {
        return new zzv("\n");
    }

    public static final CharSequence zzc(Object obj2) {
        Objects.requireNonNull(obj2);
        return obj2 instanceof CharSequence ? (CharSequence) obj2 : obj2.toString();
    }

    public final String zzb(Iterable iterable) {
        Iterator it8 = iterable.iterator();
        StringBuilder sb6 = new StringBuilder();
        try {
            if (it8.hasNext()) {
                sb6.append(zzc(it8.next()));
                while (it8.hasNext()) {
                    sb6.append((CharSequence) this.f45032zza);
                    sb6.append(zzc(it8.next()));
                }
            }
            return sb6.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
