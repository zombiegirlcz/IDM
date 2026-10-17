package zzd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.documents_hub.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f326681w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.statements.impl.ui.documents_hub.a aVar, Continuation continuation) {
        super(continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f326681w |= Integer.MIN_VALUE;
        return this.v.L2(null, this);
    }
}
