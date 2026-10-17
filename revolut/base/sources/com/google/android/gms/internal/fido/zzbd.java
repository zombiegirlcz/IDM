package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39301zza = ",\n  ";

    private zzbd(String str) {
    }

    public static zzbd zza(String str) {
        return new zzbd(",\n  ");
    }

    public static final CharSequence zzd(Object obj2) {
        Objects.requireNonNull(obj2);
        return obj2 instanceof CharSequence ? (CharSequence) obj2 : obj2.toString();
    }

    public final StringBuilder zzc(StringBuilder sb6, Iterator it8) {
        try {
            if (it8.hasNext()) {
                sb6.append(zzd(it8.next()));
                while (it8.hasNext()) {
                    sb6.append((CharSequence) this.f39301zza);
                    sb6.append(zzd(it8.next()));
                }
            }
            return sb6;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
