package gsd;

import god.k;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f146390w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, Continuation continuation) {
        super(continuation);
        this.f146390w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f146390w.emit(null, this);
    }
}
