package v1;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import android.os.Trace;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.media.ImageWriterWrapper;
import androidx.compose.runtime.Composer;
import androidx.view.result.ActivityResultRegistry;
import aw0.o9;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.feature.rev_points.models.RevPoints;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import us6.r2;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class c {
    public static void A(ArrayList arrayList, xi0.b bVar, xi0.b bVar2) {
        arrayList.add(new Pair(bVar, bVar2));
    }

    public static void B(Function2 function2, int i, Composer composer, int i2) {
        composer.updateRememberedValue(Integer.valueOf(i));
        composer.apply(Integer.valueOf(i2), function2);
    }

    public static /* synthetic */ boolean C(AtomicReference atomicReference, Throwable th10) {
        while (!atomicReference.compareAndSet(null, th10)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean D(AtomicReference atomicReference, zfm.g gVar) {
        while (!atomicReference.compareAndSet(null, gVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static int a(MessageAuthor messageAuthor, int i, int i2) {
        return (messageAuthor.hashCode() + i) * i2;
    }

    public static int b(wd6.h hVar, int i, int i2) {
        return (hVar.hashCode() + i) * i2;
    }

    public static int c(xfa.b bVar, int i, int i2) {
        return (bVar.hashCode() + i) * i2;
    }

    public static long d(Debug debug, long j2) {
        Trace.endSection();
        return DurationNs.m436constructorimpl(debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU() - j2);
    }

    public static ActivityResultRegistry e(com.revolut.kompot.navigable.a aVar) {
        return pli.b.a(f60.u.a(f60.t.a(aVar)));
    }

    public static CompositeClause f(List list, Integer num) {
        return yoj.b.m(new DotDividerClause(num), list);
    }

    public static NumberClause g(int i, RevPoints revPoints, Custom custom, o9 o9Var, int i2) {
        return nub.a.i(revPoints, custom, new nub.b(i), o9Var, i2);
    }

    public static e4m.e h(v8k.c cVar, v8k.f fVar, int i) {
        return e4m.b.b(new r2(cVar, fVar, i, 8));
    }

    public static e4m.e i(v8k.c cVar, v8k.g gVar, v8k.d dVar, int i) {
        return e4m.b.b(new r7d.w(cVar, gVar, dVar, i, 18));
    }

    public static e4m.e j(vle.b bVar, vle.c cVar, int i) {
        return e4m.b.b(new r2(bVar, cVar, i, 26));
    }

    public static e4m.e k(vp5.d dVar, vp5.e eVar, int i) {
        return e4m.b.b(new vn2.l(dVar, eVar, i, 8));
    }

    public static e4m.e l(w41.a aVar, vzc.g gVar, w41.b bVar, int i) {
        return e4m.b.b(new r7d.w(aVar, gVar, bVar, i, 26));
    }

    public static e4m.e m(w5f.m mVar, w5f.f fVar, int i) {
        return e4m.b.b(new vzc.j(mVar, fVar, i, 9));
    }

    public static e4m.e n(w5j.b bVar, w5j.c cVar, int i) {
        return e4m.b.b(new vzc.j(bVar, cVar, i, 16));
    }

    public static e4m.e o(waf.d dVar, int i) {
        return e4m.b.b(new waf.c(dVar, i));
    }

    public static e4m.e p(waf.d dVar, waf.b bVar, int i) {
        return e4m.b.b(new vzc.j(dVar, bVar, i, 22));
    }

    public static e60.s q(com.revolut.kompot.navigable.a aVar, t80.v vVar, e60.z zVar, rp0.m mVar, e60.t tVar) {
        return f0k.d.v(aVar, vVar, zVar, mVar, tVar, new nji.b());
    }

    public static j60.c r(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer) {
        j60.e dialogHostFinder = new j60.e();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static Object s(String str, String str2, ne0.d dVar) {
        return dVar.get(str + str2);
    }

    public static String t(int i, String str, String str2, String str3) {
        return str + str2 + str3 + i;
    }

    public static String u(String str, Throwable th10) {
        return str + th10;
    }

    public static List v(List list) {
        return zhm.u.c(Integer.valueOf(list.size()));
    }

    public static List w(xi0.b bVar, xi0.b bVar2) {
        return zhm.u.c(new Pair(bVar, bVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) throws Exception {
        boolean zIsTerminated;
        if (cameraCaptureSessionWrapper instanceof AutoCloseable) {
            cameraCaptureSessionWrapper.close();
            return;
        }
        if (!(cameraCaptureSessionWrapper instanceof ExecutorService)) {
            if (cameraCaptureSessionWrapper instanceof TypedArray) {
                ((TypedArray) cameraCaptureSessionWrapper).recycle();
                return;
            } else {
                if (!(cameraCaptureSessionWrapper instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) cameraCaptureSessionWrapper).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cameraCaptureSessionWrapper;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void y(ImageWriterWrapper imageWriterWrapper) throws Exception {
        boolean zIsTerminated;
        if (imageWriterWrapper instanceof AutoCloseable) {
            imageWriterWrapper.close();
            return;
        }
        if (!(imageWriterWrapper instanceof ExecutorService)) {
            if (imageWriterWrapper instanceof TypedArray) {
                ((TypedArray) imageWriterWrapper).recycle();
                return;
            } else {
                if (!(imageWriterWrapper instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) imageWriterWrapper).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) imageWriterWrapper;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void z(Object obj2) throws Exception {
        boolean zIsTerminated;
        if (obj2 instanceof AutoCloseable) {
            ((AutoCloseable) obj2).close();
            return;
        }
        if (!(obj2 instanceof ExecutorService)) {
            if (obj2 instanceof TypedArray) {
                ((TypedArray) obj2).recycle();
                return;
            } else {
                if (!(obj2 instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) obj2).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj2;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
