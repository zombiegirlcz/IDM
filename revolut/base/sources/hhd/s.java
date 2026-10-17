package hhd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f152405w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f152405w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152405w.emit(null, this);
    }
}
