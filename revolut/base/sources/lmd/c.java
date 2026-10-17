package lmd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c2d.f f196952w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c2d.f fVar, Continuation continuation) {
        super(continuation);
        this.f196952w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f196952w.emit(null, this);
    }
}
