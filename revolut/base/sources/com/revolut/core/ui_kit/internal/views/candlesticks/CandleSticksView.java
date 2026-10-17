package com.revolut.core.ui_kit.internal.views.candlesticks;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import aw0.r0;
import aw0.z8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.k0;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_resources.R$attr;
import hx7.q;
import ir0.e;
import ir0.g;
import iv0.j;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.x;
import o6.a;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rrd.l;
import rs0.b;
import rs0.c;
import rs0.d;
import rs0.f;
import rs0.h;
import rs0.i;
import te0.w;
import z9h.n;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002rUB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010%\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010)\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$RV\u00104\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,\u0018\u00010*j\u0004\u0018\u0001`-2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,\u0018\u00010*j\u0004\u0018\u0001`-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010<\u001a\u0002052\u0006\u0010\u000e\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R.\u0010D\u001a\u0004\u0018\u00010=2\b\u0010\u000e\u001a\u0004\u0018\u00010=8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR.\u0010L\u001a\u0004\u0018\u00010E2\b\u0010\u000e\u001a\u0004\u0018\u00010E8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010T\u001a\u0004\u0018\u00010M2\b\u0010\u000e\u001a\u0004\u0018\u00010M8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR.\u0010\\\u001a\u0004\u0018\u00010U2\b\u0010\u000e\u001a\u0004\u0018\u00010U8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R(\u0010b\u001a\u0004\u0018\u00010]2\b\u0010\u000e\u001a\u0004\u0018\u00010]8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR$\u0010m\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0011\u0010q\u001a\u00020n8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/candlesticks/CandleSticksView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getYAxisWidth", "()F", "Law0/z8;", "value", "b", "Law0/z8;", "getPlotData", "()Law0/z8;", "setPlotData", "(Law0/z8;)V", "plotData", "Lcom/revolut/core/ui_kit/models/Clause;", "c", "Lcom/revolut/core/ui_kit/models/Clause;", "getContentDescription", "()Lcom/revolut/core/ui_kit/models/Clause;", "setContentDescription", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "contentDescription", "", "d", "Z", "getShowVolume", "()Z", "setShowVolume", "(Z)V", "showVolume", "e", "getCompressGraph", "setCompressGraph", "compressGraph", "Lkotlin/Function1;", "Law0/r0;", "", "Lcom/revolut/core/ui_kit/internal/views/candlesticks/CandleSelectedCallback;", "f", "Lkotlin/jvm/functions/Function1;", "getCandleSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "setCandleSelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "candleSelectedCallback", "Lcom/revolut/core/ui_kit/models/k0;", "g", "Lcom/revolut/core/ui_kit/models/k0;", "getSelectedCandleFormat", "()Lcom/revolut/core/ui_kit/models/k0;", "setSelectedCandleFormat", "(Lcom/revolut/core/ui_kit/models/k0;)V", "selectedCandleFormat", "Lrs0/e;", "h", "Lrs0/e;", "getVerticalLineData", "()Lrs0/e;", "setVerticalLineData", "(Lrs0/e;)V", "verticalLineData", "Lrs0/i;", "i", "Lrs0/i;", "getYAxis", "()Lrs0/i;", "setYAxis", "(Lrs0/i;)V", "yAxis", "Luw0/i;", "j", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Lrs0/c;", "k", "Lrs0/c;", "getCopies", "()Lrs0/c;", "setCopies", "(Lrs0/c;)V", "copies", "Lrs0/g;", "y", "Lrs0/g;", "setCandleToElaborate", "(Lrs0/g;)V", "candleToElaborate", "Lms0/x;", "G", "Lkotlin/Lazy;", "getVerticalLineBadge", "()Lms0/x;", "verticalLineBadge", "I", "F", "setAppearingAnimatedValue", "(F)V", "appearingAnimatedValue", "Lty0/c;", "getClauseDisplayer", "()Lty0/c;", "clauseDisplayer", "rs0/b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CandleSticksView extends FrameLayout {
    public static final /* synthetic */ int S = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final View F;
    public final Object G;
    public final ArrayList H;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public float appearingAnimatedValue;
    public boolean J;
    public final g K;
    public final j L;
    public final e M;
    public final int N;
    public final long O;
    public final PointF P;
    public final PointF Q;
    public final a R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f56564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public z8 plotData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Clause contentDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean showVolume;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean compressGraph;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Function1 candleSelectedCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k0 selectedCandleFormat;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public rs0.e verticalLineData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public i yAxis;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public uw0.i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public c copies;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f56570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f56571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BigDecimal f56572n;
    public BigDecimal o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f56573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f56574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f56575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f56576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f56577t;
    public float u;
    public final Paint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f56578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AnimatorSet f56579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public rs0.g candleToElaborate;
    public final int z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CandleSticksView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(CandleSticksView candleSticksView, float f) {
        candleSticksView.setAppearingAnimatedValue(f);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final x getVerticalLineBadge() {
        return (x) this.G.getValue();
    }

    private final float getYAxisWidth() {
        i iVar = this.yAxis;
        if (iVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int size = iVar.f256925a.size();
        float fMax = Float.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            fMax = Math.max(fMax, ((x) this.H.get(i)).getMeasuredWidth());
        }
        return fMax + d.f256910c;
    }

    private final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        invalidate();
    }

    private final void setCandleToElaborate(rs0.g gVar) {
        if (Intrinsics.f(gVar, this.candleToElaborate)) {
            return;
        }
        this.candleToElaborate = gVar;
        ((com.revolut.core.ui_kit_core.displayers.haptic.b) u.k(this).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true));
        Function1 function1 = this.candleSelectedCallback;
        if (function1 != null) {
            rs0.g gVar2 = this.candleToElaborate;
            function1.invoke(gVar2 != null ? gVar2.f : null);
            Unit unit = Unit.f186387a;
        }
    }

    public final void b(int i, rs0.g gVar) {
        final rs0.g gVar2 = (rs0.g) this.f56570l.get(i);
        ArrayList arrayList = new ArrayList();
        final int i2 = 2;
        final int i3 = 0;
        final int i5 = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(gVar2.f256919a, gVar.f256919a);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i3;
                CandleSticksView candleSticksView = this;
                g gVar3 = gVar2;
                switch (i6) {
                    case 0:
                        int i21 = CandleSticksView.S;
                        gVar3.f256919a = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 1:
                        int i22 = CandleSticksView.S;
                        gVar3.f256920b = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 2:
                        int i32 = CandleSticksView.S;
                        gVar3.f256921c = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 3:
                        int i33 = CandleSticksView.S;
                        gVar3.d = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 4:
                        int i43 = CandleSticksView.S;
                        gVar3.e = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 5:
                        int i59 = CandleSticksView.S;
                        gVar3.f256922g = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    default:
                        int i66 = CandleSticksView.S;
                        gVar3.f256923h = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(gVar2.f256920b, gVar.f256920b);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i5;
                CandleSticksView candleSticksView = this;
                g gVar3 = gVar2;
                switch (i6) {
                    case 0:
                        int i21 = CandleSticksView.S;
                        gVar3.f256919a = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 1:
                        int i22 = CandleSticksView.S;
                        gVar3.f256920b = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 2:
                        int i32 = CandleSticksView.S;
                        gVar3.f256921c = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 3:
                        int i33 = CandleSticksView.S;
                        gVar3.d = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 4:
                        int i43 = CandleSticksView.S;
                        gVar3.e = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 5:
                        int i59 = CandleSticksView.S;
                        gVar3.f256922g = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    default:
                        int i66 = CandleSticksView.S;
                        gVar3.f256923h = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat2);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(gVar2.f256921c, gVar.f256921c);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i2;
                CandleSticksView candleSticksView = this;
                g gVar3 = gVar2;
                switch (i6) {
                    case 0:
                        int i21 = CandleSticksView.S;
                        gVar3.f256919a = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 1:
                        int i22 = CandleSticksView.S;
                        gVar3.f256920b = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 2:
                        int i32 = CandleSticksView.S;
                        gVar3.f256921c = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 3:
                        int i33 = CandleSticksView.S;
                        gVar3.d = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 4:
                        int i43 = CandleSticksView.S;
                        gVar3.e = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 5:
                        int i59 = CandleSticksView.S;
                        gVar3.f256922g = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    default:
                        int i66 = CandleSticksView.S;
                        gVar3.f256923h = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat3);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(gVar2.d, gVar.d);
        final int i6 = 3;
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i66 = i6;
                CandleSticksView candleSticksView = this;
                g gVar3 = gVar2;
                switch (i66) {
                    case 0:
                        int i21 = CandleSticksView.S;
                        gVar3.f256919a = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 1:
                        int i22 = CandleSticksView.S;
                        gVar3.f256920b = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 2:
                        int i32 = CandleSticksView.S;
                        gVar3.f256921c = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 3:
                        int i33 = CandleSticksView.S;
                        gVar3.d = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 4:
                        int i43 = CandleSticksView.S;
                        gVar3.e = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 5:
                        int i59 = CandleSticksView.S;
                        gVar3.f256922g = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    default:
                        int i662 = CandleSticksView.S;
                        gVar3.f256923h = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat4);
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(gVar2.e, gVar.e);
        final int i21 = 4;
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i66 = i21;
                CandleSticksView candleSticksView = this;
                g gVar3 = gVar2;
                switch (i66) {
                    case 0:
                        int i212 = CandleSticksView.S;
                        gVar3.f256919a = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 1:
                        int i22 = CandleSticksView.S;
                        gVar3.f256920b = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 2:
                        int i32 = CandleSticksView.S;
                        gVar3.f256921c = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 3:
                        int i33 = CandleSticksView.S;
                        gVar3.d = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 4:
                        int i43 = CandleSticksView.S;
                        gVar3.e = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 5:
                        int i59 = CandleSticksView.S;
                        gVar3.f256922g = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    default:
                        int i662 = CandleSticksView.S;
                        gVar3.f256923h = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat5);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(gVar2.f256922g, gVar.f256922g);
        final int i22 = 5;
        valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i66 = i22;
                CandleSticksView candleSticksView = this;
                g gVar3 = gVar2;
                switch (i66) {
                    case 0:
                        int i212 = CandleSticksView.S;
                        gVar3.f256919a = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 1:
                        int i222 = CandleSticksView.S;
                        gVar3.f256920b = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 2:
                        int i32 = CandleSticksView.S;
                        gVar3.f256921c = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 3:
                        int i33 = CandleSticksView.S;
                        gVar3.d = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 4:
                        int i43 = CandleSticksView.S;
                        gVar3.e = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 5:
                        int i59 = CandleSticksView.S;
                        gVar3.f256922g = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    default:
                        int i662 = CandleSticksView.S;
                        gVar3.f256923h = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat6);
        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(gVar2.f256923h, gVar.f256923h);
        final int i32 = 6;
        valueAnimatorOfFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i66 = i32;
                CandleSticksView candleSticksView = this;
                g gVar3 = gVar2;
                switch (i66) {
                    case 0:
                        int i212 = CandleSticksView.S;
                        gVar3.f256919a = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 1:
                        int i222 = CandleSticksView.S;
                        gVar3.f256920b = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 2:
                        int i322 = CandleSticksView.S;
                        gVar3.f256921c = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 3:
                        int i33 = CandleSticksView.S;
                        gVar3.d = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 4:
                        int i43 = CandleSticksView.S;
                        gVar3.e = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    case 5:
                        int i59 = CandleSticksView.S;
                        gVar3.f256922g = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                    default:
                        int i662 = CandleSticksView.S;
                        gVar3.f256923h = ((Float) n.g(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        candleSticksView.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat7);
        r0 r0Var = gVar.f;
        Intrinsics.checkNotNullParameter(r0Var, "<set-?>");
        gVar2.f = r0Var;
        AnimatorSet animatorSet = this.f56579x;
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(new OvershootInterpolator());
        ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) arrayList.toArray(new ValueAnimator[0]);
        animatorSet.playTogether((Animator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length));
    }

    public final void c(int i, rs0.g gVar) {
        rs0.g gVar2 = (rs0.g) this.f56570l.get(i);
        r0 r0Var = gVar.f;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(r0Var, "<set-?>");
        gVar2.f = r0Var;
        gVar2.f256919a = gVar.f256919a;
        gVar2.e = gVar.e;
        gVar2.d = gVar.d;
        gVar2.f256920b = gVar.f256920b;
        gVar2.f256921c = gVar.f256921c;
        gVar2.f256922g = gVar.f256922g;
        gVar2.f256923h = gVar.f256923h;
    }

    public final void d(Canvas canvas) {
        Unit unit;
        String str;
        rs0.g gVar = this.candleToElaborate;
        if (gVar != null) {
            float f = this.f56575r + d.f256911g;
            int i = this.D;
            Paint paint = this.v;
            paint.setColor(i);
            paint.setStrokeWidth(d.i);
            float f4 = gVar.f256919a;
            canvas.drawLine(f4, gVar.f256923h, f4, f, paint);
            if (!gVar.f.i) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                xi0.b bVar = gVar.f.f10504h;
                ty0.c clauseDisplayer = getClauseDisplayer();
                Clause clause = (Clause) this.selectedCandleFormat.a().invoke(new ej0.b(gVar.f.f10502c, bVar));
                int i2 = R$id.open_value;
                View view = this.F;
                View viewFindViewById = view.findViewById(i2);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                ty0.c.b(clauseDisplayer, clause, (TextView) viewFindViewById, null, null, 12);
                ty0.c clauseDisplayer2 = getClauseDisplayer();
                Clause clause2 = (Clause) this.selectedCandleFormat.a().invoke(new ej0.b(gVar.f.d, bVar));
                View viewFindViewById2 = view.findViewById(R$id.close_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                ty0.c.b(clauseDisplayer2, clause2, (TextView) viewFindViewById2, null, null, 12);
                ty0.c clauseDisplayer3 = getClauseDisplayer();
                Clause clause3 = (Clause) this.selectedCandleFormat.a().invoke(new ej0.b(gVar.f.e, bVar));
                View viewFindViewById3 = view.findViewById(R$id.high_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                ty0.c.b(clauseDisplayer3, clause3, (TextView) viewFindViewById3, null, null, 12);
                ty0.c clauseDisplayer4 = getClauseDisplayer();
                Clause clause4 = (Clause) this.selectedCandleFormat.a().invoke(new ej0.b(gVar.f.f, bVar));
                View viewFindViewById4 = view.findViewById(R$id.low_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                ty0.c.b(clauseDisplayer4, clause4, (TextView) viewFindViewById4, null, null, 12);
                ty0.c clauseDisplayer5 = getClauseDisplayer();
                Clause clause5 = (Clause) this.selectedCandleFormat.b().invoke(new ej0.b(gVar.f.f10503g, bVar));
                View viewFindViewById5 = view.findViewById(R$id.volume_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                ty0.c.b(clauseDisplayer5, clause5, (TextView) viewFindViewById5, null, null, 12);
                TextView textView = (TextView) view.findViewById(R$id.change_value);
                r0 r0Var = gVar.f;
                textView.setTextColor(r0Var.d.compareTo(r0Var.f10502c) < 0 ? this.B : this.z);
                TextView textView2 = (TextView) view.findViewById(R$id.change_value);
                if (gVar.f.f10502c.compareTo(BigDecimal.ZERO) != 0) {
                    r0 r0Var2 = gVar.f;
                    BigDecimal bigDecimal = r0Var2.d;
                    BigDecimal bigDecimal2 = r0Var2.f10502c;
                    Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
                    MathContext DECIMAL128 = MathContext.DECIMAL128;
                    BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, DECIMAL128);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "access$div(...)");
                    Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
                    BigDecimal bigDecimalSubtract = bigDecimalDivide.subtract(new BigDecimal(1, DECIMAL128));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
                    BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(new BigDecimal(100, DECIMAL128));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    str = bigDecimalMultiply.setScale(2, RoundingMode.HALF_UP) + "%";
                } else {
                    str = "100%";
                }
                textView2.setText(str);
                View viewFindViewById6 = view.findViewById(R$id.volume);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                viewFindViewById6.setVisibility(this.showVolume ? 0 : 8);
                View viewFindViewById7 = view.findViewById(R$id.volume_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
                viewFindViewById7.setVisibility(this.showVolume ? 0 : 8);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                Float fValueOf = Float.valueOf(view.getMeasuredWidth());
                view.getMeasuredHeight();
                float fFloatValue = fValueOf.floatValue();
                float f5 = gVar.f256919a;
                float f6 = d.f256912h;
                float width = (f5 - fFloatValue) - f6;
                float f32 = f5 + f6;
                if (width < d.f256910c) {
                    width = f32 + fFloatValue <= ((float) canvas.getWidth()) - getYAxisWidth() ? f32 : (canvas.getWidth() - fFloatValue) - getYAxisWidth();
                }
                float f35 = f + d.f256913j;
                canvas.save();
                canvas.translate(width, f35);
                view.draw(canvas);
                canvas.restore();
            }
            unit = Unit.f186387a;
        } else {
            unit = null;
        }
        getVerticalLineBadge().setVisibility((unit != null || this.verticalLineData == null) ? 4 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f56564a.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f56564a.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView.e(android.graphics.Canvas):void");
    }

    public final rs0.g f(float f) {
        z8 z8Var = this.plotData;
        if (z8Var == null) {
            return null;
        }
        ArrayList arrayList = z8Var.f10648c;
        j3i.n nVar = new j3i.n(this, f, 3);
        int iG = v.g(this.f56570l, new i1.h(f, 1));
        return iG >= 0 ? (rs0.g) nVar.invoke(Integer.valueOf(Math.min(arrayList.size() - 1, iG))) : (rs0.g) nVar.invoke(Integer.valueOf(Math.min(arrayList.size() - 1, -(iG + 1))));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView.g():void");
    }

    public final Function1<r0, Unit> getCandleSelectedCallback() {
        return this.candleSelectedCallback;
    }

    @NotNull
    public final ty0.c getClauseDisplayer() {
        return u.k(this).b0();
    }

    public final boolean getCompressGraph() {
        return this.compressGraph;
    }

    @Override // android.view.View
    public final Clause getContentDescription() {
        return this.contentDescription;
    }

    public final c getCopies() {
        return this.copies;
    }

    public final uw0.i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    public final z8 getPlotData() {
        return this.plotData;
    }

    @NotNull
    public final k0 getSelectedCandleFormat() {
        return this.selectedCandleFormat;
    }

    public final boolean getShowVolume() {
        return this.showVolume;
    }

    public final rs0.e getVerticalLineData() {
        return this.verticalLineData;
    }

    public final i getYAxis() {
        return this.yAxis;
    }

    public final void h(float f) {
        this.P.set(-999999.0f, -999999.0f);
        getParent().requestDisallowInterceptTouchEvent(true);
        setCandleToElaborate(f(f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight();
        float width = getWidth();
        if (this.plotData != null) {
            h hVar = this.f56571m;
            if (hVar != null) {
                float f = hVar.f256924a;
                canvas2 = canvas;
                canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, f, this.f56574q, f, this.f56578w);
            } else {
                canvas2 = canvas;
            }
            int iSave = canvas2.save();
            try {
                canvas2.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.appearingAnimatedValue * width, height);
                e(canvas2);
                d(canvas2);
            } finally {
                canvas2.restoreToCount(iSave);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f56564a.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        g();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        PointF pointF = this.Q;
        a aVar = this.R;
        PointF pointF2 = this.P;
        if (action == 0) {
            pointF2.set(event.getX(), event.getY());
            pointF.set(event.getX(), event.getY());
            getHandler().postDelayed(aVar, this.O);
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (pointF2.x == -999999.0f) {
                    setCandleToElaborate(f(event.getX()));
                } else if (Math.abs(event.getX() - pointF2.x) >= this.N) {
                    h(event.getX());
                    getHandler().removeCallbacks(aVar);
                }
                pointF.set(event.getX(), event.getY());
                invalidate();
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(event);
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        setCandleToElaborate(null);
        getHandler().removeCallbacks(aVar);
        invalidate();
        return true;
    }

    public final void setCandleSelectedCallback(Function1<? super r0, Unit> function1) {
        if (Intrinsics.f(this.candleSelectedCallback, function1)) {
            return;
        }
        this.candleSelectedCallback = function1;
        if (function1 != null) {
            rs0.g gVar = this.candleToElaborate;
            function1.invoke(gVar != null ? gVar.f : null);
            Unit unit = Unit.f186387a;
        }
    }

    public final void setCompressGraph(boolean z) {
        if (z == this.compressGraph) {
            return;
        }
        this.compressGraph = z;
        g();
    }

    public final void setContentDescription(Clause clause) {
        if (Intrinsics.f(this.contentDescription, clause)) {
            return;
        }
        this.contentDescription = clause;
        this.f56564a.invalidateRoot();
    }

    public final void setCopies(c cVar) {
        if (Intrinsics.f(this.copies, cVar)) {
            return;
        }
        this.copies = cVar;
        ty0.c cVarB0 = u.k(this).b0();
        Clause clause = cVar != null ? cVar.f256905a : null;
        int i = R$id.open;
        View view = this.F;
        View viewFindViewById = view.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ty0.c.b(cVarB0, clause, (TextView) viewFindViewById, null, null, 12);
        ty0.c cVarB02 = u.k(this).b0();
        Clause clause2 = cVar != null ? cVar.f256907c : null;
        View viewFindViewById2 = view.findViewById(R$id.high);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ty0.c.b(cVarB02, clause2, (TextView) viewFindViewById2, null, null, 12);
        ty0.c cVarB03 = u.k(this).b0();
        Clause clause3 = cVar != null ? cVar.d : null;
        View viewFindViewById3 = view.findViewById(R$id.low);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ty0.c.b(cVarB03, clause3, (TextView) viewFindViewById3, null, null, 12);
        ty0.c cVarB04 = u.k(this).b0();
        Clause clause4 = cVar != null ? cVar.f256906b : null;
        View viewFindViewById4 = view.findViewById(R$id.close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ty0.c.b(cVarB04, clause4, (TextView) viewFindViewById4, null, null, 12);
        ty0.c cVarB05 = u.k(this).b0();
        Clause clause5 = cVar != null ? cVar.e : null;
        View viewFindViewById5 = view.findViewById(R$id.volume);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ty0.c.b(cVarB05, clause5, (TextView) viewFindViewById5, null, null, 12);
        ty0.c cVarB06 = u.k(this).b0();
        Clause clause6 = cVar != null ? cVar.f : null;
        View viewFindViewById6 = view.findViewById(R$id.change);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ty0.c.b(cVarB06, clause6, (TextView) viewFindViewById6, null, null, 12);
        invalidate();
    }

    public final void setDataChangeAnimationRequest(uw0.i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        if (this.plotData != null) {
            this.L.a(iVar);
        }
    }

    public final void setPlotData(z8 z8Var) {
        z8 z8Var2 = this.plotData;
        boolean z = true;
        if (z8Var2 != null) {
            ArrayList arrayList = z8Var2.f10648c;
            if (z8Var != null) {
                ArrayList arrayList2 = z8Var.f10648c;
                if (Math.abs(arrayList.size() - arrayList2.size()) <= 2) {
                    int size = arrayList2.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!arrayList.contains((r0) arrayList2.get(i2))) {
                            i++;
                        }
                    }
                    if (i <= 2) {
                        z = false;
                    }
                }
            }
        }
        this.J = z;
        if (z8Var == null || z8Var.f10648c.isEmpty()) {
            z8Var = null;
        }
        this.plotData = z8Var;
        g();
        this.f56564a.invalidateRoot();
    }

    public final void setSelectedCandleFormat(@NotNull k0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(value, this.selectedCandleFormat)) {
            return;
        }
        this.selectedCandleFormat = value;
        g();
    }

    public final void setShowVolume(boolean z) {
        if (z == this.showVolume) {
            return;
        }
        this.showVolume = z;
        g();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setVerticalLineData(rs0.e eVar) {
        if (Intrinsics.f(eVar, this.verticalLineData)) {
            return;
        }
        this.verticalLineData = eVar;
        if (eVar != null) {
            getVerticalLineBadge().setVisibility(0);
            getVerticalLineBadge().setContent(new ms0.u(eVar.f256916b));
        } else {
            getVerticalLineBadge().setVisibility(8);
        }
        g();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setYAxis(i iVar) {
        ArrayList arrayList;
        if (Intrinsics.f(iVar, this.yAxis)) {
            return;
        }
        this.yAxis = iVar;
        if (iVar != null) {
            ArrayList arrayList2 = iVar.f256925a;
            Iterator it8 = arrayList2.iterator();
            int i = 0;
            while (true) {
                boolean zHasNext = it8.hasNext();
                arrayList = this.H;
                if (!zHasNext) {
                    break;
                }
                int i2 = i + 1;
                f fVar = (f) it8.next();
                while (i >= arrayList.size()) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    arrayList.add(d.a(context));
                    addView((View) d0.m0(arrayList));
                }
                x xVar = (x) arrayList.get(i);
                xVar.setContent(new ms0.u(fVar.f256918b));
                xVar.setStyle(iVar.f256926b);
                xVar.setVisibility(0);
                i = i2;
            }
            int size = arrayList.size();
            for (int size2 = arrayList2.size(); size2 < size; size2++) {
                ((View) arrayList.get(size2)).setVisibility(8);
            }
        }
        requestLayout();
        g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CandleSticksView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CandleSticksView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = new b(this);
        this.f56564a = bVar;
        this.showVolume = true;
        this.compressGraph = true;
        this.selectedCandleFormat = k0.b.d;
        this.f56570l = new ArrayList();
        this.f56572n = new BigDecimal(String.valueOf(BitmapDescriptorFactory.HUE_RED));
        this.o = new BigDecimal(String.valueOf(BitmapDescriptorFactory.HUE_RED));
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.v = paintC;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{kli.a.l(context, 1.0f), kli.a.l(context, 5.0f)}, BitmapDescriptorFactory.HUE_RED));
        paint.setStrokeWidth(kli.a.l(context, 1.0f));
        this.f56578w = paint;
        this.f56579x = new AnimatorSet();
        this.z = kli.a.s(R$attr.uikit_colorPerformancePositive, context);
        this.A = kli.a.s(R$attr.uikit_colorPerformancePositive_80, context);
        this.B = kli.a.s(R$attr.uikit_colorPerformanceNegative, context);
        this.C = kli.a.s(R$attr.uikit_colorPerformanceNegative_80, context);
        this.D = kli.a.s(R$attr.uikit_colorForeground, context);
        this.E = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        this.F = LayoutInflater.from(context).inflate(R$layout.internal_candles_popup, (ViewGroup) null);
        this.G = w.y0(new lu0.a(context, 23));
        this.H = new ArrayList();
        this.appearingAnimatedValue = 1.0f;
        g gVarA = ebm.a.a(this, paintC);
        this.K = gVarA;
        this.L = new j(this, gVarA, q.b(new l(this, 2)), new lm.d(13));
        this.M = new e(this, gVarA);
        setWillNotDraw(false);
        addView(getVerticalLineBadge());
        ViewCompat.setAccessibilityDelegate(this, bVar);
        this.N = ViewConfiguration.get(context).getScaledTouchSlop();
        this.O = ViewConfiguration.getLongPressTimeout();
        this.P = new PointF();
        this.Q = new PointF();
        this.R = new a(this, 22);
    }

    public /* synthetic */ CandleSticksView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
