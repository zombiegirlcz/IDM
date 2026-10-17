package fc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowEntitiesPage;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import w4l.k;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ a A;
    public final /* synthetic */ k B;
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f133592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f133593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f133594y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, String str, String str2, Map map, String str3, a aVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f133592w = str;
        this.f133593x = str2;
        this.f133594y = map;
        this.z = str3;
        this.A = aVar;
        this.B = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f133592w, this.f133593x, this.f133594y, this.z, this.A, this.B, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((BackendFlowEntitiesPage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BackendFlowEntitiesPage backendFlowEntitiesPage = (BackendFlowEntitiesPage) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (backendFlowEntitiesPage.f63269a || !backendFlowEntitiesPage.f63271c.isEmpty()) {
            return zi0.c.i(backendFlowEntitiesPage);
        }
        return this.v.a(this.f133592w, this.f133593x, this.f133594y, backendFlowEntitiesPage.f63270b, this.z, this.A, this.B);
    }
}
