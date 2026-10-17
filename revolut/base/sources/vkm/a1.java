package vkm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes14.dex */
public final class a1 extends gim.c {
    public Ref$ObjectRef u;
    public y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f289991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289992x;

    public a1(Continuation continuation) {
        super(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f289991w = obj2;
        this.f289992x |= Integer.MIN_VALUE;
        return q.y(null, null, this);
    }
}
