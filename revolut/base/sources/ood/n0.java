package ood;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nvk.v f227062w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(nvk.v vVar, Continuation continuation) {
        super(continuation);
        this.f227062w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f227062w.emit(null, this);
    }
}
