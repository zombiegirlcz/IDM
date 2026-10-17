package bg9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f15148w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f15148w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f15148w.emit(null, this);
    }
}
