package r7;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.PaintCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class j {
    public static final Matrix B = new Matrix();
    public a A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f251948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a80.e f251949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f251950c;
    public RectF d;
    public RectF e;
    public Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f251951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f251952h;
    public Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f251953j;
    public e7.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f251954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Canvas f251955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f251956n;
    public e7.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f251957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f251958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f251959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f251960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Canvas f251961t;
    public Canvas u;
    public e7.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f251962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f251963x = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f251964y;
    public RenderNode z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, a aVar) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.f251951g == null) {
            this.f251951g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + aVar.f251929b, rectF.top + aVar.f251930c);
        RectF rectF2 = this.e;
        float f = aVar.f251928a;
        rectF2.inset(-f, -f);
        this.f251951g.set(rectF);
        this.e.union(this.f251951g);
        return this.e;
    }

    public final void c() {
        float f;
        e7.a aVar;
        if (this.f251948a == null || this.f251949b == null || this.f251958q == null || this.d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i = h.f251947a[this.f251950c.ordinal()];
        if (i == 1 || i == 2) {
            this.f251948a.restore();
        } else {
            if (i != 3) {
                if (i == 4) {
                    if (this.f251964y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f251948a.save();
                    Canvas canvas = this.f251948a;
                    float[] fArr = this.f251958q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f251964y.endRecording();
                    if (this.f251949b.k()) {
                        Canvas canvas2 = this.f251948a;
                        a aVar2 = (a) this.f251949b.f1989c;
                        if (this.f251964y == null || this.z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i2 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f251958q;
                        float f4 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        a aVar3 = this.A;
                        if (aVar3 == null || aVar2.f251928a != aVar3.f251928a || aVar2.f251929b != aVar3.f251929b || aVar2.f251930c != aVar3.f251930c || aVar2.d != aVar3.d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(aVar2.d, PorterDuff.Mode.SRC_IN));
                            float f5 = aVar2.f251928a;
                            if (f5 > BitmapDescriptorFactory.HUE_RED) {
                                float f6 = ((f4 + f) * f5) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f6, f6, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = aVar2;
                        }
                        RectF rectFB = b(this.d, aVar2);
                        RectF rectF = new RectF(rectFB.left * f4, rectFB.top * f, rectFB.right * f4, rectFB.bottom * f);
                        this.z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((aVar2.f251929b * f4) + (-rectF.left), (aVar2.f251930c * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f251964y);
                        this.z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.z);
                        canvas2.restore();
                    }
                    this.f251948a.drawRenderNode(this.f251964y);
                    this.f251948a.restore();
                }
            } else {
                if (this.f251954l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f251949b.k()) {
                    Canvas canvas3 = this.f251948a;
                    a aVar4 = (a) this.f251949b.f1989c;
                    RectF rectF2 = this.d;
                    if (rectF2 == null || this.f251954l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, aVar4);
                    if (this.f == null) {
                        this.f = new Rect();
                    }
                    this.f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f251958q;
                    float f32 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f251952h == null) {
                        this.f251952h = new RectF();
                    }
                    this.f251952h.set(rectFB2.left * f32, rectFB2.top * f, rectFB2.right * f32, rectFB2.bottom * f);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.f251952h.width()), Math.round(this.f251952h.height()));
                    if (d(this.f251959r, this.f251952h)) {
                        Bitmap bitmap = this.f251959r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f251960s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f251959r = a(this.f251952h, Bitmap.Config.ARGB_8888);
                        this.f251960s = a(this.f251952h, Bitmap.Config.ALPHA_8);
                        this.f251961t = new Canvas(this.f251959r);
                        this.u = new Canvas(this.f251960s);
                    } else {
                        Canvas canvas4 = this.f251961t;
                        if (canvas4 == null || this.u == null || (aVar = this.o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.i, aVar);
                        this.u.drawRect(this.i, this.o);
                    }
                    if (this.f251960s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.v == null) {
                        this.v = new e7.a(1);
                    }
                    RectF rectF3 = this.d;
                    this.u.drawBitmap(this.f251954l, Math.round((rectF3.left - rectFB2.left) * f32), Math.round((rectF3.top - rectFB2.top) * f), (Paint) null);
                    if (this.f251962w == null || this.f251963x != aVar4.f251928a) {
                        float f35 = ((f32 + f) * aVar4.f251928a) / 2.0f;
                        if (f35 > BitmapDescriptorFactory.HUE_RED) {
                            this.f251962w = new BlurMaskFilter(f35, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f251962w = null;
                        }
                        this.f251963x = aVar4.f251928a;
                    }
                    this.v.setColor(aVar4.d);
                    if (aVar4.f251928a > BitmapDescriptorFactory.HUE_RED) {
                        this.v.setMaskFilter(this.f251962w);
                    } else {
                        this.v.setMaskFilter(null);
                    }
                    this.v.setFilterBitmap(true);
                    this.f251961t.drawBitmap(this.f251960s, Math.round(aVar4.f251929b * f32), Math.round(aVar4.f251930c * f), this.v);
                    canvas3.drawBitmap(this.f251959r, this.i, this.f, this.k);
                }
                if (this.f251956n == null) {
                    this.f251956n = new Rect();
                }
                this.f251956n.set(0, 0, (int) (this.d.width() * this.f251958q[0]), (int) (this.d.height() * this.f251958q[4]));
                this.f251948a.drawBitmap(this.f251954l, this.f251956n, this.d, this.k);
            }
        }
        this.f251948a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, a80.e eVar) {
        i iVar;
        if (this.f251948a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f251958q == null) {
            this.f251958q = new float[9];
        }
        if (this.f251957p == null) {
            this.f251957p = new Matrix();
        }
        canvas.getMatrix(this.f251957p);
        this.f251957p.getValues(this.f251958q);
        float[] fArr = this.f251958q;
        float f = fArr[0];
        float f4 = fArr[4];
        if (this.f251953j == null) {
            this.f251953j = new RectF();
        }
        this.f251953j.set(rectF.left * f, rectF.top * f4, rectF.right * f, rectF.bottom * f4);
        this.f251948a = canvas;
        this.f251949b = eVar;
        if (eVar.f1988b >= 255 && !eVar.k()) {
            iVar = i.DIRECT;
        } else if (eVar.k()) {
            int i = Build.VERSION.SDK_INT;
            iVar = (i < 29 || !canvas.isHardwareAccelerated() || i <= 31) ? i.BITMAP : i.RENDER_NODE;
        } else {
            iVar = i.SAVE_LAYER;
        }
        this.f251950c = iVar;
        if (this.d == null) {
            this.d = new RectF();
        }
        this.d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.k == null) {
            this.k = new e7.a();
        }
        this.k.reset();
        int i2 = h.f251947a[this.f251950c.ordinal()];
        if (i2 == 1) {
            canvas.save();
            return canvas;
        }
        if (i2 == 2) {
            this.k.setAlpha(eVar.f1988b);
            this.k.setColorFilter(null);
            l.e(canvas, rectF, this.k);
            return canvas;
        }
        Matrix matrix = B;
        if (i2 == 3) {
            if (this.o == null) {
                e7.a aVar = new e7.a();
                this.o = aVar;
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f251954l, this.f251953j)) {
                Bitmap bitmap = this.f251954l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f251954l = a(this.f251953j, Bitmap.Config.ARGB_8888);
                this.f251955m = new Canvas(this.f251954l);
            } else {
                Canvas canvas2 = this.f251955m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix);
                this.f251955m.drawRect(-1.0f, -1.0f, this.f251953j.width() + 1.0f, this.f251953j.height() + 1.0f, this.o);
            }
            PaintCompat.setBlendMode(this.k, null);
            this.k.setColorFilter(null);
            this.k.setAlpha(eVar.f1988b);
            Canvas canvas3 = this.f251955m;
            canvas3.scale(f, f4);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i2 != 4) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f251964y == null) {
            this.f251964y = q2.a.f();
        }
        if (eVar.k() && this.z == null) {
            this.z = q2.a.v();
            this.A = null;
        }
        this.f251964y.setAlpha(eVar.f1988b / 255.0f);
        if (eVar.k()) {
            RenderNode renderNode = this.z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(eVar.f1988b / 255.0f);
        }
        this.f251964y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f251964y;
        RectF rectF2 = this.f251953j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f251964y.beginRecording((int) this.f251953j.width(), (int) this.f251953j.height());
        recordingCanvasBeginRecording.setMatrix(matrix);
        recordingCanvasBeginRecording.scale(f, f4);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
