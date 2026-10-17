package a3l;

import a31.k;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import voi.i;
import yy0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f1177a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f1178b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f1179c;
    public static volatile gpk.c d;

    private e() {
    }

    public static void g() {
        ReentrantReadWriteLock.ReadLock lock = f1178b.readLock();
        lock.lock();
        try {
            gpk.c cVar = d;
            if (f1179c == null && cVar != null) {
                i iVar = (i) cVar.f145463a;
                bk0.e eVar = (bk0.e) cVar.f145464b;
                Object obj2 = ((voi.b) cVar.f145465c).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                f1179c = new a(iVar, eVar, (Set) obj2, eVar);
            }
            Unit unit = Unit.f186387a;
            lock.unlock();
        } catch (Throwable th10) {
            lock.unlock();
            throw th10;
        }
    }

    @Override // yy0.f
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(to6, "to");
        ReentrantReadWriteLock.ReadLock lock = f1178b.readLock();
        lock.lock();
        try {
            g();
            a aVar = f1179c;
            if (aVar == null) {
                throw new IllegalStateException("smth tries to load image before delegate image loader initied or after clear");
            }
            aVar.a(image, to6, function1, function0);
            Unit unit = Unit.f186387a;
        } finally {
            lock.unlock();
        }
    }

    @Override // yy0.f
    public final void b(ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yy0.f
    public final void c(Image image, Context context, int i, int i2, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        k kVar = new k(1, function1);
        b bVar = new b(0, function0);
        ReentrantReadWriteLock.ReadLock lock = f1178b.readLock();
        lock.lock();
        try {
            g();
            a aVar = f1179c;
            if (aVar == null) {
                throw new IllegalStateException("smth tries to load image before delegate image loader initied or after clear");
            }
            aVar.c(image, context, i, i2, kVar, bVar);
            Unit unit = Unit.f186387a;
            lock.unlock();
        } catch (Throwable th10) {
            lock.unlock();
            throw th10;
        }
    }

    @Override // yy0.f
    public final Image d(ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a aVar = f1179c;
        if (aVar != null) {
            return aVar.d(view);
        }
        return null;
    }

    @Override // yy0.f
    public final void f(ImageView to6, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        g();
        a aVar = f1179c;
        if (aVar != null) {
            aVar.f(to6, z);
        }
    }
}
