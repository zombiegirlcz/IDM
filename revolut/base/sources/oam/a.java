package oam;

import flm.c;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import skm.e0;
import skm.g0;
import skm.g1;
import skm.o;
import skm.r;
import skm.r0;
import skm.r1;
import ukm.b0;
import ukm.j0;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements j0, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f223796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f223797b;

    public a() {
        b0 channel = new b0();
        r deferred = e0.b();
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(deferred, "deferred");
        this.f223796a = channel;
        this.f223797b = deferred;
    }

    @Override // ukm.j0
    public final boolean close(Throwable th10) {
        return this.f223796a.f280798a.close(th10);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean d() {
        return this.f223797b.d();
    }

    @Override // kotlinx.coroutines.Job
    public final void f(CancellationException cancellationException) {
        this.f223796a.f280798a.m(cancellationException);
        this.f223797b.f(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj2, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        r rVar = this.f223797b;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj2, rVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        r rVar = this.f223797b;
        rVar.getClass();
        return e.b(rVar, key);
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return this.f223797b.getChildren();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        this.f223797b.getClass();
        return g1.f263979a;
    }

    @Override // ukm.j0
    public final flm.e getOnSend() {
        return this.f223796a.f280798a.getOnSend();
    }

    @Override // skm.g0
    public final Object h() {
        return (Boolean) this.f223797b.I();
    }

    @Override // skm.g0
    public final Object i(Continuation continuation) {
        Object objY = this.f223797b.y(continuation);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        return objY;
    }

    @Override // ukm.j0
    public final void invokeOnClose(Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f223796a.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return this.f223797b.isCancelled();
    }

    @Override // ukm.j0
    public final boolean isClosedForSend() {
        return this.f223796a.f280798a.isClosedForSend();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return this.f223797b.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    public final r0 k(Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f223797b.k(handler);
    }

    @Override // kotlinx.coroutines.Job
    public final c l() {
        return this.f223797b.l();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        r rVar = this.f223797b;
        rVar.getClass();
        return e.c(rVar, key);
    }

    @Override // skm.g0
    public final Throwable n() {
        return this.f223797b.n();
    }

    @Override // kotlinx.coroutines.Job
    public final r0 o(boolean z, boolean z3, Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f223797b.o(z, z3, handler);
    }

    @Override // ukm.j0
    public final boolean offer(Object obj2) {
        this.f223797b.U(Boolean.TRUE);
        return this.f223796a.offer(obj2);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException p() {
        return this.f223797b.p();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r rVar = this.f223797b;
        rVar.getClass();
        return e.d(rVar, context);
    }

    @Override // kotlinx.coroutines.Job
    public final o s(r1 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.f223797b.s(child);
    }

    @Override // ukm.j0
    public final Object send(Object obj2, Continuation continuation) throws Throwable {
        this.f223797b.U(Boolean.TRUE);
        Object objSend = this.f223796a.f280798a.send(obj2, continuation);
        return objSend == fim.a.COROUTINE_SUSPENDED ? objSend : Unit.f186387a;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return this.f223797b.start();
    }

    @Override // skm.g0
    public final twg.c t() {
        return this.f223797b.M();
    }

    @Override // kotlinx.coroutines.Job
    public final Object u(Continuation continuation) {
        return this.f223797b.u(continuation);
    }
}
