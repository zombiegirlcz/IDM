package ebk;

import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f124379w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f124379w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f124379w.emit(null, this);
    }
}
