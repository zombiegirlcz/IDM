package mg;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {
    public static final c1 A;
    public static final n B;
    public static final c1 C;
    public static final i D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f205095a = new c1(Class.class, new t0().b(), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f205096b = new c1(BitSet.class, new d1().b(), 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f205097c;
    public static final e1 d;
    public static final e1 e;
    public static final e1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e1 f205098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c1 f205099h;
    public static final c1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c1 f205100j;
    public static final k0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l0 f205101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m0 f205102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e1 f205103n;
    public static final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q0 f205104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final r0 f205105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c1 f205106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c1 f205107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c1 f205108t;
    public static final c1 u;
    public static final c1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c1 f205109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c1 f205110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c1 f205111y;
    public static final u z;

    static {
        g1 g1Var = new g1();
        f205097c = new h1();
        d = new e1(Boolean.TYPE, Boolean.class, g1Var);
        e = new e1(Byte.TYPE, Byte.class, new i1());
        f = new e1(Short.TYPE, Short.class, new j1());
        f205098g = new e1(Integer.TYPE, Integer.class, new k1());
        f205099h = new c1(AtomicInteger.class, new l1().b(), 0);
        i = new c1(AtomicBoolean.class, new m1().b(), 0);
        f205100j = new c1(AtomicIntegerArray.class, new j0().b(), 0);
        k = new k0();
        f205101l = new l0();
        f205102m = new m0();
        f205103n = new e1(Character.TYPE, Character.class, new n0());
        o0 o0Var = new o0();
        o = new p0();
        f205104p = new q0();
        f205105q = new r0();
        f205106r = new c1(String.class, o0Var, 0);
        f205107s = new c1(StringBuilder.class, new s0(), 0);
        f205108t = new c1(StringBuffer.class, new u0(), 0);
        u = new c1(URL.class, new v0(), 0);
        v = new c1(URI.class, new w0(), 0);
        f205109w = new c1(InetAddress.class, new x0(), 1);
        f205110x = new c1(UUID.class, new y0(), 0);
        f205111y = new c1(Currency.class, new z0().b(), 0);
        z = new u(new a1(), 2);
        A = new c1(Locale.class, new b1(), 0);
        n nVar = n.f205094a;
        B = nVar;
        C = new c1(kg.u.class, nVar, 1);
        D = j.d;
    }
}
