package qv;

import gim.c;
import kotlin.coroutines.Continuation;
import qph.g;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f249507w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, Continuation continuation) {
        super(continuation);
        this.f249507w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f249507w.emit(null, this);
    }
}
