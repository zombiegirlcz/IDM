package mzh;

import kotlin.coroutines.Continuation;
import lmg.k;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f210767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Continuation continuation) {
        super(continuation);
        this.f210767w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f210767w.emit(null, this);
    }
}
