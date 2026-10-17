package androidx.glance.session;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "androidx/work/ListenableFutureKt$await$2$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SessionManagerImpl$isSessionRunning$$inlined$await$2 extends u implements Function1<Throwable, Unit> {
    final /* synthetic */ ListenableFuture $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerImpl$isSessionRunning$$inlined$await$2(ListenableFuture listenableFuture) {
        super(1);
        this.$this_await = listenableFuture;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Throwable) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Throwable th10) {
        this.$this_await.cancel(false);
    }
}
