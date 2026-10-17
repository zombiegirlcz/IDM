package uwl;

import kotlin.coroutines.Continuation;
import urd.m;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f283698w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, Continuation continuation) {
        super(continuation);
        this.f283698w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f283698w.emit(null, this);
    }
}
