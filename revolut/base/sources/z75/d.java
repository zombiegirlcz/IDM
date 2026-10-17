package z75;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.g f319910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ly4.g gVar, Continuation continuation) {
        super(continuation);
        this.f319910w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f319910w.emit(null, this);
    }
}
