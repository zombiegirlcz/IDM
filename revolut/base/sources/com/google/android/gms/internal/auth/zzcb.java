package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcb {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    static HashMap f38927zze;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    static boolean f38932zzj;
    private static Object zzm;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final Uri f38923zza = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final Uri f38924zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final Pattern f38925zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final Pattern f38926zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static final AtomicBoolean f38934zzl = new AtomicBoolean();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    static final HashMap f38928zzf = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    static final HashMap f38929zzg = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    static final HashMap f38930zzh = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    static final HashMap f38931zzi = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    static final String[] f38933zzk = new String[0];

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzcb.class) {
            try {
                String str3 = null;
                if (f38927zze == null) {
                    f38934zzl.set(false);
                    f38927zze = new HashMap(16, 1.0f);
                    zzm = new Object();
                    f38932zzj = false;
                    contentResolver.registerContentObserver(f38923zza, true, new zzca(null));
                } else if (f38934zzl.getAndSet(false)) {
                    f38927zze.clear();
                    f38928zzf.clear();
                    f38929zzg.clear();
                    f38930zzh.clear();
                    f38931zzi.clear();
                    zzm = new Object();
                    f38932zzj = false;
                }
                Object obj2 = zzm;
                if (f38927zze.containsKey(str)) {
                    String str4 = (String) f38927zze.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f38933zzk.length;
                Cursor cursorQuery = contentResolver.query(f38923zza, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        zzc(obj2, str, null);
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    zzc(obj2, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th10) {
                    cursorQuery.close();
                    throw th10;
                }
            } finally {
            }
        }
    }

    private static void zzc(Object obj2, String str, String str2) {
        synchronized (zzcb.class) {
            try {
                if (obj2 == zzm) {
                    f38927zze.put(str, str2);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
