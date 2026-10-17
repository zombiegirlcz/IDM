package d7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import le.u1;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f111702a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f111703b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f111704c = {80, 75, 3, 4};
    public static final byte[] d = {Ascii.US, ISOFileInfo.SECURITY_ATTR_EXP, 8};

    public static i0 a(final String str, Callable callable, Runnable runnable) {
        j jVarA = str == null ? null : k7.h.f181769b.a(str);
        i0 i0Var = jVarA != null ? new i0(jVarA) : null;
        HashMap map = f111702a;
        if (str != null && map.containsKey(str)) {
            i0Var = (i0) map.get(str);
        }
        if (i0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return i0Var;
        }
        i0 i0Var2 = new i0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            i0Var2.b(new d0() { // from class: d7.l
                @Override // d7.d0
                public final void onResult(Object obj2) {
                    switch (i) {
                        case 0:
                            HashMap map2 = n.f111702a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                n.l();
                            }
                            break;
                        default:
                            HashMap map3 = n.f111702a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                n.l();
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            i0Var2.a(new d0() { // from class: d7.l
                @Override // d7.d0
                public final void onResult(Object obj2) {
                    switch (i2) {
                        case 0:
                            HashMap map2 = n.f111702a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                n.l();
                            }
                            break;
                        default:
                            HashMap map3 = n.f111702a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                n.l();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, i0Var2);
                if (map.size() == 1) {
                    l();
                }
            }
        }
        return i0Var2;
    }

    public static g0 b(Context context, String str, String str2) {
        j jVarA = str2 == null ? null : k7.h.f181769b.a(str2);
        if (jVarA != null) {
            return new g0(jVarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new g0(e);
        }
    }

    public static g0 c(Context context, InputStream inputStream, String str) {
        j jVarA = str == null ? null : k7.h.f181769b.a(str);
        if (jVarA != null) {
            return new g0(jVarA);
        }
        try {
            mmm.l0 l0VarC = u1.c(u1.r(inputStream));
            if (k(l0VarC, f111704c).booleanValue()) {
                return i(context, new ZipInputStream(new mmm.i(l0VarC, 1)), str);
            }
            if (k(l0VarC, d).booleanValue()) {
                return e(u1.r(new GZIPInputStream(new mmm.i(l0VarC, 1))), str);
            }
            String[] strArr = q7.d.e;
            return d(new q7.e(l0VarC), str, true);
        } catch (IOException e) {
            return new g0(e);
        }
    }

    public static g0 d(q7.e eVar, String str, boolean z) {
        j jVarA;
        try {
            if (str == null) {
                jVarA = null;
            } else {
                try {
                    jVarA = k7.h.f181769b.a(str);
                } catch (Exception e) {
                    g0 g0Var = new g0(e);
                    if (z) {
                        r7.l.b(eVar);
                    }
                    return g0Var;
                }
            }
            if (jVarA != null) {
                g0 g0Var2 = new g0(jVarA);
                if (z) {
                    r7.l.b(eVar);
                }
                return g0Var2;
            }
            j jVarA2 = p7.t.a(eVar);
            if (str != null) {
                k7.h.f181769b.f181770a.put(str, jVarA2);
            }
            g0 g0Var3 = new g0(jVarA2);
            if (z) {
                r7.l.b(eVar);
            }
            return g0Var3;
        } catch (Throwable th10) {
            if (z) {
                r7.l.b(eVar);
            }
            throw th10;
        }
    }

    public static g0 e(mmm.e eVar, String str) {
        mmm.l0 l0VarC = u1.c(eVar);
        String[] strArr = q7.d.e;
        return d(new q7.e(l0VarC), str, true);
    }

    public static i0 f(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: d7.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return n.g(context2, i, str);
            }
        }, null);
    }

    public static g0 g(Context context, int i, String str) {
        j jVarA = str == null ? null : k7.h.f181769b.a(str);
        if (jVarA != null) {
            return new g0(jVarA);
        }
        try {
            mmm.l0 l0VarC = u1.c(u1.r(context.getResources().openRawResource(i)));
            if (k(l0VarC, f111704c).booleanValue()) {
                return i(context, new ZipInputStream(new mmm.i(l0VarC, 1)), str);
            }
            if (!k(l0VarC, d).booleanValue()) {
                String[] strArr = q7.d.e;
                return d(new q7.e(l0VarC), str, true);
            }
            try {
                return e(u1.r(new GZIPInputStream(new mmm.i(l0VarC, 1))), str);
            } catch (IOException e) {
                return new g0(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new g0(e2);
        }
    }

    public static i0 h(Context context, String str) {
        String strQ = j6.a.q("url_", str);
        return a(strQ, new k(context, 0, str, strQ), null);
    }

    public static g0 i(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return j(context, zipInputStream, str);
        } finally {
            r7.l.b(zipInputStream);
        }
    }

    public static g0 j(Context context, ZipInputStream zipInputStream, String str) {
        j jVarA;
        c0 c0Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            jVarA = null;
        } else {
            try {
                jVarA = k7.h.f181769b.a(str);
            } catch (IOException e) {
                return new g0(e);
            }
        }
        if (jVarA != null) {
            return new g0(jVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        j jVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                mmm.l0 l0VarC = u1.c(u1.r(zipInputStream));
                String[] strArr = q7.d.e;
                jVar = d(new q7.e(l0VarC), null, false).f111669a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new g0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th10) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th11) {
                                th10.addSuppressed(th11);
                            }
                            throw th10;
                        }
                    } finally {
                    }
                } catch (Throwable th12) {
                    r7.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th12);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    r7.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (jVar == null) {
            return new g0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it8 = ((HashMap) jVar.c()).values().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    c0Var = null;
                    break;
                }
                c0Var = (c0) it8.next();
                if (c0Var.c().equals(str4)) {
                    break;
                }
            }
            if (c0Var != null) {
                c0Var.g(r7.l.d(c0Var.f(), c0Var.d(), (Bitmap) entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (k7.d dVar : jVar.f.values()) {
                if (dVar.a().equals(entry2.getKey())) {
                    dVar.c((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                r7.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it9 = ((HashMap) jVar.c()).entrySet().iterator();
            while (it9.hasNext()) {
                c0 c0Var2 = (c0) ((Map.Entry) it9.next()).getValue();
                if (c0Var2 == null) {
                    return null;
                }
                String strC = c0Var2.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            c0Var2.g(r7.l.d(c0Var2.f(), c0Var2.d(), bitmapDecodeByteArray));
                        }
                    } catch (IllegalArgumentException e2) {
                        r7.c.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            k7.h.f181769b.f181770a.put(str, jVar);
        }
        return new g0(jVar);
    }

    public static Boolean k(mmm.l0 l0Var, byte[] bArr) {
        try {
            mmm.l0 l0VarPeek = l0Var.peek();
            for (byte b4 : bArr) {
                if (l0VarPeek.readByte() != b4) {
                    return Boolean.FALSE;
                }
            }
            l0VarPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            r7.c.f251932a.b();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void l() {
        ArrayList arrayList = new ArrayList(f111703b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String m(int i, Context context) {
        return com.google.android.gms.internal.mlkit_vision_face.a.s(new StringBuilder("rawRes"), (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", i);
    }
}
