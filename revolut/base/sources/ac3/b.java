package ac3;

import a9j.s;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f3022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, Continuation continuation) {
        super(continuation);
        this.f3022w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f3022w.emit(null, this);
    }
}
