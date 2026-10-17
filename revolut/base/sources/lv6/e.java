package lv6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lkf.q f200324w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lkf.q qVar, Continuation continuation) {
        super(continuation);
        this.f200324w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f200324w.emit(null, this);
    }
}
