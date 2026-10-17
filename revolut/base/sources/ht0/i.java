package ht0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f155145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn2.c f155146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hl6.b f155147c;
    public final ArrayList d;
    public int[] e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f155148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f155149h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f155150j;
    public LinearGradient k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f155151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f155152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f155153n;
    public final Paint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f155154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f155155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f155156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f155157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Path f155158t;
    public final Path u;
    public List v;

    public i(Context context, fn2.c plot, hl6.b createAndAttachBadgeView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(plot, "plot");
        Intrinsics.checkNotNullParameter(createAndAttachBadgeView, "createAndAttachBadgeView");
        this.f155145a = context;
        this.f155146b = plot;
        this.f155147c = createAndAttachBadgeView;
        this.d = new ArrayList();
        this.e = new int[0];
        this.f = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f155148g = kli.a.s(R$attr.uikit_colorGreyTone10, context);
        float fL = kli.a.l(context, 1.0f);
        this.f155149h = fL;
        this.i = kli.a.k(context, 4.0f);
        this.f155150j = kli.a.l(context, 5.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fL);
        this.o = paint;
        final int i = 0;
        this.f155154p = te0.w.y0(new Function0(this) { // from class: ht0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f155141b;

            {
                this.f155141b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                i iVar = this.f155141b;
                switch (i2) {
                    case 0:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 1.0f), kli.a.l(iVar.f155145a, 5.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 1:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 2.0f), kli.a.l(iVar.f155145a, 8.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 2:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setColor(ColorUtils.setAlphaComponent(kli.a.s(R$attr.uikit_windowBackground, iVar.f155145a), Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2));
                        return paint2;
                    default:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setColor(iVar.o.getColor());
                        paint3.setAntiAlias(true);
                        return paint3;
                }
            }
        });
        final int i2 = 1;
        this.f155155q = te0.w.y0(new Function0(this) { // from class: ht0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f155141b;

            {
                this.f155141b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                i iVar = this.f155141b;
                switch (i22) {
                    case 0:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 1.0f), kli.a.l(iVar.f155145a, 5.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 1:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 2.0f), kli.a.l(iVar.f155145a, 8.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 2:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setColor(ColorUtils.setAlphaComponent(kli.a.s(R$attr.uikit_windowBackground, iVar.f155145a), Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2));
                        return paint2;
                    default:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setColor(iVar.o.getColor());
                        paint3.setAntiAlias(true);
                        return paint3;
                }
            }
        });
        final int i3 = 2;
        this.f155156r = te0.w.y0(new Function0(this) { // from class: ht0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f155141b;

            {
                this.f155141b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                i iVar = this.f155141b;
                switch (i22) {
                    case 0:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 1.0f), kli.a.l(iVar.f155145a, 5.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 1:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 2.0f), kli.a.l(iVar.f155145a, 8.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 2:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setColor(ColorUtils.setAlphaComponent(kli.a.s(R$attr.uikit_windowBackground, iVar.f155145a), Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2));
                        return paint2;
                    default:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setColor(iVar.o.getColor());
                        paint3.setAntiAlias(true);
                        return paint3;
                }
            }
        });
        final int i5 = 3;
        this.f155157s = te0.w.y0(new Function0(this) { // from class: ht0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f155141b;

            {
                this.f155141b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                i iVar = this.f155141b;
                switch (i22) {
                    case 0:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 1.0f), kli.a.l(iVar.f155145a, 5.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 1:
                        return new DashPathEffect(new float[]{kli.a.l(iVar.f155145a, 2.0f), kli.a.l(iVar.f155145a, 8.0f)}, BitmapDescriptorFactory.HUE_RED);
                    case 2:
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setColor(ColorUtils.setAlphaComponent(kli.a.s(R$attr.uikit_windowBackground, iVar.f155145a), Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2));
                        return paint2;
                    default:
                        Paint paint3 = new Paint();
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setColor(iVar.o.getColor());
                        paint3.setAntiAlias(true);
                        return paint3;
                }
            }
        });
        this.f155158t = new Path();
        this.u = new Path();
        this.v = f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Canvas canvas, float f, float f4, float f5, float f6) {
        float f32 = ((TrendView) this.f155146b.f136517b).f();
        int iSave = canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, f32);
        try {
            canvas.rotate(f, f4, f5);
            float f35 = f6 / 2;
            float f36 = f5 + f35;
            Path path = this.u;
            path.rewind();
            float f37 = f36 - f35;
            path.moveTo(f4, f37);
            float f41 = f36 + f35;
            path.lineTo(f4 - f35, f41);
            path.lineTo(f35 + f4, f41);
            path.lineTo(f4, f37);
            path.close();
            canvas.drawPath(path, (Paint) this.f155157s.getValue());
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final Float b() {
        if (this.v.isEmpty()) {
            return null;
        }
        List list = this.v;
        int size = list.size();
        float fMax = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            hw0.x xVar = (hw0.x) list.get(i);
            if (xVar.k) {
                fMax = Math.max(fMax, Math.max(xVar.f156022a, xVar.f156023b));
            }
        }
        return Float.valueOf(fMax);
    }

    public final Float c() {
        if (this.v.isEmpty()) {
            return null;
        }
        List list = this.v;
        int size = list.size();
        float fMin = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            hw0.x xVar = (hw0.x) list.get(i);
            if (xVar.k) {
                fMin = Math.min(fMin, Math.min(xVar.f156022a, xVar.f156023b));
            }
        }
        return Float.valueOf(fMin);
    }
}
