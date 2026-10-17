package alm;

import fim.b;
import fim.c;
import fim.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchException;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final void a(Throwable th10, Continuation continuation) throws Throwable {
        if (th10 instanceof DispatchException) {
            th10 = ((DispatchException) th10).getF187929a();
        }
        m.Companion companion = m.INSTANCE;
        continuation.resumeWith(o.a(th10));
        throw th10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Continuation completion, Function1 function1) {
        Continuation<Unit> bVar;
        try {
            Intrinsics.checkNotNullParameter(function1, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            Intrinsics.checkNotNullParameter(completion, "completion");
            if (function1 instanceof gim.a) {
                bVar = ((gim.a) function1).create(completion);
            } else {
                CoroutineContext context = completion.getContext();
                bVar = context == g.f186406a ? new b(completion, function1) : new c(completion, context, function1);
            }
            Continuation continuationB = h.b(bVar);
            m.Companion companion = m.INSTANCE;
            zkm.g.c(Unit.f186387a, continuationB);
        } catch (Throwable th10) {
            a(th10, completion);
            throw null;
        }
    }

    public static final void c(Continuation continuation, skm.a aVar) throws Throwable {
        try {
            Continuation continuationB = h.b(continuation);
            m.Companion companion = m.INSTANCE;
            zkm.g.c(Unit.f186387a, continuationB);
        } catch (Throwable th10) {
            a(th10, aVar);
            throw null;
        }
    }

    public static final void d(Function2 function2, skm.a aVar, skm.a aVar2) {
        try {
            Continuation continuationB = h.b(h.a(aVar, aVar2, function2));
            m.Companion companion = m.INSTANCE;
            zkm.g.c(Unit.f186387a, continuationB);
        } catch (Throwable th10) {
            a(th10, aVar2);
            throw null;
        }
    }
}
