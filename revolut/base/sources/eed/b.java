package eed;

import dwi.v;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f125176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, Continuation continuation) {
        super(continuation);
        this.f125176w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f125176w.emit(null, this);
    }
}
