package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.fourthline.orca.internal.e9;
import com.fourthline.orca.internal.lz0;
import com.fourthline.orca.internal.m71;
import com.fourthline.orca.internal.oq0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public class kz0 {
    private static final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f30446j;
    private static final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f30447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f30448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f30449n;
    private static final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f30450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final boolean f30451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final boolean f30452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f30453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f30454t;
    private static final Pattern u;
    private static final Pattern v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f30455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f30456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static HashSet f30457y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Canvas f30458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f30459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lz0 f30460c;
    private h d;
    private Stack e;
    private Stack f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack f30461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e9.p f30462h = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f30465c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[m71.i.values().length];
            d = iArr;
            try {
                iArr[m71.i.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[m71.i.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[m71.i.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[m71.h.values().length];
            f30465c = iArr2;
            try {
                iArr2[m71.h.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30465c[m71.h.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30465c[m71.h.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[oq0.a.values().length];
            f30464b = iArr3;
            try {
                iArr3[oq0.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30464b[oq0.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30464b[oq0.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30464b[oq0.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30464b[oq0.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30464b[oq0.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30464b[oq0.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f30464b[oq0.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[m71.b.values().length];
            f30463a = iArr4;
            try {
                iArr4[m71.b.multiply.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f30463a[m71.b.screen.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f30463a[m71.b.overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f30463a[m71.b.darken.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f30463a[m71.b.lighten.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f30463a[m71.b.color_dodge.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f30463a[m71.b.color_burn.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f30463a[m71.b.hard_light.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f30463a[m71.b.soft_light.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f30463a[m71.b.difference.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f30463a[m71.b.exclusion.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f30463a[m71.b.hue.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f30463a[m71.b.saturation.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f30463a[m71.b.color.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f30463a[m71.b.luminosity.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f30463a[m71.b.normal.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    public class b implements lz0.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f30466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f30467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f30468c;
        private c d;
        private boolean e;
        private boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f30469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f30470h;

        public b(lz0.x xVar) {
            ArrayList arrayList = new ArrayList();
            this.f30466a = arrayList;
            this.d = null;
            this.e = false;
            this.f = true;
            this.f30469g = -1;
            if (xVar == null) {
                return;
            }
            xVar.a(this);
            if (this.f30470h) {
                this.d.a((c) arrayList.get(this.f30469g));
                arrayList.set(this.f30469g, this.d);
                this.f30470h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        public List a() {
            return this.f30466a;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void close() {
            this.f30466a.add(this.d);
            lineTo(this.f30467b, this.f30468c);
            this.f30470h = true;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void cubicTo(float f, float f4, float f5, float f6, float f32, float f35) {
            if (this.f || this.e) {
                this.d.a(f, f4);
                this.f30466a.add(this.d);
                this.e = false;
            }
            this.d = new c(f32, f35, f32 - f5, f35 - f6);
            this.f30470h = false;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void lineTo(float f, float f4) {
            this.d.a(f, f4);
            this.f30466a.add(this.d);
            c cVar = this.d;
            this.d = new c(f, f4, f - cVar.f30471a, f4 - cVar.f30472b);
            this.f30470h = false;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void moveTo(float f, float f4) {
            if (this.f30470h) {
                this.d.a((c) this.f30466a.get(this.f30469g));
                this.f30466a.set(this.f30469g, this.d);
                this.f30470h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.f30466a.add(cVar);
            }
            this.f30467b = f;
            this.f30468c = f4;
            this.d = new c(f, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f30469g = this.f30466a.size();
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void a(float f, float f4, float f5, float f6) {
            this.d.a(f, f4);
            this.f30466a.add(this.d);
            this.d = new c(f5, f6, f5 - f, f6 - f4);
            this.f30470h = false;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void a(float f, float f4, float f5, boolean z, boolean z3, float f6, float f32) {
            this.e = true;
            this.f = false;
            c cVar = this.d;
            kz0.a(cVar.f30471a, cVar.f30472b, f, f4, f5, z, z3, f6, f32, this);
            this.f = true;
            this.f30470h = false;
        }
    }

    public static class d implements lz0.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Path f30474a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f30475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f30476c;

        public d(lz0.x xVar) {
            if (xVar == null) {
                return;
            }
            xVar.a(this);
        }

        public Path a() {
            return this.f30474a;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void close() {
            this.f30474a.close();
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void cubicTo(float f, float f4, float f5, float f6, float f32, float f35) {
            this.f30474a.cubicTo(f, f4, f5, f6, f32, f35);
            this.f30475b = f32;
            this.f30476c = f35;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void lineTo(float f, float f4) {
            this.f30474a.lineTo(f, f4);
            this.f30475b = f;
            this.f30476c = f4;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void moveTo(float f, float f4) {
            this.f30474a.moveTo(f, f4);
            this.f30475b = f;
            this.f30476c = f4;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void a(float f, float f4, float f5, float f6) {
            this.f30474a.quadTo(f, f4, f5, f6);
            this.f30475b = f5;
            this.f30476c = f6;
        }

        @Override // com.fourthline.orca.internal.lz0.y
        public void a(float f, float f4, float f5, boolean z, boolean z3, float f6, float f32) {
            kz0.a(this.f30475b, this.f30476c, f, f4, f5, z, z3, f6, f32, this);
            this.f30475b = f6;
            this.f30476c = f32;
        }
    }

    public class e extends f {
        private final Path d;

        public e(Path path, float f, float f4) {
            super(f, f4);
            this.d = path;
        }

        @Override // com.fourthline.orca.internal.kz0.f, com.fourthline.orca.internal.kz0.j
        public void a(String str) {
            float fA;
            if (kz0.this.t()) {
                if (kz0.f30448m) {
                    kz0 kz0Var = kz0.this;
                    fA = kz0Var.d.f30483a.f31024b0.a(kz0Var) / 2.0f;
                } else {
                    fA = BitmapDescriptorFactory.HUE_RED;
                }
                kz0 kz0Var2 = kz0.this;
                h hVar = kz0Var2.d;
                if (hVar.f30484b) {
                    kz0Var2.f30458a.drawTextOnPath(str, this.d, this.f30477a - fA, this.f30478b, hVar.f30486g);
                }
                kz0 kz0Var3 = kz0.this;
                h hVar2 = kz0Var3.d;
                if (hVar2.f30485c) {
                    kz0Var3.f30458a.drawTextOnPath(str, this.d, this.f30477a - fA, this.f30478b, hVar2.f30487h);
                }
            }
            float f = this.f30477a;
            kz0 kz0Var4 = kz0.this;
            this.f30477a = f + kz0Var4.a(str, kz0Var4.d.f30486g);
        }
    }

    public class f extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f30477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f30478b;

        public f(float f, float f4) {
            super(0);
            this.f30477a = f;
            this.f30478b = f4;
        }

        @Override // com.fourthline.orca.internal.kz0.j
        public void a(String str) {
            float fA;
            kz0.a("TextSequence render", new Object[0]);
            if (kz0.this.t()) {
                if (kz0.f30448m) {
                    kz0 kz0Var = kz0.this;
                    fA = kz0Var.d.f30483a.f31024b0.a(kz0Var) / 2.0f;
                } else {
                    fA = BitmapDescriptorFactory.HUE_RED;
                }
                kz0 kz0Var2 = kz0.this;
                h hVar = kz0Var2.d;
                if (hVar.f30484b) {
                    kz0Var2.f30458a.drawText(str, this.f30477a - fA, this.f30478b, hVar.f30486g);
                }
                kz0 kz0Var3 = kz0.this;
                h hVar2 = kz0Var3.d;
                if (hVar2.f30485c) {
                    kz0Var3.f30458a.drawText(str, this.f30477a - fA, this.f30478b, hVar2.f30487h);
                }
            }
            float f = this.f30477a;
            kz0 kz0Var4 = kz0.this;
            this.f30477a = f + kz0Var4.a(str, kz0Var4.d.f30486g);
        }
    }

    public static abstract class j {
        public /* synthetic */ j(int i) {
            this();
        }

        public abstract void a(String str);

        public boolean a(lz0.y0 y0Var) {
            return true;
        }

        private j() {
        }
    }

    public class k extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f30492a;

        public /* synthetic */ k(kz0 kz0Var, int i) {
            this();
        }

        @Override // com.fourthline.orca.internal.kz0.j
        public void a(String str) {
            float f = this.f30492a;
            kz0 kz0Var = kz0.this;
            this.f30492a = f + kz0Var.a(str, kz0Var.d.f30486g);
        }

        private k() {
            super(0);
            this.f30492a = BitmapDescriptorFactory.HUE_RED;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        i = true;
        f30446j = true;
        k = true;
        f30447l = true;
        f30448m = true;
        f30449n = true;
        o = i2 >= 29;
        f30450p = i2 >= 29;
        f30451q = true;
        f30452r = i2 >= 31;
        f30453s = Pattern.compile("[\\n\\t]");
        f30454t = Pattern.compile("\\t");
        u = Pattern.compile("\\n");
        v = Pattern.compile("^\\s+");
        f30455w = Pattern.compile("\\s+$");
        f30456x = Pattern.compile("\\s{2,}");
        f30457y = null;
    }

    public kz0(Canvas canvas, float f4, mz0 mz0Var) {
        this.f30458a = canvas;
        this.f30459b = f4;
    }

    private Path.FillType e() {
        m71.c cVar = this.d.f30483a.G;
        return (cVar == null || cVar != m71.c.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private Path.FillType j() {
        m71.c cVar = this.d.f30483a.f31025c;
        return (cVar == null || cVar != m71.c.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static synchronized void k() {
        HashSet hashSet = new HashSet();
        f30457y = hashSet;
        hashSet.add("Structure");
        f30457y.add("BasicStructure");
        f30457y.add("ConditionalProcessing");
        f30457y.add("Image");
        f30457y.add("Style");
        f30457y.add("ViewportAttribute");
        f30457y.add("Shape");
        f30457y.add("BasicText");
        f30457y.add("PaintAttribute");
        f30457y.add("BasicPaintAttribute");
        f30457y.add("OpacityAttribute");
        f30457y.add("BasicGraphicsAttribute");
        f30457y.add("Marker");
        f30457y.add("Gradient");
        f30457y.add("Pattern");
        f30457y.add("Clip");
        f30457y.add("BasicClip");
        f30457y.add("Mask");
        f30457y.add("View");
    }

    private void l() {
        this.f.pop();
        this.f30461g.pop();
    }

    private boolean m() {
        return b(1.0f);
    }

    private boolean n() {
        if (this.d.f30483a.f31030m.floatValue() < 1.0f) {
            return true;
        }
        m71 m71Var = this.d.f30483a;
        if (m71Var.H != null || m71Var.O == m71.g.isolate) {
            return true;
        }
        return o && m71Var.P != m71.b.normal;
    }

    private void o() {
        this.d = new h();
        this.e = new Stack();
        a(this.d, m71.a());
        h hVar = this.d;
        hVar.d = null;
        hVar.f = false;
        this.e.push(new h(hVar));
        this.f30461g = new Stack();
        this.f = new Stack();
    }

    private void p() {
        List<String> list = this.d.f30483a.o;
        Typeface typefaceA = null;
        if (list != null && this.f30460c != null) {
            for (String str : list) {
                m71 m71Var = this.d.f30483a;
                typefaceA = a(str, m71Var.f31033q, m71Var.f31034r);
                if (typefaceA != null) {
                    break;
                }
            }
        }
        if (typefaceA == null) {
            m71 m71Var2 = this.d.f30483a;
            typefaceA = a("serif", m71Var2.f31033q, m71Var2.f31034r);
        }
        this.d.f30486g.setTypeface(typefaceA);
        this.d.f30487h.setTypeface(typefaceA);
        if (f30449n) {
            h hVar = this.d;
            hVar.f30488j.a("wght", hVar.f30483a.f31033q.floatValue());
            h hVar2 = this.d;
            m71.e eVar = hVar2.f30483a.f31034r;
            if (eVar == m71.e.italic) {
                hVar2.f30488j.a("ital", c9.f27412b.floatValue());
                this.d.f30488j.a("slnt", c9.f27413c.floatValue());
            } else if (eVar == m71.e.oblique) {
                hVar2.f30488j.a("slnt", c9.f27413c.floatValue());
            }
            h hVar3 = this.d;
            hVar3.f30488j.a("wdth", hVar3.f30483a.f31035s.floatValue());
            String string = this.d.f30488j.toString();
            a("fontVariationSettings = " + string, new Object[0]);
            this.d.f30486g.setFontVariationSettings(string);
            this.d.f30487h.setFontVariationSettings(string);
        }
        if (f30447l) {
            String string2 = this.d.i.toString();
            a("fontFeatureSettings = " + string2, new Object[0]);
            this.d.f30486g.setFontFeatureSettings(string2);
            this.d.f30487h.setFontFeatureSettings(string2);
        }
    }

    private void q() {
        this.f30458a.restore();
        this.d = (h) this.e.pop();
    }

    private void r() {
        a(false);
    }

    private void s() {
        int iA;
        m71 m71Var = this.d.f30483a;
        lz0.o0 o0Var = m71Var.K;
        if (o0Var instanceof lz0.g) {
            iA = ((lz0.g) o0Var).f30845a;
        } else if (!(o0Var instanceof lz0.h)) {
            return;
        } else {
            iA = m71Var.f31031n.f30845a;
        }
        Float f4 = m71Var.L;
        if (f4 != null) {
            iA = a(iA, f4.floatValue());
        }
        this.f30458a.drawColor(iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        Boolean bool = this.d.f30483a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public float f() {
        return this.d.f30486g.getTextSize();
    }

    public float g() {
        return this.d.f30486g.getTextSize() / 2.0f;
    }

    public float h() {
        return this.f30459b;
    }

    public lz0.c i() {
        h hVar = this.d;
        lz0.c cVar = hVar.e;
        return cVar != null ? cVar : hVar.d;
    }

    public class g extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f30480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f30481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Path f30482c;

        public g(float f, float f4, Path path) {
            super(0);
            this.f30480a = f;
            this.f30481b = f4;
            this.f30482c = path;
        }

        @Override // com.fourthline.orca.internal.kz0.j
        public boolean a(lz0.y0 y0Var) {
            if (!(y0Var instanceof lz0.z0)) {
                return true;
            }
            kz0.c("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.fourthline.orca.internal.kz0.j
        public void a(String str) {
            String str2;
            if (kz0.this.t()) {
                Path path = new Path();
                str2 = str;
                kz0.this.d.f30486g.getTextPath(str2, 0, str.length(), this.f30480a, this.f30481b, path);
                this.f30482c.addPath(path);
            } else {
                str2 = str;
            }
            float f = this.f30480a;
            kz0 kz0Var = kz0.this;
            this.f30480a = f + kz0Var.a(str2, kz0Var.d.f30486g);
        }
    }

    private float a(float f4, float f5, float f6, float f32) {
        return (f4 * f6) + (f5 * f32);
    }

    private void b(Path path) {
        h hVar = this.d;
        if (hVar.f30483a.M != m71.o.NonScalingStroke) {
            this.f30458a.drawPath(path, hVar.f30487h);
            return;
        }
        Matrix matrix = this.f30458a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f30458a.setMatrix(new Matrix());
        Shader shader = this.d.f30487h.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f30458a.drawPath(path2, this.d.f30487h);
        this.f30458a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void c(lz0.n0 n0Var) {
        if (n0Var instanceof lz0.u) {
            return;
        }
        r();
        a(n0Var);
        if (n0Var instanceof lz0.f0) {
            a((lz0.f0) n0Var);
        } else if (n0Var instanceof lz0.e1) {
            a((lz0.e1) n0Var);
        } else if (n0Var instanceof lz0.s0) {
            a((lz0.s0) n0Var);
        } else if (n0Var instanceof lz0.n) {
            a((lz0.n) n0Var);
        } else if (n0Var instanceof lz0.p) {
            a((lz0.p) n0Var);
        } else if (n0Var instanceof lz0.w) {
            a((lz0.w) n0Var);
        } else if (n0Var instanceof lz0.c0) {
            b((lz0.c0) n0Var);
        } else if (n0Var instanceof lz0.e) {
            b((lz0.e) n0Var);
        } else if (n0Var instanceof lz0.j) {
            b((lz0.j) n0Var);
        } else if (n0Var instanceof lz0.r) {
            c((lz0.r) n0Var);
        } else if (n0Var instanceof lz0.b0) {
            a((lz0.b0) n0Var);
        } else if (n0Var instanceof lz0.a0) {
            c((lz0.a0) n0Var);
        } else if (n0Var instanceof lz0.w0) {
            b((lz0.w0) n0Var);
        }
        q();
    }

    private void d(lz0.k0 k0Var) {
        if (k0Var.f30871b == null || k0Var.f30860h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f30461g.peek()).invert(matrix)) {
            lz0.c cVar = k0Var.f30860h;
            float f4 = cVar.f30812a;
            float f5 = cVar.f30813b;
            float fA = cVar.a();
            lz0.c cVar2 = k0Var.f30860h;
            float f6 = cVar2.f30813b;
            float fA2 = cVar2.a();
            float fB = k0Var.f30860h.b();
            lz0.c cVar3 = k0Var.f30860h;
            float[] fArr = {f4, f5, fA, f6, fA2, fB, cVar3.f30812a, cVar3.b()};
            matrix.preConcat(this.f30458a.getMatrix());
            matrix.mapPoints(fArr);
            float f32 = fArr[0];
            float f35 = fArr[1];
            RectF rectF = new RectF(f32, f35, f32, f35);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f36 = fArr[i2];
                if (f36 < rectF.left) {
                    rectF.left = f36;
                }
                if (f36 > rectF.right) {
                    rectF.right = f36;
                }
                float f37 = fArr[i2 + 1];
                if (f37 < rectF.top) {
                    rectF.top = f37;
                }
                if (f37 > rectF.bottom) {
                    rectF.bottom = f37;
                }
            }
            lz0.k0 k0Var2 = (lz0.k0) this.f.peek();
            lz0.c cVar4 = k0Var2.f30860h;
            if (cVar4 == null) {
                k0Var2.f30860h = lz0.c.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                cVar4.a(lz0.c.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, Object... objArr) {
    }

    public void a(lz0 lz0Var, dz0 dz0Var) {
        lz0.c cVar;
        oq0 oq0Var;
        lz0.f1 f1Var;
        if (dz0Var != null) {
            this.f30460c = lz0Var;
            lz0.f0 f0VarF = lz0Var.f();
            if (f0VarF == null) {
                c("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (dz0Var.d()) {
                lz0.l0 l0VarB = this.f30460c.b(dz0Var.f);
                if (!(l0VarB instanceof lz0.f1) || (cVar = (f1Var = (lz0.f1) l0VarB).f30888p) == null) {
                    return;
                } else {
                    oq0Var = f1Var.o;
                }
            } else {
                cVar = dz0Var.e() ? dz0Var.e : f0VarF.f30888p;
                oq0Var = dz0Var.b() ? dz0Var.f27955c : f0VarF.o;
            }
            if (dz0Var.a()) {
                if (dz0Var.f27953a != null) {
                    lz0Var.a(new e9(e9.t.RenderOptions, null).a(dz0Var.f27953a));
                } else {
                    e9.q qVar = dz0Var.f27954b;
                    if (qVar != null) {
                        lz0Var.a(qVar);
                    }
                }
            }
            if (dz0Var.c()) {
                e9.p pVar = new e9.p();
                this.f30462h = pVar;
                pVar.f28068a = lz0Var.b(dz0Var.d);
            }
            o();
            a((lz0.n0) f0VarF);
            a(true);
            lz0.c cVar2 = new lz0.c(dz0Var.f27956g);
            lz0.q qVar2 = f0VarF.f30841s;
            if (qVar2 != null) {
                cVar2.f30814c = qVar2.a(this, cVar2.f30814c);
            }
            lz0.q qVar3 = f0VarF.f30842t;
            if (qVar3 != null) {
                cVar2.d = qVar3.a(this, cVar2.d);
            }
            a(f0VarF, cVar2, cVar, oq0Var);
            q();
            if (dz0Var.a()) {
                lz0Var.a();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f30471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f30472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f30473c;
        float d;
        boolean e = false;

        public c(float f, float f4, float f5, float f6) {
            this.f30473c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.f30471a = f;
            this.f30472b = f4;
            double dSqrt = Math.sqrt((f5 * f5) + (f6 * f6));
            if (dSqrt != 0.0d) {
                this.f30473c = (float) (((double) f5) / dSqrt);
                this.d = (float) (((double) f6) / dSqrt);
            }
        }

        public void a(float f, float f4) {
            float f5 = f - this.f30471a;
            float f6 = f4 - this.f30472b;
            double dSqrt = Math.sqrt((f5 * f5) + (f6 * f6));
            if (dSqrt != 0.0d) {
                f5 = (float) (((double) f5) / dSqrt);
                f6 = (float) (((double) f6) / dSqrt);
            }
            float f32 = this.f30473c;
            if (f5 != (-f32) || f6 != (-this.d)) {
                this.f30473c = f32 + f5;
                this.d += f6;
            } else {
                this.e = true;
                this.f30473c = -f6;
                this.d = f5;
            }
        }

        public String toString() {
            return "(" + this.f30471a + "," + this.f30472b + " " + this.f30473c + "," + this.d + ")";
        }

        public void a(c cVar) {
            float f = cVar.f30473c;
            float f4 = this.f30473c;
            if (f == (-f4)) {
                float f5 = cVar.d;
                if (f5 == (-this.d)) {
                    this.e = true;
                    this.f30473c = -f5;
                    this.d = cVar.f30473c;
                    return;
                }
            }
            this.f30473c = f4 + f;
            this.d += cVar.d;
        }
    }

    public class i extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f30489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f30490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final RectF f30491c;

        public i(float f, float f4) {
            super(0);
            this.f30491c = new RectF();
            this.f30489a = f;
            this.f30490b = f4;
        }

        @Override // com.fourthline.orca.internal.kz0.j
        public boolean a(lz0.y0 y0Var) {
            if (!(y0Var instanceof lz0.z0)) {
                return true;
            }
            lz0.z0 z0Var = (lz0.z0) y0Var;
            lz0.n0 n0VarC = y0Var.f30870a.c(z0Var.o);
            if (n0VarC == null) {
                kz0.b("TextPath path reference '%s' not found", z0Var.o);
                return false;
            }
            lz0.w wVar = (lz0.w) n0VarC;
            Path pathA = new d(wVar.o).a();
            Matrix matrix = wVar.f30866n;
            if (matrix != null) {
                pathA.transform(matrix);
            }
            RectF rectF = new RectF();
            pathA.computeBounds(rectF, true);
            this.f30491c.union(rectF);
            return false;
        }

        @Override // com.fourthline.orca.internal.kz0.j
        public void a(String str) {
            if (kz0.this.t()) {
                Rect rect = new Rect();
                kz0.this.d.f30486g.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f30489a, this.f30490b);
                this.f30491c.union(rectF);
            }
            float f = this.f30489a;
            kz0 kz0Var = kz0.this;
            this.f30489a = f + kz0Var.a(str, kz0Var.d.f30486g);
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m71 f30483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f30484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f30485c;
        lz0.c d;
        lz0.c e;
        boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Paint f30486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Paint f30487h;
        final b9 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final c9 f30488j;

        public h() {
            Paint paint = new Paint();
            this.f30486g = paint;
            paint.setFlags(Constants.TAG_ATMEL_SERIAL);
            boolean z = kz0.i;
            if (z) {
                paint.setHinting(0);
            }
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f30487h = paint2;
            paint2.setFlags(Constants.TAG_ATMEL_SERIAL);
            if (z) {
                paint2.setHinting(0);
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.i = new b9();
            this.f30488j = new c9();
            this.f30483a = m71.a();
        }

        public h(h hVar) {
            this.f30484b = hVar.f30484b;
            this.f30485c = hVar.f30485c;
            this.f30486g = new Paint(hVar.f30486g);
            this.f30487h = new Paint(hVar.f30487h);
            lz0.c cVar = hVar.d;
            if (cVar != null) {
                this.d = new lz0.c(cVar);
            }
            lz0.c cVar2 = hVar.e;
            if (cVar2 != null) {
                this.e = new lz0.c(cVar2);
            }
            this.f = hVar.f;
            this.i = new b9(hVar.i);
            this.f30488j = new c9(hVar.f30488j);
            try {
                this.f30483a = (m71) hVar.f30483a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f30483a = m71.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Object... objArr) {
        String.format(str, objArr);
    }

    private boolean b(float f4) {
        if (!n() && f4 == 1.0f) {
            return false;
        }
        Paint paint = new Paint();
        paint.setAlpha(a(this.d.f30483a.f31030m.floatValue() * f4));
        if (o && this.d.f30483a.P != m71.b.normal) {
            a(paint);
        }
        a(this.f30458a, (RectF) null, paint);
        this.e.push(this.d);
        h hVar = new h(this.d);
        this.d = hVar;
        String str = hVar.f30483a.H;
        if (str != null && !(this.f30460c.c(str) instanceof lz0.t)) {
            b("Mask reference '%s' not found", this.d.f30483a.H);
            this.d.f30483a.H = null;
        }
        return true;
    }

    private void d(lz0.k0 k0Var, lz0.c cVar) {
        if (this.d.f30483a.H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            a(this.f30458a, (RectF) null, paint);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2127f, 0.7151f, 0.0722f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED})));
            a(this.f30458a, (RectF) null, paint2);
            lz0.t tVar = (lz0.t) this.f30460c.c(this.d.f30483a.H);
            a(tVar, k0Var, cVar);
            this.f30458a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            a(this.f30458a, (RectF) null, paint3);
            a(tVar, k0Var, cVar);
            this.f30458a.restore();
            this.f30458a.restore();
        }
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(lz0.s0 s0Var) {
        Set setA;
        String language = Locale.getDefault().getLanguage();
        for (lz0.n0 n0Var : s0Var.getChildren()) {
            if (n0Var instanceof lz0.g0) {
                lz0.g0 g0Var = (lz0.g0) n0Var;
                if (g0Var.b() == null && ((setA = g0Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                    Set setD = g0Var.d();
                    if (setD != null) {
                        if (f30457y == null) {
                            k();
                        }
                        if (setD.isEmpty() || !f30457y.containsAll(setD)) {
                        }
                    }
                    Set setE = g0Var.e();
                    if (setE != null) {
                        setE.isEmpty();
                    } else {
                        Set setF = g0Var.f();
                        if (setF != null) {
                            setF.isEmpty();
                        } else {
                            c(n0Var);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object... objArr) {
        String.format(str, objArr);
    }

    private void c(lz0.k0 k0Var) {
        d(k0Var, k0Var.f30860h);
    }

    private void c(lz0.r rVar) {
        a("Line render", new Object[0]);
        a(this.d, rVar);
        if (c() && t() && this.d.f30485c) {
            Matrix matrix = rVar.f30866n;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            Path pathB = b(rVar);
            d(rVar);
            b((lz0.k0) rVar);
            a((lz0.k0) rVar);
            boolean zM = m();
            b(pathB);
            a((lz0.m) rVar);
            if (zM) {
                c((lz0.k0) rVar);
            }
        }
    }

    private void a(lz0.j0 j0Var, boolean z) {
        if (z) {
            a(j0Var);
        }
        Iterator it8 = j0Var.getChildren().iterator();
        while (it8.hasNext()) {
            c((lz0.n0) it8.next());
        }
        if (z) {
            l();
        }
    }

    private m71.k d() {
        m71.k kVar;
        m71 m71Var = this.d.f30483a;
        if (m71Var.u != m71.m.LTR && (kVar = m71Var.v) != m71.k.Middle) {
            m71.k kVar2 = m71.k.Start;
            return kVar == kVar2 ? m71.k.End : kVar2;
        }
        return m71Var.v;
    }

    private void a(boolean z) {
        if (z) {
            a(this.f30458a, (RectF) null, (Paint) null);
        } else {
            this.f30458a.save();
        }
        this.e.push(this.d);
        this.d = new h(this.d);
    }

    private void a(Canvas canvas, RectF rectF, Paint paint) {
        if (f30451q) {
            canvas.saveLayer(rectF, paint);
        } else {
            r9.a(canvas, rectF, paint, r9.f32648b);
        }
    }

    private void b(lz0.c0 c0Var) {
        a("Rect render", new Object[0]);
        lz0.q qVar = c0Var.f30816q;
        if (qVar == null || c0Var.f30817r == null || qVar.c() || c0Var.f30817r.c()) {
            return;
        }
        a(this.d, c0Var);
        if (c() && t()) {
            Matrix matrix = c0Var.f30866n;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            Path pathA = a(c0Var);
            d(c0Var);
            b((lz0.k0) c0Var);
            a((lz0.k0) c0Var);
            boolean zM = m();
            if (this.d.f30484b) {
                a(c0Var, pathA);
            }
            if (this.d.f30485c) {
                b(pathA);
            }
            if (zM) {
                c((lz0.k0) c0Var);
            }
        }
    }

    private void c(lz0.a0 a0Var) {
        a("PolyLine render", new Object[0]);
        a(this.d, a0Var);
        if (c() && t()) {
            h hVar = this.d;
            if (hVar.f30485c || hVar.f30484b) {
                Matrix matrix = a0Var.f30866n;
                if (matrix != null) {
                    this.f30458a.concat(matrix);
                }
                float[] fArr = a0Var.o;
                int length = fArr != null ? fArr.length : 0;
                if (length < 2 || length % 2 == 1) {
                    return;
                }
                Path pathB = b(a0Var);
                d(a0Var);
                pathB.setFillType(j());
                b((lz0.k0) a0Var);
                a((lz0.k0) a0Var);
                boolean zM = m();
                if (this.d.f30484b) {
                    a(a0Var, pathB);
                }
                if (this.d.f30485c) {
                    b(pathB);
                }
                a((lz0.m) a0Var);
                if (zM) {
                    c((lz0.k0) a0Var);
                }
            }
        }
    }

    private void a(lz0.j0 j0Var) {
        this.f.push(j0Var);
        this.f30461g.push(this.f30458a.getMatrix());
    }

    private void a(h hVar, lz0.l0 l0Var) {
        hVar.f30483a.a(l0Var.f30871b == null);
        m71 m71Var = l0Var.e;
        if (m71Var != null) {
            a(hVar, m71Var);
        }
        if (this.f30460c.g()) {
            for (e9.o oVar : this.f30460c.c()) {
                if (e9.a(this.f30462h, oVar.f28065a, l0Var)) {
                    a(hVar, oVar.f28066b);
                }
            }
        }
        m71 m71Var2 = l0Var.f;
        if (m71Var2 != null) {
            a(hVar, m71Var2);
        }
    }

    private void a(lz0.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof lz0.l0) && (bool = ((lz0.l0) n0Var).d) != null) {
            this.d.f = bool.booleanValue();
        }
    }

    private void b(lz0.e eVar) {
        a("Circle render", new Object[0]);
        lz0.q qVar = eVar.f30831q;
        if (qVar == null || qVar.c()) {
            return;
        }
        a(this.d, eVar);
        if (c() && t()) {
            Matrix matrix = eVar.f30866n;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            Path pathA = a(eVar);
            d(eVar);
            b((lz0.k0) eVar);
            a((lz0.k0) eVar);
            boolean zM = m();
            if (this.d.f30484b) {
                a(eVar, pathA);
            }
            if (this.d.f30485c) {
                b(pathA);
            }
            if (zM) {
                c((lz0.k0) eVar);
            }
        }
    }

    private void a(lz0.k0 k0Var, Path path) {
        lz0.o0 o0Var = this.d.f30483a.f31023b;
        if (o0Var instanceof lz0.v) {
            lz0.n0 n0VarC = this.f30460c.c(((lz0.v) o0Var).f30899a);
            if (n0VarC instanceof lz0.z) {
                a(k0Var, path, (lz0.z) n0VarC);
                return;
            }
        }
        this.f30458a.drawPath(path, this.d.f30486g);
    }

    private boolean c() {
        Boolean bool = this.d.f30483a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void a(lz0.f0 f0Var) {
        a(f0Var, a(f0Var.f30839q, f0Var.f30840r, f0Var.f30841s, f0Var.f30842t), f0Var.f30888p, f0Var.o);
    }

    private void c(lz0.k0 k0Var, lz0.c cVar) {
        lz0.n0 n0VarC = k0Var.f30870a.c(this.d.f30483a.F);
        if (n0VarC == null) {
            b("ClipPath reference '%s' not found", this.d.f30483a.F);
            return;
        }
        if (n0VarC.g() != "clipPath") {
            return;
        }
        lz0.f fVar = (lz0.f) n0VarC;
        if (fVar.i.isEmpty()) {
            this.f30458a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = fVar.f30838p;
        boolean z = bool == null || bool.booleanValue();
        if ((k0Var instanceof lz0.n) && !z) {
            c("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", k0Var.g());
            return;
        }
        b();
        if (!z) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(cVar.f30812a, cVar.f30813b);
            matrix.preScale(cVar.f30814c, cVar.d);
            this.f30458a.concat(matrix);
        }
        Matrix matrix2 = fVar.o;
        if (matrix2 != null) {
            this.f30458a.concat(matrix2);
        }
        this.d = b((lz0.n0) fVar);
        a((lz0.k0) fVar);
        Path path = new Path();
        Iterator it8 = fVar.i.iterator();
        while (it8.hasNext()) {
            a((lz0.n0) it8.next(), true, path, new Matrix());
        }
        this.f30458a.clipPath(path);
        a();
    }

    private void a(lz0.f0 f0Var, lz0.c cVar) {
        a(f0Var, cVar, f0Var.f30888p, f0Var.o);
    }

    private void a(lz0.f0 f0Var, lz0.c cVar, lz0.c cVar2, oq0 oq0Var) {
        a("Svg render", new Object[0]);
        if (cVar.f30814c == BitmapDescriptorFactory.HUE_RED || cVar.d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (oq0Var == null && (oq0Var = f0Var.o) == null) {
            oq0Var = oq0.f;
        }
        a(this.d, f0Var);
        if (c()) {
            h hVar = this.d;
            hVar.d = cVar;
            if (!hVar.f30483a.f31037w.booleanValue()) {
                lz0.c cVar3 = this.d.d;
                b(cVar3.f30812a, cVar3.f30813b, cVar3.f30814c, cVar3.d);
            }
            b(f0Var, this.d.d);
            if (cVar2 != null) {
                this.f30458a.concat(a(this.d.d, cVar2, oq0Var));
                this.d.e = f0Var.f30888p;
            } else {
                Canvas canvas = this.f30458a;
                lz0.c cVar4 = this.d.d;
                canvas.translate(cVar4.f30812a, cVar4.f30813b);
                this.d.e = null;
            }
            boolean zM = m();
            s();
            a((lz0.j0) f0Var, true);
            if (zM) {
                c((lz0.k0) f0Var);
            }
            d(f0Var);
        }
    }

    private void b(lz0.j jVar) {
        a("Ellipse render", new Object[0]);
        lz0.q qVar = jVar.f30855q;
        if (qVar == null || jVar.f30856r == null || qVar.c() || jVar.f30856r.c()) {
            return;
        }
        a(this.d, jVar);
        if (c() && t()) {
            Matrix matrix = jVar.f30866n;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            Path pathA = a(jVar);
            d(jVar);
            b((lz0.k0) jVar);
            a((lz0.k0) jVar);
            boolean zM = m();
            if (this.d.f30484b) {
                a(jVar, pathA);
            }
            if (this.d.f30485c) {
                b(pathA);
            }
            if (zM) {
                c((lz0.k0) jVar);
            }
        }
    }

    private lz0.c a(lz0.q qVar, lz0.q qVar2, lz0.q qVar3, lz0.q qVar4) {
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = qVar != null ? qVar.b(this) : 0.0f;
        if (qVar2 != null) {
            fC = qVar2.c(this);
        }
        lz0.c cVarI = i();
        return new lz0.c(fB, fC, qVar3 != null ? qVar3.b(this) : cVarI.f30814c, qVar4 != null ? qVar4.c(this) : cVarI.d);
    }

    private void b(lz0.w0 w0Var) {
        a("Text render", new Object[0]);
        a(this.d, w0Var);
        if (c()) {
            p();
            Matrix matrix = w0Var.f30903s;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            List list = w0Var.o;
            float fC = BitmapDescriptorFactory.HUE_RED;
            float fB = (list == null || list.size() == 0) ? 0.0f : ((lz0.q) w0Var.o.get(0)).b(this);
            List list2 = w0Var.f30808p;
            float fC2 = (list2 == null || list2.size() == 0) ? 0.0f : ((lz0.q) w0Var.f30808p.get(0)).c(this);
            List list3 = w0Var.f30809q;
            float fB2 = (list3 == null || list3.size() == 0) ? 0.0f : ((lz0.q) w0Var.f30809q.get(0)).b(this);
            List list4 = w0Var.f30810r;
            if (list4 != null && list4.size() != 0) {
                fC = ((lz0.q) w0Var.f30810r.get(0)).c(this);
            }
            m71.k kVarD = d();
            if (kVarD != m71.k.Start) {
                float fA = a((lz0.y0) w0Var);
                if (kVarD == m71.k.Middle) {
                    fA /= 2.0f;
                }
                fB -= fA;
            }
            if (w0Var.f30860h == null) {
                i iVar = new i(fB, fC2);
                a((lz0.y0) w0Var, (j) iVar);
                RectF rectF = iVar.f30491c;
                w0Var.f30860h = new lz0.c(rectF.left, rectF.top, rectF.width(), iVar.f30491c.height());
            }
            d(w0Var);
            b((lz0.k0) w0Var);
            a((lz0.k0) w0Var);
            boolean zM = m();
            a((lz0.y0) w0Var, new f(fB + fB2, fC2 + fC));
            if (zM) {
                c((lz0.k0) w0Var);
            }
        }
    }

    private void a(lz0.n nVar) {
        a(nVar.g() + " render", new Object[0]);
        a(this.d, nVar);
        if (c()) {
            Matrix matrix = nVar.o;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            a((lz0.k0) nVar);
            boolean zM = m();
            a((lz0.j0) nVar, true);
            if (zM) {
                c((lz0.k0) nVar);
            }
            d(nVar);
        }
    }

    private void a(Paint paint) {
        a("Setting blend mode to " + this.d.f30483a.P, new Object[0]);
        switch (a.f30463a[this.d.f30483a.P.ordinal()]) {
            case 1:
                BlendMode unused = BlendMode.MULTIPLY;
                paint.setBlendMode(BlendMode.MULTIPLY);
                break;
            case 2:
                BlendMode unused2 = BlendMode.SCREEN;
                paint.setBlendMode(BlendMode.SCREEN);
                break;
            case 3:
                BlendMode unused3 = BlendMode.OVERLAY;
                paint.setBlendMode(BlendMode.OVERLAY);
                break;
            case 4:
                BlendMode unused4 = BlendMode.DARKEN;
                paint.setBlendMode(BlendMode.DARKEN);
                break;
            case 5:
                BlendMode unused5 = BlendMode.LIGHTEN;
                paint.setBlendMode(BlendMode.LIGHTEN);
                break;
            case 6:
                BlendMode unused6 = BlendMode.COLOR_DODGE;
                paint.setBlendMode(BlendMode.COLOR_DODGE);
                break;
            case 7:
                BlendMode unused7 = BlendMode.COLOR_BURN;
                paint.setBlendMode(BlendMode.COLOR_BURN);
                break;
            case 8:
                BlendMode unused8 = BlendMode.HARD_LIGHT;
                paint.setBlendMode(BlendMode.HARD_LIGHT);
                break;
            case 9:
                BlendMode unused9 = BlendMode.SOFT_LIGHT;
                paint.setBlendMode(BlendMode.SOFT_LIGHT);
                break;
            case 10:
                BlendMode unused10 = BlendMode.DIFFERENCE;
                paint.setBlendMode(BlendMode.DIFFERENCE);
                break;
            case 11:
                BlendMode unused11 = BlendMode.EXCLUSION;
                paint.setBlendMode(BlendMode.EXCLUSION);
                break;
            case 12:
                BlendMode unused12 = BlendMode.HUE;
                paint.setBlendMode(BlendMode.HUE);
                break;
            case 13:
                BlendMode unused13 = BlendMode.SATURATION;
                paint.setBlendMode(BlendMode.SATURATION);
                break;
            case 14:
                BlendMode unused14 = BlendMode.COLOR;
                paint.setBlendMode(BlendMode.COLOR);
                break;
            case 15:
                BlendMode unused15 = BlendMode.LUMINOSITY;
                paint.setBlendMode(BlendMode.LUMINOSITY);
                break;
            default:
                paint.setBlendMode(null);
                break;
        }
    }

    private void b(float f4, float f5, float f6, float f32) {
        float fB = f6 + f4;
        float fC = f32 + f5;
        lz0.d dVar = this.d.f30483a.f31038x;
        if (dVar != null) {
            f4 += dVar.d.b(this);
            f5 += this.d.f30483a.f31038x.f30821a.c(this);
            fB -= this.d.f30483a.f31038x.f30822b.b(this);
            fC -= this.d.f30483a.f31038x.f30823c.c(this);
        }
        this.f30458a.clipRect(f4, f5, fB, fC);
    }

    private void a(lz0.s0 s0Var) {
        a("Switch render", new Object[0]);
        a(this.d, s0Var);
        if (c()) {
            Matrix matrix = s0Var.o;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            a((lz0.k0) s0Var);
            boolean zM = m();
            b(s0Var);
            if (zM) {
                c((lz0.k0) s0Var);
            }
            d(s0Var);
        }
    }

    private h b(lz0.n0 n0Var) {
        h hVar = new h();
        a(hVar, m71.a());
        return a(n0Var, hVar);
    }

    private void b(lz0.k0 k0Var) {
        lz0.o0 o0Var = this.d.f30483a.f31023b;
        if (o0Var instanceof lz0.v) {
            a(true, k0Var.f30860h, (lz0.v) o0Var);
        }
        lz0.o0 o0Var2 = this.d.f30483a.e;
        if (o0Var2 instanceof lz0.v) {
            a(false, k0Var.f30860h, (lz0.v) o0Var2);
        }
    }

    private void b(lz0.k0 k0Var, lz0.c cVar) {
        if (this.d.f30483a.F == null) {
            return;
        }
        if (k) {
            Path pathA = a(k0Var, cVar);
            if (pathA != null) {
                this.f30458a.clipPath(pathA);
                return;
            }
            return;
        }
        c(k0Var, cVar);
    }

    private void a(lz0.e1 e1Var) {
        a("Use render", new Object[0]);
        lz0.q qVar = e1Var.f30836s;
        if (qVar == null || !qVar.c()) {
            lz0.q qVar2 = e1Var.f30837t;
            if (qVar2 == null || !qVar2.c()) {
                a(this.d, e1Var);
                if (c()) {
                    lz0.n0 n0VarC = e1Var.f30870a.c(e1Var.f30833p);
                    if (n0VarC == null) {
                        b("Use reference '%s' not found", e1Var.f30833p);
                        return;
                    }
                    Matrix matrix = e1Var.o;
                    if (matrix != null) {
                        this.f30458a.concat(matrix);
                    }
                    lz0.q qVar3 = e1Var.f30834q;
                    float fC = BitmapDescriptorFactory.HUE_RED;
                    float fB = qVar3 != null ? qVar3.b(this) : 0.0f;
                    lz0.q qVar4 = e1Var.f30835r;
                    if (qVar4 != null) {
                        fC = qVar4.c(this);
                    }
                    this.f30458a.translate(fB, fC);
                    a((lz0.k0) e1Var);
                    boolean zM = m();
                    a((lz0.j0) e1Var);
                    if (n0VarC instanceof lz0.f0) {
                        lz0.c cVarA = a((lz0.q) null, (lz0.q) null, e1Var.f30836s, e1Var.f30837t);
                        r();
                        a((lz0.f0) n0VarC, cVarA);
                        q();
                    } else if (n0VarC instanceof lz0.t0) {
                        lz0.q qVar5 = e1Var.f30836s;
                        if (qVar5 == null) {
                            qVar5 = new lz0.q(100.0f, lz0.d1.percent);
                        }
                        lz0.q qVar6 = e1Var.f30837t;
                        if (qVar6 == null) {
                            qVar6 = new lz0.q(100.0f, lz0.d1.percent);
                        }
                        lz0.c cVarA2 = a((lz0.q) null, (lz0.q) null, qVar5, qVar6);
                        r();
                        a((lz0.t0) n0VarC, cVarA2);
                        q();
                    } else {
                        c(n0VarC);
                    }
                    l();
                    if (zM) {
                        c((lz0.k0) e1Var);
                    }
                    d(e1Var);
                }
            }
        }
    }

    private void b() {
        r9.a(this.f30458a, r9.f32647a);
        this.e.push(this.d);
        this.d = new h(this.d);
    }

    private Path b(lz0.r rVar) {
        lz0.q qVar = rVar.o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = qVar == null ? 0.0f : qVar.b(this);
        lz0.q qVar2 = rVar.f30885p;
        float fC2 = qVar2 == null ? 0.0f : qVar2.c(this);
        lz0.q qVar3 = rVar.f30886q;
        float fB2 = qVar3 == null ? 0.0f : qVar3.b(this);
        lz0.q qVar4 = rVar.f30887r;
        if (qVar4 != null) {
            fC = qVar4.c(this);
        }
        if (rVar.f30860h == null) {
            rVar.f30860h = new lz0.c(Math.min(fB, fB2), Math.min(fC2, fC), Math.abs(fB2 - fB), Math.abs(fC - fC2));
        }
        Path path = new Path();
        path.moveTo(fB, fC2);
        path.lineTo(fB2, fC);
        return path;
    }

    private Path b(lz0.a0 a0Var) {
        Path path = new Path();
        float[] fArr = a0Var.o;
        int i2 = 0;
        int length = fArr != null ? fArr.length : 0;
        if (length % 2 != 0) {
            return null;
        }
        if (length > 0) {
            while (length >= 2) {
                if (i2 == 0) {
                    float[] fArr2 = a0Var.o;
                    path.moveTo(fArr2[i2], fArr2[i2 + 1]);
                } else {
                    float[] fArr3 = a0Var.o;
                    path.lineTo(fArr3[i2], fArr3[i2 + 1]);
                }
                i2 += 2;
                length -= 2;
            }
            if (a0Var instanceof lz0.b0) {
                path.close();
            }
        }
        if (a0Var.f30860h == null) {
            a0Var.f30860h = a(path);
        }
        return path;
    }

    private void a(lz0.w wVar) {
        a("Path render", new Object[0]);
        if (wVar.o == null) {
            return;
        }
        a(this.d, wVar);
        if (c() && t()) {
            h hVar = this.d;
            if (hVar.f30485c || hVar.f30484b) {
                Matrix matrix = wVar.f30866n;
                if (matrix != null) {
                    this.f30458a.concat(matrix);
                }
                Path pathA = new d(wVar.o).a();
                if (wVar.f30860h == null) {
                    wVar.f30860h = a(pathA);
                }
                d(wVar);
                b((lz0.k0) wVar);
                a((lz0.k0) wVar);
                boolean zM = m();
                if (this.d.f30484b) {
                    pathA.setFillType(j());
                    a(wVar, pathA);
                }
                if (this.d.f30485c) {
                    b(pathA);
                }
                a((lz0.m) wVar);
                if (zM) {
                    c((lz0.k0) wVar);
                }
            }
        }
    }

    private lz0.c a(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new lz0.c(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private List a(lz0.r rVar) {
        lz0.q qVar = rVar.o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = qVar != null ? qVar.b(this) : 0.0f;
        lz0.q qVar2 = rVar.f30885p;
        float fC2 = qVar2 != null ? qVar2.c(this) : 0.0f;
        lz0.q qVar3 = rVar.f30886q;
        float fB2 = qVar3 != null ? qVar3.b(this) : 0.0f;
        lz0.q qVar4 = rVar.f30887r;
        if (qVar4 != null) {
            fC = qVar4.c(this);
        }
        ArrayList arrayList = new ArrayList(2);
        float f4 = fB2 - fB;
        float f5 = fC - fC2;
        arrayList.add(new c(fB, fC2, f4, f5));
        arrayList.add(new c(fB2, fC, f4, f5));
        return arrayList;
    }

    private List a(lz0.a0 a0Var) {
        float[] fArr = a0Var.o;
        int length = fArr != null ? fArr.length : 0;
        int i2 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr2 = a0Var.o;
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float f6 = BitmapDescriptorFactory.HUE_RED;
        c cVar = new c(f4, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float f32 = 0.0f;
        while (i2 < length) {
            float[] fArr3 = a0Var.o;
            f6 = fArr3[i2];
            f32 = fArr3[i2 + 1];
            cVar.a(f6, f32);
            arrayList.add(cVar);
            i2 += 2;
            cVar = new c(f6, f32, f6 - cVar.f30471a, f32 - cVar.f30472b);
        }
        if (a0Var instanceof lz0.b0) {
            float[] fArr4 = a0Var.o;
            float f35 = fArr4[0];
            if (f6 != f35) {
                float f36 = fArr4[1];
                if (f32 != f36) {
                    cVar.a(f35, f36);
                    arrayList.add(cVar);
                    c cVar2 = new c(f35, f36, f35 - cVar.f30471a, f36 - cVar.f30472b);
                    cVar2.a((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
            return arrayList;
        }
        arrayList.add(cVar);
        return arrayList;
    }

    private void a(lz0.b0 b0Var) {
        a("Polygon render", new Object[0]);
        a(this.d, b0Var);
        if (c() && t()) {
            h hVar = this.d;
            if (hVar.f30485c || hVar.f30484b) {
                Matrix matrix = b0Var.f30866n;
                if (matrix != null) {
                    this.f30458a.concat(matrix);
                }
                float[] fArr = b0Var.o;
                if ((fArr != null ? fArr.length : 0) < 2) {
                    return;
                }
                Path pathB = b((lz0.a0) b0Var);
                d(b0Var);
                b((lz0.k0) b0Var);
                a((lz0.k0) b0Var);
                boolean zM = m();
                if (this.d.f30484b) {
                    a(b0Var, pathB);
                }
                if (this.d.f30485c) {
                    b(pathB);
                }
                a((lz0.m) b0Var);
                if (zM) {
                    c((lz0.k0) b0Var);
                }
            }
        }
    }

    private void a(lz0.y0 y0Var, j jVar) {
        if (c()) {
            Iterator it8 = y0Var.i.iterator();
            boolean z = true;
            while (it8.hasNext()) {
                lz0.n0 n0Var = (lz0.n0) it8.next();
                if (n0Var instanceof lz0.c1) {
                    jVar.a(a(((lz0.c1) n0Var).f30820c, z, !it8.hasNext()));
                } else {
                    a(n0Var, jVar);
                }
                z = false;
            }
        }
    }

    private void a(lz0.n0 n0Var, j jVar) {
        float f4;
        float fC;
        float fB;
        m71.k kVarD;
        if (jVar.a((lz0.y0) n0Var)) {
            if (n0Var instanceof lz0.z0) {
                r();
                a((lz0.z0) n0Var);
                q();
                return;
            }
            if (n0Var instanceof lz0.v0) {
                a("TSpan render", new Object[0]);
                r();
                lz0.v0 v0Var = (lz0.v0) n0Var;
                a(this.d, v0Var);
                if (c()) {
                    p();
                    List list = v0Var.o;
                    boolean z = list != null && list.size() > 0;
                    boolean z3 = jVar instanceof f;
                    float fC2 = BitmapDescriptorFactory.HUE_RED;
                    if (z3) {
                        float fB2 = !z ? ((f) jVar).f30477a : ((lz0.q) v0Var.o.get(0)).b(this);
                        List list2 = v0Var.f30808p;
                        fC = (list2 == null || list2.size() == 0) ? ((f) jVar).f30478b : ((lz0.q) v0Var.f30808p.get(0)).c(this);
                        List list3 = v0Var.f30809q;
                        fB = (list3 == null || list3.size() == 0) ? 0.0f : ((lz0.q) v0Var.f30809q.get(0)).b(this);
                        List list4 = v0Var.f30810r;
                        if (list4 != null && list4.size() != 0) {
                            fC2 = ((lz0.q) v0Var.f30810r.get(0)).c(this);
                        }
                        f4 = fC2;
                        fC2 = fB2;
                    } else {
                        f4 = 0.0f;
                        fC = 0.0f;
                        fB = 0.0f;
                    }
                    if (z && (kVarD = d()) != m71.k.Start) {
                        float fA = a((lz0.y0) v0Var);
                        if (kVarD == m71.k.Middle) {
                            fA /= 2.0f;
                        }
                        fC2 -= fA;
                    }
                    b((lz0.k0) v0Var.c());
                    if (z3) {
                        f fVar = (f) jVar;
                        fVar.f30477a = fC2 + fB;
                        fVar.f30478b = fC + f4;
                    }
                    boolean zM = m();
                    a((lz0.y0) v0Var, jVar);
                    if (zM) {
                        c((lz0.k0) v0Var);
                    }
                }
                q();
                return;
            }
            if (n0Var instanceof lz0.u0) {
                r();
                lz0.u0 u0Var = (lz0.u0) n0Var;
                a(this.d, u0Var);
                if (c()) {
                    b((lz0.k0) u0Var.c());
                    lz0.n0 n0VarC = n0Var.f30870a.c(u0Var.o);
                    if (n0VarC instanceof lz0.y0) {
                        StringBuilder sb6 = new StringBuilder();
                        a((lz0.y0) n0VarC, sb6);
                        if (sb6.length() > 0) {
                            jVar.a(sb6.toString());
                        }
                    } else {
                        b("Tref reference '%s' not found", u0Var.o);
                    }
                }
                q();
            }
        }
    }

    private void a(lz0.z0 z0Var) {
        a("TextPath render", new Object[0]);
        a(this.d, z0Var);
        if (c() && t()) {
            p();
            lz0.n0 n0VarC = z0Var.f30870a.c(z0Var.o);
            if (n0VarC == null) {
                b("TextPath reference '%s' not found", z0Var.o);
                return;
            }
            lz0.w wVar = (lz0.w) n0VarC;
            Path pathA = new d(wVar.o).a();
            Matrix matrix = wVar.f30866n;
            if (matrix != null) {
                pathA.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathA, false);
            lz0.q qVar = z0Var.f30913p;
            float fA = qVar != null ? qVar.a(this, pathMeasure.getLength()) : 0.0f;
            m71.k kVarD = d();
            if (kVarD != m71.k.Start) {
                float fA2 = a((lz0.y0) z0Var);
                if (kVarD == m71.k.Middle) {
                    fA2 /= 2.0f;
                }
                fA -= fA2;
            }
            b((lz0.k0) z0Var.c());
            boolean zM = m();
            a((lz0.y0) z0Var, (j) new e(pathA, fA, BitmapDescriptorFactory.HUE_RED));
            if (zM) {
                c((lz0.k0) z0Var);
            }
        }
    }

    private float a(lz0.y0 y0Var) {
        k kVar = new k(this, 0);
        a(y0Var, (j) kVar);
        return kVar.f30492a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(String str, Paint paint) {
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        float f4 = BitmapDescriptorFactory.HUE_RED;
        for (int i2 = 0; i2 < length; i2++) {
            f4 += fArr[i2];
        }
        return f4;
    }

    private void a(lz0.y0 y0Var, StringBuilder sb6) {
        Iterator it8 = y0Var.i.iterator();
        boolean z = true;
        while (it8.hasNext()) {
            lz0.n0 n0Var = (lz0.n0) it8.next();
            if (n0Var instanceof lz0.y0) {
                a((lz0.y0) n0Var, sb6);
            } else if (n0Var instanceof lz0.c1) {
                sb6.append(a(((lz0.c1) n0Var).f30820c, z, !it8.hasNext()));
            }
            z = false;
        }
    }

    private String a(String str, boolean z, boolean z3) {
        if (this.d.f) {
            return f30453s.matcher(str).replaceAll(" ");
        }
        String strReplaceAll = u.matcher(f30454t.matcher(str).replaceAll("")).replaceAll(" ");
        if (z) {
            strReplaceAll = v.matcher(strReplaceAll).replaceAll("");
        }
        if (z3) {
            strReplaceAll = f30455w.matcher(strReplaceAll).replaceAll("");
        }
        return f30456x.matcher(strReplaceAll).replaceAll(" ");
    }

    private void a(lz0.t0 t0Var, lz0.c cVar) {
        a("Symbol render", new Object[0]);
        if (cVar.f30814c == BitmapDescriptorFactory.HUE_RED || cVar.d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        oq0 oq0Var = t0Var.o;
        if (oq0Var == null) {
            oq0Var = oq0.f;
        }
        a(this.d, t0Var);
        h hVar = this.d;
        hVar.d = cVar;
        if (!hVar.f30483a.f31037w.booleanValue()) {
            lz0.c cVar2 = this.d.d;
            b(cVar2.f30812a, cVar2.f30813b, cVar2.f30814c, cVar2.d);
        }
        lz0.c cVar3 = t0Var.f30888p;
        if (cVar3 != null) {
            this.f30458a.concat(a(this.d.d, cVar3, oq0Var));
            this.d.e = t0Var.f30888p;
        } else {
            Canvas canvas = this.f30458a;
            lz0.c cVar4 = this.d.d;
            canvas.translate(cVar4.f30812a, cVar4.f30813b);
            this.d.e = null;
        }
        boolean zM = m();
        a((lz0.j0) t0Var, true);
        if (zM) {
            c((lz0.k0) t0Var);
        }
        d(t0Var);
    }

    private void a(lz0.p pVar) {
        lz0.q qVar;
        String str;
        a("Image render", new Object[0]);
        lz0.q qVar2 = pVar.f30875s;
        if (qVar2 == null || qVar2.c() || (qVar = pVar.f30876t) == null || qVar.c() || (str = pVar.f30872p) == null) {
            return;
        }
        oq0 oq0Var = pVar.o;
        if (oq0Var == null) {
            oq0Var = oq0.f;
        }
        Bitmap bitmapA = a(str);
        if (bitmapA == null) {
            return;
        }
        lz0.c cVar = new lz0.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapA.getWidth(), bitmapA.getHeight());
        a(this.d, pVar);
        if (c() && t()) {
            Matrix matrix = pVar.u;
            if (matrix != null) {
                this.f30458a.concat(matrix);
            }
            lz0.q qVar3 = pVar.f30873q;
            float fB = qVar3 != null ? qVar3.b(this) : 0.0f;
            lz0.q qVar4 = pVar.f30874r;
            this.d.d = new lz0.c(fB, qVar4 != null ? qVar4.c(this) : 0.0f, pVar.f30875s.b(this), pVar.f30876t.b(this));
            if (!this.d.f30483a.f31037w.booleanValue()) {
                lz0.c cVar2 = this.d.d;
                b(cVar2.f30812a, cVar2.f30813b, cVar2.f30814c, cVar2.d);
            }
            pVar.f30860h = this.d.d;
            d(pVar);
            a((lz0.k0) pVar);
            boolean zM = m();
            s();
            this.f30458a.save();
            this.f30458a.concat(a(this.d.d, cVar, oq0Var));
            this.f30458a.drawBitmap(bitmapA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(this.d.f30483a.N != m71.j.optimizeSpeed ? 2 : 0));
            this.f30458a.restore();
            if (zM) {
                c((lz0.k0) pVar);
            }
        }
    }

    private Bitmap a(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix a(com.fourthline.orca.internal.lz0.c r10, com.fourthline.orca.internal.lz0.c r11, com.fourthline.orca.internal.oq0 r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            com.fourthline.orca.internal.oq0$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f30814c
            float r2 = r11.f30814c
            float r1 = r1 / r2
            float r2 = r10.d
            float r3 = r11.d
            float r2 = r2 / r3
            float r3 = r11.f30812a
            float r3 = -r3
            float r4 = r11.f30813b
            float r4 = -r4
            com.fourthline.orca.internal.oq0 r5 = com.fourthline.orca.internal.oq0.e
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f30812a
            float r10 = r10.f30813b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.fourthline.orca.internal.oq0$b r5 = r12.b()
            com.fourthline.orca.internal.oq0$b r6 = com.fourthline.orca.internal.oq0.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f30814c
            float r2 = r2 / r1
            float r5 = r10.d
            float r5 = r5 / r1
            int[] r6 = com.fourthline.orca.internal.kz0.a.f30464b
            com.fourthline.orca.internal.oq0$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f30814c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f30814c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            com.fourthline.orca.internal.oq0$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f30812a
            float r10 = r10.f30813b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kz0.a(com.fourthline.orca.internal.lz0$c, com.fourthline.orca.internal.lz0$c, com.fourthline.orca.internal.oq0):android.graphics.Matrix");
    }

    private boolean a(m71 m71Var, long j2) {
        return (m71Var.f31021a & j2) != 0;
    }

    private void a(h hVar, m71 m71Var) {
        Float fValueOf = Float.valueOf(700.0f);
        Float fValueOf2 = Float.valueOf(400.0f);
        if (a(m71Var, 4096L)) {
            hVar.f30483a.f31031n = m71Var.f31031n;
        }
        if (a(m71Var, 2048L)) {
            hVar.f30483a.f31030m = m71Var.f31030m;
        }
        if (a(m71Var, 1L)) {
            hVar.f30483a.f31023b = m71Var.f31023b;
            lz0.o0 o0Var = m71Var.f31023b;
            hVar.f30484b = (o0Var == null || o0Var == lz0.g.f30844c) ? false : true;
        }
        if (a(m71Var, 4L)) {
            hVar.f30483a.d = m71Var.d;
        }
        if (a(m71Var, 6149L)) {
            a(hVar, true, hVar.f30483a.f31023b);
        }
        if (a(m71Var, 2L)) {
            hVar.f30483a.f31025c = m71Var.f31025c;
        }
        if (a(m71Var, 8L)) {
            hVar.f30483a.e = m71Var.e;
            lz0.o0 o0Var2 = m71Var.e;
            hVar.f30485c = (o0Var2 == null || o0Var2 == lz0.g.f30844c) ? false : true;
        }
        if (a(m71Var, 16L)) {
            hVar.f30483a.f = m71Var.f;
        }
        if (a(m71Var, 6168L)) {
            a(hVar, false, hVar.f30483a.e);
        }
        if (a(m71Var, 34359738368L)) {
            hVar.f30483a.M = m71Var.M;
        }
        if (a(m71Var, 32L)) {
            m71 m71Var2 = hVar.f30483a;
            lz0.q qVar = m71Var.f31026g;
            m71Var2.f31026g = qVar;
            hVar.f30487h.setStrokeWidth(qVar.a(this));
        }
        if (a(m71Var, 64L)) {
            hVar.f30483a.f31027h = m71Var.f31027h;
            int i2 = a.f30465c[m71Var.f31027h.ordinal()];
            if (i2 == 1) {
                hVar.f30487h.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 2) {
                hVar.f30487h.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 3) {
                hVar.f30487h.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (a(m71Var, 128L)) {
            hVar.f30483a.i = m71Var.i;
            int i3 = a.d[m71Var.i.ordinal()];
            if (i3 == 1) {
                hVar.f30487h.setStrokeJoin(Paint.Join.MITER);
            } else if (i3 == 2) {
                hVar.f30487h.setStrokeJoin(Paint.Join.ROUND);
            } else if (i3 == 3) {
                hVar.f30487h.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (a(m71Var, 256L)) {
            hVar.f30483a.f31028j = m71Var.f31028j;
            hVar.f30487h.setStrokeMiter(m71Var.f31028j.floatValue());
        }
        if (a(m71Var, 512L)) {
            hVar.f30483a.k = m71Var.k;
        }
        if (a(m71Var, FileSize.KB_COEFFICIENT)) {
            hVar.f30483a.f31029l = m71Var.f31029l;
        }
        if (a(m71Var, 1536L)) {
            lz0.q[] qVarArr = hVar.f30483a.k;
            if (qVarArr == null) {
                hVar.f30487h.setPathEffect(null);
            } else {
                int length = qVarArr.length;
                int i5 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i5];
                float f4 = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    float fA = hVar.f30483a.k[i6 % length].a(this);
                    fArr[i6] = fA;
                    f4 += fA;
                }
                if (f4 == BitmapDescriptorFactory.HUE_RED) {
                    hVar.f30487h.setPathEffect(null);
                } else {
                    float fA2 = hVar.f30483a.f31029l.a(this);
                    if (fA2 < BitmapDescriptorFactory.HUE_RED) {
                        fA2 = (fA2 % f4) + f4;
                    }
                    hVar.f30487h.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (a(m71Var, 16384L)) {
            float f5 = f();
            hVar.f30483a.f31032p = m71Var.f31032p;
            hVar.f30486g.setTextSize(m71Var.f31032p.a(this, f5));
            hVar.f30487h.setTextSize(m71Var.f31032p.a(this, f5));
        }
        if (a(m71Var, FileAppender.DEFAULT_BUFFER_SIZE)) {
            hVar.f30483a.o = m71Var.o;
        }
        if (a(m71Var, 32768L)) {
            if (m71Var.f31033q.floatValue() == Float.MIN_VALUE) {
                float fFloatValue = hVar.f30483a.f31033q.floatValue();
                if (fFloatValue >= 100.0f && fFloatValue < 550.0f) {
                    hVar.f30483a.f31033q = Float.valueOf(100.0f);
                } else if (fFloatValue >= 550.0f && fFloatValue < 750.0f) {
                    hVar.f30483a.f31033q = fValueOf2;
                } else if (fFloatValue >= 750.0f) {
                    hVar.f30483a.f31033q = fValueOf;
                }
            } else if (m71Var.f31033q.floatValue() == Float.MAX_VALUE) {
                float fFloatValue2 = hVar.f30483a.f31033q.floatValue();
                if (fFloatValue2 < 350.0f) {
                    hVar.f30483a.f31033q = fValueOf2;
                } else if (fFloatValue2 >= 350.0f && fFloatValue2 < 550.0f) {
                    hVar.f30483a.f31033q = fValueOf;
                } else if (fFloatValue2 >= 550.0f && fFloatValue2 < 900.0f) {
                    hVar.f30483a.f31033q = Float.valueOf(900.0f);
                }
            } else {
                hVar.f30483a.f31033q = m71Var.f31033q;
            }
        }
        if (a(m71Var, 65536L)) {
            hVar.f30483a.f31034r = m71Var.f31034r;
        }
        if (a(m71Var, 2251799813685248L)) {
            hVar.f30483a.f31035s = m71Var.f31035s;
        }
        if (a(m71Var, 131072L)) {
            hVar.f30483a.f31036t = m71Var.f31036t;
            Paint paint = hVar.f30486g;
            m71.l lVar = m71Var.f31036t;
            m71.l lVar2 = m71.l.LineThrough;
            paint.setStrikeThruText(lVar == lVar2);
            Paint paint2 = hVar.f30486g;
            m71.l lVar3 = m71Var.f31036t;
            m71.l lVar4 = m71.l.Underline;
            paint2.setUnderlineText(lVar3 == lVar4);
            if (f30446j) {
                hVar.f30487h.setStrikeThruText(m71Var.f31036t == lVar2);
                hVar.f30487h.setUnderlineText(m71Var.f31036t == lVar4);
            }
        }
        if (a(m71Var, 68719476736L)) {
            hVar.f30483a.u = m71Var.u;
        }
        if (a(m71Var, 262144L)) {
            hVar.f30483a.v = m71Var.v;
        }
        if (a(m71Var, 524288L)) {
            hVar.f30483a.f31037w = m71Var.f31037w;
        }
        if (a(m71Var, 2097152L)) {
            hVar.f30483a.f31039y = m71Var.f31039y;
        }
        if (a(m71Var, 4194304L)) {
            hVar.f30483a.z = m71Var.z;
        }
        if (a(m71Var, 8388608L)) {
            hVar.f30483a.A = m71Var.A;
        }
        if (a(m71Var, 16777216L)) {
            hVar.f30483a.B = m71Var.B;
        }
        if (a(m71Var, 33554432L)) {
            hVar.f30483a.C = m71Var.C;
        }
        if (a(m71Var, FileSize.MB_COEFFICIENT)) {
            hVar.f30483a.f31038x = m71Var.f31038x;
        }
        if (a(m71Var, 268435456L)) {
            hVar.f30483a.F = m71Var.F;
        }
        if (a(m71Var, 536870912L)) {
            hVar.f30483a.G = m71Var.G;
        }
        if (a(m71Var, FileSize.GB_COEFFICIENT)) {
            hVar.f30483a.H = m71Var.H;
        }
        if (a(m71Var, 67108864L)) {
            hVar.f30483a.D = m71Var.D;
        }
        if (a(m71Var, 134217728L)) {
            hVar.f30483a.E = m71Var.E;
        }
        if (a(m71Var, 8589934592L)) {
            hVar.f30483a.K = m71Var.K;
        }
        if (a(m71Var, 17179869184L)) {
            hVar.f30483a.L = m71Var.L;
        }
        if (a(m71Var, 137438953472L)) {
            hVar.f30483a.N = m71Var.N;
        }
        if (a(m71Var, 274877906944L)) {
            hVar.f30483a.O = m71Var.O;
        }
        if (a(m71Var, 549755813888L)) {
            hVar.f30483a.P = m71Var.P;
        }
        if (a(m71Var, 562949953421312L)) {
            hVar.f30483a.Q = m71Var.Q;
            hVar.i.a(m71Var.Q);
        }
        if (a(m71Var, 35184372088832L)) {
            hVar.f30483a.W = m71Var.W;
            hVar.i.a(m71Var.W);
        }
        if (a(m71Var, 1099511627776L)) {
            hVar.f30483a.R = m71Var.R;
            hVar.i.a(m71Var.R);
        }
        if (a(m71Var, 2199023255552L)) {
            hVar.f30483a.S = m71Var.S;
            hVar.i.a(m71Var.S);
        }
        if (a(m71Var, 4398046511104L)) {
            hVar.f30483a.T = m71Var.T;
            hVar.i.a(m71Var.T);
        }
        if (a(m71Var, 8796093022208L)) {
            hVar.f30483a.U = m71Var.U;
            hVar.i.a(m71Var.U);
        }
        if (a(m71Var, 17592186044416L)) {
            hVar.f30483a.V = m71Var.V;
            hVar.i.a(m71Var.V);
        }
        if (f30449n && a(m71Var, 1125899906842624L)) {
            hVar.f30483a.X = m71Var.X;
            hVar.f30488j.a(m71Var.X);
        }
        if (a(m71Var, 70368744177664L)) {
            hVar.f30483a.Y = m71Var.Y;
        }
        if (a(m71Var, 140737488355328L)) {
            hVar.f30483a.Z = m71Var.Z;
        }
        if (a(m71Var, 281474976710656L)) {
            hVar.f30483a.f31022a0 = m71Var.f31022a0;
        }
        if (a(m71Var, 4503599627370496L)) {
            hVar.f30483a.f31024b0 = m71Var.f31024b0;
            if (f30448m) {
                hVar.f30486g.setLetterSpacing(m71Var.f31024b0.a(this) / f());
                hVar.f30487h.setLetterSpacing(m71Var.f31024b0.a(this) / f());
            }
        }
        if (a(m71Var, 9007199254740992L)) {
            hVar.f30483a.c0 = m71Var.c0;
            if (f30450p) {
                hVar.f30486g.setWordSpacing(m71Var.c0.a(this));
                hVar.f30487h.setWordSpacing(m71Var.c0.a(this));
            }
        }
    }

    private void a(h hVar, boolean z, lz0.o0 o0Var) {
        int i2;
        float fFloatValue = (z ? hVar.f30483a.d : hVar.f30483a.f).floatValue();
        if (o0Var instanceof lz0.g) {
            i2 = ((lz0.g) o0Var).f30845a;
        } else if (!(o0Var instanceof lz0.h)) {
            return;
        } else {
            i2 = hVar.f30483a.f31031n.f30845a;
        }
        int iA = a(i2, fFloatValue);
        if (z) {
            hVar.f30486g.setColor(iA);
        } else {
            hVar.f30487h.setColor(iA);
        }
    }

    private Typeface a(String str, Float f4, m71.e eVar) {
        int i2;
        boolean z = eVar == m71.e.italic;
        i2 = f4.floatValue() >= 700.0f ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
            case "fantasy":
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            default:
                return null;
        }
    }

    private static int a(float f4) {
        int i2 = (int) (f4 * 256.0f);
        if (i2 < 0) {
            return 0;
        }
        return Math.min(i2, 255);
    }

    private static int a(int i2, float f4) {
        int iRound = Math.round(((i2 >> 24) & 255) * f4);
        return (i2 & 16777215) | ((iRound < 0 ? 0 : Math.min(iRound, 255)) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(float f4, float f5, float f6, float f32, float f35, boolean z, boolean z3, float f36, float f37, lz0.y yVar) {
        float f41 = f36;
        if (f4 == f41 && f5 == f37) {
            return;
        }
        if (f6 == BitmapDescriptorFactory.HUE_RED) {
            f41 = f36;
        } else if (f32 != BitmapDescriptorFactory.HUE_RED) {
            float fAbs = Math.abs(f6);
            float fAbs2 = Math.abs(f32);
            double radians = Math.toRadians(((double) f35) % 360.0d);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d5 = ((double) (f4 - f41)) / 2.0d;
            double d6 = ((double) (f5 - f37)) / 2.0d;
            double d10 = (dCos * d5) + (dSin * d6);
            double d15 = ((-dSin) * d5) + (d6 * dCos);
            double d41 = fAbs * fAbs;
            double d51 = fAbs2 * fAbs2;
            double d68 = d10 * d10;
            double d81 = d15 * d15;
            double d82 = (d68 / d41) + (d81 / d51);
            if (d82 > 0.99999d) {
                double dSqrt = Math.sqrt(d82) * 1.00001d;
                fAbs = (float) (((double) fAbs) * dSqrt);
                fAbs2 = (float) (dSqrt * ((double) fAbs2));
                d41 = fAbs * fAbs;
                d51 = fAbs2 * fAbs2;
            }
            double d95 = z == z3 ? -1.0d : 1.0d;
            double d100 = d41 * d51;
            double d101 = d41 * d81;
            double d102 = d51 * d68;
            double d103 = ((d100 - d101) - d102) / (d101 + d102);
            if (d103 < 0.0d) {
                d103 = 0.0d;
            }
            double dSqrt2 = d95 * Math.sqrt(d103);
            double d104 = fAbs;
            double d105 = fAbs2;
            double d106 = ((d104 * d15) / d105) * dSqrt2;
            double d107 = dSqrt2 * (-((d105 * d10) / d104));
            double d108 = (((double) (f4 + f41)) / 2.0d) + ((dCos * d106) - (dSin * d107));
            double d109 = (((double) (f5 + f37)) / 2.0d) + (dSin * d106) + (dCos * d107);
            double d110 = (d10 - d106) / d104;
            double d111 = (d15 - d107) / d105;
            double d112 = ((-d10) - d106) / d104;
            double d113 = ((-d15) - d107) / d105;
            double d114 = (d110 * d110) + (d111 * d111);
            double dAcos = (d111 < 0.0d ? -1.0d : 1.0d) * Math.acos(d110 / Math.sqrt(d114));
            double dA = ((d110 * d113) - (d111 * d112) < 0.0d ? -1.0d : 1.0d) * a(((d110 * d112) + (d111 * d113)) / Math.sqrt(d114 * ((d112 * d112) + (d113 * d113))));
            if (dA == 0.0d) {
                yVar.lineTo(f41, f37);
                return;
            }
            if (!z3 && dA > 0.0d) {
                dA -= 6.283185307179586d;
            } else if (z3 && dA < 0.0d) {
                dA += 6.283185307179586d;
            }
            float[] fArrA = a(dAcos % 6.283185307179586d, dA % 6.283185307179586d);
            Matrix matrix = new Matrix();
            matrix.postScale(fAbs, fAbs2);
            matrix.postRotate(f35);
            matrix.postTranslate((float) d108, (float) d109);
            matrix.mapPoints(fArrA);
            fArrA[fArrA.length - 2] = f36;
            fArrA[fArrA.length - 1] = f37;
            for (int i2 = 0; i2 < fArrA.length; i2 += 6) {
                yVar.cubicTo(fArrA[i2], fArrA[i2 + 1], fArrA[i2 + 2], fArrA[i2 + 3], fArrA[i2 + 4], fArrA[i2 + 5]);
            }
            return;
        }
        yVar.lineTo(f41, f37);
    }

    private static double a(double d5) {
        if (d5 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d5 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d5);
    }

    private static float[] a(double d5, double d6) {
        int iCeil = (int) Math.ceil((Math.abs(d6) * 2.0d) / 3.141592653589793d);
        double d10 = d6 / ((double) iCeil);
        double d15 = d10 / 2.0d;
        double dSin = (Math.sin(d15) * 1.3333333333333333d) / (Math.cos(d15) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d41 = d5 + (((double) i2) * d10);
            double dCos = Math.cos(d41);
            double dSin2 = Math.sin(d41);
            float[] fArr2 = fArr;
            fArr2[i3] = (float) (dCos - (dSin * dSin2));
            fArr2[i3 + 1] = (float) (dSin2 + (dCos * dSin));
            double d51 = d41 + d10;
            double dCos2 = Math.cos(d51);
            double dSin3 = Math.sin(d51);
            fArr2[i3 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i3 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i5 = i3 + 5;
            fArr2[i3 + 4] = (float) dCos2;
            i3 += 6;
            fArr2[i5] = (float) dSin3;
            i2++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void a(lz0.m mVar) {
        lz0.s sVar;
        lz0.s sVar2;
        lz0.s sVar3;
        List listA;
        int size;
        m71 m71Var = this.d.f30483a;
        String str = m71Var.f31039y;
        if (str == null && m71Var.z == null && m71Var.A == null) {
            return;
        }
        if (str == null) {
            sVar = null;
        } else {
            lz0.n0 n0VarC = mVar.f30870a.c(str);
            if (n0VarC != null) {
                sVar = (lz0.s) n0VarC;
            } else {
                b("Marker reference '%s' not found", this.d.f30483a.f31039y);
                sVar = null;
            }
        }
        String str2 = this.d.f30483a.z;
        if (str2 == null) {
            sVar2 = null;
        } else {
            lz0.n0 n0VarC2 = mVar.f30870a.c(str2);
            if (n0VarC2 != null) {
                sVar2 = (lz0.s) n0VarC2;
            } else {
                b("Marker reference '%s' not found", this.d.f30483a.z);
                sVar2 = null;
            }
        }
        String str3 = this.d.f30483a.A;
        if (str3 == null) {
            sVar3 = null;
        } else {
            lz0.n0 n0VarC3 = mVar.f30870a.c(str3);
            if (n0VarC3 != null) {
                sVar3 = (lz0.s) n0VarC3;
            } else {
                b("Marker reference '%s' not found", this.d.f30483a.A);
                sVar3 = null;
            }
        }
        if (mVar instanceof lz0.w) {
            listA = new b(((lz0.w) mVar).o).a();
        } else if (mVar instanceof lz0.r) {
            listA = a((lz0.r) mVar);
        } else {
            listA = a((lz0.a0) mVar);
        }
        if (listA == null || (size = listA.size()) == 0) {
            return;
        }
        m71 m71Var2 = this.d.f30483a;
        m71Var2.A = null;
        m71Var2.z = null;
        m71Var2.f31039y = null;
        if (sVar != null) {
            a(sVar, (c) listA.get(0));
        }
        if (sVar2 != null && listA.size() > 2) {
            c cVarA = (c) listA.get(0);
            c cVar = (c) listA.get(1);
            int i2 = 1;
            while (i2 < size - 1) {
                i2++;
                c cVar2 = (c) listA.get(i2);
                cVarA = cVar.e ? a(cVarA, cVar, cVar2) : cVar;
                a(sVar2, cVarA);
                cVar = cVar2;
            }
        }
        if (sVar3 != null) {
            a(sVar3, (c) listA.get(size - 1));
        }
    }

    private c a(c cVar, c cVar2, c cVar3) {
        float fA = a(cVar2.f30473c, cVar2.d, cVar2.f30471a - cVar.f30471a, cVar2.f30472b - cVar.f30472b);
        if (fA == BitmapDescriptorFactory.HUE_RED) {
            fA = a(cVar2.f30473c, cVar2.d, cVar3.f30471a - cVar2.f30471a, cVar3.f30472b - cVar2.f30472b);
        }
        if (fA > BitmapDescriptorFactory.HUE_RED || (fA == BitmapDescriptorFactory.HUE_RED && (cVar2.f30473c > BitmapDescriptorFactory.HUE_RED || cVar2.d >= BitmapDescriptorFactory.HUE_RED))) {
            return cVar2;
        }
        cVar2.f30473c = -cVar2.f30473c;
        cVar2.d = -cVar2.d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fourthline.orca.internal.lz0.s r12, com.fourthline.orca.internal.kz0.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kz0.a(com.fourthline.orca.internal.lz0$s, com.fourthline.orca.internal.kz0$c):void");
    }

    private h a(lz0.n0 n0Var, h hVar) {
        int i2;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i2 = 0;
            if (n0Var instanceof lz0.l0) {
                arrayList.add(0, (lz0.l0) n0Var);
            }
            Object obj2 = n0Var.f30871b;
            if (obj2 == null) {
                break;
            }
            n0Var = (lz0.n0) obj2;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            a(hVar, (lz0.l0) obj3);
        }
        h hVar2 = this.d;
        hVar.e = hVar2.e;
        hVar.d = hVar2.d;
        return hVar;
    }

    private void a(boolean z, lz0.c cVar, lz0.v vVar) {
        lz0.n0 n0VarC = this.f30460c.c(vVar.f30899a);
        if (n0VarC == null) {
            b("%s reference '%s' not found", z ? "Fill" : "Stroke", vVar.f30899a);
            lz0.o0 o0Var = vVar.f30900b;
            if (o0Var != null) {
                a(this.d, z, o0Var);
                return;
            } else if (z) {
                this.d.f30484b = false;
                return;
            } else {
                this.d.f30485c = false;
                return;
            }
        }
        if (n0VarC instanceof lz0.m0) {
            a(z, cVar, (lz0.m0) n0VarC);
        } else if (n0VarC instanceof lz0.q0) {
            a(z, cVar, (lz0.q0) n0VarC);
        } else if (n0VarC instanceof lz0.d0) {
            a(z, (lz0.d0) n0VarC);
        }
    }

    private void a(boolean z, lz0.c cVar, lz0.m0 m0Var) {
        float fA;
        float fC;
        float fB;
        float f4;
        float fC2;
        float f5;
        float f6;
        int i2;
        String str = m0Var.f30859l;
        if (str != null) {
            a(m0Var, str);
        }
        Boolean bool = m0Var.i;
        int i3 = 0;
        boolean z3 = bool != null && bool.booleanValue();
        Paint paint = z ? this.d.f30486g : this.d.f30487h;
        if (z3) {
            lz0.q qVar = m0Var.f30867m;
            fA = qVar != null ? qVar.b(this) : BitmapDescriptorFactory.HUE_RED;
            lz0.q qVar2 = m0Var.f30868n;
            fC = qVar2 != null ? qVar2.c(this) : BitmapDescriptorFactory.HUE_RED;
            lz0.q qVar3 = m0Var.o;
            if (qVar3 == null) {
                qVar3 = lz0.q.d;
            }
            fB = qVar3.b(this);
            lz0.q qVar4 = m0Var.f30869p;
            if (qVar4 != null) {
                f4 = fA;
                f5 = fC;
                f6 = fB;
                fC2 = qVar4.c(this);
            } else {
                f4 = fA;
                f5 = fC;
                f6 = fB;
                fC2 = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            lz0.q qVar5 = m0Var.f30867m;
            fA = qVar5 != null ? qVar5.a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            lz0.q qVar6 = m0Var.f30868n;
            float fA2 = qVar6 != null ? qVar6.a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            lz0.q qVar7 = m0Var.o;
            float fA3 = qVar7 != null ? qVar7.a(this, 1.0f) : 1.0f;
            lz0.q qVar8 = m0Var.f30869p;
            if (qVar8 != null) {
                float fA4 = qVar8.a(this, 1.0f);
                f4 = fA;
                fC2 = fA4;
                f5 = fA2;
                f6 = fA3;
            } else {
                fC = fA2;
                fB = fA3;
                f4 = fA;
                f5 = fC;
                f6 = fB;
                fC2 = BitmapDescriptorFactory.HUE_RED;
            }
        }
        r();
        this.d = b(m0Var);
        Matrix matrix = new Matrix();
        if (!z3) {
            matrix.preTranslate(cVar.f30812a, cVar.f30813b);
            matrix.preScale(cVar.f30814c, cVar.d);
        }
        Matrix matrix2 = m0Var.f30858j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f30857h.size();
        if (size == 0) {
            q();
            if (z) {
                this.d.f30484b = false;
                return;
            } else {
                this.d.f30485c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it8 = m0Var.f30857h.iterator();
        float f32 = -1.0f;
        while (it8.hasNext()) {
            lz0.e0 e0Var = (lz0.e0) ((lz0.n0) it8.next());
            Float f35 = e0Var.f30832h;
            float fFloatValue = f35 != null ? f35.floatValue() : BitmapDescriptorFactory.HUE_RED;
            if (i3 != 0 && fFloatValue < f32) {
                fArr[i3] = f32;
            } else {
                fArr[i3] = fFloatValue;
                f32 = fFloatValue;
            }
            r();
            a(this.d, e0Var);
            m71 m71Var = this.d.f30483a;
            lz0.g gVar = (lz0.g) m71Var.D;
            if (gVar == null) {
                gVar = lz0.g.f30843b;
            }
            iArr[i3] = a(gVar.f30845a, m71Var.E.floatValue());
            i3++;
            q();
        }
        if (f4 == f6 && f5 == fC2) {
            i2 = 1;
        } else {
            i2 = 1;
            if (size != 1) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                lz0.l lVar = m0Var.k;
                if (lVar != null) {
                    if (lVar == lz0.l.reflect) {
                        tileMode = Shader.TileMode.MIRROR;
                    } else if (lVar == lz0.l.repeat) {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                }
                Shader.TileMode tileMode2 = tileMode;
                q();
                LinearGradient linearGradient = new LinearGradient(f4, f5, f6, fC2, iArr, fArr, tileMode2);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                paint.setAlpha(a(this.d.f30483a.d.floatValue()));
                return;
            }
        }
        q();
        paint.setColor(iArr[size - i2]);
    }

    private void a(boolean z, lz0.c cVar, lz0.q0 q0Var) {
        float f4;
        float f5;
        float f6;
        float fA;
        float fB;
        float fA2;
        float fC;
        float fC2;
        float fB2;
        float fA3;
        long[] jArr;
        RadialGradient radialGradient;
        String str = q0Var.f30859l;
        if (str != null) {
            a(q0Var, str);
        }
        Boolean bool = q0Var.i;
        int i2 = 0;
        boolean z3 = bool != null && bool.booleanValue();
        Paint paint = z ? this.d.f30486g : this.d.f30487h;
        if (z3) {
            lz0.q qVar = new lz0.q(50.0f, lz0.d1.percent);
            lz0.q qVar2 = q0Var.f30880m;
            fB = qVar2 != null ? qVar2.b(this) : qVar.b(this);
            lz0.q qVar3 = q0Var.f30881n;
            fC2 = qVar3 != null ? qVar3.c(this) : qVar.c(this);
            lz0.q qVar4 = q0Var.o;
            fA2 = qVar4 != null ? qVar4.a(this) : qVar.a(this);
            if (f30452r) {
                lz0.q qVar5 = q0Var.f30882p;
                fB2 = qVar5 != null ? qVar5.b(this) : fB;
                lz0.q qVar6 = q0Var.f30883q;
                fC = qVar6 != null ? qVar6.c(this) : fC2;
                lz0.q qVar7 = q0Var.f30884r;
                if (qVar7 != null) {
                    f6 = fA2;
                    f4 = fB;
                    f5 = fC2;
                    fA3 = qVar7.a(this);
                    fA = fB2;
                } else {
                    f6 = fA2;
                    f4 = fB;
                    f5 = fC2;
                    fA = fB2;
                    fA3 = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                f6 = fA2;
                f4 = fB;
                f5 = fC2;
                fA3 = BitmapDescriptorFactory.HUE_RED;
                fC = BitmapDescriptorFactory.HUE_RED;
                fA = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            lz0.q qVar8 = q0Var.f30880m;
            float fA4 = qVar8 != null ? qVar8.a(this, 1.0f) : 0.5f;
            lz0.q qVar9 = q0Var.f30881n;
            float fA5 = qVar9 != null ? qVar9.a(this, 1.0f) : 0.5f;
            lz0.q qVar10 = q0Var.o;
            float fA6 = qVar10 != null ? qVar10.a(this, 1.0f) : 0.5f;
            if (f30452r) {
                lz0.q qVar11 = q0Var.f30882p;
                fA = qVar11 != null ? qVar11.a(this, 1.0f) : 0.5f;
                lz0.q qVar12 = q0Var.f30883q;
                float fA7 = qVar12 != null ? qVar12.a(this, 1.0f) : 0.5f;
                lz0.q qVar13 = q0Var.f30884r;
                if (qVar13 != null) {
                    fA3 = qVar13.a(this, 1.0f);
                    f4 = fA4;
                    f5 = fA5;
                    f6 = fA6;
                    fC = fA7;
                } else {
                    float f32 = fA7;
                    fB = fA4;
                    fA2 = fA6;
                    fC = f32;
                    fC2 = fA5;
                    fB2 = fA;
                    f6 = fA2;
                    f4 = fB;
                    f5 = fC2;
                    fA = fB2;
                    fA3 = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                f4 = fA4;
                f5 = fA5;
                f6 = fA6;
                fA3 = BitmapDescriptorFactory.HUE_RED;
                fC = BitmapDescriptorFactory.HUE_RED;
                fA = BitmapDescriptorFactory.HUE_RED;
            }
        }
        r();
        this.d = b(q0Var);
        Matrix matrix = new Matrix();
        if (!z3) {
            matrix.preTranslate(cVar.f30812a, cVar.f30813b);
            matrix.preScale(cVar.f30814c, cVar.d);
        }
        Matrix matrix2 = q0Var.f30858j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f30857h.size();
        if (size == 0) {
            q();
            if (z) {
                this.d.f30484b = false;
                return;
            } else {
                this.d.f30485c = false;
                return;
            }
        }
        int[] iArr = null;
        if (f30452r) {
            jArr = new long[size];
        } else {
            jArr = null;
            iArr = new int[size];
        }
        float[] fArr = new float[size];
        Iterator it8 = q0Var.f30857h.iterator();
        float f35 = -1.0f;
        while (it8.hasNext()) {
            lz0.e0 e0Var = (lz0.e0) ((lz0.n0) it8.next());
            Float f36 = e0Var.f30832h;
            float fFloatValue = f36 != null ? f36.floatValue() : 0.0f;
            if (i2 != 0 && fFloatValue < f35) {
                fArr[i2] = f35;
            } else {
                fArr[i2] = fFloatValue;
                f35 = fFloatValue;
            }
            r();
            a(this.d, e0Var);
            m71 m71Var = this.d.f30483a;
            lz0.g gVar = (lz0.g) m71Var.D;
            if (gVar == null) {
                gVar = lz0.g.f30843b;
            }
            if (f30452r) {
                jArr[i2] = Color.pack(a(gVar.f30845a, m71Var.E.floatValue()));
            } else {
                iArr[i2] = a(gVar.f30845a, m71Var.E.floatValue());
            }
            i2++;
            q();
        }
        if (f6 != BitmapDescriptorFactory.HUE_RED && size != 1) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            lz0.l lVar = q0Var.k;
            if (lVar != null) {
                if (lVar == lz0.l.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (lVar == lz0.l.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            q();
            if (f30452r) {
                radialGradient = com.fourthline.core.internal.j0.a(fA, fC, fA3, f4, f5, f6, jArr, fArr, tileMode2);
            } else {
                radialGradient = new RadialGradient(f4, f5, f6, iArr, fArr, tileMode2);
            }
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(a(this.d.f30483a.d.floatValue()));
            return;
        }
        int[] iArr2 = iArr;
        q();
        paint.setColor(iArr2[size - 1]);
    }

    private void a(lz0.k kVar, String str) {
        lz0.n0 n0VarC = kVar.f30870a.c(str);
        if (n0VarC == null) {
            c("Gradient reference '%s' not found", str);
            return;
        }
        if (!(n0VarC instanceof lz0.k)) {
            b("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n0VarC == kVar) {
            b("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        lz0.k kVar2 = (lz0.k) n0VarC;
        if (kVar.i == null) {
            kVar.i = kVar2.i;
        }
        if (kVar.f30858j == null) {
            kVar.f30858j = kVar2.f30858j;
        }
        if (kVar.k == null) {
            kVar.k = kVar2.k;
        }
        if (kVar.f30857h.isEmpty()) {
            kVar.f30857h = kVar2.f30857h;
        }
        try {
            if (kVar instanceof lz0.m0) {
                a((lz0.m0) kVar, (lz0.m0) n0VarC);
            } else {
                a((lz0.q0) kVar, (lz0.q0) n0VarC);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = kVar2.f30859l;
        if (str2 != null) {
            a(kVar, str2);
        }
    }

    private void a(lz0.m0 m0Var, lz0.m0 m0Var2) {
        if (m0Var.f30867m == null) {
            m0Var.f30867m = m0Var2.f30867m;
        }
        if (m0Var.f30868n == null) {
            m0Var.f30868n = m0Var2.f30868n;
        }
        if (m0Var.o == null) {
            m0Var.o = m0Var2.o;
        }
        if (m0Var.f30869p == null) {
            m0Var.f30869p = m0Var2.f30869p;
        }
    }

    private void a(lz0.q0 q0Var, lz0.q0 q0Var2) {
        if (q0Var.f30880m == null) {
            q0Var.f30880m = q0Var2.f30880m;
        }
        if (q0Var.f30881n == null) {
            q0Var.f30881n = q0Var2.f30881n;
        }
        if (q0Var.o == null) {
            q0Var.o = q0Var2.o;
        }
        if (q0Var.f30882p == null) {
            q0Var.f30882p = q0Var2.f30882p;
        }
        if (q0Var.f30883q == null) {
            q0Var.f30883q = q0Var2.f30883q;
        }
        if (q0Var.f30884r == null) {
            q0Var.f30884r = q0Var2.f30884r;
        }
    }

    private void a(boolean z, lz0.d0 d0Var) {
        if (z) {
            if (a(d0Var.e, 2147483648L)) {
                h hVar = this.d;
                m71 m71Var = hVar.f30483a;
                lz0.o0 o0Var = d0Var.e.I;
                m71Var.f31023b = o0Var;
                hVar.f30484b = o0Var != null;
            }
            if (a(d0Var.e, 4294967296L)) {
                this.d.f30483a.d = d0Var.e.J;
            }
            if (a(d0Var.e, 6442450944L)) {
                h hVar2 = this.d;
                a(hVar2, z, hVar2.f30483a.f31023b);
                return;
            }
            return;
        }
        if (a(d0Var.e, 2147483648L)) {
            h hVar3 = this.d;
            m71 m71Var2 = hVar3.f30483a;
            lz0.o0 o0Var2 = d0Var.e.I;
            m71Var2.e = o0Var2;
            hVar3.f30485c = o0Var2 != null;
        }
        if (a(d0Var.e, 4294967296L)) {
            this.d.f30483a.f = d0Var.e.J;
        }
        if (a(d0Var.e, 6442450944L)) {
            h hVar4 = this.d;
            a(hVar4, z, hVar4.f30483a.e);
        }
    }

    private void a(lz0.k0 k0Var) {
        b(k0Var, k0Var.f30860h);
    }

    private Path a(lz0.k0 k0Var, lz0.c cVar) {
        Path pathA;
        lz0.n0 n0VarC = k0Var.f30870a.c(this.d.f30483a.F);
        if (n0VarC == null) {
            b("ClipPath reference '%s' not found", this.d.f30483a.F);
            return null;
        }
        if (n0VarC.g() != "clipPath") {
            return null;
        }
        lz0.f fVar = (lz0.f) n0VarC;
        this.e.push(this.d);
        this.d = b((lz0.n0) fVar);
        Boolean bool = fVar.f30838p;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(cVar.f30812a, cVar.f30813b);
            matrix.preScale(cVar.f30814c, cVar.d);
        }
        Matrix matrix2 = fVar.o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (lz0.n0 n0Var : fVar.i) {
            if ((n0Var instanceof lz0.k0) && (pathA = a((lz0.k0) n0Var, true)) != null) {
                path.op(pathA, Path.Op.UNION);
            }
        }
        if (this.d.f30483a.F != null) {
            if (fVar.f30860h == null) {
                fVar.f30860h = a(path);
            }
            Path pathA2 = a(fVar, fVar.f30860h);
            if (pathA2 != null) {
                path.op(pathA2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = (h) this.e.pop();
        return path;
    }

    private Path a(lz0.k0 k0Var, boolean z) {
        Path pathA;
        Path pathA2;
        this.e.push(this.d);
        h hVar = new h(this.d);
        this.d = hVar;
        a(hVar, k0Var);
        if (c() && t()) {
            if (k0Var instanceof lz0.e1) {
                if (!z) {
                    b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                lz0.e1 e1Var = (lz0.e1) k0Var;
                lz0.n0 n0VarC = k0Var.f30870a.c(e1Var.f30833p);
                if (n0VarC == null) {
                    b("Use reference '%s' not found", e1Var.f30833p);
                    this.d = (h) this.e.pop();
                    return null;
                }
                if (!(n0VarC instanceof lz0.k0)) {
                    this.d = (h) this.e.pop();
                    return null;
                }
                pathA = a((lz0.k0) n0VarC, false);
                if (pathA == null) {
                    return null;
                }
                if (e1Var.f30860h == null) {
                    e1Var.f30860h = a(pathA);
                }
                Matrix matrix = e1Var.o;
                if (matrix != null) {
                    pathA.transform(matrix);
                }
            } else if (k0Var instanceof lz0.m) {
                lz0.m mVar = (lz0.m) k0Var;
                if (k0Var instanceof lz0.w) {
                    pathA = new d(((lz0.w) k0Var).o).a();
                    if (k0Var.f30860h == null) {
                        k0Var.f30860h = a(pathA);
                    }
                } else {
                    pathA = k0Var instanceof lz0.c0 ? a((lz0.c0) k0Var) : k0Var instanceof lz0.e ? a((lz0.e) k0Var) : k0Var instanceof lz0.j ? a((lz0.j) k0Var) : k0Var instanceof lz0.a0 ? b((lz0.a0) k0Var) : null;
                }
                if (pathA == null) {
                    return null;
                }
                if (mVar.f30860h == null) {
                    mVar.f30860h = a(pathA);
                }
                Matrix matrix2 = mVar.f30866n;
                if (matrix2 != null) {
                    pathA.transform(matrix2);
                }
                pathA.setFillType(e());
            } else if (k0Var instanceof lz0.w0) {
                lz0.w0 w0Var = (lz0.w0) k0Var;
                pathA = a(w0Var);
                Matrix matrix3 = w0Var.f30903s;
                if (matrix3 != null) {
                    pathA.transform(matrix3);
                }
                pathA.setFillType(e());
            } else {
                b("Invalid %s element found in clipPath definition", k0Var.g());
                return null;
            }
            if (this.d.f30483a.F != null && (pathA2 = a(k0Var, k0Var.f30860h)) != null) {
                pathA.op(pathA2, Path.Op.INTERSECT);
            }
            this.d = (h) this.e.pop();
            return pathA;
        }
        this.d = (h) this.e.pop();
        return null;
    }

    private void a(lz0.n0 n0Var, boolean z, Path path, Matrix matrix) {
        if (c()) {
            b();
            if (n0Var instanceof lz0.e1) {
                if (z) {
                    a((lz0.e1) n0Var, path, matrix);
                } else {
                    b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (n0Var instanceof lz0.w) {
                a((lz0.w) n0Var, path, matrix);
            } else if (n0Var instanceof lz0.w0) {
                a((lz0.w0) n0Var, path, matrix);
            } else if (n0Var instanceof lz0.m) {
                a((lz0.m) n0Var, path, matrix);
            } else {
                b("Invalid %s element found in clipPath definition", n0Var.toString());
            }
            a();
        }
    }

    private void a() {
        this.f30458a.restore();
        this.d = (h) this.e.pop();
    }

    private void a(lz0.w wVar, Path path, Matrix matrix) {
        a(this.d, wVar);
        if (c() && t()) {
            Matrix matrix2 = wVar.f30866n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path pathA = new d(wVar.o).a();
            if (wVar.f30860h == null) {
                wVar.f30860h = a(pathA);
            }
            a((lz0.k0) wVar);
            path.setFillType(e());
            path.addPath(pathA, matrix);
        }
    }

    private void a(lz0.m mVar, Path path, Matrix matrix) {
        Path pathB;
        a(this.d, mVar);
        if (c() && t()) {
            Matrix matrix2 = mVar.f30866n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (mVar instanceof lz0.c0) {
                pathB = a((lz0.c0) mVar);
            } else if (mVar instanceof lz0.e) {
                pathB = a((lz0.e) mVar);
            } else if (mVar instanceof lz0.j) {
                pathB = a((lz0.j) mVar);
            } else if (!(mVar instanceof lz0.a0)) {
                return;
            } else {
                pathB = b((lz0.a0) mVar);
            }
            if (pathB == null) {
                return;
            }
            a((lz0.k0) mVar);
            path.setFillType(e());
            path.addPath(pathB, matrix);
        }
    }

    private void a(lz0.e1 e1Var, Path path, Matrix matrix) {
        a(this.d, e1Var);
        if (c() && t()) {
            Matrix matrix2 = e1Var.o;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            lz0.n0 n0VarC = e1Var.f30870a.c(e1Var.f30833p);
            if (n0VarC == null) {
                b("Use reference '%s' not found", e1Var.f30833p);
            } else {
                a((lz0.k0) e1Var);
                a(n0VarC, false, path, matrix);
            }
        }
    }

    private void a(lz0.w0 w0Var, Path path, Matrix matrix) {
        a(this.d, w0Var);
        if (c()) {
            Matrix matrix2 = w0Var.f30903s;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List list = w0Var.o;
            float fC = BitmapDescriptorFactory.HUE_RED;
            float fB = (list == null || list.size() == 0) ? 0.0f : ((lz0.q) w0Var.o.get(0)).b(this);
            List list2 = w0Var.f30808p;
            float fC2 = (list2 == null || list2.size() == 0) ? 0.0f : ((lz0.q) w0Var.f30808p.get(0)).c(this);
            List list3 = w0Var.f30809q;
            float fB2 = (list3 == null || list3.size() == 0) ? 0.0f : ((lz0.q) w0Var.f30809q.get(0)).b(this);
            List list4 = w0Var.f30810r;
            if (list4 != null && list4.size() != 0) {
                fC = ((lz0.q) w0Var.f30810r.get(0)).c(this);
            }
            if (this.d.f30483a.v != m71.k.Start) {
                float fA = a((lz0.y0) w0Var);
                if (this.d.f30483a.v == m71.k.Middle) {
                    fA /= 2.0f;
                }
                fB -= fA;
            }
            if (w0Var.f30860h == null) {
                i iVar = new i(fB, fC2);
                a((lz0.y0) w0Var, (j) iVar);
                RectF rectF = iVar.f30491c;
                w0Var.f30860h = new lz0.c(rectF.left, rectF.top, rectF.width(), iVar.f30491c.height());
            }
            a((lz0.k0) w0Var);
            Path path2 = new Path();
            a((lz0.y0) w0Var, new g(fB + fB2, fC2 + fC, path2));
            path.setFillType(e());
            path.addPath(path2, matrix);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Path a(com.fourthline.orca.internal.lz0.c0 r21) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kz0.a(com.fourthline.orca.internal.lz0$c0):android.graphics.Path");
    }

    private Path a(lz0.e eVar) {
        lz0.q qVar = eVar.o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = qVar != null ? qVar.b(this) : 0.0f;
        lz0.q qVar2 = eVar.f30830p;
        if (qVar2 != null) {
            fC = qVar2.c(this);
        }
        float f4 = fC;
        float fA = eVar.f30831q.a(this);
        float f5 = fB - fA;
        float f6 = f4 - fA;
        float f32 = fB + fA;
        float f35 = f4 + fA;
        if (eVar.f30860h == null) {
            float f36 = 2.0f * fA;
            eVar.f30860h = new lz0.c(f5, f6, f36, f36);
        }
        float f37 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fB, f6);
        float f41 = fB + f37;
        float f42 = f4 - f37;
        path.cubicTo(f41, f6, f32, f42, f32, f4);
        float f57 = f4 + f37;
        path.cubicTo(f32, f57, f41, f35, fB, f35);
        float f69 = fB - f37;
        path.cubicTo(f69, f35, f5, f57, f5, f4);
        path.cubicTo(f5, f42, f69, f6, fB, f6);
        path.close();
        return path;
    }

    private Path a(lz0.j jVar) {
        lz0.q qVar = jVar.o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = qVar != null ? qVar.b(this) : 0.0f;
        lz0.q qVar2 = jVar.f30854p;
        if (qVar2 != null) {
            fC = qVar2.c(this);
        }
        float f4 = fC;
        float fB2 = jVar.f30855q.b(this);
        float fC2 = jVar.f30856r.c(this);
        float f5 = fB - fB2;
        float f6 = f4 - fC2;
        float f32 = fB + fB2;
        float f35 = f4 + fC2;
        if (jVar.f30860h == null) {
            jVar.f30860h = new lz0.c(f5, f6, fB2 * 2.0f, 2.0f * fC2);
        }
        float f36 = fB2 * 0.5522848f;
        float f37 = fC2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fB, f6);
        float f41 = fB + f36;
        float f42 = f4 - f37;
        path.cubicTo(f41, f6, f32, f42, f32, f4);
        float f57 = f4 + f37;
        path.cubicTo(f32, f57, f41, f35, fB, f35);
        float f69 = fB - f36;
        path.cubicTo(f69, f35, f5, f57, f5, f4);
        path.cubicTo(f5, f42, f69, f6, fB, f6);
        path.close();
        return path;
    }

    private Path a(lz0.w0 w0Var) {
        List list = w0Var.o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = (list == null || list.size() == 0) ? 0.0f : ((lz0.q) w0Var.o.get(0)).b(this);
        List list2 = w0Var.f30808p;
        float fC2 = (list2 == null || list2.size() == 0) ? 0.0f : ((lz0.q) w0Var.f30808p.get(0)).c(this);
        List list3 = w0Var.f30809q;
        float fB2 = (list3 == null || list3.size() == 0) ? 0.0f : ((lz0.q) w0Var.f30809q.get(0)).b(this);
        List list4 = w0Var.f30810r;
        if (list4 != null && list4.size() != 0) {
            fC = ((lz0.q) w0Var.f30810r.get(0)).c(this);
        }
        if (this.d.f30483a.v != m71.k.Start) {
            float fA = a((lz0.y0) w0Var);
            if (this.d.f30483a.v == m71.k.Middle) {
                fA /= 2.0f;
            }
            fB -= fA;
        }
        if (w0Var.f30860h == null) {
            i iVar = new i(fB, fC2);
            a((lz0.y0) w0Var, (j) iVar);
            RectF rectF = iVar.f30491c;
            w0Var.f30860h = new lz0.c(rectF.left, rectF.top, rectF.width(), iVar.f30491c.height());
        }
        Path path = new Path();
        a((lz0.y0) w0Var, new g(fB + fB2, fC2 + fC, path));
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fourthline.orca.internal.lz0.k0 r22, android.graphics.Path r23, com.fourthline.orca.internal.lz0.z r24) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kz0.a(com.fourthline.orca.internal.lz0$k0, android.graphics.Path, com.fourthline.orca.internal.lz0$z):void");
    }

    private void a(lz0.z zVar, String str) {
        lz0.n0 n0VarC = zVar.f30870a.c(str);
        if (n0VarC == null) {
            c("Pattern reference '%s' not found", str);
            return;
        }
        if (!(n0VarC instanceof lz0.z)) {
            b("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n0VarC == zVar) {
            b("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        lz0.z zVar2 = (lz0.z) n0VarC;
        if (zVar.f30907q == null) {
            zVar.f30907q = zVar2.f30907q;
        }
        if (zVar.f30908r == null) {
            zVar.f30908r = zVar2.f30908r;
        }
        if (zVar.f30909s == null) {
            zVar.f30909s = zVar2.f30909s;
        }
        if (zVar.f30910t == null) {
            zVar.f30910t = zVar2.f30910t;
        }
        if (zVar.u == null) {
            zVar.u = zVar2.u;
        }
        if (zVar.v == null) {
            zVar.v = zVar2.v;
        }
        if (zVar.f30911w == null) {
            zVar.f30911w = zVar2.f30911w;
        }
        if (zVar.i.isEmpty()) {
            zVar.i = zVar2.i;
        }
        if (zVar.f30888p == null) {
            zVar.f30888p = zVar2.f30888p;
        }
        if (zVar.o == null) {
            zVar.o = zVar2.o;
        }
        String str2 = zVar2.f30912x;
        if (str2 != null) {
            a(zVar, str2);
        }
    }

    private void a(lz0.t tVar, lz0.k0 k0Var, lz0.c cVar) {
        float fB;
        float fC;
        a("Mask render", new Object[0]);
        Boolean bool = tVar.o;
        if (bool != null && bool.booleanValue()) {
            lz0.q qVar = tVar.f30896s;
            fB = qVar != null ? qVar.b(this) : cVar.f30814c;
            lz0.q qVar2 = tVar.f30897t;
            fC = qVar2 != null ? qVar2.c(this) : cVar.d;
        } else {
            lz0.q qVar3 = tVar.f30896s;
            float fA = qVar3 != null ? qVar3.a(this, 1.0f) : 1.2f;
            lz0.q qVar4 = tVar.f30897t;
            float fA2 = qVar4 != null ? qVar4.a(this, 1.0f) : 1.2f;
            fB = fA * cVar.f30814c;
            fC = fA2 * cVar.d;
        }
        if (fB == BitmapDescriptorFactory.HUE_RED || fC == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        r();
        h hVarB = b((lz0.n0) tVar);
        this.d = hVarB;
        hVarB.f30483a.f31030m = Float.valueOf(1.0f);
        boolean zM = m();
        this.f30458a.save();
        Boolean bool2 = tVar.f30893p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f30458a.translate(cVar.f30812a, cVar.f30813b);
            this.f30458a.scale(cVar.f30814c, cVar.d);
        }
        a((lz0.j0) tVar, false);
        this.f30458a.restore();
        if (zM) {
            d(k0Var, cVar);
        }
        q();
    }
}
