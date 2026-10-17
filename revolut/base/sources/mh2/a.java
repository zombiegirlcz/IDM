package mh2;

import gim.c;
import kotlin.coroutines.Continuation;
import lmg.k;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f205372w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, Continuation continuation) {
        super(continuation);
        this.f205372w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f205372w.emit(null, this);
    }
}
