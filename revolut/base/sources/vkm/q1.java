package vkm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes14.dex */
public final class q1 extends gim.c {
    public vkf.d u;
    public Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f290105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vkf.d f290106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f290107y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f290106x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f290105w = obj2;
        this.f290107y |= Integer.MIN_VALUE;
        return this.f290106x.emit(null, this);
    }
}
