package oji;

import kotlin.coroutines.Continuation;
import nvk.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f225783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225784x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, Continuation continuation) {
        super(continuation);
        this.f225783w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225784x |= Integer.MIN_VALUE;
        return this.f225783w.emit(null, this);
    }
}
