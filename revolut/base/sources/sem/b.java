package sem;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f262225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f262226c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object context, List interceptors, Object subject, CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f262225b = interceptors;
        this.f262226c = coroutineContext;
        this.d = subject;
    }

    @Override // sem.f
    public final Object a(Object obj2, gim.c cVar) {
        this.e = 0;
        Intrinsics.checkNotNullParameter(obj2, "<set-?>");
        this.d = obj2;
        return c(cVar);
    }

    @Override // sem.f
    public final Object b() {
        return this.d;
    }

    @Override // sem.f
    public final Object c(Continuation continuation) {
        int i = this.e;
        if (i < 0) {
            return this.d;
        }
        if (i < this.f262225b.size()) {
            return e(continuation);
        }
        this.e = -1;
        return this.d;
    }

    @Override // sem.f
    public final Object d(Object obj2, Continuation continuation) {
        Intrinsics.checkNotNullParameter(obj2, "<set-?>");
        this.d = obj2;
        return c(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof sem.a
            if (r0 == 0) goto L13
            r0 = r7
            sem.a r0 = (sem.a) r0
            int r1 = r0.f262224w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f262224w = r1
            goto L18
        L13:
            sem.a r0 = new sem.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f262224w
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2c:
            yhm.o.b(r7)
        L2f:
            int r7 = r6.e
            r2 = -1
            if (r7 != r2) goto L35
            goto L3f
        L35:
            java.util.List r4 = r6.f262225b
            int r5 = r4.size()
            if (r7 < r5) goto L42
            r6.e = r2
        L3f:
            java.lang.Object r7 = r6.d
            return r7
        L42:
            java.lang.Object r2 = r4.get(r7)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            int r7 = r7 + 1
            r6.e = r7
            java.lang.Object r7 = r6.d
            r0.f262224w = r3
            java.lang.Object r7 = r2.invoke(r6, r7, r0)
            if (r7 != r1) goto L2f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sem.b.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f262226c;
    }
}
