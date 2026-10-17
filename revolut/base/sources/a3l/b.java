package a3l;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.compose.material.DrawerKt;
import androidx.content.internal.NavControllerImpl;
import com.revolut.kompot.common.StackDestination;
import efm.k;
import et0.p;
import et0.t0;
import ix0.h1;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lk0.g;
import mx0.o4;
import rfm.h;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f1171b;

    public /* synthetic */ b(int i, Function0 function0) {
        this.f1170a = i;
        this.f1171b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1170a;
        Function0 function0 = this.f1171b;
        switch (i) {
            case 0:
                Handler handler = e.f1177a;
                c cVar = new c(0, function0);
                if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                    cVar.run();
                } else {
                    e.f1177a.post(cVar);
                }
                return Unit.f186387a;
            case 1:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 2:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 3:
                p.a aVar = p.Companion;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 4:
                int i2 = t0.e;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 5:
                function0.invoke();
                return Unit.f186387a;
            case 6:
                g gVar = (g) function0.invoke();
                if (gVar != null) {
                    return k.g(gVar);
                }
                h hVar = h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 7:
                int i3 = o4.f;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 8:
                function0.invoke();
                return Unit.f186387a;
            case 9:
                function0.invoke();
                return Unit.f186387a;
            case 10:
                return u0.f((StackDestination) function0.invoke());
            case 11:
                return NavControllerImpl.pop$lambda$6(function0);
            case 12:
                return Boolean.valueOf(DrawerKt.Scrim_Bx497Mc$lambda$1$0$0(function0));
            case 13:
                function0.invoke();
                return Unit.f186387a;
            case 14:
                function0.invoke();
                return Unit.f186387a;
            case 15:
                return Threads._camera2Handler$lambda$0(function0);
            case 16:
                return Threads._camera2Executor$lambda$0(function0);
            default:
                Lazy lazy = h1.f169241a;
                c runnable = new c(14, function0);
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                    runnable.run();
                } else {
                    h1.a().post(runnable);
                }
                return Unit.f186387a;
        }
    }
}
