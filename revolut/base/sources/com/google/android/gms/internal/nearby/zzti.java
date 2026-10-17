package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public final class zzti {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    static HashMap f45712zze;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    static boolean f45717zzj;
    private static Object zzm;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final Uri f45708zza = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final Uri f45709zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final Pattern f45710zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final Pattern f45711zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static final AtomicBoolean f45719zzl = new AtomicBoolean();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    static final HashMap f45713zzf = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    static final HashMap f45714zzg = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    static final HashMap f45715zzh = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    static final HashMap f45716zzi = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    static final String[] f45718zzk = new String[0];

    public static boolean zzb(ContentResolver contentResolver, String str, boolean z) {
        Object obj2;
        String str2;
        Object obj3;
        boolean z3;
        Cursor cursor;
        synchronized (zzti.class) {
            zzc(contentResolver);
            obj2 = zzm;
        }
        HashMap map = f45713zzf;
        Boolean bool = Boolean.TRUE;
        synchronized (zzti.class) {
            try {
                str2 = null;
                if (map.containsKey("gms:nearby:requires_gms_check")) {
                    obj3 = map.get("gms:nearby:requires_gms_check");
                    if (obj3 == null) {
                        obj3 = bool;
                    }
                } else {
                    obj3 = null;
                }
            } finally {
            }
        }
        Boolean bool2 = (Boolean) obj3;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        synchronized (zzti.class) {
            try {
                zzc(contentResolver);
                Object obj4 = zzm;
                z3 = true;
                if (f45712zze.containsKey("gms:nearby:requires_gms_check")) {
                    String str3 = (String) f45712zze.get("gms:nearby:requires_gms_check");
                    if (str3 != null) {
                        str2 = str3;
                    }
                } else {
                    int length = f45718zzk.length;
                    Cursor cursorQuery = contentResolver.query(f45708zza, null, null, new String[]{"gms:nearby:requires_gms_check"}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(1);
                                if (string != null) {
                                    boolean zEquals = string.equals(null);
                                    cursor = zEquals;
                                    if (zEquals) {
                                        string = null;
                                        cursor = zEquals;
                                    }
                                }
                                zzd(obj4, "gms:nearby:requires_gms_check", string);
                                cursorQuery = cursor;
                                if (string != null) {
                                    str2 = string;
                                    cursorQuery = cursor;
                                }
                            } else {
                                zzd(obj4, "gms:nearby:requires_gms_check", null);
                            }
                        } finally {
                            cursorQuery.close();
                        }
                    }
                }
            } finally {
            }
        }
        if (str2 == null || str2.equals("")) {
            bool = bool2;
        } else if (!f45710zzc.matcher(str2).matches()) {
            if (f45711zzd.matcher(str2).matches()) {
                bool = Boolean.FALSE;
                z3 = false;
            } else {
                String str4 = "attempt to read gservices key gms:nearby:requires_gms_check (value \"" + str2 + "\") as boolean";
                bool = bool2;
            }
        }
        synchronized (zzti.class) {
            try {
                if (obj2 == zzm) {
                    map.put("gms:nearby:requires_gms_check", bool);
                    f45712zze.remove("gms:nearby:requires_gms_check");
                }
            } finally {
            }
        }
        return z3;
    }

    private static void zzc(ContentResolver contentResolver) {
        if (f45712zze == null) {
            f45719zzl.set(false);
            f45712zze = new HashMap(16, 1.0f);
            zzm = new Object();
            f45717zzj = false;
            contentResolver.registerContentObserver(f45708zza, true, new zzth(null));
            return;
        }
        if (f45719zzl.getAndSet(false)) {
            f45712zze.clear();
            f45713zzf.clear();
            f45714zzg.clear();
            f45715zzh.clear();
            f45716zzi.clear();
            zzm = new Object();
            f45717zzj = false;
        }
    }

    private static void zzd(Object obj2, String str, String str2) {
        synchronized (zzti.class) {
            try {
                if (obj2 == zzm) {
                    f45712zze.put("gms:nearby:requires_gms_check", str2);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
