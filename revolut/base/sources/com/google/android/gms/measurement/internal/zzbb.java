package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbb extends zzjr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private long f46929zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f46930zzb;

    public zzbb(zzio zzioVar) {
        super(zzioVar);
    }

    public final long zza() {
        zzv();
        return this.f46929zza;
    }

    public final String zzb() {
        zzv();
        return this.f46930zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    public final boolean zzc() {
        Calendar calendar = Calendar.getInstance();
        this.f46929zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f46930zzb = a.o(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
