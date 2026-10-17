package wjg;

import gim.c;
import kotlin.coroutines.Continuation;
import wa3.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f298087w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, Continuation continuation) {
        super(continuation);
        this.f298087w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f298087w.emit(null, this);
    }
}
