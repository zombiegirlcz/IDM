package vy5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f293210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, Continuation continuation) {
        super(continuation);
        this.v = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f293210w |= Integer.MIN_VALUE;
        return this.v.f3(this);
    }
}
