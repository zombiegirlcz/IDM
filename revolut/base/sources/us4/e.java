package us4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ urd.m f282420w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(urd.m mVar, Continuation continuation) {
        super(continuation);
        this.f282420w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282420w.emit(null, this);
    }
}
