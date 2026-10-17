package m6i;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public List u;
    public Function2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jul.o f203130x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203131y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jul.o oVar, gim.c cVar) {
        super(cVar);
        this.f203130x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203129w = obj2;
        this.f203131y |= Integer.MIN_VALUE;
        return this.f203130x.r(null, null, this);
    }
}
