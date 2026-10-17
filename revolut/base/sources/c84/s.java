package c84;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22106w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Continuation continuation) {
        super(continuation);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22106w |= Integer.MIN_VALUE;
        return this.v.M2(null, false, this);
    }
}
