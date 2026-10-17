package fe8;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = iVar.d;
                Type type = i.f134468l;
                Intrinsics.checkNotNullExpressionValue(type, "access$getCOPARENT_REQUESTS_LIST_TYPE$cp(...)");
                List list = (List) cVar.T2("COPARENT_REQUESTS_LIST_KEY", type);
                if (list != null) {
                    return i2b.a.D(list);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = iVar.d;
                Type type2 = i.k;
                Intrinsics.checkNotNullExpressionValue(type2, "access$getINVITATION_APP…CATIONS_LIST_TYPE$cp(...)");
                List list2 = (List) cVar2.T2("INVITATION_APPLICATIONS_LIST_KEY", type2);
                if (list2 != null) {
                    return ifk.b.A(list2);
                }
                return null;
        }
    }
}
