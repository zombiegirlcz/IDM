package s57;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public String A;
    public b67.f B;
    public String C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f260026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f260027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f260028y;
    public od0.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f260026w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f260026w.emit(null, this);
    }
}
