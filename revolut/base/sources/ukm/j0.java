package ukm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public interface j0 {
    boolean close(Throwable th10);

    flm.e getOnSend();

    void invokeOnClose(Function1 function1);

    boolean isClosedForSend();

    boolean offer(Object obj2);

    Object send(Object obj2, Continuation continuation);

    /* JADX INFO: renamed from: trySend-JP2dKIU */
    Object mo3647trySendJP2dKIU(Object obj2);
}
