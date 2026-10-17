package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzt implements Iterable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ CharSequence f39252zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzw f39253zzb;

    public zzt(zzw zzwVar, CharSequence charSequence) {
        this.f39252zza = charSequence;
        Objects.requireNonNull(zzwVar);
        this.f39253zzb = zzwVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f39253zzb.zze(this.f39252zza);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append('[');
        Iterator it8 = iterator();
        try {
            if (it8.hasNext()) {
                sb6.append(zzq.zza(it8.next(), ", "));
                while (it8.hasNext()) {
                    sb6.append((CharSequence) ", ");
                    sb6.append(zzq.zza(it8.next(), ", "));
                }
            }
            sb6.append(']');
            return sb6.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
