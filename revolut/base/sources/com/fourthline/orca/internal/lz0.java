package com.fourthline.orca.internal;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.fourthline.orca.internal.e9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class lz0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f30802h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f30804b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30805c = "";
    private String d = "";
    private float e = 96.0f;
    private final e9.q f = new e9.q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f30806g = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30807a;

        static {
            int[] iArr = new int[d1.values().length];
            f30807a = iArr;
            try {
                iArr[d1.em.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30807a[d1.ex.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30807a[d1.in.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30807a[d1.cm.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30807a[d1.mm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30807a[d1.pt.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30807a[d1.pc.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30807a[d1.percent.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30807a[d1.px.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends m {
        float[] o;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "polyline";
        }
    }

    public static abstract class a1 extends y0 {
        List o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List f30808p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        List f30809q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        List f30810r;
    }

    public static class b extends n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f30811p;

        @Override // com.fourthline.orca.internal.lz0.n, com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "a";
        }
    }

    public static class b0 extends a0 {
        @Override // com.fourthline.orca.internal.lz0.a0, com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "polygon";
        }
    }

    public interface b1 {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f30812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f30813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f30814c;
        float d;

        public c(float f, float f4, float f5, float f6) {
            this.f30812a = f;
            this.f30813b = f4;
            this.f30814c = f5;
            this.d = f6;
        }

        public static c a(float f, float f4, float f5, float f6) {
            return new c(f, f4, f5 - f, f6 - f4);
        }

        public float b() {
            return this.f30813b + this.d;
        }

        public String toString() {
            return "[" + this.f30812a + " " + this.f30813b + " " + this.f30814c + " " + this.d + "]";
        }

        public float a() {
            return this.f30812a + this.f30814c;
        }

        public void a(c cVar) {
            float f = cVar.f30812a;
            if (f < this.f30812a) {
                this.f30812a = f;
            }
            float f4 = cVar.f30813b;
            if (f4 < this.f30813b) {
                this.f30813b = f4;
            }
            if (cVar.a() > a()) {
                this.f30814c = cVar.a() - this.f30812a;
            }
            if (cVar.b() > b()) {
                this.d = cVar.b() - this.f30813b;
            }
        }

        public c(c cVar) {
            this.f30812a = cVar.f30812a;
            this.f30813b = cVar.f30813b;
            this.f30814c = cVar.f30814c;
            this.d = cVar.d;
        }
    }

    public static class c0 extends m {
        q o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f30815p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30816q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30817r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        q f30818s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        q f30819t;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "rect";
        }
    }

    public static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30820c;
        private b1 d;

        public c1(String str) {
            this.f30820c = str;
        }

        @Override // com.fourthline.orca.internal.lz0.x0
        public b1 c() {
            return this.d;
        }

        public String toString() {
            return "TextChild: '" + this.f30820c + "'";
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f30821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final q f30822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final q f30823c;
        final q d;

        public d(q qVar, q qVar2, q qVar3, q qVar4) {
            this.f30821a = qVar;
            this.f30822b = qVar2;
            this.f30823c = qVar3;
            this.d = qVar4;
        }
    }

    public static class d0 extends l0 implements j0 {
        @Override // com.fourthline.orca.internal.lz0.j0
        public void a(n0 n0Var) {
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "solidColor";
        }

        @Override // com.fourthline.orca.internal.lz0.j0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    public enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class e extends m {
        q o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f30830p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30831q;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "circle";
        }
    }

    public static class e0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Float f30832h;

        @Override // com.fourthline.orca.internal.lz0.j0
        public void a(n0 n0Var) {
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "stop";
        }

        @Override // com.fourthline.orca.internal.lz0.j0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    public static class e1 extends n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f30833p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30834q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30835r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        q f30836s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        q f30837t;

        @Override // com.fourthline.orca.internal.lz0.n, com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "use";
        }
    }

    public static class f extends n implements u {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f30838p;

        @Override // com.fourthline.orca.internal.lz0.n, com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "clipPath";
        }
    }

    public static class f0 extends r0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30839q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30840r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        q f30841s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        q f30842t;
        public String u;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "svg";
        }
    }

    public static class f1 extends r0 implements u {
        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "view";
        }
    }

    public static class g extends o0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final g f30843b = new g(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final g f30844c = new g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f30845a;

        public g(int i) {
            this.f30845a = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f30845a));
        }
    }

    public interface g0 {
        Set a();

        void a(String str);

        void a(Set set);

        String b();

        void b(Set set);

        void c(Set set);

        Set d();

        void d(Set set);

        Set e();

        Set f();
    }

    public static class h extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f30846a = new h();

        private h() {
        }

        public static h a() {
            return f30846a;
        }
    }

    public static abstract class h0 extends k0 implements j0, g0 {
        List i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Set f30847j = null;
        String k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f30848l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f30849m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Set f30850n = null;

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set a() {
            return null;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public String b() {
            return this.k;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void c(Set set) {
            this.f30847j = set;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set d() {
            return this.f30847j;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set e() {
            return this.f30849m;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set f() {
            return this.f30850n;
        }

        @Override // com.fourthline.orca.internal.lz0.j0
        public List getChildren() {
            return this.i;
        }

        @Override // com.fourthline.orca.internal.lz0.l0
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.fourthline.orca.internal.lz0.j0
        public void a(n0 n0Var) {
            this.i.add(n0Var);
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void b(Set set) {
            this.f30850n = set;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void d(Set set) {
            this.f30848l = set;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void a(String str) {
            this.k = str;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void a(Set set) {
            this.f30849m = set;
        }
    }

    public static class i extends n implements u {
        @Override // com.fourthline.orca.internal.lz0.n, com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "defs";
        }
    }

    public static abstract class i0 extends k0 implements g0 {
        Set i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f30851j = null;
        Set k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f30852l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f30853m = null;

        @Override // com.fourthline.orca.internal.lz0.g0
        public void a(String str) {
            this.f30851j = str;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public String b() {
            return this.f30851j;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void c(Set set) {
            this.i = set;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set d() {
            return this.i;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set e() {
            return this.f30852l;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set f() {
            return this.f30853m;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public Set a() {
            return this.k;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void b(Set set) {
            this.f30853m = set;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void d(Set set) {
            this.k = set;
        }

        @Override // com.fourthline.orca.internal.lz0.g0
        public void a(Set set) {
            this.f30852l = set;
        }
    }

    public static class j extends m {
        q o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f30854p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30855q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30856r;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "ellipse";
        }
    }

    public interface j0 {
        void a(n0 n0Var);

        List getChildren();
    }

    public static abstract class k extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f30857h = new ArrayList();
        Boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Matrix f30858j;
        l k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f30859l;

        @Override // com.fourthline.orca.internal.lz0.j0
        public void a(n0 n0Var) throws nz0 {
            if (n0Var instanceof e0) {
                this.f30857h.add(n0Var);
                return;
            }
            throw new nz0("Gradient elements cannot contain " + n0Var + " elements.");
        }

        @Override // com.fourthline.orca.internal.lz0.j0
        public List getChildren() {
            return this.f30857h;
        }
    }

    public static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        c f30860h = null;
    }

    public enum l {
        pad,
        reflect,
        repeat
    }

    public static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30864c = null;
        Boolean d = null;
        m71 e = null;
        m71 f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f30865g = null;

        public String toString() {
            return g();
        }
    }

    public static abstract class m extends i0 implements o {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Matrix f30866n;

        @Override // com.fourthline.orca.internal.lz0.o
        public void a(Matrix matrix) {
            this.f30866n = matrix;
        }
    }

    public static class m0 extends k {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        q f30867m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        q f30868n;
        q o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f30869p;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "linearGradient";
        }
    }

    public static class n extends h0 implements o {
        Matrix o;

        @Override // com.fourthline.orca.internal.lz0.o
        public void a(Matrix matrix) {
            this.o = matrix;
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "group";
        }
    }

    public static class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        lz0 f30870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j0 f30871b;

        public String g() {
            return "";
        }
    }

    public interface o {
        void a(Matrix matrix);
    }

    public static abstract class o0 implements Cloneable {
    }

    public static class p extends p0 implements o {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f30872p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30873q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30874r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        q f30875s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        q f30876t;
        Matrix u;

        @Override // com.fourthline.orca.internal.lz0.o
        public void a(Matrix matrix) {
            this.u = matrix;
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "image";
        }
    }

    public static abstract class p0 extends h0 {
        oq0 o = null;
    }

    public static class q implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final q f30877c = new q(BitmapDescriptorFactory.HUE_RED);
        static final q d = new q(100.0f, d1.percent);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f30878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d1 f30879b;

        public q(float f, d1 d1Var) {
            this.f30878a = f;
            this.f30879b = d1Var;
        }

        public float a() {
            return this.f30878a;
        }

        public float b(kz0 kz0Var) {
            switch (a.f30807a[this.f30879b.ordinal()]) {
                case 8:
                    c cVarI = kz0Var.i();
                    if (cVarI != null) {
                    }
                    break;
            }
            return this.f30878a;
        }

        public float c(kz0 kz0Var) {
            if (this.f30879b != d1.percent) {
                return b(kz0Var);
            }
            c cVarI = kz0Var.i();
            return cVarI == null ? this.f30878a : (this.f30878a * cVarI.d) / 100.0f;
        }

        public String toString() {
            return String.valueOf(this.f30878a) + this.f30879b;
        }

        public float a(kz0 kz0Var) {
            if (this.f30879b != d1.percent) {
                return b(kz0Var);
            }
            c cVarI = kz0Var.i();
            if (cVarI == null) {
                return this.f30878a;
            }
            float f = cVarI.f30814c;
            if (f == cVarI.d) {
                return (this.f30878a * f) / 100.0f;
            }
            return (this.f30878a * ((float) (Math.sqrt((f * f) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        public q(float f) {
            this.f30878a = f;
            this.f30879b = d1.px;
        }

        public boolean c() {
            return this.f30878a == BitmapDescriptorFactory.HUE_RED;
        }

        public float a(kz0 kz0Var, float f) {
            if (this.f30879b == d1.percent) {
                return (this.f30878a * f) / 100.0f;
            }
            return b(kz0Var);
        }

        public boolean b() {
            return this.f30878a < BitmapDescriptorFactory.HUE_RED;
        }

        public float a(float f) {
            int i = a.f30807a[this.f30879b.ordinal()];
            if (i == 3) {
                return this.f30878a * f;
            }
            if (i == 4) {
                return (this.f30878a * f) / 2.54f;
            }
            if (i == 5) {
                return (this.f30878a * f) / 25.4f;
            }
            if (i == 6) {
                return (this.f30878a * f) / 72.0f;
            }
            if (i != 7) {
                return this.f30878a;
            }
            return (this.f30878a * f) / 6.0f;
        }
    }

    public static class q0 extends k {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        q f30880m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        q f30881n;
        q o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f30882p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30883q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30884r;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "radialGradient";
        }
    }

    public static class r extends m {
        q o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f30885p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30886q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30887r;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "line";
        }
    }

    public static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        c f30888p;
    }

    public static class s extends r0 implements u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f30889q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30890r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        q f30891s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        q f30892t;
        q u;
        Float v;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "marker";
        }
    }

    public static class s0 extends n {
        @Override // com.fourthline.orca.internal.lz0.n, com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "switch";
        }
    }

    public static class t extends h0 implements u {
        Boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f30893p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        q f30894q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        q f30895r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        q f30896s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        q f30897t;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "mask";
        }
    }

    public static class t0 extends r0 implements u {
        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "symbol";
        }
    }

    public interface u {
    }

    public static class u0 extends y0 implements x0 {
        String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b1 f30898p;

        public void a(b1 b1Var) {
            this.f30898p = b1Var;
        }

        @Override // com.fourthline.orca.internal.lz0.x0
        public b1 c() {
            return this.f30898p;
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "tref";
        }
    }

    public static class v extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f30899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final o0 f30900b;

        public v(String str, o0 o0Var) {
            this.f30899a = str;
            this.f30900b = o0Var;
        }

        public String toString() {
            return this.f30899a + " " + this.f30900b;
        }
    }

    public static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b1 f30901s;

        public void a(b1 b1Var) {
            this.f30901s = b1Var;
        }

        @Override // com.fourthline.orca.internal.lz0.x0
        public b1 c() {
            return this.f30901s;
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "tspan";
        }
    }

    public static class w extends m {
        x o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f30902p;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "path";
        }
    }

    public static class w0 extends a1 implements b1, o {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f30903s;

        @Override // com.fourthline.orca.internal.lz0.o
        public void a(Matrix matrix) {
            this.f30903s = matrix;
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "text";
        }
    }

    public static class x implements y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f30905b = 0;
        private int d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f30904a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f30906c = new float[16];

        public boolean a() {
            return this.f30905b == 0;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void close() {
            a((byte) 8);
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void cubicTo(float f, float f4, float f5, float f6, float f32, float f35) {
            a((byte) 2);
            a(6);
            float[] fArr = this.f30906c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f4;
            int i5 = i + 3;
            this.d = i5;
            fArr[i3] = f5;
            int i6 = i + 4;
            this.d = i6;
            fArr[i5] = f6;
            int i21 = i + 5;
            this.d = i21;
            fArr[i6] = f32;
            this.d = i + 6;
            fArr[i21] = f35;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void lineTo(float f, float f4) {
            a((byte) 1);
            a(2);
            float[] fArr = this.f30906c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f4;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void moveTo(float f, float f4) {
            a((byte) 0);
            a(2);
            float[] fArr = this.f30906c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f4;
        }

        private void a(byte b4) {
            int i = this.f30905b;
            byte[] bArr = this.f30904a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f30904a = bArr2;
            }
            byte[] bArr3 = this.f30904a;
            int i2 = this.f30905b;
            this.f30905b = i2 + 1;
            bArr3[i2] = b4;
        }

        private void a(int i) {
            float[] fArr = this.f30906c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f30906c = fArr2;
            }
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void a(float f, float f4, float f5, float f6) {
            a((byte) 3);
            a(4);
            float[] fArr = this.f30906c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f4;
            int i5 = i + 3;
            this.d = i5;
            fArr[i3] = f5;
            this.d = i + 4;
            fArr[i5] = f6;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void a(float f, float f4, float f5, boolean z, boolean z3, float f6, float f32) {
            a((byte) ((z ? 2 : 0) | 4 | (z3 ? 1 : 0)));
            a(5);
            float[] fArr = this.f30906c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f4;
            int i5 = i + 3;
            this.d = i5;
            fArr[i3] = f5;
            int i6 = i + 4;
            this.d = i6;
            fArr[i5] = f6;
            this.d = i + 5;
            fArr[i6] = f32;
        }

        public void a(y yVar) {
            int i = 0;
            for (int i2 = 0; i2 < this.f30905b; i2++) {
                byte b4 = this.f30904a[i2];
                if (b4 == 8) {
                    yVar.close();
                } else if (b4 == 0) {
                    float[] fArr = this.f30906c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    yVar.moveTo(f, fArr[i3]);
                } else if (b4 == 1) {
                    float[] fArr2 = this.f30906c;
                    int i5 = i + 1;
                    float f4 = fArr2[i];
                    i += 2;
                    yVar.lineTo(f4, fArr2[i5]);
                } else if (b4 == 2) {
                    float[] fArr3 = this.f30906c;
                    yVar.cubicTo(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b4 != 3) {
                    boolean z = (b4 & 2) != 0;
                    boolean z3 = (b4 & 1) != 0;
                    float[] fArr4 = this.f30906c;
                    yVar.a(fArr4[i], fArr4[i + 1], fArr4[i + 2], z, z3, fArr4[i + 3], fArr4[i + 4]);
                    i += 5;
                } else {
                    float[] fArr5 = this.f30906c;
                    float f5 = fArr5[i];
                    float f6 = fArr5[i + 1];
                    int i6 = i + 3;
                    float f32 = fArr5[i + 2];
                    i += 4;
                    yVar.a(f5, f6, f32, fArr5[i6]);
                }
            }
        }
    }

    public interface x0 {
        b1 c();
    }

    public interface y {
        void a(float f, float f4, float f5, float f6);

        void a(float f, float f4, float f5, boolean z, boolean z3, float f6, float f32);

        void close();

        void cubicTo(float f, float f4, float f5, float f6, float f32, float f35);

        void lineTo(float f, float f4);

        void moveTo(float f, float f4);
    }

    public static abstract class y0 extends h0 {
        @Override // com.fourthline.orca.internal.lz0.h0, com.fourthline.orca.internal.lz0.j0
        public void a(n0 n0Var) throws nz0 {
            if (n0Var instanceof x0) {
                this.i.add(n0Var);
                return;
            }
            throw new nz0("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    public static class z extends r0 implements u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f30907q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Boolean f30908r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f30909s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        q f30910t;
        q u;
        q v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        q f30911w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f30912x;

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "pattern";
        }
    }

    public static class z0 extends y0 implements x0 {
        String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f30913p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b1 f30914q;

        public void a(b1 b1Var) {
            this.f30914q = b1Var;
        }

        @Override // com.fourthline.orca.internal.lz0.x0
        public b1 c() {
            return this.f30914q;
        }

        @Override // com.fourthline.orca.internal.lz0.n0
        public String g() {
            return "textPath";
        }
    }

    public lz0(boolean z3, mz0 mz0Var) {
        this.f30803a = z3;
    }

    public static lz0 a(InputStream inputStream) {
        return b().a(inputStream);
    }

    public void b(float f4) {
        this.e = f4;
    }

    public n0 c(String str) {
        if (str == null) {
            return null;
        }
        String strA = a(str);
        if (strA.length() <= 1 || !strA.startsWith("#")) {
            return null;
        }
        return b(strA.substring(1));
    }

    public float d() {
        if (this.f30804b != null) {
            return a(this.e).d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float e() {
        if (this.f30804b != null) {
            return a(this.e).f30814c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public f0 f() {
        return this.f30804b;
    }

    public boolean g() {
        return !this.f.b();
    }

    public static oz0 b() {
        return new pz0().a(f30802h).a((mz0) null);
    }

    public void a(Canvas canvas, cz0 cz0Var) {
        if (cz0Var == null) {
            cz0Var = new cz0();
        }
        if (!cz0Var.f()) {
            cz0Var.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        }
        new kz0(canvas, this.e, null).a(this, cz0Var);
    }

    public l0 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f30804b.f30864c)) {
            return this.f30804b;
        }
        if (this.f30806g.containsKey(str)) {
            return (l0) this.f30806g.get(str);
        }
        l0 l0VarA = a(this.f30804b, str);
        this.f30806g.put(str, l0VarA);
        return l0VarA;
    }

    public List c() {
        return this.f.a();
    }

    public void d(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.f30805c = str;
    }

    public void a(f0 f0Var) {
        this.f30804b = f0Var;
    }

    private String a(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private c a(float f4) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fA;
        d1 d1Var5;
        f0 f0Var = this.f30804b;
        q qVar = f0Var.f30841s;
        q qVar2 = f0Var.f30842t;
        if (qVar != null && !qVar.c() && (d1Var = qVar.f30879b) != (d1Var2 = d1.percent) && d1Var != (d1Var3 = d1.em) && d1Var != (d1Var4 = d1.ex)) {
            float fA2 = qVar.a(f4);
            if (qVar2 != null) {
                if (!qVar2.c() && (d1Var5 = qVar2.f30879b) != d1Var2 && d1Var5 != d1Var3 && d1Var5 != d1Var4) {
                    fA = qVar2.a(f4);
                } else {
                    return new c(-1.0f, -1.0f, -1.0f, -1.0f);
                }
            } else {
                c cVar = this.f30804b.f30888p;
                fA = cVar != null ? (cVar.d * fA2) / cVar.f30814c : fA2;
            }
            return new c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fA2, fA);
        }
        return new c(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    public void a(e9.q qVar) {
        this.f.a(qVar);
    }

    public void a() {
        this.f.a(e9.t.RenderOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 a(j0 j0Var, String str) {
        l0 l0VarA;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f30864c)) {
            return l0Var;
        }
        for (Object obj2 : j0Var.getChildren()) {
            if (obj2 instanceof l0) {
                l0 l0Var2 = (l0) obj2;
                if (str.equals(l0Var2.f30864c)) {
                    return l0Var2;
                }
                if ((obj2 instanceof j0) && (l0VarA = a((j0) obj2, str)) != null) {
                    return l0VarA;
                }
            }
        }
        return null;
    }
}
