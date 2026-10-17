package zzd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zul.l f326679w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zul.l lVar, Continuation continuation) {
        super(continuation);
        this.f326679w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f326679w.emit(null, this);
    }
}
