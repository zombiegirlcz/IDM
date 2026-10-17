package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final Uri f40302zza = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final Uri f40303zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final Pattern f40304zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final Pattern f40305zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
