package hh;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzte;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzth;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import mp.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f152195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f152196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f152197c;
    public static final HashMap d;

    static {
        SparseArray sparseArray = new SparseArray();
        f152195a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f152196b = sparseArray2;
        f152197c = new AtomicReference();
        sparseArray.put(-1, zzpv.FORMAT_UNKNOWN);
        sparseArray.put(1, zzpv.FORMAT_CODE_128);
        sparseArray.put(2, zzpv.FORMAT_CODE_39);
        sparseArray.put(4, zzpv.FORMAT_CODE_93);
        sparseArray.put(8, zzpv.FORMAT_CODABAR);
        sparseArray.put(16, zzpv.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzpv.FORMAT_EAN_13);
        sparseArray.put(64, zzpv.FORMAT_EAN_8);
        sparseArray.put(128, zzpv.FORMAT_ITF);
        sparseArray.put(256, zzpv.FORMAT_QR_CODE);
        sparseArray.put(512, zzpv.FORMAT_UPC_A);
        sparseArray.put(1024, zzpv.FORMAT_UPC_E);
        sparseArray.put(2048, zzpv.FORMAT_PDF417);
        sparseArray.put(4096, zzpv.FORMAT_AZTEC);
        sparseArray2.put(0, zzpw.TYPE_UNKNOWN);
        sparseArray2.put(1, zzpw.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzpw.TYPE_EMAIL);
        sparseArray2.put(3, zzpw.TYPE_ISBN);
        sparseArray2.put(4, zzpw.TYPE_PHONE);
        sparseArray2.put(5, zzpw.TYPE_PRODUCT);
        sparseArray2.put(6, zzpw.TYPE_SMS);
        sparseArray2.put(7, zzpw.TYPE_TEXT);
        sparseArray2.put(8, zzpw.TYPE_URL);
        sparseArray2.put(9, zzpw.TYPE_WIFI);
        sparseArray2.put(10, zzpw.TYPE_GEO);
        sparseArray2.put(11, zzpw.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzpw.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        d = map;
        map.put(1, zzte.CODE_128);
        map.put(2, zzte.CODE_39);
        map.put(4, zzte.CODE_93);
        map.put(8, zzte.CODABAR);
        map.put(16, zzte.DATA_MATRIX);
        map.put(32, zzte.EAN_13);
        map.put(64, zzte.EAN_8);
        map.put(128, zzte.ITF);
        map.put(256, zzte.QR_CODE);
        map.put(512, zzte.UPC_A);
        map.put(1024, zzte.UPC_E);
        map.put(2048, zzte.PDF417);
        map.put(4096, zzte.AZTEC);
    }

    public static zzth a(eh.a aVar) {
        int i = aVar.f125676a;
        zzcs zzcsVar = new zzcs();
        HashMap map = d;
        if (i == 0) {
            zzcsVar.zze(map.values());
        } else {
            for (Map.Entry entry : map.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i) != 0) {
                    zzcsVar.zzd((zzte) entry.getValue());
                }
            }
        }
        zztf zztfVar = new zztf();
        zztfVar.zzb(zzcsVar.zzf());
        return zztfVar.zzc();
    }

    public static void b(zztx zztxVar, zzpj zzpjVar) {
        zztxVar.zzf(new r(zzpjVar, 13), zzpk.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean c() {
        AtomicReference atomicReference = f152197c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextB = ch.h.c().b();
        zzcv zzcvVar = l.f152213h;
        boolean z = DynamiteModule.getLocalVersion(contextB, "com.google.mlkit.dynamite.barcode") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
