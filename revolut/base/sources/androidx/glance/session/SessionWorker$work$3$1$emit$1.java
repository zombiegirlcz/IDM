package androidx.glance.session;

import androidx.compose.runtime.Recomposer;
import androidx.glance.session.SessionWorker;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.session.SessionWorker$work$3$1", f = "SessionWorker.kt", l = {136, 143}, m = "emit")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class SessionWorker$work$3$1$emit$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionWorker.AnonymousClass3.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$work$3$1$emit$1(SessionWorker.AnonymousClass3.AnonymousClass1 anonymousClass1, Continuation<? super SessionWorker$work$3$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Recomposer.State) null, (Continuation<? super Unit>) this);
    }
}
