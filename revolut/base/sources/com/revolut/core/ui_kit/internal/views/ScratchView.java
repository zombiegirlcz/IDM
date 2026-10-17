package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.views.ScratchView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ScratchView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "t", "Lkotlin/Lazy;", "getScratchBitmap", "()Landroid/graphics/Bitmap;", "scratchBitmap", "Landroid/graphics/Canvas;", "u", "getScratchCanvas", "()Landroid/graphics/Canvas;", "scratchCanvas", "Landroid/graphics/drawable/Drawable;", "getScratchDrawable", "()Landroid/graphics/drawable/Drawable;", "scratchDrawable", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScratchView extends AppCompatImageView {
    public static final /* synthetic */ int B = 0;
    public final float A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f56371r;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Lazy scratchBitmap;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final Lazy scratchCanvas;
    public final a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f56373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f56374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f56375y;
    public float z;

    public static final class a extends Path implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f56376a = new ArrayList();

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.ScratchView$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0434a implements Serializable {
            private AbstractC0434a() {
            }
        }

        public final void a() {
            for (AbstractC0434a abstractC0434a : this.f56376a) {
                if (abstractC0434a instanceof i) {
                    i iVar = (i) abstractC0434a;
                    super.moveTo(iVar.f57208a, iVar.f57209b);
                } else if (abstractC0434a instanceof h) {
                    h hVar = (h) abstractC0434a;
                    super.lineTo(hVar.f57206a, hVar.f57207b);
                } else {
                    if (!(abstractC0434a instanceof j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j jVar = (j) abstractC0434a;
                    super.quadTo(jVar.f57217a, jVar.f57218b, jVar.f57219c, jVar.d);
                }
            }
        }

        @Override // android.graphics.Path
        public final void addPath(Path src2) {
            Intrinsics.checkNotNullParameter(src2, "src");
            if ((src2 instanceof a ? (a) src2 : null) != null) {
                this.f56376a.addAll(((a) src2).f56376a);
            }
            super.addPath(src2);
        }

        @Override // android.graphics.Path
        public final void lineTo(float f, float f4) {
            this.f56376a.add(new h(f, f4));
            super.lineTo(f, f4);
        }

        @Override // android.graphics.Path
        public final void moveTo(float f, float f4) {
            this.f56376a.add(new i(f, f4));
            super.moveTo(f, f4);
        }

        @Override // android.graphics.Path
        public final void quadTo(float f, float f4, float f5, float f6) {
            this.f56376a.add(new j(f, f4, f5, f6));
            super.quadTo(f, f4, f5, f6);
        }

        @Override // android.graphics.Path
        public final void reset() {
            this.f56376a.clear();
            super.reset();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Bitmap a(ScratchView scratchView) {
        Drawable scratchDrawable = scratchView.getScratchDrawable();
        int intrinsicWidth = scratchDrawable != null ? scratchDrawable.getIntrinsicWidth() : 0;
        Drawable scratchDrawable2 = scratchView.getScratchDrawable();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, scratchDrawable2 != null ? scratchDrawable2.getIntrinsicHeight() : 0, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static Canvas b(ScratchView scratchView) {
        return new Canvas(scratchView.getScratchBitmap());
    }

    public static Float c(ScratchView scratchView, Unit it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        Bitmap scratchBitmap = scratchView.getScratchBitmap();
        int measuredHeight = scratchView.getMeasuredHeight() * scratchView.getMeasuredWidth();
        int i = 0;
        kotlin.ranges.c cVarN = kotlin.ranges.f.n(3, kotlin.ranges.f.o(0, scratchView.getMeasuredWidth()));
        int i2 = cVarN.f186448a;
        int i3 = cVarN.f186449b;
        int i5 = cVarN.f186450c;
        if ((i5 > 0 && i2 <= i3) || (i5 < 0 && i3 <= i2)) {
            int i6 = 0;
            while (true) {
                kotlin.ranges.c cVarN2 = kotlin.ranges.f.n(3, kotlin.ranges.f.o(0, scratchView.getMeasuredHeight()));
                int i21 = cVarN2.f186448a;
                int i22 = cVarN2.f186449b;
                int i32 = cVarN2.f186450c;
                if ((i32 > 0 && i21 <= i22) || (i32 < 0 && i22 <= i21)) {
                    while (true) {
                        if (scratchBitmap.getPixel(i2, i21) == 0) {
                            i6++;
                        }
                        if (i21 == i22) {
                            break;
                        }
                        i21 += i32;
                    }
                }
                if (i2 == i3) {
                    break;
                }
                i2 += i5;
            }
            i = i6;
        }
        return Float.valueOf((i / measuredHeight) * 9);
    }

    private final Bitmap getScratchBitmap() {
        return (Bitmap) this.scratchBitmap.getValue();
    }

    private final Canvas getScratchCanvas() {
        return (Canvas) this.scratchCanvas.getValue();
    }

    private final Drawable getScratchDrawable() {
        return getDrawable();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(getScratchBitmap(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        Drawable scratchDrawable = getScratchDrawable();
        if (scratchDrawable != null) {
            scratchDrawable.setBounds(0, 0, getWidth(), getHeight());
            scratchDrawable.draw(getScratchCanvas());
        }
        a aVar = this.f56374x;
        aVar.a();
        Canvas scratchCanvas = getScratchCanvas();
        Paint paint = this.f56373w;
        scratchCanvas.drawPath(aVar, paint);
        getScratchCanvas().drawPath(this.v, paint);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        Serializable serializable = bundle.getSerializable("KEY_PATH");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.ScratchView.PathSerializable");
        this.f56374x.addPath((a) serializable);
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putSerializable("KEY_PATH", this.f56374x);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            float r0 = r10.getX()
            float r1 = r10.getY()
            android.view.ViewParent r2 = r9.getParent()
            r3 = 1
            r2.requestDisallowInterceptTouchEvent(r3)
            int r10 = r10.getAction()
            com.revolut.core.ui_kit.internal.views.ScratchView$a r2 = r9.v
            if (r10 == 0) goto L6c
            ihm.f r4 = r9.f56371r
            if (r10 == r3) goto L56
            r5 = 2
            if (r10 == r5) goto L28
            r5 = 3
            if (r10 == r5) goto L56
            goto L72
        L28:
            float r10 = r9.f56375y
            float r10 = r0 - r10
            float r10 = java.lang.Math.abs(r10)
            float r6 = r9.z
            float r6 = r1 - r6
            float r6 = java.lang.Math.abs(r6)
            r7 = 1082130432(0x40800000, float:4.0)
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 >= 0) goto L42
            int r10 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r10 < 0) goto L50
        L42:
            float r10 = r9.f56375y
            float r6 = r9.z
            float r7 = r0 + r10
            float r5 = (float) r5
            float r7 = r7 / r5
            float r8 = r1 + r6
            float r8 = r8 / r5
            r2.quadTo(r10, r6, r7, r8)
        L50:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            r4.onNext(r10)
            goto L72
        L56:
            android.view.ViewParent r10 = r9.getParent()
            r5 = 0
            r10.requestDisallowInterceptTouchEvent(r5)
            r2.lineTo(r0, r1)
            com.revolut.core.ui_kit.internal.views.ScratchView$a r10 = r9.f56374x
            r10.addPath(r2)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            r4.onNext(r10)
            goto L72
        L6c:
            r2.reset()
            r2.moveTo(r0, r1)
        L72:
            r9.f56375y = r0
            r9.z = r1
            r9.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.ScratchView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScratchView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56371r = v0.a.d("create(...)");
        final int i2 = 0;
        this.scratchBitmap = yhm.j.b(new Function0(this) { // from class: ms0.z3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScratchView f208503b;

            {
                this.f208503b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ScratchView.a(this.f208503b);
                    default:
                        return ScratchView.b(this.f208503b);
                }
            }
        });
        final int i3 = 1;
        this.scratchCanvas = yhm.j.b(new Function0(this) { // from class: ms0.z3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScratchView f208503b;

            {
                this.f208503b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ScratchView.a(this.f208503b);
                    default:
                        return ScratchView.b(this.f208503b);
                }
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ScratchView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.A = typedArrayObtainStyledAttributes.getDimension(R$styleable.ScratchView_internal_scratchStrokeWidth, kli.a.k(context, 35.0f));
        typedArrayObtainStyledAttributes.recycle();
        this.v = new a();
        Paint paint = new Paint();
        this.f56373w = paint;
        this.f56374x = new a();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.A);
        kli.a.s(R$attr.uikit_colorDeepGrey, context);
    }

    public /* synthetic */ ScratchView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
