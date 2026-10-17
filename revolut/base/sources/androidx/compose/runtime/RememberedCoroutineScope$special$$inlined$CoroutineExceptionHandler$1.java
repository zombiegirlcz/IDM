package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import skm.a0;
import skm.z;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/runtime/RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Lskm/a0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements a0 {
    final /* synthetic */ CompositionErrorContextImpl $traceContext$inlined;
    final /* synthetic */ RememberedCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(z zVar, CompositionErrorContextImpl compositionErrorContextImpl, RememberedCoroutineScope rememberedCoroutineScope) {
        super(zVar);
        this.$traceContext$inlined = compositionErrorContextImpl;
        this.this$0 = rememberedCoroutineScope;
    }

    @Override // skm.a0
    public void handleException(CoroutineContext context, Throwable exception) throws Throwable {
        this.$traceContext$inlined.attachComposeStackTrace(exception, this.this$0);
        CoroutineContext coroutineContext = this.this$0.overlayContext;
        z zVar = z.f264021a;
        a0 a0Var = (a0) coroutineContext.get(zVar);
        if (a0Var != null) {
            a0Var.handleException(context, exception);
            return;
        }
        a0 a0Var2 = (a0) this.this$0.parentContext.get(zVar);
        if (a0Var2 == null) {
            throw exception;
        }
        a0Var2.handleException(context, exception);
    }
}
