package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes13.dex */
public interface CancellableContinuation extends Continuation {
    boolean a(Throwable th10);

    boolean d();

    void e(Object obj2, Function3 function3);

    void m(Object obj2);

    cfm.c q(Object obj2, Function3 function3);

    void r(Function1 function1);
}
