package qkf;

import kotlin.coroutines.Continuation;
import pkf.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d1 f246990w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f246990w = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f246990w.emit(null, this);
    }
}
