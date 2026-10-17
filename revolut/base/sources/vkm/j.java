package vkm;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v0f.p f290047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f290048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f290049y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v0f.p pVar, Continuation continuation) {
        super(continuation);
        this.f290047w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290047w.collect(null, this);
    }
}
