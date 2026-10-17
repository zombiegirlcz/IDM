package bw;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements f {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qw.a f19159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nw.a f19160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.h f19161c;
    public final z1 d;
    public final z1 e;
    public final Handler f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicLong f19162g;

    public q(qw.a imageUtils, nw.a closeableBitmapFactory, yw.h settings) {
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(closeableBitmapFactory, "closeableBitmapFactory");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f19159a = imageUtils;
        this.f19160b = closeableBitmapFactory;
        this.f19161c = settings;
        z1 z1VarB = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        this.d = z1VarB;
        this.e = z1VarB;
        this.f = new Handler(Looper.getMainLooper());
        this.f19162g = new AtomicLong(0L);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void analyze(ImageProxy proxy) {
        xv.u uVar;
        Object objA;
        Object objA2;
        nw.b bVar;
        Object objA3;
        qw.a aVar = this.f19159a;
        nw.a aVar2 = this.f19160b;
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        long jIncrementAndGet = this.f19162g.incrementAndGet();
        z1 z1Var = this.d;
        if (((Number) ((wkm.y) z1Var.l()).getValue()).intValue() == 0) {
            proxy.close();
            return;
        }
        if (this.f19161c.g() && proxy.getFormat() == 35) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                objA3 = r.a(proxy);
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA3 = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA3);
            if (thA != null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Could not copy YUV data from proxy", thA, h0Var);
                objA3 = null;
            }
            uVar = (xv.u) objA3;
        } else {
            uVar = null;
        }
        try {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA = proxy.toBitmap();
        } catch (Throwable th11) {
            m.Companion companion4 = yhm.m.INSTANCE;
            objA = yhm.o.a(th11);
        }
        Throwable thA2 = yhm.m.a(objA);
        if (thA2 != null) {
            proxy.close();
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "Could not create a bitmap from proxy", thA2, h0Var2);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(objA, "getOrElse(...)");
        Bitmap bitmap = (Bitmap) objA;
        try {
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            bVar = new nw.b(bitmap);
        } catch (Throwable th12) {
            m.Companion companion5 = yhm.m.INSTANCE;
            objA2 = yhm.o.a(th12);
        }
        try {
            Rect cropRect = proxy.getCropRect();
            Intrinsics.checkNotNullExpressionValue(cropRect, "getCropRect(...)");
            aVar.getClass();
            Bitmap bitmap2 = qw.a.c(bitmap, cropRect);
            Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
            bVar = new nw.b(bitmap2);
            try {
                objA2 = new yhm.r(qw.a.f(bitmap2), Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()));
                bVar.close();
                bVar.close();
                Throwable thA3 = yhm.m.a(objA2);
                if (thA3 != null) {
                    proxy.close();
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, "Exception during bitmap manipulations", thA3, h0Var3);
                    return;
                }
                yhm.r rVar = (yhm.r) objA2;
                ByteBuffer byteBuffer = (ByteBuffer) rVar.f314201a;
                int iIntValue = ((Number) rVar.f314202b).intValue();
                int iIntValue2 = ((Number) rVar.f314203c).intValue();
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                p pVar = new p(proxy, this.f);
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                xv.n nVar = new xv.n(byteBuffer, proxy.getImageInfo().getRotationDegrees(), iIntValue, iIntValue2, 1, jIncrementAndGet - 1, pVar, uVar);
                if (((Number) ((wkm.y) z1Var.l()).getValue()).intValue() == 0 || !z1Var.k(nVar)) {
                    pVar.close();
                }
            } finally {
            }
        } finally {
        }
    }
}
