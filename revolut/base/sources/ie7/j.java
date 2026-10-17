package ie7;

import hd.r;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public h30.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f160669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f160670x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, Continuation continuation) {
        super(continuation);
        this.f160669w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f160670x |= Integer.MIN_VALUE;
        return r.k(this.f160669w, null, this);
    }
}
