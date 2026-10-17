package nn8;

import kotlin.coroutines.Continuation;
import njj.i;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f217483w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Continuation continuation) {
        super(continuation);
        this.f217483w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f217483w.emit(null, this);
    }
}
