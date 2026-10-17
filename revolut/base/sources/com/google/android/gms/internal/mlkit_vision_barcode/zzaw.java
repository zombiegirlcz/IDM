package com.google.android.gms.internal.mlkit_vision_barcode;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzaw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f41248zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzau f41249zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzau f41250zzc;

    public /* synthetic */ zzaw(String str, zzav zzavVar) {
        zzau zzauVar = new zzau(null);
        this.f41249zzb = zzauVar;
        this.f41250zzc = zzauVar;
        str.getClass();
        this.f41248zza = str;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append(this.f41248zza);
        sb6.append(CoreConstants.CURLY_LEFT);
        zzau zzauVar = this.f41249zzb.f41247zzb;
        String str = "";
        while (zzauVar != null) {
            Object obj2 = zzauVar.f41246zza;
            sb6.append(str);
            if (obj2 == null || !obj2.getClass().isArray()) {
                sb6.append(obj2);
            } else {
                sb6.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
            }
            zzauVar = zzauVar.f41247zzb;
            str = ", ";
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }

    public final zzaw zza(Object obj2) {
        zzau zzauVar = new zzau(null);
        this.f41250zzc.f41247zzb = zzauVar;
        this.f41250zzc = zzauVar;
        zzauVar.f41246zza = obj2;
        return this;
    }
}
