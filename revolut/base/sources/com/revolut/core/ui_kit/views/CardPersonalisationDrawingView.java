package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010'\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR$\u0010+\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/revolut/core/ui_kit/views/CardPersonalisationDrawingView;", "Lcom/revolut/core/ui_kit/views/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getCenterX", "()F", "getCenterY", "", "Landroid/graphics/PointF;", "points", "", "setDrawingShapePoints", "(Ljava/util/List;)V", "strokeColor", "setStrokeColor", "(I)V", "", "value", "U", "Z", "getShowThicknessDot", "()Z", "setShowThicknessDot", "(Z)V", "showThicknessDot", "V", "getPositionGuidingEnabled", "setPositionGuidingEnabled", "positionGuidingEnabled", "W", "getRotationGuidingEnabled", "setRotationGuidingEnabled", "rotationGuidingEnabled", "getLineSize", "setLineSize", "(F)V", "lineSize", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPersonalisationDrawingView extends i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final ihm.f A;
    public final ihm.f B;
    public final ihm.f C;
    public final ihm.f D;
    public Path E;
    public Path F;
    public final Paint G;
    public final Paint H;
    public float I;
    public float J;
    public final RectF K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public VelocityTracker P;
    public final int Q;
    public boolean R;
    public final fr0.e S;
    public final fr0.g T;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean showThicknessDot;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean positionGuidingEnabled;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean rotationGuidingEnabled;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.CardPersonalisationDrawingView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPersonalisationDrawingView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revolut.core.ui_kit.views.i
    public final boolean a() {
        if (getDrawingEnabled() || this.F == null || getCurrentSprite() == null) {
            return false;
        }
        Path path = new Path(this.F);
        Path path2 = new Path(this.F);
        fr0.i currentSprite = getCurrentSprite();
        Intrinsics.h(currentSprite);
        Path pathG = currentSprite.g();
        Path.Op op2 = Path.Op.DIFFERENCE;
        path.op(pathG, op2);
        path2.op(path, op2);
        return path2.isEmpty();
    }

    @Override // com.revolut.core.ui_kit.views.i
    public final void e() {
        Object obj2;
        Object next;
        if (getGlobalUndoAvailable()) {
            super.e();
            return;
        }
        Iterator<T> it8 = getSprites().iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((fr0.i) next) instanceof fr0.d) {
                    break;
                }
            }
        }
        fr0.d sprite = next instanceof fr0.d ? (fr0.d) next : null;
        if (sprite != null) {
            ArrayList arrayList = sprite.f137329n;
            ArrayList arrayList2 = sprite.f137346c;
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                if (((fr0.j) objPrevious) instanceof fr0.k) {
                    obj2 = objPrevious;
                    break;
                }
            }
            fr0.j jVar = (fr0.j) obj2;
            if (jVar != null) {
                arrayList2.remove(jVar);
                u0.a(arrayList).remove(jVar);
                sprite.o();
            }
            Intrinsics.checkNotNullParameter(sprite, "sprite");
            if (arrayList.isEmpty()) {
                c(sprite);
                this.D.onNext(Boolean.FALSE);
            }
            invalidate();
        }
    }

    @Override // com.revolut.core.ui_kit.views.i
    public float getCenterX() {
        float f = this.I;
        return f == BitmapDescriptorFactory.HUE_RED ? super.getCenterX() : f;
    }

    @Override // com.revolut.core.ui_kit.views.i
    public float getCenterY() {
        float f = this.J;
        return f == BitmapDescriptorFactory.HUE_RED ? super.getCenterY() : f;
    }

    @Override // com.revolut.core.ui_kit.views.i
    public float getLineSize() {
        return super.getLineSize();
    }

    public final boolean getPositionGuidingEnabled() {
        return this.positionGuidingEnabled;
    }

    public final boolean getRotationGuidingEnabled() {
        return this.rotationGuidingEnabled;
    }

    public final boolean getShowThicknessDot() {
        return this.showThicknessDot;
    }

    public final void h() {
        this.K.set(getCenterX() - getLineSize(), getCenterY() - getLineSize(), getLineSize() + getCenterX(), getLineSize() + getCenterY());
        int currentColor = getCurrentColor();
        Paint paint = this.H;
        paint.setColor(currentColor);
        paint.setShadowLayer(getLineSize() + 8, BitmapDescriptorFactory.HUE_RED, 2.0f, this.Q);
    }

    public final void i() {
        fr0.g gVar = this.T;
        gVar.f137339a = false;
        this.N = false;
        this.O = false;
        gVar.d = gVar.f137341c;
        fr0.i currentSprite = getCurrentSprite();
        if (currentSprite != null) {
            currentSprite.f137350l = false;
        }
    }

    public final boolean j() {
        return (!this.positionGuidingEnabled || getDrawingEnabled() || getTextEditingEnabled()) ? false : true;
    }

    public final boolean k() {
        return (!this.rotationGuidingEnabled || getDrawingEnabled() || getTextEditingEnabled()) ? false : true;
    }

    @Override // com.revolut.core.ui_kit.views.i, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Path path;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean editingEnabled = getEditingEnabled();
        Paint paint = this.G;
        if (editingEnabled && (path = this.F) != null) {
            canvas.drawPath(path, paint);
        }
        if (getDrawingEnabled() || getTextEditingEnabled()) {
            int i = 0;
            for (Object obj2 : getSprites()) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                fr0.i iVar = (fr0.i) obj2;
                if (getDrawingEnabled() && (iVar instanceof fr0.d)) {
                    ((fr0.d) iVar).l(255);
                } else if (i == getSprites().size() - 1 && getTextEditingEnabled() && (iVar instanceof fr0.n)) {
                    ((fr0.n) iVar).l(255);
                } else {
                    iVar.l(102);
                }
                i = i2;
            }
        } else {
            Iterator<T> it8 = getSprites().iterator();
            while (it8.hasNext()) {
                ((fr0.i) it8.next()).l(255);
            }
        }
        Path path2 = this.E;
        if (path2 != null) {
            canvas.clipOutPath(path2);
        }
        if (this.positionGuidingEnabled) {
            if (this.L) {
                canvas2 = canvas;
                canvas2.drawLine(getCenterX(), BitmapDescriptorFactory.HUE_RED, getCenterX(), getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
            if (this.M) {
                canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, getCenterY(), getWidth(), getCenterY(), paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.rotationGuidingEnabled) {
            if (this.N) {
                if (this.M) {
                    canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, getCenterY(), getWidth(), getCenterY(), paint);
                } else {
                    fr0.i currentSprite = getCurrentSprite();
                    if (currentSprite != null) {
                        canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, currentSprite.f(), getWidth(), currentSprite.f(), paint);
                    }
                }
            }
            if (this.O) {
                if (this.L) {
                    canvas2.drawLine(getCenterX(), BitmapDescriptorFactory.HUE_RED, getCenterX(), getHeight(), paint);
                } else {
                    fr0.i currentSprite2 = getCurrentSprite();
                    if (currentSprite2 != null) {
                        canvas2.drawLine(currentSprite2.e(), BitmapDescriptorFactory.HUE_RED, currentSprite2.e(), getHeight(), paint);
                    }
                }
            }
        }
        super.onDraw(canvas2);
        if (this.showThicknessDot) {
            canvas2.drawOval(this.K, this.H);
        }
    }

    @Override // com.revolut.core.ui_kit.views.i, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        float f = i / i3;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Path path = this.E;
        if (path != null) {
            path.transform(matrix);
        }
        Path path2 = this.F;
        if (path2 != null) {
            path2.transform(matrix);
        }
        Path path3 = this.F;
        if (path3 != null) {
            RectF rectF = new RectF();
            path3.computeBounds(rectF, false);
            this.I = rectF.centerX();
            this.J = rectF.centerY();
        }
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c3  */
    @Override // com.revolut.core.ui_kit.views.i, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.CardPersonalisationDrawingView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDrawingShapePoints(@NotNull List<? extends PointF> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (points.isEmpty()) {
            return;
        }
        post(new k0.b(this, points, 14));
    }

    @Override // com.revolut.core.ui_kit.views.i
    public void setLineSize(float f) {
        super.setLineSize(f);
        h();
        invalidate();
    }

    public final void setPositionGuidingEnabled(boolean z) {
        this.positionGuidingEnabled = z;
    }

    public final void setRotationGuidingEnabled(boolean z) {
        this.rotationGuidingEnabled = z;
    }

    public final void setShowThicknessDot(boolean z) {
        this.showThicknessDot = z;
        invalidate();
    }

    public final void setStrokeColor(int strokeColor) {
        this.G.setColor(strokeColor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPersonalisationDrawingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardPersonalisationDrawingView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.A = v0.a.d("create(...)");
        this.B = v0.a.d("create(...)");
        this.C = v0.a.d("create(...)");
        this.D = v0.a.d("create(...)");
        Paint paint = new Paint();
        this.G = paint;
        Paint paint2 = new Paint();
        this.H = paint2;
        this.K = new RectF();
        int iS = kli.a.s(R$attr.uikit_colorBlack_30, context);
        this.Q = iS;
        this.S = new fr0.e(kli.a.k(context, 5.0f));
        this.T = new fr0.g();
        setMultipleDrawingsEnabled(false);
        setBringToTopReversible(false);
        paint.setAntiAlias(true);
        paint.setColor(kli.a.s(R$attr.uikit_colorWhite_80, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(kli.a.k(context, 1.0f));
        paint.setPathEffect(new ComposePathEffect(new DashPathEffect(new float[]{kli.a.k(context, 4.0f), kli.a.k(context, 6.0f)}, BitmapDescriptorFactory.HUE_RED), new CornerPathEffect(kli.a.k(context, 4.0f))));
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(getCurrentColor());
        paint2.setShadowLayer(getLineSize(), this.I, this.J, iS);
    }

    public /* synthetic */ CardPersonalisationDrawingView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
