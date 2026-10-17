package b9;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class m1 implements Cloneable {
    public Boolean A;
    public Boolean B;
    public v1 C;
    public Float D;
    public String E;
    public d1 F;
    public String G;
    public v1 H;
    public Float I;
    public v1 J;
    public Float K;
    public l1 L;
    public h1 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13390a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1 f13391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d1 f13392c;
    public Float d;
    public v1 e;
    public Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0 f13393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f1 f13394h;
    public g1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f13395j;
    public o0[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o0 f13396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Float f13397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e0 f13398n;
    public ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o0 f13399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f13400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e1 f13401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j1 f13402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k1 f13403t;
    public i1 u;
    public Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public twg.c f13404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f13405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f13406y;
    public String z;

    public static m1 a() {
        m1 m1Var = new m1();
        m1Var.f13390a = -1L;
        e0 e0Var = e0.f13339b;
        m1Var.f13391b = e0Var;
        d1 d1Var = d1.NonZero;
        m1Var.f13392c = d1Var;
        Float fValueOf = Float.valueOf(1.0f);
        m1Var.d = fValueOf;
        m1Var.e = null;
        m1Var.f = fValueOf;
        m1Var.f13393g = new o0(1.0f);
        m1Var.f13394h = f1.Butt;
        m1Var.i = g1.Miter;
        m1Var.f13395j = Float.valueOf(4.0f);
        m1Var.k = null;
        m1Var.f13396l = new o0(BitmapDescriptorFactory.HUE_RED);
        m1Var.f13397m = fValueOf;
        m1Var.f13398n = e0Var;
        m1Var.o = null;
        m1Var.f13399p = new o0(12.0f, j2.f13377pt);
        m1Var.f13400q = 400;
        m1Var.f13401r = e1.Normal;
        m1Var.f13402s = j1.None;
        m1Var.f13403t = k1.LTR;
        m1Var.u = i1.Start;
        Boolean bool = Boolean.TRUE;
        m1Var.v = bool;
        m1Var.f13404w = null;
        m1Var.f13405x = null;
        m1Var.f13406y = null;
        m1Var.z = null;
        m1Var.A = bool;
        m1Var.B = bool;
        m1Var.C = e0Var;
        m1Var.D = fValueOf;
        m1Var.E = null;
        m1Var.F = d1Var;
        m1Var.G = null;
        m1Var.H = null;
        m1Var.I = fValueOf;
        m1Var.J = null;
        m1Var.K = fValueOf;
        m1Var.L = l1.None;
        m1Var.M = h1.auto;
        return m1Var;
    }

    public final Object clone() {
        m1 m1Var = (m1) super.clone();
        o0[] o0VarArr = this.k;
        if (o0VarArr != null) {
            m1Var.k = (o0[]) o0VarArr.clone();
        }
        return m1Var;
    }
}
