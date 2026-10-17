package kgm;

import ch.n;
import dcl.q;

/* JADX INFO: loaded from: classes14.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qy5.a f184025a = new qy5.a(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f184026b = new n(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f184027c = new b();
    public static final he2.b d = new he2.b(22);
    public static final r39.a e = new r39.a();
    public static final by5.a f = new by5.a(23);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p96.a f184028g = new p96.a(22);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f184029h = new h();
    public static final q i = new q();

    public static void a(int i2, String str) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.k(i2, str, " > 0 required but it was "));
        }
    }

    public static void b(long j2, String str) {
        if (j2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j2);
    }
}
