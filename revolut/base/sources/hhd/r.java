package hhd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f152404w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f152404w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152404w.emit(null, this);
    }
}
