package com.revolut.core.ui_kit.internal.views.barchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import aw0.a6;
import aw0.v5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.AlignedTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ct0.c0;
import ct0.r;
import ct0.t;
import ct0.u;
import ir0.f;
import ir0.g;
import iv0.j;
import iv0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import ps0.l;
import ps0.m;
import ps0.n;
import r10.q;
import ts0.a;
import uw0.i;
import vf0.h;
import yhm.d;
import zh9.u0;
import zhm.d0;
import zhm.p;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001f B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/barchart/HorizontalBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lps0/n;", "data", "", "setBars", "(Lps0/n;)V", "Luw0/i;", "i", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "", "j", "Z", "getRoundedCorners", "()Z", "setRoundedCorners", "(Z)V", "roundedCorners", "ps0/l", "HorizontalBar", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalBarView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseIntArray f56542b;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f56543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f56544h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean roundedCorners;
    public final Barrier k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Barrier f56546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Guideline f56547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Guideline f56548n;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010)\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\"\u00101\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R/\u0010:\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/barchart/HorizontalBarView$HorizontalBar;", "Landroid/view/View;", "Lts0/a;", "Lvs0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/a6;", "color", "", "setColor", "(Law0/a6;)V", "setTrackColor", "(I)V", "Lct0/c0;", "b", "Lct0/c0;", "getChartDrawer", "()Lct0/c0;", "chartDrawer", "", "value", "j", "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "", "k", "Z", "getRoundedCorners", "()Z", "setRoundedCorners", "(Z)V", "roundedCorners", "l", "getScaleAnimatorValue", "setScaleAnimatorValue", "scaleAnimatorValue", "m", "getHighlightAnimatorValue", "setHighlightAnimatorValue", "highlightAnimatorValue", "Luw0/i;", "<set-?>", "o", "Lr10/q;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HorizontalBar extends View implements a, vs0.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f56549p = {o0.f186429a.f(new z(HorizontalBar.class, "dataChangeAnimationRequest", "getDataChangeAnimationRequest()Lcom/revolut/core/ui_kit/recycler/animation/ItemAnimationRequest;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f56550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final c0 chartDrawer;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f56552c;
        public final Paint d;
        public boolean e;
        public final float f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public t f56553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final RectF f56554h;
        public final RectF i;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public float progress;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public boolean roundedCorners;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public float scaleAnimatorValue;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public float highlightAnimatorValue;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final g f56558n;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public final q dataChangeAnimationRequest;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public HorizontalBar(@NotNull Context context) {
            this(context, null, 6, 0);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public final i getDataChangeAnimationRequest() {
            KProperty property = f56549p[0];
            q qVar = this.dataChangeAnimationRequest;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(this, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            return (i) qVar.d;
        }

        @Override // vs0.a
        public float getHighlightAnimatorValue() {
            return this.highlightAnimatorValue;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final boolean getRoundedCorners() {
            return this.roundedCorners;
        }

        @Override // vs0.a
        public float getScaleAnimatorValue() {
            return this.scaleAnimatorValue;
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            super.onDraw(canvas);
            boolean z = this.e;
            RectF rectF = this.i;
            if (z) {
                rectF.left = getPaddingLeft();
                rectF.right = getWidth() - getPaddingRight();
                rectF.top = getPaddingTop();
                rectF.bottom = getHeight() - getPaddingBottom();
                this.e = false;
            }
            float scaleAnimatorValue = getScaleAnimatorValue() * rectF.width() * this.progress;
            float f = rectF.left;
            float f4 = rectF.bottom;
            RectF rectF2 = this.f56554h;
            rectF2.set(f, rectF.top, scaleAnimatorValue + f, f4);
            if (!this.f56550a) {
                float f5 = this.f;
                canvas.drawRoundRect(rectF, f5, f5, this.d);
                f fVar = g.Companion;
                this.f56558n.l(canvas, rectF2, true, true);
                return;
            }
            c0 c0VarM3748getChartDrawer = m3748getChartDrawer();
            boolean z3 = this.roundedCorners;
            u uVar = u.RIGHT;
            c0VarM3748getChartDrawer.e(canvas, rectF, z3, uVar, ct0.q.SOLID);
            ct0.z.a(c0VarM3748getChartDrawer, canvas, rectF2, this.f56553g, 0, this.roundedCorners, uVar, null, 100);
        }

        @Override // android.view.View
        public final void onSizeChanged(int i, int i2, int i3, int i5) {
            super.onSizeChanged(i, i2, i3, i5);
            this.e = true;
        }

        public final void setColor(@NotNull a6 color) {
            t tVarI;
            Intrinsics.checkNotNullParameter(color, "color");
            if (!this.f56550a) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iS = kli.a.s(color instanceof v5 ? ((v5) color).f10572a : u0.I(color).a(0), context);
                this.f56552c.setColor(iS);
                this.f56558n.d(iS);
                return;
            }
            if (color instanceof v5) {
                r rVar = t.Companion;
                int i = ((v5) color).f10572a;
                rVar.getClass();
                tVarI = r.a(i);
            } else {
                tVarI = u0.I(color);
            }
            this.f56553g = tVarI;
        }

        public final void setDataChangeAnimationRequest(i iVar) {
            this.dataChangeAnimationRequest.setValue(this, f56549p[0], iVar);
        }

        @Override // vs0.a
        public void setHighlightAnimatorValue(float f) {
            this.highlightAnimatorValue = f;
        }

        public final void setProgress(float f) {
            this.progress = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
            invalidate();
        }

        public final void setRoundedCorners(boolean z) {
            if (this.roundedCorners != z) {
                this.roundedCorners = z;
                invalidate();
            }
        }

        @Override // vs0.a
        public void setScaleAnimatorValue(float f) {
            this.scaleAnimatorValue = f;
        }

        @d
        public final void setTrackColor(int color) {
            this.d.setColor(color);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public HorizontalBar(@NotNull Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 4, 0);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @NotNull
        /* JADX INFO: renamed from: getChartDrawer, reason: from getter and merged with bridge method [inline-methods] */
        public c0 m3748getChartDrawer() {
            return this.chartDrawer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
        public HorizontalBar(@NotNull Context context, AttributeSet attributeSet, int i) {
            o jVar;
            super(context, attributeSet, i);
            Intrinsics.checkNotNullParameter(context, "context");
            boolean zBooleanValue = ((Boolean) jo0.g.E.getValue()).booleanValue();
            this.f56550a = zBooleanValue;
            this.chartDrawer = new c0(context, this);
            Paint paint = new Paint();
            this.f56552c = paint;
            this.d = new Paint();
            this.e = true;
            this.f = kli.a.k(context, 2.0f);
            this.f56553g = t.BASIC;
            this.f56554h = new RectF();
            this.i = new RectF();
            this.scaleAnimatorValue = 1.0f;
            this.highlightAnimatorValue = 1.0f;
            g gVarA = ebm.a.a(this, paint);
            this.f56558n = gVarA;
            if (zBooleanValue) {
                jVar = new iv0.f(this);
            } else {
                jVar = new j(this, gVarA, hx7.q.b(new pp5.d(this, 18)), new lm.d(13));
            }
            this.dataChangeAnimationRequest = new q(jVar, new lm.d(13));
        }

        public /* synthetic */ HorizontalBar(Context context, AttributeSet attributeSet, int i, int i2) {
            this(context, (i & 2) != 0 ? null : attributeSet, 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalBarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(ConstraintLayout.LayoutParams layoutParams, l lVar) {
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = lVar.f239376a;
        layoutParams.topToTop = lVar.f239377b;
        layoutParams.topToBottom = lVar.f239378c;
        layoutParams.bottomToBottom = lVar.d;
    }

    public final i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    public final boolean getRoundedCorners() {
        return this.roundedCorners;
    }

    public final void setBars(@NotNull n data) {
        ArrayList arrayList;
        Iterator it8;
        Object obj2;
        int i;
        int iValueAt;
        SparseIntArray sparseIntArray;
        LinkedHashSet linkedHashSet;
        h hVar;
        float f;
        float f4;
        h hVar2;
        View view;
        LinkedHashSet linkedHashSet2;
        AlignedTextView alignedTextView;
        Clause clause;
        l lVar;
        l lVar2;
        int iValueAt2;
        l lVar3;
        n data2 = data;
        Intrinsics.checkNotNullParameter(data2, "data");
        LinkedHashSet linkedHashSet3 = this.f56543g;
        linkedHashSet3.clear();
        LinkedHashSet linkedHashSet4 = this.f56544h;
        linkedHashSet4.clear();
        ArrayList arrayList2 = data2.f239383b;
        float f5 = data2.f239384c;
        Iterator it9 = arrayList2.iterator();
        int i2 = 0;
        Object obj3 = null;
        while (true) {
            boolean zHasNext = it9.hasNext();
            Barrier barrier = this.k;
            Barrier barrier2 = this.f56546l;
            ArrayList arrayList3 = this.f;
            if (!zHasNext) {
                LinkedHashSet linkedHashSet5 = linkedHashSet3;
                ArrayList arrayList4 = arrayList2;
                LinkedHashSet linkedHashSet6 = linkedHashSet4;
                if (arrayList4.isEmpty() || arrayList4.size() >= arrayList3.size()) {
                    return;
                }
                int size = arrayList3.size() - 1;
                int size2 = arrayList4.size();
                if (size2 <= size) {
                    while (true) {
                        h hVar3 = (h) arrayList3.get(size);
                        View view2 = (Barrier) hVar3.f288433a;
                        View view3 = (AlignedTextView) hVar3.f288434b;
                        View view4 = (HorizontalBar) hVar3.f288435c;
                        View view5 = (AppCompatTextView) hVar3.d;
                        removeView(view2);
                        removeView(view3);
                        removeView(view4);
                        removeView(view5);
                        arrayList3.remove(size);
                        if (size == size2) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                barrier.setReferencedIds(d0.c1(linkedHashSet5));
                barrier2.setReferencedIds(d0.c1(linkedHashSet6));
                return;
            }
            Object next = it9.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            m mVar = (m) next;
            int size3 = arrayList3.size();
            SparseIntArray sparseIntArray2 = this.f56542b;
            if (i2 < size3) {
                hVar = (h) arrayList3.get(i2);
                linkedHashSet = linkedHashSet4;
                arrayList = arrayList2;
                it8 = it9;
                i = i2;
                obj2 = obj3;
                sparseIntArray = sparseIntArray2;
            } else {
                arrayList = arrayList2;
                Barrier barrier3 = new Barrier(getContext());
                barrier3.setId(View.generateViewId());
                barrier3.setType(3);
                addView(barrier3);
                it8 = it9;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                obj2 = obj3;
                i = i2;
                AlignedTextView alignedTextView2 = new AlignedTextView(context, null, R$attr.internal_textAppearanceBody3);
                alignedTextView2.setId(View.generateViewId());
                int[] referencedIds = barrier.getReferencedIds();
                Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
                barrier.setReferencedIds(p.x(alignedTextView2.getId(), referencedIds));
                int[] referencedIds2 = barrier3.getReferencedIds();
                Intrinsics.checkNotNullExpressionValue(referencedIds2, "getReferencedIds(...)");
                barrier3.setReferencedIds(p.x(alignedTextView2.getId(), referencedIds2));
                alignedTextView2.setMaxLines(2);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                alignedTextView2.setEllipsize(truncateAt);
                int i5 = R$attr.uikit_colorGrey50;
                int iIndexOfKey = sparseIntArray2.indexOfKey(i5);
                if (iIndexOfKey < 0) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iValueAt = kli.a.s(i5, context2);
                    sparseIntArray2.put(i5, iValueAt);
                } else {
                    iValueAt = sparseIntArray2.valueAt(iIndexOfKey);
                }
                alignedTextView2.setTextColor(iValueAt);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.constrainedWidth = true;
                layoutParams.horizontalBias = BitmapDescriptorFactory.HUE_RED;
                layoutParams.startToStart = 0;
                layoutParams.endToStart = this.f56547m.getId();
                alignedTextView2.setLayoutParams(layoutParams);
                Context context3 = alignedTextView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iK = kli.a.k(context3, 4.0f);
                sparseIntArray = sparseIntArray2;
                alignedTextView2.setPadding(alignedTextView2.getPaddingLeft(), iK, alignedTextView2.getPaddingRight(), iK);
                addView(alignedTextView2);
                linkedHashSet = linkedHashSet4;
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R$attr.internal_textAppearanceBody3);
                appCompatTextView.setId(View.generateViewId());
                int[] referencedIds3 = barrier2.getReferencedIds();
                Intrinsics.checkNotNullExpressionValue(referencedIds3, "getReferencedIds(...)");
                barrier2.setReferencedIds(p.x(appCompatTextView.getId(), referencedIds3));
                int[] referencedIds4 = barrier3.getReferencedIds();
                Intrinsics.checkNotNullExpressionValue(referencedIds4, "getReferencedIds(...)");
                barrier3.setReferencedIds(p.x(appCompatTextView.getId(), referencedIds4));
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(truncateAt);
                Context context4 = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context4));
                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams2.constrainedWidth = true;
                layoutParams2.endToEnd = 0;
                layoutParams2.startToEnd = this.f56548n.getId();
                layoutParams2.horizontalBias = 1.0f;
                appCompatTextView.setLayoutParams(layoutParams2);
                addView(appCompatTextView);
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                View horizontalBar = new HorizontalBar(context5, null, 4, 0);
                horizontalBar.setId(View.generateViewId());
                int[] referencedIds5 = barrier3.getReferencedIds();
                Intrinsics.checkNotNullExpressionValue(referencedIds5, "getReferencedIds(...)");
                barrier3.setReferencedIds(p.x(horizontalBar.getId(), referencedIds5));
                Context context6 = horizontalBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, kli.a.k(context6, f5));
                layoutParams3.startToEnd = barrier.getId();
                layoutParams3.endToStart = barrier2.getId();
                setClipChildren(false);
                horizontalBar.setLayoutParams(layoutParams3);
                addView(horizontalBar);
                h hVar4 = new h(barrier3, alignedTextView2, horizontalBar, appCompatTextView);
                arrayList3.add(hVar4);
                hVar = hVar4;
            }
            View view6 = (View) obj2;
            float f6 = data2.f;
            float f32 = data2.d;
            float f35 = data2.e;
            AlignedTextView alignedTextView3 = (AlignedTextView) hVar.f288434b;
            HorizontalBar horizontalBar2 = (HorizontalBar) hVar.f288435c;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) hVar.d;
            Clause clause2 = mVar.f239379a;
            Clause clause3 = mVar.f239380b;
            if (clause2 != null) {
                if (view6 == null) {
                    f = f32;
                    f4 = f35;
                    view = view6;
                    lVar3 = new l(0, 0, -1, -1);
                    hVar2 = hVar;
                } else {
                    f = f32;
                    f4 = f35;
                    view = view6;
                    Context context7 = alignedTextView3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                    hVar2 = hVar;
                    lVar3 = new l(kli.a.k(context7, f6), -1, view.getId(), -1);
                }
                ViewGroup.LayoutParams layoutParams4 = alignedTextView3.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                f0(layoutParams5, lVar3);
                alignedTextView3.setLayoutParams(layoutParams5);
            } else {
                f = f32;
                f4 = f35;
                hVar2 = hVar;
                view = view6;
            }
            linkedHashSet3.add(Integer.valueOf(alignedTextView3.getId()));
            ty0.f fVar = ty0.f.f275450a;
            kli.a.b(alignedTextView3, clause2, fVar);
            ViewGroup.LayoutParams layoutParams6 = appCompatTextView2.getLayoutParams();
            if (layoutParams6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) layoutParams6;
            if (clause2 != null) {
                linkedHashSet2 = linkedHashSet3;
                alignedTextView = alignedTextView3;
                clause = clause2;
                lVar = new l(0, alignedTextView3.getId(), -1, alignedTextView3.getId());
            } else {
                linkedHashSet2 = linkedHashSet3;
                alignedTextView = alignedTextView3;
                clause = clause2;
                if (view != null) {
                    Context context8 = appCompatTextView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                    lVar = new l(kli.a.k(context8, f6), -1, view.getId(), -1);
                } else {
                    lVar = new l(0, 0, -1, -1);
                }
            }
            f0(layoutParams7, lVar);
            appCompatTextView2.setLayoutParams(layoutParams7);
            kli.a.b(appCompatTextView2, clause3, fVar);
            LinkedHashSet linkedHashSet7 = linkedHashSet;
            linkedHashSet7.add(Integer.valueOf(appCompatTextView2.getId()));
            ViewGroup.LayoutParams layoutParams8 = horizontalBar2.getLayoutParams();
            if (layoutParams8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams9 = (ConstraintLayout.LayoutParams) layoutParams8;
            Context context9 = horizontalBar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams9).height = kli.a.k(context9, f5);
            Context context10 = horizontalBar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            layoutParams9.setMarginStart(kli.a.k(context10, clause == null ? BitmapDescriptorFactory.HUE_RED : f));
            Context context11 = horizontalBar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
            layoutParams9.setMarginEnd(kli.a.k(context11, clause3 == null ? BitmapDescriptorFactory.HUE_RED : f4));
            if (clause != null) {
                lVar2 = new l(0, alignedTextView.getId(), -1, alignedTextView.getId());
            } else if (clause3 != null) {
                lVar2 = new l(0, appCompatTextView2.getId(), -1, appCompatTextView2.getId());
            } else if (view != null) {
                Context context12 = horizontalBar2.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                lVar2 = new l(kli.a.k(context12, f6), -1, view.getId(), -1);
            } else {
                lVar2 = new l(0, 0, -1, -1);
            }
            f0(layoutParams9, lVar2);
            horizontalBar2.setLayoutParams(layoutParams9);
            horizontalBar2.setColor(mVar.e);
            int i6 = R$attr.uikit_colorGreyTone5;
            SparseIntArray sparseIntArray3 = sparseIntArray;
            int iIndexOfKey2 = sparseIntArray3.indexOfKey(i6);
            if (iIndexOfKey2 < 0) {
                Context context13 = getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                iValueAt2 = kli.a.s(i6, context13);
                sparseIntArray3.put(i6, iValueAt2);
            } else {
                iValueAt2 = sparseIntArray3.valueAt(iIndexOfKey2);
            }
            horizontalBar2.setTrackColor(iValueAt2);
            horizontalBar2.setRoundedCorners(this.roundedCorners);
            horizontalBar2.setProgress(mVar.d);
            i iVar = this.dataChangeAnimationRequest;
            if (iVar != null) {
                String id10 = p.a.o(iVar.f283502a, i);
                uw0.g playPolicy = iVar.f283503b;
                boolean z = iVar.f283504c;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(playPolicy, "playPolicy");
                horizontalBar2.setDataChangeAnimationRequest(new i(id10, playPolicy, z));
            }
            obj3 = hVar2.f288433a;
            data2 = data;
            linkedHashSet4 = linkedHashSet7;
            i2 = i3;
            arrayList2 = arrayList;
            it9 = it8;
            linkedHashSet3 = linkedHashSet2;
        }
    }

    public final void setDataChangeAnimationRequest(i iVar) {
        this.dataChangeAnimationRequest = iVar;
    }

    public final void setRoundedCorners(boolean z) {
        this.roundedCorners = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56542b = new SparseIntArray();
        this.f = new ArrayList();
        this.f56543g = new LinkedHashSet();
        this.f56544h = new LinkedHashSet();
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setType(6);
        addView(barrier);
        this.k = barrier;
        Barrier barrier2 = new Barrier(context);
        barrier2.setId(View.generateViewId());
        barrier2.setType(5);
        addView(barrier2);
        this.f56546l = barrier2;
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.orientation = 1;
        layoutParams.guidePercent = 0.28f;
        guideline.setLayoutParams(layoutParams);
        addView(guideline);
        this.f56547m = guideline;
        Guideline guideline2 = new Guideline(context);
        guideline2.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.orientation = 1;
        layoutParams2.guideBegin = kli.a.k(context, 48.0f);
        guideline2.setLayoutParams(layoutParams2);
        addView(guideline2);
        this.f56548n = guideline2;
    }

    public /* synthetic */ HorizontalBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
