package xub;

import kotlin.coroutines.Continuation;
import xif.m;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f309004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Continuation continuation) {
        super(continuation);
        this.f309004w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f309004w.emit(null, this);
    }
}
