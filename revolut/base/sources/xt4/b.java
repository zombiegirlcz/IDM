package xt4;

import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public List u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f308751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f308752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f308753y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(continuation);
        this.f308752x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f308751w = obj2;
        this.f308753y |= Integer.MIN_VALUE;
        return this.f308752x.b(null, this);
    }
}
