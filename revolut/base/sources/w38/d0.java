package w38;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f294166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f294167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io3.d f294168c;
    public final /* synthetic */ xi0.b d;
    public final /* synthetic */ n38.a e;
    public final /* synthetic */ List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ do3.n f294169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Set f294170h;
    public final /* synthetic */ g48.a i;

    public d0(Flow flow, q0 q0Var, io3.d dVar, xi0.b bVar, n38.a aVar, List list, do3.n nVar, Set set, g48.a aVar2) {
        this.f294166a = flow;
        this.f294167b = q0Var;
        this.f294168c = dVar;
        this.d = bVar;
        this.e = aVar;
        this.f = list;
        this.f294169g = nVar;
        this.f294170h = set;
        this.i = aVar2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f294166a.collect(new c0(flowCollector, this.f294167b, this.f294168c, this.d, this.e, this.f, this.f294169g, this.f294170h, this.i), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
