package mfm;

import com.google.gson.internal.m;
import kfm.h;
import mp.r;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dfm.c f205044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final af.f f205045h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ah.a f205041a = new ah.a(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f205042b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final en.a f205043c = new en.a(1);
    public static final dfm.c d = new dfm.c(8);
    public static final ch.b e = new ch.b(9);
    public static final qf.b f = new qf.b(8);
    public static final hhm.b i = new hhm.b(4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m f205046j = new m(1);
    public static final qf.b k = new qf.b(9);

    static {
        int i2 = 9;
        f205044g = new dfm.c(i2);
        f205045h = new af.f(i2);
    }

    public static boolean a(Object obj2, Object obj3) {
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public static void b(Object obj2, String str) {
        if (obj2 == null) {
            throw new NullPointerException(str);
        }
    }

    public static r c(kfm.c cVar) {
        b(cVar, "f is null");
        return new r(cVar, 22);
    }

    public static yf.c d(h hVar) {
        b(hVar, "f is null");
        return new yf.c(hVar, 17);
    }

    public static void e(int i2, String str) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.k(i2, str, " > 0 required but it was "));
        }
    }

    public static void f(long j2, String str) {
        if (j2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j2);
    }
}
