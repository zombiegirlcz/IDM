package hsl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f155083w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f155083w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f155083w.emit(null, this);
    }
}
