package uwe;

import kotlin.coroutines.Continuation;
import urd.m;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f283638w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, Continuation continuation) {
        super(continuation);
        this.f283638w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f283638w.emit(null, this);
    }
}
