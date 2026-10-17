package mt0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import mx0.n6;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingBottomBarView f208701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShadowLayout f208702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f208703c;
    public ro0.p d;
    public final RectF e;
    public final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f208704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f208705h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f208706j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f208707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ro0.m f208708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f208709n;
    public final kye.e o;

    public j(FloatingBottomBarView bottomBarView, ShadowLayout shadowLayout, n6 bottomInsetHeightProvider) {
        Intrinsics.checkNotNullParameter(bottomBarView, "bottomBarView");
        Intrinsics.checkNotNullParameter(shadowLayout, "shadowLayout");
        Intrinsics.checkNotNullParameter(bottomInsetHeightProvider, "bottomInsetHeightProvider");
        this.f208701a = bottomBarView;
        this.f208702b = shadowLayout;
        this.f208703c = bottomInsetHeightProvider;
        this.e = new RectF();
        this.f = new float[9];
        this.f208704g = new float[9];
        this.f208705h = -1;
        this.i = -1;
        this.f208706j = -1;
        this.k = -1;
        this.f208707l = -1.0f;
        this.f208709n = te0.w.y0(new h(this, 0));
        this.o = new kye.e(this, 16);
    }

    public final ro0.m a() {
        ShadowLayout shadowLayout = this.f208702b;
        Matrix matrix = shadowLayout.getMatrix();
        float[] fArr = this.f;
        matrix.getValues(fArr);
        int width = shadowLayout.getWidth();
        int height = shadowLayout.getHeight();
        int left = shadowLayout.getLeft();
        int top = shadowLayout.getTop();
        float cornersRadius = shadowLayout.getCornersRadius();
        ro0.m mVar = this.f208708m;
        float[] destination = this.f208704g;
        if (mVar != null && this.f208705h == width && this.i == height && this.f208706j == left && this.k == top && this.f208707l == cornersRadius && Arrays.equals(fArr, destination)) {
            return mVar;
        }
        RectF rectF = this.e;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
        matrix.mapRect(rectF);
        rectF.offset(left, top);
        float fMin = Math.min(Math.abs(shadowLayout.getScaleX()), Math.abs(shadowLayout.getScaleY()));
        this.f208705h = width;
        this.i = height;
        this.f208706j = left;
        this.k = top;
        this.f208707l = cornersRadius;
        int length = fArr.length;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, 0, destination, 0, length);
        Rect rect = new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        Context context = this.f208701a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ro0.m mVar2 = new ro0.m(rect, kli.a.l(context, cornersRadius) * fMin);
        this.f208708m = mVar2;
        return mVar2;
    }
}
