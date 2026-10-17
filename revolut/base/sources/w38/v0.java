package w38;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f294224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f294225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f294226c;
    public final /* synthetic */ xi0.b d;
    public final /* synthetic */ n38.a e;
    public final /* synthetic */ List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ do3.n f294227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Set f294228h;
    public final /* synthetic */ g48.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dj0.d f294229j;

    public v0(Flow flow, List list, w0 w0Var, xi0.b bVar, n38.a aVar, List list2, do3.n nVar, Set set, g48.a aVar2, dj0.d dVar) {
        this.f294224a = flow;
        this.f294225b = list;
        this.f294226c = w0Var;
        this.d = bVar;
        this.e = aVar;
        this.f = list2;
        this.f294227g = nVar;
        this.f294228h = set;
        this.i = aVar2;
        this.f294229j = dVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f294224a.collect(new u0(flowCollector, this.f294225b, this.f294226c, this.d, this.e, this.f, this.f294227g, this.f294228h, this.i, this.f294229j), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
