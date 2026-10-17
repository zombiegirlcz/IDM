package du0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import aw0.p8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import d27.g0;
import ir0.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import te0.w;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    public float A;
    public final HashMap B;
    public List C;
    public List D;
    public Object E;
    public c F;
    public c G;
    public Path H;
    public Path I;
    public Path J;
    public Path K;
    public Path L;
    public eu0.b M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f117514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f117516c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f117517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f117518h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f117519j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f117520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f117521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f117522n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f117523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ir0.e f117524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f117525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f117526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f117527t;
    public final Object u;
    public final Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f117528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f117529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f117530y;
    public float z;

    public f(OrderBookChartView view) {
        d style = d.DEFAULT;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(style, "style");
        Context context = view.getContext();
        this.f117514a = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float fL = kli.a.l(context, 2.0f);
        this.f117515b = fL;
        float f = 2;
        this.f117516c = fL / f;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float fL2 = kli.a.l(context, 4.0f);
        this.d = fL2;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float fL3 = kli.a.l(context, 1.0f);
        this.e = fL3;
        this.f = (fL3 / f) + fL2;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iK = kli.a.k(context, 18.0f);
        this.f117517g = iK;
        this.f117518h = iK / 2.0f;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iS = kli.a.s(style.b(), context);
        this.i = iS;
        this.f117519j = style.c() == BitmapDescriptorFactory.HUE_RED ? null : Integer.valueOf(io0.a.d(style.c(), iS));
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iS2 = kli.a.s(style.a(), context);
        this.k = iS2;
        this.f117520l = style.c() != BitmapDescriptorFactory.HUE_RED ? Integer.valueOf(io0.a.d(style.c(), iS2)) : null;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f117521m = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f117522n = kli.a.s(R$attr.uikit_colorWhite, context);
        final int i = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                f fVar = this.f117509b;
                switch (i2) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        this.o = lazyY0;
        g gVarA = ebm.a.a(view, (Paint) lazyY0.getValue());
        gVarA.i(false);
        this.f117523p = gVarA;
        this.f117524q = new ir0.e(view, gVarA);
        final int i2 = 1;
        this.f117525r = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.f117509b;
                switch (i22) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        final int i3 = 2;
        this.f117526s = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                f fVar = this.f117509b;
                switch (i22) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        final int i5 = 3;
        this.f117527t = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                f fVar = this.f117509b;
                switch (i22) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        final int i6 = 4;
        this.u = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                f fVar = this.f117509b;
                switch (i22) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        final int i21 = 5;
        this.v = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                f fVar = this.f117509b;
                switch (i22) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        final int i22 = 6;
        this.f117528w = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                f fVar = this.f117509b;
                switch (i222) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        final int i32 = 7;
        this.f117529x = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i32;
                f fVar = this.f117509b;
                switch (i222) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        final int i33 = 8;
        this.f117530y = w.y0(new Function0(this) { // from class: du0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f117509b;

            {
                this.f117509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i33;
                f fVar = this.f117509b;
                switch (i222) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(fVar.i);
                        float f4 = fVar.f117515b;
                        paint.setStrokeWidth(f4);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setAntiAlias(true);
                        paint.setPathEffect(new CornerPathEffect(f4));
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        paint2.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAntiAlias(true);
                        paint3.setPathEffect(new CornerPathEffect(fVar.f117515b));
                        return paint3;
                    case 3:
                        Context context2 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        float fL4 = kli.a.l(context2, 3.0f);
                        Context context3 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        float fL5 = kli.a.l(context3, 2.0f);
                        Paint paint4 = new Paint();
                        paint4.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        paint4.setStrokeWidth(kli.a.l(context3, 1.0f));
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setPathEffect(new DashPathEffect(new float[]{fL4, fL5}, BitmapDescriptorFactory.HUE_RED));
                        paint4.setAntiAlias(true);
                        return paint4;
                    case 4:
                        Context context4 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        float fL6 = kli.a.l(context4, 3.0f);
                        Context context5 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        float fL7 = kli.a.l(context5, 1.0f);
                        Paint paint5 = new Paint();
                        paint5.setColor(fVar.f117521m);
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        paint5.setStrokeWidth(kli.a.l(context5, 1.0f));
                        paint5.setStyle(Paint.Style.STROKE);
                        paint5.setPathEffect(new DashPathEffect(new float[]{fL6, fL7}, BitmapDescriptorFactory.HUE_RED));
                        paint5.setAntiAlias(true);
                        return paint5;
                    case 5:
                        Paint paint6 = new Paint();
                        Context context6 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        paint6.setColor(kli.a.s(R$attr.uikit_colorForeground, context6));
                        Context context7 = fVar.f117514a;
                        Intrinsics.checkNotNullExpressionValue(context7, "context");
                        paint6.setStrokeWidth(kli.a.l(context7, 1.0f));
                        paint6.setStyle(Paint.Style.STROKE);
                        paint6.setAntiAlias(true);
                        return paint6;
                    case 6:
                        Paint paint7 = new Paint();
                        paint7.setColor(fVar.i);
                        paint7.setStyle(Paint.Style.FILL);
                        return paint7;
                    case 7:
                        Paint paint8 = new Paint();
                        paint8.setColor(fVar.k);
                        paint8.setStyle(Paint.Style.FILL);
                        return paint8;
                    default:
                        Paint paint9 = new Paint();
                        paint9.setStrokeWidth(fVar.e);
                        paint9.setColor(fVar.f117522n);
                        paint9.setStyle(Paint.Style.STROKE);
                        return paint9;
                }
            }
        });
        this.B = new HashMap();
        f0 f0Var = f0.f322471a;
        this.C = f0Var;
        this.D = f0Var;
        this.E = f0Var;
    }

    public static PointF b(float f, float f4, eu0.b bVar, c cVar) {
        float f5 = bVar.f129455j;
        float f6 = bVar.i;
        float f32 = f5 > f6 ? (f - f6) / (f5 - f6) : BitmapDescriptorFactory.HUE_RED;
        float f35 = cVar.f;
        float f36 = cVar.d;
        float f37 = cVar.f117512c;
        if (f36 != f37) {
            f35 = (((f4 - f37) / (f36 - f37)) * f35) + cVar.e;
        }
        RectF rectF = cVar.f117510a;
        return new PointF((float) Math.rint(f35), (float) Math.rint(rectF.bottom - (rectF.height() * f32)));
    }

    public static Pair c(c cVar, eu0.b bVar, eu0.g gVar) {
        c cVar2 = cVar;
        eu0.b bVar2 = bVar;
        List list = cVar2.f117511b;
        RectF rectF = cVar2.f117510a;
        ArrayList arrayList = new ArrayList(list.size() * 2);
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            p8 p8Var = (p8) list.get(i);
            Float f = (Float) bVar2.k.get(p8Var);
            float fFloatValue = BitmapDescriptorFactory.HUE_RED;
            PointF pointFB = b(f != null ? f.floatValue() : 0.0f, p8Var.f10471a, bVar2, cVar2);
            i++;
            p8 p8Var2 = (p8) d0.e0(i, list);
            arrayList.add(pointFB);
            if (p8Var2 != null) {
                Float f4 = (Float) bVar2.k.get(p8Var2);
                if (f4 != null) {
                    fFloatValue = f4.floatValue();
                }
                PointF pointFB2 = b(fFloatValue, p8Var2.f10471a, bVar2, cVar2);
                arrayList2.add(new eu0.f(p8Var.f10471a, gVar, p8Var.f10473c, new PointF((float) Math.rint((pointFB.x + pointFB2.x) / 2), pointFB.y), p8Var.d));
                arrayList.add(new PointF(pointFB2.x, pointFB.y));
            } else {
                float f5 = gVar == eu0.g.BID ? rectF.left : rectF.right;
                arrayList2.add(new eu0.f(p8Var.f10471a, gVar, p8Var.f10473c, new PointF((float) Math.rint((pointFB.x + f5) / 2), pointFB.y), p8Var.d));
                arrayList.add(new PointF(f5, pointFB.y));
            }
            cVar2 = cVar;
            bVar2 = bVar;
        }
        return new Pair(arrayList, arrayList2);
    }

    public static Path d(List list) {
        Path path = new Path();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) list.get(i);
            if (i == 0) {
                path.moveTo(pointF.x, pointF.y);
            } else {
                path.lineTo(pointF.x, pointF.y);
            }
        }
        return path;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Canvas canvas) {
        Drawable drawable;
        Paint paint;
        ?? r06 = this.E;
        int size = r06.size();
        for (int i = 0; i < size; i++) {
            eu0.f fVar = (eu0.f) r06.get(i);
            Clause clause = fVar.e;
            if (clause == null) {
                drawable = null;
            } else {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Object obj2 = this.B.get(clause);
                ref$ObjectRef.f186409a = obj2;
                if (obj2 == null) {
                    Context context = this.f117514a;
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    ty0.c cVarB0 = jh.d.f(context).b0();
                    Context context2 = this.f117514a;
                    Intrinsics.checkNotNullExpressionValue(context2, "context");
                    TextImage textImage = new TextImage(ty0.c.a(cVarB0, clause, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE), new Color.Solid(R$attr.uikit_colorGreyTone50), new Color.Solid(R$attr.uikit_colorGreyTone8), new Color.Solid(R$attr.uikit_colorGreyTone10), 12, 18, null, null, 192);
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    yy0.f fVarQ = jh.d.f(context).Q();
                    Context context3 = this.f117514a;
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    g0 g0Var = new g0(this, 22, clause, ref$ObjectRef);
                    yy0.e eVar = yy0.f.Companion;
                    int i2 = this.f117517g;
                    fVarQ.c(textImage, context3, i2, i2, g0Var, null);
                }
                drawable = (Drawable) ref$ObjectRef.f186409a;
            }
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                PointF pointF = fVar.d;
                float f = pointF.x;
                canvas.drawLine(f, this.f117518h, f, pointF.y, (Paint) this.u.getValue());
                int i3 = e.f117513a[fVar.f129458b.ordinal()];
                if (i3 == 1) {
                    paint = (Paint) this.f117528w.getValue();
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    paint = (Paint) this.f117529x.getValue();
                }
                canvas.drawCircle(pointF.x, pointF.y, this.d, paint);
                canvas.drawCircle(pointF.x, pointF.y, this.f, (Paint) this.f117530y.getValue());
                float f4 = pointF.x;
                float f5 = this.f117518h;
                int iSave = canvas.save();
                canvas.translate(f4 - f5, -f5);
                try {
                    int i5 = this.f117517g;
                    drawable2.setBounds(0, 0, i5, i5);
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(float f, float f4, int i, int i2) {
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        if (f == BitmapDescriptorFactory.HUE_RED || f4 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f5 = f - i;
        float f6 = this.f117515b;
        float f32 = f5 - f6;
        this.A = f32;
        float f35 = (f4 - i2) - f6;
        this.z = f35;
        if (f32 <= BitmapDescriptorFactory.HUE_RED || f35 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        eu0.b bVar = this.M;
        if (bVar == null || (bVar.f129450a.isEmpty() && bVar.f129451b.isEmpty())) {
            float f36 = this.A;
            float f37 = this.z;
            float f41 = f36 / 2;
            this.H = d(v.k(new PointF(BitmapDescriptorFactory.HUE_RED, f37), new PointF(f41, f37)));
            this.J = d(v.k(new PointF(f41, f37), new PointF(f36, f37)));
            Path path = new Path();
            path.moveTo(f41, BitmapDescriptorFactory.HUE_RED);
            path.lineTo(f41, f37);
            this.L = path;
            return;
        }
        float f42 = this.A / 2;
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f42, this.z);
        RectF rectF2 = new RectF(f42, BitmapDescriptorFactory.HUE_RED, this.A, this.z);
        c cVar = new c(rectF, bVar, true, rectF2);
        c cVar2 = new c(rectF2, bVar, false, rectF);
        this.F = cVar;
        this.G = cVar2;
        Pair pairC = c(cVar, bVar, eu0.g.BID);
        List list = (List) pairC.f186385a;
        List list2 = (List) pairC.f186386b;
        Pair pairC2 = c(cVar2, bVar, eu0.g.ASK);
        List list3 = (List) pairC2.f186385a;
        List list4 = (List) pairC2.f186386b;
        this.D = list4;
        this.C = list2;
        this.E = d0.E0(list4, list2);
        Path pathD = d(list);
        Integer num = this.f117519j;
        if (num != null && !list.isEmpty()) {
            float f57 = ((PointF) d0.b0(list)).x;
            float f69 = this.z;
            Path path2 = new Path(pathD);
            path2.lineTo(BitmapDescriptorFactory.HUE_RED, f69);
            path2.lineTo(f57, f69);
            path2.close();
            this.I = path2;
        }
        this.H = pathD;
        Path pathD2 = d(list3);
        Integer num2 = this.f117520l;
        if (num2 != null && !list3.isEmpty()) {
            float f75 = ((PointF) d0.b0(list3)).x;
            float f77 = this.z;
            float f81 = this.A;
            Path path3 = new Path(pathD2);
            path3.lineTo(f81, f77);
            path3.lineTo(f75, f77);
            path3.close();
            this.K = path3;
        }
        this.J = pathD2;
        float f82 = this.z;
        Path path4 = new Path();
        path4.moveTo(f42, BitmapDescriptorFactory.HUE_RED);
        path4.lineTo(f42, f82);
        this.L = path4;
        float f93 = this.z + f6;
        if (num != null) {
            ((Paint) this.f117525r.getValue()).setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f93, num.intValue(), 0, Shader.TileMode.CLAMP));
        }
        if (num2 != null) {
            ((Paint) this.f117526s.getValue()).setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f93, num2.intValue(), 0, Shader.TileMode.CLAMP));
        }
    }
}
