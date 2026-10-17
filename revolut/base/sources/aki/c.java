package aki;

import aj0.o;
import com.revolut.kompot.navigable.ControllerKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface c {
    static void a(c cVar, ControllerKey controllerKey, boolean z) {
        o doAfterRemove = new o(23);
        f fVar = (f) cVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(controllerKey, "controllerKey");
        Intrinsics.checkNotNullParameter(doAfterRemove, "doAfterRemove");
        if (fVar.e.contains(controllerKey)) {
            return;
        }
        fVar.e(controllerKey, z, false, "explicit");
        doAfterRemove.invoke();
    }
}
