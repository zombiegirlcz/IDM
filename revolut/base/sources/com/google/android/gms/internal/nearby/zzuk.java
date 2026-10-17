package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzuk implements Appendable {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Appendable f45754zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f45755zzc = ":";

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    int f45753zza = 2;

    public zzuk(int i, Appendable appendable, String str) {
        this.f45754zzb = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) throws IOException {
        if (this.f45753zza == 0) {
            this.f45754zzb.append(this.f45755zzc);
            this.f45753zza = 2;
        }
        this.f45754zzb.append(c2);
        this.f45753zza--;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
