package sem;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class f implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f262233a;

    public f(Object context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f262233a = context;
    }

    public abstract Object a(Object obj2, gim.c cVar);

    public abstract Object b();

    public abstract Object c(Continuation continuation);

    public abstract Object d(Object obj2, Continuation continuation);
}
