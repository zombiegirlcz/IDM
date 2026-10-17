package ba7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public f u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f13967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f13968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13969y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(continuation);
        this.f13968x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13967w = obj2;
        this.f13969y |= Integer.MIN_VALUE;
        return this.f13968x.e(null, this);
    }
}
