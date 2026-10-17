package sem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class l implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f262238a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f262239b;

    public l(m mVar) {
        this.f262239b = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = k.f262237a;
        int i = this.f262238a;
        m mVar = this.f262239b;
        if (i == Integer.MIN_VALUE) {
            this.f262238a = mVar.f;
        }
        int i2 = this.f262238a;
        if (i2 < 0) {
            this.f262238a = Integer.MIN_VALUE;
            continuation = null;
        } else {
            try {
                Continuation continuation2 = mVar.e[i2];
                if (continuation2 != null) {
                    this.f262238a = i2 - 1;
                    continuation = continuation2;
                }
            } catch (Throwable unused) {
            }
        }
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        m mVar = this.f262239b;
        Continuation[] continuationArr = mVar.e;
        int i = mVar.f;
        Continuation continuation = continuationArr[i];
        if (continuation != this && continuation != null) {
            return continuation.getContext();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            Continuation continuation2 = continuationArr[i2];
            if (continuation2 != this && continuation2 != null) {
                return continuation2.getContext();
            }
            i2 = i3;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        m.Companion companion = yhm.m.INSTANCE;
        boolean z = obj2 instanceof n;
        m mVar = this.f262239b;
        if (!z) {
            mVar.e(false);
            return;
        }
        Throwable thA = yhm.m.a(obj2);
        Intrinsics.h(thA);
        mVar.f(o.a(thA));
    }
}
