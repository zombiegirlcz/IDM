package wh8;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KTypeProjection;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f297440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f297441x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f297441x = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(this.f297441x, continuation, 0);
                iVar.v = str;
                iVar.f297440w = list;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(this.f297441x, continuation, 1);
                iVar2.v = str;
                iVar2.f297440w = list;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = this.f297441x;
        switch (i) {
            case 0:
                String str = this.v;
                List list = this.f297440w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jVar.f297444c.G(list, j.b(str), kii.e.o(mh8.g.class, KTypeProjection.INSTANCE, List.class));
                break;
            default:
                String str2 = this.v;
                List list2 = this.f297440w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jVar.f297444c.G(list2, j.a(str2), kii.e.o(th8.d.class, KTypeProjection.INSTANCE, List.class));
                break;
        }
        return Unit.f186387a;
    }
}
