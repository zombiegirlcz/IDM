package androidx.compose.ui;

import androidx.compose.ui.SessionMutex;
import fim.a;
import gim.d;
import gim.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import skm.e0;
import yhm.o;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class SessionMutex$withSessionCancellingPrevious$2<R> extends i implements Function2<CoroutineScope, Continuation<? super R>, Object> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-SessionMutex$-this$0, reason: not valid java name */
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> f53$$v$c$androidxcomposeuiSessionMutex$this$0;
    final /* synthetic */ Function2<T, Continuation<? super R>, Object> $session;
    final /* synthetic */ Function1<CoroutineScope, T> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionMutex$withSessionCancellingPrevious$2(Function1<? super CoroutineScope, ? extends T> function1, AtomicReference<SessionMutex.Session<T>> atomicReference, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super SessionMutex$withSessionCancellingPrevious$2> continuation) {
        super(2, continuation);
        this.$sessionInitializer = function1;
        this.f53$$v$c$androidxcomposeuiSessionMutex$this$0 = atomicReference;
        this.$session = function2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.f53$$v$c$androidxcomposeuiSessionMutex$this$0, this.$session, continuation);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj2;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        SessionMutex.Session session;
        Job job2;
        SessionMutex.Session session2;
        AtomicReference<SessionMutex.Session<T>> atomicReference;
        AtomicReference<SessionMutex.Session<T>> atomicReference2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                o.b(obj2);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                session = new SessionMutex.Session(e0.t(coroutineScope.getF74819h()), this.$sessionInitializer.invoke(coroutineScope));
                SessionMutex.Session session3 = (SessionMutex.Session) this.f53$$v$c$androidxcomposeuiSessionMutex$this$0.getAndSet((SessionMutex.Session<T>) session);
                if (session3 != null && (job2 = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (e0.m(job2, this) != aVar) {
                    }
                    return aVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (SessionMutex.Session) this.L$0;
                    try {
                        o.b(obj2);
                        atomicReference2 = this.f53$$v$c$androidxcomposeuiSessionMutex$this$0;
                        while (!atomicReference2.compareAndSet((SessionMutex.Session<T>) session2, null) && atomicReference2.get() == session2) {
                        }
                        return obj2;
                    } catch (Throwable th10) {
                        th = th10;
                        atomicReference = this.f53$$v$c$androidxcomposeuiSessionMutex$this$0;
                        while (!atomicReference.compareAndSet((SessionMutex.Session<T>) session2, null) && atomicReference.get() == session2) {
                        }
                        throw th;
                    }
                }
                session = (SessionMutex.Session) this.L$0;
                o.b(obj2);
            }
            Function2<T, Continuation<? super R>, Object> function2 = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj2 = function2.invoke(value, this);
            if (obj2 != aVar) {
                session2 = session;
                atomicReference2 = this.f53$$v$c$androidxcomposeuiSessionMutex$this$0;
                while (!atomicReference2.compareAndSet((SessionMutex.Session<T>) session2, null)) {
                }
                return obj2;
            }
            return aVar;
        } catch (Throwable th11) {
            th = th11;
            session2 = session;
            atomicReference = this.f53$$v$c$androidxcomposeuiSessionMutex$this$0;
            while (!atomicReference.compareAndSet((SessionMutex.Session<T>) session2, null)) {
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
