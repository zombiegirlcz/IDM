package tzd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tnb.j f275939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tnb.j jVar, Continuation continuation) {
        super(continuation);
        this.f275939w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f275939w.emit(null, this);
    }
}
