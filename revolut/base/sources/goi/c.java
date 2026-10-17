package goi;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f145159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f145160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f145161c;
    public f d;
    public boolean e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f145162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f145163h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.camera.viewfinder.a f145164j;

    public c(ScreenContentRecyclerView hostView) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f145159a = hostView;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paintC.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, -16777216, 0, Shader.TileMode.CLAMP));
        this.f145160b = paintC;
        this.d = d.f145165a;
        this.f = new int[2];
        this.f145162g = new int[2];
        Context context = hostView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f145163h = c8g.c.e(context, 4.0f);
        this.f145164j = new androidx.camera.viewfinder.a(this, 7);
    }

    public final void a() {
        View view = this.f145161c;
        if (view == null) {
            return;
        }
        ScreenContentRecyclerView screenContentRecyclerView = this.f145159a;
        int[] iArr = this.f;
        screenContentRecyclerView.getLocationOnScreen(iArr);
        int[] iArr2 = this.f145162g;
        view.getLocationOnScreen(iArr2);
        int height = (view.getHeight() + iArr2[1]) - iArr[1];
        if (height == this.i) {
            return;
        }
        this.i = height;
        screenContentRecyclerView.invalidate();
    }
}
