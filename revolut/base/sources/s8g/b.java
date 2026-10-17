package s8g;

import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s6b.c f260991w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s6b.c cVar, Continuation continuation) {
        super(continuation);
        this.f260991w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f260991w.emit(null, this);
    }
}
