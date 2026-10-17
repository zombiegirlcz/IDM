package hjh;

import hg4.i;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f152818w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, Continuation continuation) {
        super(continuation);
        this.f152818w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152818w.emit(null, this);
    }
}
