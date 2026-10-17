package h7;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.LottieDrawable;
import d7.m0;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ Rect f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ContentScale f149809h;
    public final /* synthetic */ Alignment i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Matrix f149810j;
    public final /* synthetic */ LottieDrawable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f149811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d7.a f149812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d7.j f149813n;
    public final /* synthetic */ b0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f149814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function0 f149815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f149816r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, ContentScale contentScale, Alignment alignment, Matrix matrix, LottieDrawable lottieDrawable, m0 m0Var, d7.a aVar, d7.j jVar, b0 b0Var, Context context, Function0 function0, MutableState mutableState) {
        super(1);
        this.f = rect;
        this.f149809h = contentScale;
        this.i = alignment;
        this.f149810j = matrix;
        this.k = lottieDrawable;
        this.f149811l = m0Var;
        this.f149812m = aVar;
        this.f149813n = jVar;
        this.o = b0Var;
        this.f149814p = context;
        this.f149815q = function0;
        this.f149816r = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DrawScope Canvas = (DrawScope) obj2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Canvas canvas = Canvas.getDrawContext().getCanvas();
        Rect rect = this.f;
        long jSize = SizeKt.Size(rect.width(), rect.height());
        long jIntSize = IntSizeKt.IntSize(rim.d.c(Size.m1869getWidthimpl(Canvas.mo2212getSizeNHjbRc())), rim.d.c(Size.m1867getHeightimpl(Canvas.mo2212getSizeNHjbRc())));
        long jMo2525computeScaleFactorH7hwNQA = this.f149809h.mo2525computeScaleFactorH7hwNQA(jSize, Canvas.mo2212getSizeNHjbRc());
        long jMo1721alignKFBX0sM = this.i.mo1721alignKFBX0sM(IntSizeKt.IntSize((int) (Size.m1869getWidthimpl(jSize) * ScaleFactor.m2589getScaleXimpl(jMo2525computeScaleFactorH7hwNQA)), (int) (Size.m1867getHeightimpl(jSize) * ScaleFactor.m2590getScaleYimpl(jMo2525computeScaleFactorH7hwNQA))), jIntSize, Canvas.getLayoutDirection());
        Matrix matrix = this.f149810j;
        matrix.reset();
        matrix.preTranslate(IntOffset.m3334getXimpl(jMo1721alignKFBX0sM), IntOffset.m3335getYimpl(jMo1721alignKFBX0sM));
        matrix.preScale(ScaleFactor.m2589getScaleXimpl(jMo2525computeScaleFactorH7hwNQA), ScaleFactor.m2590getScaleYimpl(jMo2525computeScaleFactorH7hwNQA));
        d7.b0 b0Var = d7.b0.MergePathsApi19;
        LottieDrawable drawable = this.k;
        boolean zJ = drawable.f25596n.j(b0Var, false);
        if (drawable.f25588a != null && zJ) {
            drawable.c();
        }
        drawable.e = false;
        drawable.f25603x = this.f149811l;
        drawable.e();
        drawable.N = this.f149812m;
        drawable.q(this.f149813n);
        if (drawable.k != null) {
            drawable.k = null;
            drawable.invalidateSelf();
        }
        MutableState mutableState = this.f149816r;
        b0 b0Var2 = (b0) mutableState.getValue();
        b0 b0Var3 = this.o;
        if (b0Var3 != b0Var2) {
            b0 b0Var4 = (b0) mutableState.getValue();
            if (b0Var4 != null) {
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                for (e0 e0Var : b0Var4.f149761a) {
                    drawable.a(e0Var.f149775b, e0Var.f149774a, null);
                }
                for (e0 e0Var2 : b0Var4.f149762b) {
                    drawable.a(e0Var2.f149775b, e0Var2.f149774a, null);
                }
                for (e0 e0Var3 : b0Var4.f149763c) {
                    drawable.a(e0Var3.f149775b, e0Var3.f149774a, null);
                }
                for (e0 e0Var4 : b0Var4.d) {
                    drawable.a(e0Var4.f149775b, e0Var4.f149774a, null);
                }
                for (e0 e0Var5 : b0Var4.e) {
                    drawable.a(e0Var5.f149775b, e0Var5.f149774a, null);
                }
                for (e0 e0Var6 : b0Var4.f) {
                    drawable.a(e0Var6.f149775b, e0Var6.f149774a, null);
                }
                for (e0 e0Var7 : b0Var4.f149764g) {
                    drawable.a(e0Var7.f149775b, e0Var7.f149774a, null);
                }
                for (e0 e0Var8 : b0Var4.f149765h) {
                    drawable.a(e0Var8.f149775b, e0Var8.f149774a, null);
                }
                for (e0 e0Var9 : b0Var4.i) {
                    drawable.a(e0Var9.f149775b, e0Var9.f149774a, null);
                }
                for (e0 e0Var10 : b0Var4.f149766j) {
                    drawable.a(e0Var10.f149775b, e0Var10.f149774a, null);
                }
            }
            if (b0Var3 != null) {
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                for (e0 e0Var11 : b0Var3.f149761a) {
                    drawable.a(e0Var11.f149775b, e0Var11.f149774a, new c0(e0Var11.f149776c));
                }
                for (e0 e0Var12 : b0Var3.f149762b) {
                    drawable.a(e0Var12.f149775b, e0Var12.f149774a, new c0(e0Var12.f149776c));
                }
                for (e0 e0Var13 : b0Var3.f149763c) {
                    drawable.a(e0Var13.f149775b, e0Var13.f149774a, new c0(e0Var13.f149776c));
                }
                for (e0 e0Var14 : b0Var3.d) {
                    drawable.a(e0Var14.f149775b, e0Var14.f149774a, new c0(e0Var14.f149776c));
                }
                for (e0 e0Var15 : b0Var3.e) {
                    drawable.a(e0Var15.f149775b, e0Var15.f149774a, new c0(e0Var15.f149776c));
                }
                for (e0 e0Var16 : b0Var3.f) {
                    drawable.a(e0Var16.f149775b, e0Var16.f149774a, new c0(e0Var16.f149776c));
                }
                for (e0 e0Var17 : b0Var3.f149764g) {
                    drawable.a(e0Var17.f149775b, e0Var17.f149774a, new c0(e0Var17.f149776c));
                }
                for (e0 e0Var18 : b0Var3.f149765h) {
                    drawable.a(e0Var18.f149775b, e0Var18.f149774a, new c0(e0Var18.f149776c));
                }
                for (e0 e0Var19 : b0Var3.i) {
                    drawable.a(e0Var19.f149775b, e0Var19.f149774a, new c0(e0Var19.f149776c));
                }
                for (e0 e0Var20 : b0Var3.f149766j) {
                    drawable.a(e0Var20.f149775b, e0Var20.f149774a, new c0(e0Var20.f149776c));
                }
            }
            mutableState.setValue(b0Var3);
        }
        if (drawable.f25601t) {
            drawable.f25601t = false;
            n7.d dVar = drawable.f25598q;
            if (dVar != null) {
                dVar.o(false);
            }
        }
        drawable.u = false;
        drawable.v = true;
        drawable.o = false;
        if (true != drawable.f25597p) {
            drawable.f25597p = true;
            n7.d dVar2 = drawable.f25598q;
            if (dVar2 != null) {
                dVar2.N = true;
            }
            drawable.invalidateSelf();
        }
        if (drawable.f25602w) {
            drawable.f25602w = false;
            drawable.invalidateSelf();
        }
        Iterator it8 = LottieDrawable.S.iterator();
        k7.i iVarD = null;
        while (it8.hasNext()) {
            iVarD = drawable.f25588a.d((String) it8.next());
            if (iVarD != null) {
                break;
            }
        }
        if (drawable.b(this.f149814p) || iVarD == null) {
            drawable.A(((Number) this.f149815q.invoke()).floatValue());
        } else {
            drawable.A(iVarD.f181772b);
        }
        drawable.setBounds(0, 0, rect.width(), rect.height());
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        androidx.view.d dVar3 = drawable.Q;
        ThreadPoolExecutor threadPoolExecutor = LottieDrawable.T;
        r7.e eVar = drawable.f25589b;
        Semaphore semaphore = drawable.P;
        n7.d dVar4 = drawable.f25598q;
        d7.j jVar = drawable.f25588a;
        if (dVar4 != null && jVar != null) {
            d7.a aVar = drawable.N;
            if (aVar == null) {
                aVar = d7.d.f111646a;
            }
            boolean z = aVar == d7.a.ENABLED;
            if (z) {
                try {
                    semaphore.acquire();
                    if (drawable.B()) {
                        drawable.A(eVar.a());
                    }
                } catch (InterruptedException unused) {
                    if (z) {
                        semaphore.release();
                        if (dVar4.M != eVar.a()) {
                        }
                    }
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    if (!z) {
                        throw th10;
                    }
                    semaphore.release();
                    if (dVar4.M == eVar.a()) {
                        throw th10;
                    }
                    threadPoolExecutor.execute(dVar3);
                    throw th10;
                }
            }
            if (drawable.e) {
                try {
                    int i = drawable.f25599r;
                    if (drawable.f25604y) {
                        nativeCanvas.save();
                        nativeCanvas.concat(matrix);
                        drawable.n(nativeCanvas, dVar4);
                        nativeCanvas.restore();
                    } else {
                        dVar4.g(nativeCanvas, matrix, i, null);
                    }
                } catch (Throwable unused2) {
                    r7.c.f251932a.b();
                }
            } else {
                int i2 = drawable.f25599r;
                if (drawable.f25604y) {
                    nativeCanvas.save();
                    nativeCanvas.concat(matrix);
                    drawable.n(nativeCanvas, dVar4);
                    nativeCanvas.restore();
                } else {
                    dVar4.g(nativeCanvas, matrix, i2, null);
                }
            }
            drawable.M = false;
            if (z) {
                semaphore.release();
                if (dVar4.M != eVar.a()) {
                    threadPoolExecutor.execute(dVar3);
                }
            }
        }
        return Unit.f186387a;
    }
}
