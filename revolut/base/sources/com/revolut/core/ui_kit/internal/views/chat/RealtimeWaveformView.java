package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import jq0.g;
import jq0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0002\f\rB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/RealtimeWaveformView;", "Landroid/view/View;", "Ljq0/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealtimeWaveformView extends View implements g {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f56849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f56850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56851c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f56852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f56853h;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f56854j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f56855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f56856m;

    public static final class b {
        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealtimeWaveformView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // jq0.g
    public final void a(float f) {
        float f4 = this.e;
        boolean z = f == f4;
        a aVar = this.f56849a;
        int i = aVar.f56858b;
        if (i == 0) {
            if (z) {
                byte b4 = this.f56850b;
                int i2 = aVar.f56857a;
                if (i2 != 0) {
                    if (i < i2) {
                        aVar.f56858b = i + 1;
                    }
                    byte[] bArr = aVar.d;
                    int i3 = aVar.f56859c;
                    bArr[i3] = b4;
                    aVar.f56859c = (i3 + 1) % i2;
                }
                this.f56850b = (byte) 0;
                return;
            }
            return;
        }
        float width = (getWidth() - (f4 * Math.max(i - 1, 0))) - f;
        float height = getHeight();
        float f5 = 2;
        float f6 = height / f5;
        float f32 = this.f56851c;
        Path path = this.f56853h;
        path.reset();
        float f35 = width;
        float f36 = width + f32;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f56849a.f56858b) {
                break;
            }
            float fMax = Math.max(Math.min((r9.a(i5) / 100) * height, height), this.f56852g);
            float f37 = f6 - (fMax / f5);
            float f41 = this.f;
            path.addRoundRect(f35, f37, f36, f37 + fMax, f41, f41, Path.Direction.CW);
            i5++;
            f35 = f36 + this.d;
            f36 = f35 + f32;
        }
        invalidate();
        if (z) {
            a aVar2 = this.f56849a;
            byte b5 = this.f56850b;
            int i6 = aVar2.f56857a;
            if (i6 != 0) {
                int i21 = aVar2.f56858b;
                if (i21 < i6) {
                    aVar2.f56858b = i21 + 1;
                }
                byte[] bArr2 = aVar2.d;
                int i22 = aVar2.f56859c;
                bArr2[i22] = b5;
                aVar2.f56859c = (i22 + 1) % i6;
            }
            this.f56850b = (byte) 0;
        }
    }

    @Override // jq0.g
    public final boolean b() {
        return true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.g(this).addObserver(this.f56855l);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u.g(this).removeObserver(this.f56855l);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f56853h, this.i);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        int iCeil = (int) Math.ceil(getWidth() / this.e);
        a original = this.f56849a;
        if (iCeil != original.f56857a) {
            Intrinsics.checkNotNullParameter(original, "original");
            a aVar = new a(iCeil);
            int iMin = Math.min(iCeil, original.f56858b);
            for (int i6 = 0; i6 < iMin; i6++) {
                byte bA = original.a(i6);
                int i21 = aVar.f56857a;
                if (i21 != 0) {
                    int i22 = aVar.f56858b;
                    if (i22 < i21) {
                        aVar.f56858b = i22 + 1;
                    }
                    int i32 = aVar.f56859c;
                    aVar.d[i32] = bA;
                    aVar.f56859c = (i32 + 1) % i21;
                }
            }
            this.f56849a = aVar;
        }
        int width = getWidth();
        if (width == 0 || width == this.k) {
            return;
        }
        this.k = width;
        float f = width;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        float f4 = this.f56854j;
        this.i.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, new int[]{0, iS, iS, 0}, new float[]{BitmapDescriptorFactory.HUE_RED, f4 / f, (f - f4) / f, 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealtimeWaveformView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f56858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f56859c;
        public final byte[] d;

        public a(int i) {
            this.f56857a = i;
            this.d = new byte[i];
        }

        public final byte a(int i) {
            int i2;
            if (i < 0 || i >= (i2 = this.f56858b)) {
                throw new IndexOutOfBoundsException(j6.a.l(i, "Index ", " is out of bounds"));
            }
            int i3 = this.f56857a;
            return this.d[((i2 == i3 ? this.f56859c : 0) + i) % i3];
        }

        public a() {
            this(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeWaveformView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56849a = new a(0);
        float fL = kli.a.l(context, 2.0f);
        this.f56851c = fL;
        float fL2 = kli.a.l(context, 4.0f);
        this.d = fL2;
        this.e = fL2 + fL;
        this.f = fL / 2;
        this.f56852g = kli.a.l(context, 4.0f);
        this.f56853h = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(fL);
        paint.setAntiAlias(true);
        this.i = paint;
        this.f56854j = kli.a.l(context, 20.0f);
        this.k = -1;
        this.f56855l = new i(this);
    }

    public /* synthetic */ RealtimeWaveformView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
