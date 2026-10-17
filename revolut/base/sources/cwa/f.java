package cwa;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public boolean u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f109586x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f109587y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(continuation);
        this.f109586x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f109585w = obj2;
        this.f109587y |= Integer.MIN_VALUE;
        return this.f109586x.a(false, this);
    }
}
