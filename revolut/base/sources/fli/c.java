package fli;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f135996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135997x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(continuation);
        this.f135996w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f135997x |= Integer.MIN_VALUE;
        return this.f135996w.emit(null, this);
    }
}
