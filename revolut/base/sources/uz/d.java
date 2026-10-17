package uz;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.camerakit.ui.models.Mask;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.n1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f284500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f284501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f284502c;
    public e d;
    public boolean e;
    public volatile rz.u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sz.a f284503g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(d dVar) {
        Rect maskBounds = dVar.getMaskBounds();
        if (maskBounds == null) {
            return;
        }
        int[] iArr = new int[2];
        dVar.getLocationOnScreen(iArr);
        dVar.f = new rz.u(iArr[0] + maskBounds.left, iArr[1] + maskBounds.top, maskBounds.width(), maskBounds.height());
    }

    private final Rect getMaskBounds() {
        RectF rectF;
        c cVar = this.f284502c;
        if (cVar == null || (rectF = cVar.f284479c) == null) {
            return null;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public final rz.u getAbsoluteMaskLocation() {
        return this.f;
    }

    @NotNull
    public final e getMaskViewDelegateFactory$camera_kit_ui_views_release() {
        return this.d;
    }

    public final sz.a getModelsSource$camera_kit_ui_views_release() {
        return this.f284503g;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f284502c;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        c cVar = this.f284502c;
        if (cVar != null) {
            cVar.e();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f284501b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
        c cVar = this.f284502c;
        if (cVar != null) {
            cVar.f(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c cVar = this.f284502c;
        setMeasuredDimension(getMeasuredWidth(), cVar != null ? cVar.a(i2) : 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        Bitmap bitmap;
        if (i == 0 || i2 == 0) {
            this.f284501b = null;
            this.f284500a = null;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            this.f284501b = bitmapCreateBitmap;
            this.f284500a = new Canvas(bitmapCreateBitmap);
        }
        Canvas canvas = this.f284500a;
        if (canvas == null || (bitmap = this.f284501b) == null) {
            return;
        }
        bitmap.eraseColor(0);
        canvas.drawColor(0);
    }

    public final void setBorderActivated(boolean z) {
        c cVar = this.f284502c;
        if (cVar != null) {
            cVar.i(z);
        }
    }

    public final void setInvertedColors(boolean z) {
        c cVar = this.f284502c;
        Mask mask = cVar != null ? cVar.e : null;
        if (mask instanceof Mask.Empty) {
            return;
        }
        this.e = z;
        if (mask != null) {
            if (cVar != null) {
                cVar.k(ContextCompat.getColor(getContext(), z ? mask.getD() : mask.getF50849c()));
            }
            c cVar2 = this.f284502c;
            if (cVar2 != null) {
                cVar2.q(z);
            }
            requestLayout();
        }
    }

    public final void setMask(@NotNull Mask mask) {
        c iVar;
        c cVar;
        Intrinsics.checkNotNullParameter(mask, "mask");
        c cVar2 = this.f284502c;
        if (cVar2 != null) {
            cVar2.h();
        }
        e eVar = this.d;
        sz.a aVar = this.f284503g;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(this, "view");
        if (mask instanceof Mask.Document) {
            iVar = new h(this, ((Mask.Document) mask).e);
        } else if (mask instanceof Mask.DocumentZebra) {
            iVar = new t0(this, ((Mask.DocumentZebra) mask).e);
        } else if (mask instanceof Mask.Face) {
            m mVar = new m(this, new sz.c(true));
            mVar.f284537y = aVar;
            mVar.f284535w.invalidate();
            iVar = mVar;
        } else if (mask instanceof Mask.ActiveLiveness) {
            m mVar2 = new m(this, new sz.c(false));
            mVar2.f284537y = aVar;
            mVar2.f284535w.invalidate();
            iVar = mVar2;
        } else if (mask instanceof Mask.FaceZebra) {
            c0 c0Var = new c0(this, eVar.f284507a);
            c0Var.z = aVar;
            c0Var.f284497w.invalidate();
            iVar = c0Var;
        } else if (mask instanceof Mask.QrCode) {
            iVar = new yz.a(this, ((Mask.QrCode) mask).e);
        } else if (mask instanceof Mask.Barcode) {
            iVar = new vz.b(this);
        } else {
            if (!(mask instanceof Mask.Empty)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(this, "view");
            iVar = new i(this);
        }
        this.f284502c = iVar;
        if (isAttachedToWindow() && (cVar = this.f284502c) != null) {
            cVar.d();
        }
        c cVar3 = this.f284502c;
        if (cVar3 != null) {
            Intrinsics.checkNotNullParameter(mask, "mask");
            cVar3.e = mask;
        }
        if (!(mask instanceof Mask.Empty)) {
            c cVar4 = this.f284502c;
            if (cVar4 != null) {
                cVar4.k(ContextCompat.getColor(getContext(), this.e ? mask.getD() : mask.getF50849c()));
            }
            c cVar5 = this.f284502c;
            if (cVar5 != null) {
                cVar5.j(ContextCompat.getColor(getContext(), mask.getF50848b()));
            }
            c cVar6 = this.f284502c;
            if (cVar6 != null) {
                cVar6.q(this.e);
            }
        }
        requestLayout();
    }

    public final void setMaskViewDelegateFactory$camera_kit_ui_views_release(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.d = eVar;
    }

    public final void setModelsSource$camera_kit_ui_views_release(sz.a aVar) {
        this.f284503g = aVar;
        c cVar = this.f284502c;
        if (cVar instanceof m) {
            m mVar = (m) cVar;
            mVar.f284537y = aVar;
            mVar.f284535w.invalidate();
        } else if (cVar instanceof c0) {
            c0 c0Var = (c0) cVar;
            c0Var.z = aVar;
            c0Var.f284497w.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = new e(null);
        getViewTreeObserver().addOnGlobalLayoutListener(new n1(this, 1));
    }
}
