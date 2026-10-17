package uvl;

import kotlin.coroutines.Continuation;
import urd.m;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f283490w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, Continuation continuation) {
        super(continuation);
        this.f283490w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f283490w.emit(null, this);
    }
}
