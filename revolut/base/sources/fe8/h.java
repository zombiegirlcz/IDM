package fe8;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KTypeProjection;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f134466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f134466w = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(this.f134466w, continuation, 0);
                hVar.v = list;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(this.f134466w, continuation, 1);
                hVar2.v = list;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f134466w;
        switch (i) {
            case 0:
                List list = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.d.G(i2b.a.F(list), "COPARENT_REQUESTS_LIST_KEY", kii.e.o(de8.b.class, KTypeProjection.INSTANCE, List.class));
                break;
            default:
                List list2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.d.G(ifk.b.C(list2), "INVITATION_APPLICATIONS_LIST_KEY", kii.e.o(de8.c.class, KTypeProjection.INSTANCE, List.class));
                break;
        }
        return Unit.f186387a;
    }
}
