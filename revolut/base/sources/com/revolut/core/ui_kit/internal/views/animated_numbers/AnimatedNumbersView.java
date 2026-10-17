package com.revolut.core.ui_kit.internal.views.animated_numbers;

import a.a;
import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$attr;
import aw0.fa;
import aw0.o9;
import bp0.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.youTransactor.uCube.rpc.Constants;
import fs0.b;
import ht0.b0;
import ifm.c;
import java.math.BigDecimal;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import jh.d;
import jo0.h;
import jo0.m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import noi.l;
import nr0.c;
import nr0.e;
import ns0.f;
import ns0.g;
import ns0.o;
import ns0.p;
import ns0.r;
import ns0.s;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 v2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R4\u00100\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000eR*\u00106\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u00105R(\u0010;\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010A\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0013R*\u0010E\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010\u0013R*\u0010I\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010=\u001a\u0004\bG\u0010?\"\u0004\bH\u0010\u0013R*\u0010M\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?\"\u0004\bL\u0010\u0013R*\u0010Q\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00102\u001a\u0004\bO\u0010\u0019\"\u0004\bP\u00105R*\u0010U\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u00102\u001a\u0004\bS\u0010\u0019\"\u0004\bT\u00105R*\u0010Y\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u00102\u001a\u0004\bW\u0010\u0019\"\u0004\bX\u00105R$\u0010_\u001a\u00020Z2\u0006\u0010\u001e\u001a\u00020Z8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010b\u001a\u00020Z2\u0006\u0010\u001e\u001a\u00020Z8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b`\u0010\\\"\u0004\ba\u0010^R$\u0010f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010\u001c\"\u0004\bd\u0010eR$\u0010i\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010\u0019\"\u0004\bh\u00105R$\u0010o\u001a\u00020j2\u0006\u0010\u001e\u001a\u00020j8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010u\u001a\u00020p2\u0006\u0010\u001e\u001a\u00020p8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010t¨\u0006w"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/animated_numbers/AnimatedNumbersView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setClauseImmediately$ui_kit_components_release", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setClauseImmediately", "", "enabled", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "getBaseline", "()I", "", "getSpanAwareTextWidth", "()F", "", "value", "setDisplayedText", "(Ljava/lang/CharSequence;)V", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnBarrelAnimationEndListener", "()Lkotlin/jvm/functions/Function0;", "setOnBarrelAnimationEndListener", "(Lkotlin/jvm/functions/Function0;)V", "onBarrelAnimationEndListener", "b", "Lcom/revolut/core/ui_kit/models/Clause;", "getCurrentClause", "()Lcom/revolut/core/ui_kit/models/Clause;", "setCurrentClause", "getCurrentClause$annotations", "()V", "currentClause", "c", "I", "getTextAppearance", "setTextAppearance", "(I)V", "textAppearance", "d", "Ljava/lang/Integer;", "setExplicitLineHeightPx", "(Ljava/lang/Integer;)V", "explicitLineHeightPx", "e", "Z", "getIncludeFontPadding$ui_kit_components_release", "()Z", "setIncludeFontPadding$ui_kit_components_release", "includeFontPadding", "f", "getAnimateSpin", "setAnimateSpin", "animateSpin", "g", "getAnimateColour", "setAnimateColour", "animateColour", "h", "getAutoSize", "setAutoSize", "autoSize", "i", "getGravity", "setGravity", "gravity", "j", "getHigherColour", "setHigherColour", "higherColour", "k", "getLowerColour", "setLowerColour", "lowerColour", "", "q", "Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "prefix", "r", "setSuffix", "suffix", "getTextSizePx", "setTextSizePx", "(F)V", "textSizePx", "getTextColor", "setTextColor", "textColor", "", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/animation/TimeInterpolator;", "getAnimationInterpolator", "()Landroid/animation/TimeInterpolator;", "setAnimationInterpolator", "(Landroid/animation/TimeInterpolator;)V", "animationInterpolator", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimatedNumbersView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int[] S = {R.attr.textSize, R.attr.textColor};
    public float A;
    public float B;
    public int C;
    public float D;
    public float E;
    public float F;
    public int G;
    public c H;
    public c I;
    public h01.c J;
    public final h K;
    public boolean L;
    public final ArrayList M;
    public final ArrayList N;
    public final e O;
    public final TextPaint P;
    public final Paint.FontMetricsInt Q;
    public final k18.c R;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Function0 onBarrelAnimationEndListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Clause currentClause;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int textAppearance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Integer explicitLineHeightPx;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean includeFontPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean animateSpin;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean animateColour;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean autoSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int gravity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int higherColour;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int lowerColour;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f56501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f56502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f56503n;
    public final LinkedHashSet o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f56504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public String prefix;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public String suffix;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f56507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f56508t;
    public int u;
    public CharSequence v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequenceClause f56509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Clause f56510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f56511y;
    public float z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedNumbersView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(AnimatedNumbersView animatedNumbersView) {
        int i = animatedNumbersView.f56508t;
        for (int i2 = 0; i2 < i; i2++) {
            g gVar = (g) animatedNumbersView.M.get(i2);
            float f = gVar.e;
            gVar.d = f;
            gVar.f218690c = f;
            int i3 = gVar.f218693j;
            gVar.f218692h = i3;
            gVar.f218691g = i3;
        }
        float f4 = animatedNumbersView.A;
        animatedNumbersView.n();
        if (f4 != animatedNumbersView.A) {
            animatedNumbersView.requestLayout();
        }
        Function0 function0 = animatedNumbersView.onBarrelAnimationEndListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static Pair f(String str, String str2) {
        if (str.length() > str2.length()) {
            return new Pair(0, Boolean.FALSE);
        }
        if (str.length() < str2.length()) {
            return new Pair(0, Boolean.TRUE);
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return new Pair(Integer.valueOf(i), Boolean.valueOf(Intrinsics.k(str.charAt(i), str2.charAt(i)) < 0));
            }
        }
        throw new IllegalStateException("Should not get here");
    }

    public static /* synthetic */ void getCurrentClause$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getSpanAwareTextWidth() {
        boolean zBooleanValue = ((Boolean) jo0.g.R.getValue()).booleanValue();
        TextPaint textPaint = this.P;
        if (!zBooleanValue) {
            return textPaint.measureText(this.v.toString()) + this.D + this.F;
        }
        return textPaint.measureText(this.suffix) + textPaint.measureText(this.prefix) + Layout.getDesiredWidth(this.v, textPaint);
    }

    private final void setDisplayedText(CharSequence value) {
        if (Intrinsics.f(this.v, value)) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < value.length(); i2++) {
            if (Character.isDigit(value.charAt(i2))) {
                i++;
            }
        }
        int length = value.length() - i;
        ArrayList arrayList = this.M;
        if (i > arrayList.size()) {
            int iMax = Math.max(i - arrayList.size(), 20);
            for (int i3 = 0; i3 < iMax; i3++) {
                arrayList.add(new g(0));
            }
        }
        ArrayList arrayList2 = this.N;
        if (length > arrayList2.size()) {
            int iMax2 = Math.max(length - arrayList2.size(), 10);
            for (int i5 = 0; i5 < iMax2; i5++) {
                arrayList2.add(new r());
            }
        }
        Clause clause = this.currentClause;
        o9 o9Var = (clause == null || !((y) u.k(this).b0()).h(clause)) ? o9.NON_SENSITIVE : o9.SENSITIVE;
        this.v = value;
        this.f56509w = new CharSequenceClause(value, o9Var);
        this.f56511y = true;
        int i6 = this.C;
        if (i6 <= 1) {
            this.C = i6 + 1;
        }
        requestLayout();
    }

    private final void setExplicitLineHeightPx(Integer num) {
        if (Intrinsics.f(this.explicitLineHeightPx, num)) {
            return;
        }
        this.explicitLineHeightPx = num;
        requestLayout();
        invalidate();
    }

    private final void setPrefix(String str) {
        if (Intrinsics.f(this.prefix, str)) {
            return;
        }
        this.prefix = str;
        this.D = this.P.measureText(str);
        this.f56511y = true;
        requestLayout();
    }

    private final void setSuffix(String str) {
        if (Intrinsics.f(this.suffix, str)) {
            return;
        }
        this.suffix = str;
        this.F = this.P.measureText(str);
        this.f56511y = true;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r16v0, types: [ns0.b] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r21v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r22v14, types: [ns0.b] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ns0.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ns0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instruction units count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView.b():boolean");
    }

    public final float c(float f) {
        float width;
        int i = this.gravity & 7;
        if (i == 1) {
            width = getWidth() / 2.0f;
            f /= 2.0f;
        } else {
            if (i != 5) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            width = getWidth();
        }
        return width - f;
    }

    public final void d() {
        boolean z = this.animateColour;
        f fVar = this.f56502m;
        if (!z) {
            fVar.f218686a = -1;
            return;
        }
        CharSequence charSequence = this.v;
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (Character.isDigit(charSequence.charAt(i2))) {
                i++;
            }
        }
        int i3 = this.f56508t;
        if (i > i3) {
            fVar.f218686a = 0;
            fVar.f218687b = false;
            return;
        }
        if (i < i3) {
            fVar.f218686a = 0;
            fVar.f218687b = true;
            return;
        }
        int length = this.v.length();
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = this.v.charAt(i6);
            if (Character.isDigit(cCharAt)) {
                g gVar = (g) this.M.get(i5);
                float fK = k() - (((int) l()) * (cCharAt - '0'));
                float f = gVar.e;
                if (f < fK) {
                    fVar.f218686a = i5;
                    fVar.f218687b = true;
                    return;
                } else {
                    if (f > fK) {
                        fVar.f218686a = i5;
                        fVar.f218687b = false;
                        return;
                    }
                    i5++;
                }
            }
        }
        fVar.f218686a = -1;
    }

    public final void e(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, boolean z) {
        String strSubstring;
        boolean zF = Intrinsics.f(bigDecimal, bigDecimal2);
        boolean z3 = false;
        f fVar = this.f56502m;
        if (!zF) {
            Pair pairF = f(String.valueOf(bigDecimal.longValue()), String.valueOf(bigDecimal2.longValue()));
            fVar.f218686a = ((Number) pairF.f186385a).intValue();
            boolean zBooleanValue = ((Boolean) pairF.f186386b).booleanValue();
            if (z) {
                z3 = zBooleanValue;
            } else if (!zBooleanValue) {
                z3 = true;
            }
            fVar.f218687b = z3;
            return;
        }
        String string = bigDecimal3.toString();
        String strSubstring2 = "";
        if (string.length() < 3) {
            strSubstring = "";
        } else {
            strSubstring = string.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        String string2 = bigDecimal4.toString();
        if (string2.length() >= 3) {
            strSubstring2 = string2.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        }
        Pair pairF2 = f(strSubstring, strSubstring2);
        fVar.f218686a = ((Number) pairF2.f186385a).intValue() + String.valueOf(bigDecimal.longValue()).length();
        boolean zBooleanValue2 = ((Boolean) pairF2.f186386b).booleanValue();
        if (z) {
            z3 = zBooleanValue2;
        } else if (!zBooleanValue2) {
            z3 = true;
        }
        fVar.f218687b = z3;
    }

    public final void g(boolean z) {
        if (this.f56511y || z) {
            e eVar = this.O;
            eVar.a();
            CharSequenceClause charSequenceClause = this.f56509w;
            TextPaint paint = this.P;
            eVar.f(charSequenceClause, paint);
            String str = this.prefix;
            Intrinsics.checkNotNullParameter(paint, "paint");
            if (str != null) {
                eVar.f(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), paint);
            }
            String str2 = this.suffix;
            Intrinsics.checkNotNullParameter(paint, "paint");
            if (str2 != null) {
                eVar.f(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), paint);
            }
            this.f56511y = false;
        }
    }

    public final boolean getAnimateColour() {
        return this.animateColour;
    }

    public final boolean getAnimateSpin() {
        return this.animateSpin;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ns0.b] */
    public final long getAnimationDuration() {
        return this.f56501l.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ns0.b] */
    @NotNull
    public final TimeInterpolator getAnimationInterpolator() {
        return this.f56501l.h();
    }

    public final boolean getAutoSize() {
        return this.autoSize;
    }

    @Override // android.view.View
    public int getBaseline() {
        return (int) k();
    }

    public final Clause getCurrentClause() {
        return this.currentClause;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHigherColour() {
        return this.higherColour;
    }

    /* JADX INFO: renamed from: getIncludeFontPadding$ui_kit_components_release, reason: from getter */
    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public final int getLowerColour() {
        return this.lowerColour;
    }

    public final Function0<Unit> getOnBarrelAnimationEndListener() {
        return this.onBarrelAnimationEndListener;
    }

    public final int getTextAppearance() {
        return this.textAppearance;
    }

    /* JADX INFO: renamed from: getTextColor, reason: from getter */
    public final int getG() {
        return this.G;
    }

    public final float getTextSizePx() {
        return this.P.getTextSize();
    }

    public final boolean h() {
        h01.c cVarA = u.k(this).Z().a();
        if (!this.animateSpin && !this.animateColour) {
            return false;
        }
        boolean z = m.f176847a;
        if (m.f176851h) {
            return cVarA != h01.c.HIDDEN || this.O.f218515h <= 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final int i() {
        int i;
        int i2;
        if (!h() && !this.includeFontPadding) {
            String str = this.prefix;
            e eVar = this.O;
            TextPaint textPaint = this.P;
            Layout layoutC = eVar.c(str, textPaint);
            CharSequenceClause charSequenceClause = this.f56509w;
            Layout layoutB = charSequenceClause != null ? eVar.b(charSequenceClause, textPaint) : null;
            return Math.max(layoutC.getHeight(), Math.max(layoutB != null ? layoutB.getHeight() : 0, eVar.c(this.suffix, textPaint).getHeight()));
        }
        boolean z = this.includeFontPadding;
        Paint.FontMetricsInt fontMetricsInt = this.Q;
        if (z) {
            i = fontMetricsInt.bottom;
            i2 = fontMetricsInt.top;
        } else {
            i = fontMetricsInt.descent;
            i2 = fontMetricsInt.ascent;
        }
        int i3 = i - i2;
        return (((Boolean) jo0.g.R.getValue()).booleanValue() && h()) ? (int) Math.max(i3, this.A) : i3;
    }

    public final int j() {
        if (h()) {
            return (int) Math.ceil(this.D + this.E + this.F);
        }
        String str = this.prefix;
        e eVar = this.O;
        TextPaint textPaint = this.P;
        Layout layoutC = eVar.c(str, textPaint);
        CharSequenceClause charSequenceClause = this.f56509w;
        Layout layoutB = charSequenceClause != null ? eVar.b(charSequenceClause, textPaint) : null;
        return eVar.c(this.suffix, textPaint).getWidth() + layoutC.getWidth() + (layoutB != null ? layoutB.getWidth() : 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final float k() {
        float f = -(this.includeFontPadding ? this.Q.top : this.P.ascent());
        if (!((Boolean) jo0.g.R.getValue()).booleanValue() || !h()) {
            return f;
        }
        float fL = (this.A - l()) / 2.0f;
        if (fL < BitmapDescriptorFactory.HUE_RED) {
            fL = 0.0f;
        }
        return f + fL;
    }

    public final float l() {
        if (this.explicitLineHeightPx != null) {
            return r0.intValue();
        }
        TextPaint textPaint = this.P;
        return textPaint.descent() + (-textPaint.ascent());
    }

    public final void m(Clause clause) {
        CharSequence charSequenceA;
        if (clause == null) {
            return;
        }
        ty0.c cVarB0 = u.k(this).b0();
        if (u.k(this).Z().a() == h01.c.NON_HIDDEN) {
            y yVar = (y) cVarB0;
            Clause clauseV = yVar.v(clause);
            if (clauseV != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                charSequenceA = ty0.c.a(yVar, clauseV, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            } else {
                charSequenceA = this.v;
            }
        } else {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_accessibility_label_hidden_content, null, null, 14);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            charSequenceA = ty0.c.a(cVarB0, textLocalisedClause, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        setContentDescription(charSequenceA);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void n() {
        Drawable drawable;
        Rect bounds;
        boolean zBooleanValue = ((Boolean) jo0.g.R.getValue()).booleanValue();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (zBooleanValue) {
            int i = this.u;
            float fMax = 0.0f;
            for (int i2 = 0; i2 < i; i2++) {
                ImageSpan imageSpan = ((r) this.N.get(i2)).d;
                fMax = Math.max(fMax, (imageSpan == null || (drawable = imageSpan.getDrawable()) == null || (bounds = drawable.getBounds()) == null) ? 0.0f : bounds.height());
            }
            f = fMax;
        }
        this.A = f;
    }

    public final void o() {
        boolean z = this.L && isEnabled() && hasOnClickListeners();
        TextPaint textPaint = this.P;
        if (textPaint.isUnderlineText() == z) {
            return;
        }
        textPaint.setUnderlineText(z);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = this.K.f176841b.subscribe(new l(9, new ns0.c(this, 0)));
        this.I = u.k(this).Z().c().subscribe(new l(10, new ns0.c(this, 1)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ns0.b] */
    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.H;
        if (cVar != null) {
            cVar.dispose();
        }
        this.H = null;
        c cVar2 = this.I;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.I = null;
        this.f56501l.cancel();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ns0.b] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        k18.c cVar;
        ArrayList arrayList;
        ?? r3;
        ArrayList arrayList2;
        float f;
        float f4;
        float fMax;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(c(j()), BitmapDescriptorFactory.HUE_RED);
        boolean zH = h();
        int i = 0;
        TextPaint textPaint = this.P;
        if (zH) {
            float fK = k();
            canvas.drawText(this.prefix, BitmapDescriptorFactory.HUE_RED, fK, textPaint);
            int i2 = this.f56508t;
            int i3 = 0;
            while (true) {
                cVar = this.R;
                arrayList = this.M;
                r3 = this.f56501l;
                if (i3 >= i2) {
                    break;
                }
                g gVar = (g) arrayList.get(i3);
                int color = textPaint.getColor();
                MaskFilter maskFilter = textPaint.getMaskFilter();
                textPaint.setColor(gVar.f218692h);
                b bVar = gVar.k;
                cVar.d(bVar.f137515a, bVar.f137516b, bVar.f137517c);
                r3.e(canvas, gVar, textPaint, fK, this.z, getWidth());
                cVar.H();
                textPaint.setColor(color);
                textPaint.setMaskFilter(maskFilter);
                i3++;
            }
            canvas2 = canvas;
            r3.i(canvas2, textPaint, fK, this.z);
            int i5 = this.u;
            while (true) {
                arrayList2 = this.N;
                if (i >= i5) {
                    break;
                }
                r rVar = (r) arrayList2.get(i);
                b bVar2 = rVar.e;
                cVar.d(bVar2.f137515a, bVar2.f137516b, bVar2.f137517c);
                r3.c(canvas2, rVar, textPaint, fK, this.z);
                cVar.H();
                i++;
            }
            r3.k(canvas2, textPaint, fK, this.z);
            int i6 = this.f56508t;
            if (i6 == 0 && this.u == 0) {
                fMax = this.D;
            } else {
                if (i6 > 0) {
                    g gVar2 = (g) arrayList.get(i6 - 1);
                    f = gVar2.f218688a + gVar2.f218689b;
                } else {
                    f = this.D;
                }
                int i21 = this.u;
                if (i21 > 0) {
                    r rVar2 = (r) arrayList2.get(i21 - 1);
                    f4 = rVar2.f218724a + rVar2.f218725b;
                } else {
                    f4 = this.D;
                }
                fMax = Math.max(f, f4);
            }
            canvas2.drawText(this.suffix, fMax, fK, textPaint);
        } else {
            canvas2 = canvas;
            g(false);
            String str = this.prefix;
            e eVar = this.O;
            Layout layoutC = eVar.c(str, textPaint);
            CharSequenceClause charSequenceClause = this.f56509w;
            Layout layoutB = charSequenceClause != null ? eVar.b(charSequenceClause, textPaint) : null;
            Layout layoutC2 = eVar.c(this.suffix, textPaint);
            a.h(layoutC, canvas2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            float width = layoutC.getWidth() + BitmapDescriptorFactory.HUE_RED;
            if (layoutB != null) {
                a.h(layoutB, canvas2, width, BitmapDescriptorFactory.HUE_RED);
                width += layoutB.getWidth();
            }
            a.h(layoutC2, canvas2, width, BitmapDescriptorFactory.HUE_RED);
        }
        canvas2.restore();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ns0.b] */
    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (this.f56507s) {
            this.f56507s = false;
            this.f56501l.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView.onMeasure(int, int):void");
    }

    public final void setAnimateColour(boolean z) {
        if (this.animateColour == z) {
            return;
        }
        this.animateColour = z;
        invalidate();
    }

    public final void setAnimateSpin(boolean z) {
        if (this.animateSpin == z) {
            return;
        }
        this.animateSpin = z;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ns0.b] */
    public final void setAnimationDuration(long j2) {
        this.f56501l.d(j2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ns0.b] */
    public final void setAnimationInterpolator(@NotNull TimeInterpolator value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f56501l.l(value);
    }

    public final void setAutoSize(boolean z) {
        if (this.autoSize == z) {
            return;
        }
        this.autoSize = z;
        if (!z) {
            float f = this.B;
            TextPaint textPaint = this.P;
            textPaint.setTextSize(f);
            textPaint.getFontMetricsInt(this.Q);
        }
        requestLayout();
    }

    public final void setClauseImmediately$ui_kit_components_release(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        boolean z = this.animateColour;
        setAnimateSpin(false);
        setAnimateColour(false);
        setCurrentClause(clause);
        g(true);
        b();
        this.f56507s = false;
        this.f56510x = this.currentClause;
        setAnimateColour(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ns0.b] */
    public final void setCurrentClause(Clause clause) {
        Clause clause2;
        int iS;
        Object[] objArr;
        if (String.valueOf(this.currentClause).equals(String.valueOf(clause))) {
            return;
        }
        this.f56501l.cancel();
        this.f56510x = this.currentClause;
        this.currentClause = clause;
        if (clause != null) {
            ty0.c cVarB0 = u.k(this).b0();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            clause2 = clause;
            SpannableStringBuilder spannableStringBuilderA = ty0.c.a(cVarB0, clause2, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(spannableStringBuilderA, "<this>");
            Intrinsics.checkNotNullParameter(context2, "context");
            boolean zK = d.k(context2);
            Intrinsics.checkNotNullParameter(spannableStringBuilderA, "<this>");
            if (spannableStringBuilderA.length() != 0) {
                for (int i = 0; i < spannableStringBuilderA.length(); i++) {
                    char cCharAt = spannableStringBuilderA.charAt(i);
                    if (io3.h.h(cCharAt) || ((1424 <= cCharAt && cCharAt <= 2303) || ((55296 <= cCharAt && cCharAt <= 57343) || ((64285 <= cCharAt && cCharAt <= 65023) || (65136 <= cCharAt && cCharAt <= 65278))))) {
                        objArr = true;
                        break;
                    }
                }
                objArr = false;
                boolean zIsRtl = (zK ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR).isRtl(spannableStringBuilderA, 0, spannableStringBuilderA.length());
                if (objArr != false || zIsRtl) {
                    Bidi bidi = new Bidi(spannableStringBuilderA.toString(), zIsRtl ? 1 : 0);
                    if (bidi.isMixed()) {
                        int length = spannableStringBuilderA.length();
                        byte[] bArr = new byte[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            bArr[i2] = (byte) bidi.getLevelAt(i2);
                        }
                        Integer[] numArr = new Integer[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            numArr[i3] = Integer.valueOf(i3);
                        }
                        Bidi.reorderVisually(bArr, 0, numArr, 0, length);
                        StringBuilder sb6 = new StringBuilder(length);
                        for (int i5 = 0; i5 < length; i5++) {
                            sb6.append(spannableStringBuilderA.charAt(numArr[i5].intValue()));
                        }
                        int length2 = spannableStringBuilderA.length();
                        Object[] spans = spannableStringBuilderA.getSpans(0, length2, Object.class);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb6);
                        Intrinsics.h(spans);
                        if (spans.length != 0) {
                            int[] iArr = new int[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                iArr[numArr[i6].intValue()] = i6;
                            }
                            for (Object obj2 : spans) {
                                int spanStart = spannableStringBuilderA.getSpanStart(obj2);
                                int spanEnd = spannableStringBuilderA.getSpanEnd(obj2);
                                int spanFlags = spannableStringBuilderA.getSpanFlags(obj2);
                                int i21 = iArr[spanStart];
                                int i22 = iArr[spanEnd - 1];
                                spannableStringBuilder.setSpan(obj2, Math.min(i21, i22), Math.max(i21, i22) + 1, spanFlags);
                            }
                        }
                        spannableStringBuilderA = spannableStringBuilder;
                    }
                }
            }
            setDisplayedText(spannableStringBuilderA);
        } else {
            clause2 = clause;
        }
        this.f56511y = true;
        m(clause2);
        Clause clause3 = this.currentClause;
        fa faVar = clause3 instanceof fa ? (fa) clause3 : null;
        Custom custom = (Custom) (faVar != null ? faVar.getE() : null);
        Custom.Color color = custom != null ? custom.f57757a : null;
        Custom.Color.Solid solid = color instanceof Custom.Color.Solid ? (Custom.Color.Solid) color : null;
        Integer numValueOf = solid != null ? Integer.valueOf(solid.f57767a) : null;
        if (numValueOf != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iS = kli.a.s(numValueOf.intValue(), context3);
        } else {
            iS = this.G;
        }
        setTextColor(iS);
        requestLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        o();
    }

    public final void setGravity(int i) {
        if (this.gravity == i) {
            return;
        }
        this.gravity = i;
        invalidate();
    }

    public final void setHigherColour(int i) {
        if (this.higherColour == i) {
            return;
        }
        this.higherColour = i;
        invalidate();
    }

    public final void setIncludeFontPadding$ui_kit_components_release(boolean z) {
        if (this.includeFontPadding == z) {
            return;
        }
        this.includeFontPadding = z;
        requestLayout();
        invalidate();
    }

    public final void setLowerColour(int i) {
        if (this.lowerColour == i) {
            return;
        }
        this.lowerColour = i;
        invalidate();
    }

    public final void setOnBarrelAnimationEndListener(Function0<Unit> function0) {
        this.onBarrelAnimationEndListener = function0;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        super.setOnClickListener(l2);
        o();
    }

    public final void setTextAppearance(int i) {
        if (this.textAppearance == i) {
            return;
        }
        this.textAppearance = i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextPaint textPaint = this.P;
        jb3.l.d(textPaint, context, i);
        if (i != -1) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(kli.a.x(i, context2), new int[]{R$attr.lineHeight});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            numValueOf = dimensionPixelSize >= 0 ? Integer.valueOf(dimensionPixelSize) : null;
            typedArrayObtainStyledAttributes.recycle();
        }
        setExplicitLineHeightPx(numValueOf);
        textPaint.getFontMetricsInt(this.Q);
        this.B = textPaint.getTextSize();
        requestLayout();
    }

    public final void setTextColor(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        TextPaint textPaint = this.P;
        textPaint.setColor(i);
        if (!this.animateColour || this.C <= 1) {
            int i2 = this.f56508t;
            for (int i3 = 0; i3 < i2; i3++) {
                ArrayList arrayList = this.M;
                ((g) arrayList.get(i3)).f218691g = textPaint.getColor();
                ((g) arrayList.get(i3)).f218692h = textPaint.getColor();
                ((g) arrayList.get(i3)).i = textPaint.getColor();
                ((g) arrayList.get(i3)).f218693j = textPaint.getColor();
            }
        }
        invalidate();
    }

    public final void setTextSizePx(float f) {
        TextPaint textPaint = this.P;
        if (textPaint.getTextSize() == f) {
            return;
        }
        textPaint.setTextSize(f);
        textPaint.getFontMetricsInt(this.Q);
        this.B = f;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedNumbersView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public AnimatedNumbersView(@NotNull Context context, AttributeSet attributeSet, int i) {
        Object eVar;
        AnimatedNumbersView animatedNumbersView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textAppearance = -1;
        this.animateSpin = true;
        this.gravity = 3;
        this.higherColour = -16776961;
        this.lowerColour = -65536;
        if (((Boolean) jo0.g.R.getValue()).booleanValue()) {
            int i2 = 0;
            int i3 = 0;
            animatedNumbersView = this;
            eVar = new o(new b0(i3, this, AnimatedNumbersView.class, "invalidate", "invalidate()V", i2, 12), new b0(i3, animatedNumbersView, AnimatedNumbersView.class, "onStrategyAnimationEnd", "onStrategyAnimationEnd()V", i2, 13));
        } else {
            int i5 = 0;
            int i6 = 0;
            animatedNumbersView = this;
            eVar = new ns0.e(new b0(i6, animatedNumbersView, AnimatedNumbersView.class, "invalidate", "invalidate()V", i5, 14), new b0(i6, animatedNumbersView, AnimatedNumbersView.class, "onStrategyAnimationEnd", "onStrategyAnimationEnd()V", i5, 15));
        }
        animatedNumbersView.f56501l = eVar;
        f fVar = new f();
        fVar.f218686a = -1;
        fVar.f218687b = false;
        animatedNumbersView.f56502m = fVar;
        animatedNumbersView.f56503n = new ArrayList();
        animatedNumbersView.o = new LinkedHashSet();
        animatedNumbersView.f56504p = new ArrayList();
        animatedNumbersView.prefix = "";
        animatedNumbersView.suffix = "";
        animatedNumbersView.v = "";
        animatedNumbersView.f56511y = true;
        h.Companion.getClass();
        animatedNumbersView.K = h.a.a();
        ArrayList arrayList = new ArrayList(20);
        for (int i21 = 0; i21 < 20; i21++) {
            arrayList.add(new g(0));
        }
        animatedNumbersView.M = arrayList;
        ArrayList arrayList2 = new ArrayList(10);
        for (int i22 = 0; i22 < 10; i22++) {
            arrayList2.add(new r());
        }
        animatedNumbersView.N = arrayList2;
        c.a aVar = nr0.c.Companion;
        TextDirectionHeuristic textDirection = TextDirectionHeuristics.LTR;
        Intrinsics.checkNotNullExpressionValue(textDirection, "LTR");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(textDirection, "textDirection");
        animatedNumbersView.O = new e(animatedNumbersView, new nr0.c(-1, -1, null, null, 52), new nmm.h(animatedNumbersView, 18));
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        textPaint.setDither(true);
        textPaint.setHinting(1);
        animatedNumbersView.P = textPaint;
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        animatedNumbersView.Q = fontMetricsInt;
        k18.c cVar = new k18.c(textPaint);
        HashMap map = (HashMap) cVar.f180141c;
        s parser = new s();
        Intrinsics.checkNotNullParameter(parser, "parser");
        map.put(o0.f186429a.b(RelativeSizeSpan.class), parser);
        if (((Boolean) jo0.g.R.getValue()).booleanValue()) {
            p parser2 = new p();
            Intrinsics.checkNotNullParameter(parser2, "parser");
            map.put(o0.f186429a.b(ForegroundColorSpan.class), parser2);
        }
        animatedNumbersView.R = cVar;
        textPaint.setTextSize(kli.a.k(context, 12.0f));
        animatedNumbersView.B = textPaint.getTextSize();
        int iS = kli.a.s(com.revolut.core.ui_kit_resources.R$attr.uikit_colorForeground, context);
        animatedNumbersView.G = iS;
        textPaint.setColor(iS);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = animatedNumbersView.getContext().obtainStyledAttributes(attributeSet, S);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            TypedArray typedArrayObtainStyledAttributes2 = animatedNumbersView.getContext().obtainStyledAttributes(attributeSet, R$styleable.AnimatedNumbersView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
            try {
                Intrinsics.checkNotNullExpressionValue(animatedNumbersView.getContext(), "getContext(...)");
                animatedNumbersView.setTextSizePx(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, kli.a.k(r7, 12.0f)));
                Context context2 = animatedNumbersView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                animatedNumbersView.setTextColor(typedArrayObtainStyledAttributes.getColor(1, kli.a.s(com.revolut.core.ui_kit_resources.R$attr.uikit_colorForeground, context2)));
                animatedNumbersView.setAnimateSpin(typedArrayObtainStyledAttributes2.getBoolean(R$styleable.AnimatedNumbersView_internal_animateSpin, false));
                animatedNumbersView.setAnimateColour(typedArrayObtainStyledAttributes2.getBoolean(R$styleable.AnimatedNumbersView_internal_animateColour, false));
                int i32 = R$styleable.AnimatedNumbersView_internal_higherColor;
                Context context3 = animatedNumbersView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                animatedNumbersView.setHigherColour(typedArrayObtainStyledAttributes2.getColor(i32, kli.a.s(com.revolut.core.ui_kit_resources.R$attr.uikit_colorPerformancePositive, context3)));
                int i33 = R$styleable.AnimatedNumbersView_internal_lowerColor;
                Context context4 = animatedNumbersView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                animatedNumbersView.setLowerColour(typedArrayObtainStyledAttributes2.getColor(i33, kli.a.s(com.revolut.core.ui_kit_resources.R$attr.uikit_colorPerformanceNegative, context4)));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
                typedArrayObtainStyledAttributes2.recycle();
            }
        }
        textPaint.getFontMetricsInt(fontMetricsInt);
    }

    public /* synthetic */ AnimatedNumbersView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
