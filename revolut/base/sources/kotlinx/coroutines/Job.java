package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import skm.o;
import skm.r0;
import skm.r1;

/* JADX INFO: loaded from: classes13.dex */
public interface Job extends CoroutineContext.Element {
    boolean d();

    void f(CancellationException cancellationException);

    Sequence getChildren();

    boolean isCancelled();

    boolean isCompleted();

    r0 k(Function1 function1);

    flm.c l();

    r0 o(boolean z, boolean z3, Function1 function1);

    CancellationException p();

    o s(r1 r1Var);

    boolean start();

    Object u(Continuation continuation);
}
