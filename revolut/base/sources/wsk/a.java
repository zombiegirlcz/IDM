package wsk;

import kotlin.coroutines.Continuation;
import wk2.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f299752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, Continuation continuation) {
        super(continuation);
        this.f299752w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299752w.emit(null, this);
    }
}
