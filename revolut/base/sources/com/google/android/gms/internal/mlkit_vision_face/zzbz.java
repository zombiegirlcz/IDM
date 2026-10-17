package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbz {
    public static Object zza(Map map, Object obj2) {
        map.getClass();
        try {
            return map.get(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean zzb(Map map, Object obj2) {
        map.getClass();
        try {
            return map.containsKey(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
