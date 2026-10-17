package lv4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lkf.q f200314w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(lkf.q qVar, Continuation continuation) {
        super(continuation);
        this.f200314w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f200314w.emit(null, this);
    }
}
