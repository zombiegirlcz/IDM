package yu4;

import kotlin.coroutines.Continuation;
import ymk.x;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f316875w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x xVar, Continuation continuation) {
        super(continuation);
        this.f316875w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f316875w.emit(null, this);
    }
}
