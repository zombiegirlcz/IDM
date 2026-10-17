package com.revolut.core.ui_kit.internal.views.gaugechart;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.gaugechart.a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pt0.i;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();
    public static final BlurMaskFilter.Blur Q = BlurMaskFilter.Blur.NORMAL;
    public int A;
    public float B;
    public float C;
    public float[] D;
    public float[] E;
    public int[] F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public i M;
    public float N;
    public float O;
    public float P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f57165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f57166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f57167c;
    public final Paint d;
    public final Paint e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f57168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a.b f57169h;
    public final int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f57170j;
    public final int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f57171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f57172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f57173n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f57174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f57175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f57176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f57177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f57178t;
    public float u;
    public float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f57179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f57180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f57181y;
    public SweepGradient z;

    public static final class a {
        private a() {
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.gaugechart.b$b, reason: collision with other inner class name */
    public static final class C0436b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f57182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f57183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f57184c;
        public final Path d;

        public C0436b() {
            this(0);
        }

        public C0436b(int i) {
            Path path = new Path();
            Intrinsics.checkNotNullParameter(path, "path");
            this.f57182a = BitmapDescriptorFactory.HUE_RED;
            this.f57183b = BitmapDescriptorFactory.HUE_RED;
            this.f57184c = 0;
            this.d = path;
        }
    }

    public b() {
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setMaskFilter(new BlurMaskFilter(175.0f, Q));
        this.f57165a = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f57166b = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setMaskFilter(new BlurMaskFilter(85.0f, BlurMaskFilter.Blur.NORMAL));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f57167c = paint3;
        this.d = new Paint(1);
        Paint paint4 = new Paint(1);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.e = paint4;
        this.f = new RectF();
        this.f57168g = new RectF();
        this.f57169h = new a.b();
        this.i = new int[145];
        float[] fArr = new float[145];
        for (int i = 0; i < 145; i++) {
            fArr[i] = i / SyslogConstants.LOG_LOCAL2;
        }
        this.f57170j = fArr;
        this.k = new int[5];
        this.f57171l = new float[5];
        this.f57172m = new ArrayList();
        this.f57173n = new ArrayList();
        this.v = 175.0f;
        this.f57179w = 85.0f;
        i iVar = i.TransparentReference;
        this.f57180x = iVar;
        this.A = -1;
        this.B = Float.NaN;
        this.C = Float.NaN;
        this.D = new float[0];
        this.E = new float[0];
        this.F = new int[0];
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.N = Float.NaN;
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.d.setAlpha((int) (iVar.f() * 255));
        this.f57167c.setAlpha(iVar.h());
    }

    public final void a() {
        this.f57166b.setShader(null);
        this.z = null;
        this.A = -1;
        this.B = Float.NaN;
        this.C = Float.NaN;
        this.o = BitmapDescriptorFactory.HUE_RED;
        this.f57174p = BitmapDescriptorFactory.HUE_RED;
        this.f57175q = BitmapDescriptorFactory.HUE_RED;
        this.f57176r = BitmapDescriptorFactory.HUE_RED;
        this.f57177s = BitmapDescriptorFactory.HUE_RED;
        this.f57178t = BitmapDescriptorFactory.HUE_RED;
        this.u = BitmapDescriptorFactory.HUE_RED;
        c(175.0f);
        d();
        this.e.setShader(null);
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = null;
        this.f57181y = false;
        this.f.setEmpty();
        this.f57168g.setEmpty();
        this.N = Float.NaN;
        this.O = Float.NaN;
        this.P = Float.NaN;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0253 A[EDGE_INSN: B:119:0x0253->B:86:0x0253 BREAK  A[LOOP:6: B:58:0x016f->B:85:0x024b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027a A[LOOP:8: B:91:0x0278->B:92:0x027a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r23, java.util.List r24, float r25, com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView r26) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.gaugechart.b.b(android.graphics.Canvas, java.util.List, float, com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView):void");
    }

    public final void c(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (this.v == f) {
            return;
        }
        this.v = f;
        this.f57165a.setMaskFilter(new BlurMaskFilter(this.v, Q));
    }

    public final void d() {
        float f = this.o * 0.6f;
        if (f < 85.0f) {
            f = 85.0f;
        }
        if (this.f57179w == f) {
            return;
        }
        this.f57179w = f;
        this.f57167c.setMaskFilter(new BlurMaskFilter(this.f57179w, BlurMaskFilter.Blur.NORMAL));
    }
}
