package vp0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.h1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import or0.q;
import or0.u;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public boolean A;
    public Bitmap B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f291001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f291002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f291003c;
    public final js0.b d;
    public final Context e;
    public final js0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f291004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f291005h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f291006j;
    public final int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f291007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f291008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f291009n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f291010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f291011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f291012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f291013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f291014t;
    public final float[] u;
    public final Matrix v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final double f291015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f291017y;
    public final int[] z;

    public c(k effectView, View view, h parameters, g glProgram, js0.b onViewBecomeInvisibleCallback, js0.b onFinishCallback) {
        Intrinsics.checkNotNullParameter(effectView, "effectView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(glProgram, "glProgram");
        Intrinsics.checkNotNullParameter(onViewBecomeInvisibleCallback, "onViewBecomeInvisibleCallback");
        Intrinsics.checkNotNullParameter(onFinishCallback, "onFinishCallback");
        this.f291001a = view;
        this.f291002b = parameters;
        this.f291003c = glProgram;
        this.d = onFinishCallback;
        Context context = effectView.getContext();
        this.e = context;
        this.f = new js0.b(new vd1.a(this, onViewBecomeInvisibleCallback, 22));
        this.f291004g = BitmapDescriptorFactory.HUE_RED - (parameters.b() / 1000.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f291005h = jq0.a.b(context);
        this.i = view.getScaleX() * view.getWidth();
        this.f291006j = view.getScaleY() * view.getHeight();
        int[] iArr = new int[2];
        this.k = iArr;
        this.o = true;
        this.f291011q = view.getContext().getResources().getDisplayMetrics().density;
        this.f291012r = -1L;
        this.f291013s = true;
        this.f291014t = new float[9];
        this.u = new float[9];
        this.v = new Matrix();
        this.f291015w = Math.random();
        this.f291017y = new int[2];
        this.z = new int[1];
        u.m(view, effectView, iArr);
        if (parameters.e()) {
            this.B = q.e(view, null);
        } else {
            this.B = q.c(view);
        }
    }

    public final void a() {
        if (this.A) {
            try {
                GLES20.glDeleteBuffers(2, this.f291017y, 0);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
            try {
                GLES20.glDeleteTextures(1, this.z, 0);
            } catch (Exception e2) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
            }
        }
        Lazy lazy = h1.f169241a;
        h1.f(this.f);
        h1.f(this.d);
    }
}
