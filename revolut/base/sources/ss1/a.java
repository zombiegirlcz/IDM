package ss1;

import gim.c;
import kotlin.coroutines.Continuation;
import spb.f;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f265259w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Continuation continuation) {
        super(continuation);
        this.f265259w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f265259w.emit(null, this);
    }
}
