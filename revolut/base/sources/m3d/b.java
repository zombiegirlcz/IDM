package m3d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.d f202365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ly4.d dVar, Continuation continuation) {
        super(continuation);
        this.f202365w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f202365w.emit(null, this);
    }
}
