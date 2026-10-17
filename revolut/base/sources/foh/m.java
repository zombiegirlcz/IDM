package foh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fod.i f136971w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fod.i iVar, Continuation continuation) {
        super(continuation);
        this.f136971w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f136971w.emit(null, this);
    }
}
