package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import aw0.f7;
import aw0.g7;
import aw0.h7;
import aw0.i7;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import ct0.c0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import ms0.e2;
import nr0.c;
import or0.u;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/MarginChartView;", "Landroid/view/View;", "Lts0/a;", "Ljq0/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/i7;", "model", "", "setModel", "(Law0/i7;)V", "Lct0/c0;", "a", "Lct0/c0;", "getChartDrawer", "()Lct0/c0;", "chartDrawer", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "M", "Lkotlin/Lazy;", "getAnimationInterpolator", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "animationInterpolator", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarginChartView extends View implements ts0.a, jq0.g {

    @NotNull
    private static final a Companion = new a();
    public static final int O = R$attr.internal_textAppearanceBody3;
    public static final int P = R$attr.internal_textAppearanceEmphasis3;
    public static final vim.c Q = new vim.c(BitmapDescriptorFactory.HUE_RED, 1.0f);
    public static final int R = R$attr.uikit_colorGreyTone50;
    public static final int S = R$attr.uikit_colorForeground;
    public LinearGradient A;
    public final Path B;
    public final RectF C;
    public final float D;
    public i7 E;
    public nr0.e F;
    public final float G;
    public Integer H;
    public final int I;
    public final TextPaint J;
    public final TextPaint K;
    public jq0.i L;
    public final Object M;
    public float N;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final c0 chartDrawer;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f56266c;
    public final RectF d;
    public final RectF e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f56267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f56268h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f56269j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f56270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f56271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f56272n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f56273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f56274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f56275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f56276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f56277t;
    public final int[] u;
    public final Paint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f56278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f56279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f56280y;
    public LinearGradient z;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AccelerateDecelerateInterpolator getAnimationInterpolator() {
        return (AccelerateDecelerateInterpolator) this.M.getValue();
    }

    public static int i(f7 f7Var) {
        int i = e2.f208237a[f7Var.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorPerformancePositive;
        }
        if (i == 2) {
            return R$attr.uikit_colorStatusWarning;
        }
        if (i == 3) {
            return R$attr.uikit_colorPerformanceNegative;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jq0.g
    public final void a(float f) {
        this.N = f;
        c();
        i7 i7Var = this.E;
        if (i7Var != null) {
            d(i7Var);
        }
        invalidate();
    }

    @Override // jq0.g
    public final boolean b() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return jq0.a.a(context);
    }

    public final void c() {
        RectF rectF = this.f;
        float fWidth = rectF.width();
        RectF rectF2 = this.f56269j;
        RectF rectF3 = this.f56267g;
        RectF rectF4 = this.i;
        if (fWidth <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
            gj7.b.d(rectF3);
            gj7.b.d(rectF4);
            gj7.b.d(rectF2);
            return;
        }
        float f = rectF.bottom;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f56276s.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, this.f56274q, this.f56275r, tileMode));
        this.v.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF.bottom, this.u, this.f56275r, tileMode));
        float f4 = 2;
        float f5 = this.k;
        float f6 = f4 * f5;
        float fHeight = rectF.height() - (f4 * f5);
        float f32 = 0.13f * fHeight;
        float f35 = fHeight - (f4 * f32);
        float f36 = f35 - (this.N * f35);
        float f37 = rectF.left + f6;
        float f41 = this.f56277t;
        rectF3.set(f37 + f41, rectF.top + f36 + f32 + f5, (rectF.right - f6) - f41, (rectF.bottom - f32) - f5);
        RectF rectF5 = this.d;
        float f42 = rectF5.left;
        float f57 = rectF.top + f36 + f32;
        float f69 = this.D;
        this.f56268h.set(f42, f57 + f69, (rectF5.right - f6) - f41, (rectF.bottom - f32) - f69);
        if (this.N < 1.0f) {
            float f75 = rectF.left + f6 + f41;
            float f77 = rectF.top;
            rectF4.set(f75, f77 + f32 + f5, (rectF.right - f6) - f41, ((f77 + f32) + f36) - f5);
        } else {
            gj7.b.d(rectF4);
        }
        float f81 = rectF.left + f6 + f41;
        float f82 = rectF.bottom;
        rectF2.set(f81, (f82 - f32) + f5, (rectF.right - f6) - f41, f82 - f5);
    }

    public final void d(i7 i7Var) {
        float f = this.N;
        RectF rectF = this.C;
        Path path = this.B;
        if (f >= 1.0f || i7Var.f == null) {
            path.reset();
            gj7.b.d(rectF);
            return;
        }
        path.rewind();
        RectF rectF2 = this.e;
        float f4 = rectF2.left;
        float f5 = this.f56270l;
        float f6 = this.k;
        float f32 = (f4 - f5) + f6;
        RectF rectF3 = this.i;
        float f35 = rectF3.top;
        float f36 = f4 + f5 + f6;
        float f37 = 2;
        path.addArc(f32, f35, f36, (f37 * f5) + f35, 270.0f, 90.0f);
        path.lineTo(rectF2.left + f5 + f6, rectF3.bottom - f5);
        float f41 = rectF2.left;
        float f42 = rectF3.bottom;
        path.addArc((f41 - f5) + f6, f42 - (f37 * f5), f41 + f5 + f6, f42, BitmapDescriptorFactory.HUE_RED, 90.0f);
        path.computeBounds(rectF, true);
    }

    public final void e(boolean z) {
        i7 i7Var = this.E;
        if (i7Var == null) {
            return;
        }
        RectF rectF = this.e;
        RectF rectF2 = this.d;
        if (z) {
            RectF rectF3 = this.f56266c;
            rectF3.set(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
            float fWidth = rectF3.width() * 0.3f;
            float f = 2;
            float fWidth2 = rectF3.left + ((rectF3.width() - fWidth) / f);
            float f4 = rectF3.bottom;
            RectF rectF4 = this.f;
            rectF4.set(fWidth2, rectF3.top, fWidth + fWidth2, f4);
            rectF2.set(rectF3.left, rectF3.top, rectF4.left, rectF3.bottom);
            rectF.set(rectF4.right, rectF3.top, rectF3.right, rectF3.bottom);
            nr0.e eVar = this.F;
            if (eVar != null) {
                eVar.a();
            }
            c.a aVar = nr0.c.Companion;
            int iWidth = (int) (rectF2.width() - (f * this.G));
            int i = iWidth < 1 ? 1 : iWidth;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.F = new nr0.e(this, new nr0.c(-1, i, 2, truncateAt, 8), new r(this, 17));
            j(this.E);
        }
        c();
        float f5 = rectF2.left;
        float f6 = rectF2.right;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.z = new LinearGradient(f5, BitmapDescriptorFactory.HUE_RED, f6, BitmapDescriptorFactory.HUE_RED, this.f56265b, this.f56278w, tileMode);
        this.A = new LinearGradient(rectF.left, BitmapDescriptorFactory.HUE_RED, rectF.right, BitmapDescriptorFactory.HUE_RED, this.f56278w, this.f56265b, tileMode);
        d(i7Var);
    }

    public final void f(Canvas canvas, g7 g7Var, float f, float f4, boolean z, boolean z3, int i) {
        Layout layoutB;
        nr0.e eVar;
        nr0.e eVar2 = this.F;
        if (eVar2 == null || (layoutB = eVar2.b(g7Var.f10324a, this.J)) == null || (eVar = this.F) == null) {
            return;
        }
        MoneyClause moneyClause = g7Var.f10325b;
        TextPaint textPaint = this.K;
        Layout layoutB2 = eVar.b(moneyClause, textPaint);
        if (layoutB2 == null) {
            return;
        }
        int height = layoutB2.getHeight() + layoutB.getHeight();
        float f5 = this.G;
        float f6 = z3 ? (f4 - height) - f5 : f4 + f5;
        if (z) {
            a.a.i(layoutB, canvas, f - f5, f6);
        } else {
            a.a.h(layoutB, canvas, f + f5, f6);
        }
        textPaint.setColor(i);
        if (z) {
            a.a.i(layoutB2, canvas, f - f5, f6 + layoutB.getHeight());
        } else {
            a.a.h(layoutB2, canvas, f + f5, f6 + layoutB.getHeight());
        }
    }

    public final void g(Canvas canvas, g7 g7Var, float f, LinearGradient linearGradient, boolean z, int i) {
        RectF rectF = this.d;
        float f4 = rectF.right - this.k;
        float f5 = rectF.left;
        Paint paint = this.f56279x;
        paint.setShader(linearGradient);
        canvas.drawLine(f5, f, f4, f, paint);
        f(canvas, g7Var, f4, f, true, z, i);
    }

    public final SpannableStringBuilder h(i7 i7Var) {
        ty0.c cVarB0 = u.k(this).b0();
        g7 g7Var = i7Var.d;
        TextLocalisedClause textLocalisedClause = g7Var.f10324a;
        MoneyClause moneyClause = g7Var.f10325b;
        g7 g7Var2 = i7Var.f10358c;
        TextLocalisedClause textLocalisedClause2 = g7Var2.f10324a;
        MoneyClause moneyClause2 = g7Var2.f10325b;
        g7 g7Var3 = i7Var.e;
        TextLocalisedClause textLocalisedClause3 = g7Var3.f10324a;
        MoneyClause moneyClause3 = g7Var3.f10325b;
        g7 g7Var4 = i7Var.f;
        TextLocalisedClause textLocalisedClause4 = g7Var4 != null ? g7Var4.f10324a : null;
        MoneyClause moneyClause4 = g7Var4 != null ? g7Var4.f10325b : null;
        h7 h7Var = i7Var.f10359g;
        Clause[] elements = {textLocalisedClause, moneyClause, textLocalisedClause2, moneyClause2, textLocalisedClause3, moneyClause3, textLocalisedClause4, moneyClause4, h7Var != null ? h7Var.f10343a.f10324a : null, h7Var != null ? h7Var.f10343a.f10325b : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ty0.c.a(cVarB0, compositeClauseM, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
    }

    public final void j(i7 i7Var) {
        if (i7Var == null) {
            return;
        }
        g7 g7Var = i7Var.e;
        g7 g7Var2 = i7Var.d;
        g7 g7Var3 = i7Var.f10358c;
        nr0.e eVar = this.F;
        TextPaint textPaint = this.J;
        if (eVar != null) {
            eVar.f(g7Var3.f10324a, textPaint);
        }
        nr0.e eVar2 = this.F;
        TextPaint textPaint2 = this.K;
        if (eVar2 != null) {
            eVar2.f(g7Var3.f10325b, textPaint2);
        }
        nr0.e eVar3 = this.F;
        if (eVar3 != null) {
            eVar3.f(g7Var2.f10324a, textPaint);
        }
        nr0.e eVar4 = this.F;
        if (eVar4 != null) {
            eVar4.f(g7Var2.f10325b, textPaint2);
        }
        nr0.e eVar5 = this.F;
        if (eVar5 != null) {
            eVar5.f(g7Var.f10324a, textPaint);
        }
        nr0.e eVar6 = this.F;
        if (eVar6 != null) {
            eVar6.f(g7Var.f10325b, textPaint2);
        }
        g7 g7Var4 = i7Var.f;
        if (g7Var4 != null) {
            nr0.e eVar7 = this.F;
            if (eVar7 != null) {
                eVar7.f(g7Var4.f10324a, textPaint);
            }
            nr0.e eVar8 = this.F;
            if (eVar8 != null) {
                eVar8.f(g7Var4.f10325b, textPaint2);
            }
        }
        h7 h7Var = i7Var.f10359g;
        if (h7Var != null) {
            g7 g7Var5 = h7Var.f10343a;
            nr0.e eVar9 = this.F;
            if (eVar9 != null) {
                eVar9.f(g7Var5.f10324a, textPaint);
            }
            nr0.e eVar10 = this.F;
            if (eVar10 != null) {
                eVar10.f(g7Var5.f10325b, textPaint2);
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L == null) {
            jq0.i iVar = new jq0.i(this, getAnimationInterpolator());
            u.g(this).addObserver(iVar);
            this.L = iVar;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        jq0.i iVar = this.L;
        if (iVar != null) {
            u.g(this).removeObserver(iVar);
            iVar.a();
        }
        this.L = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.MarginChartView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        i7 i7Var = this.E;
        info.setContentDescription(i7Var != null ? h(i7Var) : null);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        e(z);
    }

    public final void setModel(@NotNull i7 model) {
        Integer numValueOf;
        f7 f7Var;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.E, model)) {
            return;
        }
        float f = model.f10357b;
        if (BitmapDescriptorFactory.HUE_RED > f || f > 1.0f) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ToleranceLevelGraphView", "Value " + f + " is not within bounds 0..1.", null, h0Var);
            float f4 = kotlin.ranges.f.f(model.f10357b, BitmapDescriptorFactory.HUE_RED, 1.0f);
            f7 colorState = model.f10356a;
            g7 topLabel = model.f10358c;
            g7 bottomLabel = model.d;
            g7 atValueExplanationLabel = model.e;
            g7 g7Var = model.f;
            h7 h7Var = model.f10359g;
            Intrinsics.checkNotNullParameter(colorState, "colorState");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(bottomLabel, "bottomLabel");
            Intrinsics.checkNotNullParameter(atValueExplanationLabel, "atValueExplanationLabel");
            model = new i7(colorState, f4, topLabel, bottomLabel, atValueExplanationLabel, g7Var, h7Var);
        }
        i7 i7Var = this.E;
        j(model);
        i7 i7Var2 = this.E;
        if (i7Var2 != null) {
            g7 g7Var2 = i7Var2.e;
            g7 g7Var3 = i7Var2.d;
            g7 g7Var4 = i7Var2.f10358c;
            nr0.e eVar = this.F;
            TextPaint textPaint = this.J;
            if (eVar != null) {
                eVar.e(g7Var4.f10324a, textPaint);
            }
            nr0.e eVar2 = this.F;
            TextPaint textPaint2 = this.K;
            if (eVar2 != null) {
                eVar2.e(g7Var4.f10325b, textPaint2);
            }
            nr0.e eVar3 = this.F;
            if (eVar3 != null) {
                eVar3.e(g7Var3.f10324a, textPaint);
            }
            nr0.e eVar4 = this.F;
            if (eVar4 != null) {
                eVar4.e(g7Var3.f10325b, textPaint2);
            }
            nr0.e eVar5 = this.F;
            if (eVar5 != null) {
                eVar5.e(g7Var2.f10324a, textPaint);
            }
            nr0.e eVar6 = this.F;
            if (eVar6 != null) {
                eVar6.e(g7Var2.f10325b, textPaint2);
            }
            g7 g7Var5 = i7Var2.f;
            if (g7Var5 != null) {
                nr0.e eVar7 = this.F;
                if (eVar7 != null) {
                    eVar7.e(g7Var5.f10324a, textPaint);
                }
                nr0.e eVar8 = this.F;
                if (eVar8 != null) {
                    eVar8.e(g7Var5.f10325b, textPaint2);
                }
            }
            h7 h7Var2 = i7Var2.f10359g;
            if (h7Var2 != null) {
                g7 g7Var6 = h7Var2.f10343a;
                nr0.e eVar9 = this.F;
                if (eVar9 != null) {
                    eVar9.e(g7Var6.f10324a, textPaint);
                }
                nr0.e eVar10 = this.F;
                if (eVar10 != null) {
                    eVar10.e(g7Var6.f10325b, textPaint2);
                }
            }
        }
        this.E = model;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i(model.f10356a), context);
        this.f56271m = iS;
        this.f56272n = io0.a.d(0.2f, iS);
        h7 h7Var3 = model.f10359g;
        if (h7Var3 == null || (f7Var = h7Var3.f10344b) == null) {
            numValueOf = null;
        } else {
            int i = i(f7Var);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            numValueOf = Integer.valueOf(kli.a.s(i, context2));
        }
        this.H = numValueOf;
        float f5 = model.f10357b;
        if (!Intrinsics.d(i7Var != null ? Float.valueOf(i7Var.f10357b) : null, model.f10357b)) {
            if (this.L == null || this.N < BitmapDescriptorFactory.HUE_RED || !b()) {
                this.N = f5;
            } else {
                jq0.i iVar = this.L;
                if (iVar != null) {
                    iVar.e(this.N, f5, 200L, -1L, false);
                }
            }
        }
        setContentDescription(h(model));
        e(false);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getChartDrawer, reason: from getter and merged with bridge method [inline-methods] */
    public c0 m3745getChartDrawer() {
        return this.chartDrawer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartDrawer = new c0(context, this);
        int iS = kli.a.s(R$attr.uikit_colorTransparent, context);
        this.f56265b = iS;
        this.f56266c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new RectF();
        this.f56267g = new RectF();
        this.f56268h = new RectF();
        this.i = new RectF();
        this.f56269j = new RectF();
        this.k = kli.a.k(context, 2.0f);
        this.f56270l = kli.a.k(context, 2.0f);
        this.o = kli.a.s(R$attr.uikit_colorGreyTone2, context);
        this.f56273p = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f56274q = new int[]{iS, kli.a.s(R$attr.uikit_colorForeground_10, context), iS};
        this.f56275r = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f56276s = paint;
        float fK = kli.a.k(context, 1.0f);
        this.f56277t = fK;
        this.u = new int[]{iS, kli.a.s(R$attr.uikit_colorForeground_20, context), iS};
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(fK);
        this.v = paint2;
        int iS2 = kli.a.s(R$attr.uikit_colorForeground_20, context);
        this.f56278w = iS2;
        float fL = kli.a.l(context, 1.0f);
        float fL2 = kli.a.l(context, 2.0f);
        float fL3 = kli.a.l(context, 2.0f);
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(fL);
        paint3.setPathEffect(new DashPathEffect(new float[]{fL2, fL3}, BitmapDescriptorFactory.HUE_RED));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        this.f56279x = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(fL);
        paint4.setPathEffect(new DashPathEffect(new float[]{fL2, fL3}, BitmapDescriptorFactory.HUE_RED));
        paint4.setStrokeCap(cap);
        paint4.setColor(iS2);
        this.f56280y = paint4;
        this.B = new Path();
        this.C = new RectF();
        this.D = kli.a.l(context, 6.0f);
        this.G = kli.a.l(context, 8.0f);
        int iS3 = kli.a.s(S, context);
        this.I = iS3;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(kli.a.s(R, context));
        jb3.l.d(textPaint, context, O);
        this.J = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(iS3);
        jb3.l.d(textPaint2, context, P);
        this.K = textPaint2;
        this.M = w.y0(new mq4.b(9));
        this.N = -1.0f;
    }

    public /* synthetic */ MarginChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
