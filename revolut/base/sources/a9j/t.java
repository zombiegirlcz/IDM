package a9j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f2708w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, Continuation continuation) {
        super(continuation);
        this.f2708w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f2708w.emit(null, this);
    }
}
