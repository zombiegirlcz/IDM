package pca;

import kotlin.coroutines.Continuation;
import p26.j;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f234834w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, Continuation continuation) {
        super(continuation);
        this.f234834w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f234834w.emit(null, this);
    }
}
