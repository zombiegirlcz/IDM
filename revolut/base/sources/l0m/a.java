package l0m;

import a0.d;
import android.app.Application;
import c10.g;
import c10.h;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static void a(Application context) {
        Intrinsics.checkNotNullParameter(context, "application");
        hf0.a aVarJ = e.j(context);
        phm.a aVar = (phm.a) aVarJ.a().get(n0m.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", n0m.a.class, " is not found"));
        }
        g visionInitialization = (g) ((n0m.a) aVar2.b()).d.get();
        phm.a aVar3 = (phm.a) aVarJ.a().get(k0m.a.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(d.q("Api ", k0m.a.class, " is not found"));
        }
        ((k0m.a) aVar4.b()).getClass();
        k0m.d.Companion.getClass();
        Intrinsics.checkNotNullParameter("rev_vision_android", "libraryName");
        f10.a visionFrameworkNativeImplementation = new f10.a();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(visionInitialization, "visionInitialization");
        Intrinsics.checkNotNullParameter(visionFrameworkNativeImplementation, "nativeImplementation");
        h hVar = (h) visionInitialization;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(visionFrameworkNativeImplementation, "visionFrameworkNativeImplementation");
        CountDownLatch countDownLatch = h.f20317b;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        synchronized (hVar) {
            if (countDownLatch.getCount() == 0) {
                return;
            }
            System.loadLibrary("rev_vision_android");
            countDownLatch.countDown();
            Unit unit = Unit.f186387a;
        }
    }
}
