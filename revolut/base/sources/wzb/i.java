package wzb;

import cli.y;
import com.revolut.data.model.Data;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.points_expiry.home.a f301403w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.rev_points.impl.ui.points_expiry.home.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301403w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f301403w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f301403w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f301403w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                ((i) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            default:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.rev_points.impl.ui.points_expiry.home.a aVar = this.f301403w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f83834r, new v77.a(list, 23));
                return Unit.f186387a;
            case 1:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RevPointsExpiryHomeScreenModel", null, th10, h0Var);
                com.revolut.feature.rev_points.impl.ui.points_expiry.home.a.I2(aVar);
                return Boolean.TRUE;
            default:
                y yVar = aVar.f83834r;
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (data.getError() != null && data.getContent() == null) {
                    com.revolut.feature.rev_points.impl.ui.points_expiry.home.a.I2(aVar);
                    return Unit.f186387a;
                }
                Map map = ((f) ((j2) yVar.f22677a).getValue()).f301400c;
                Map map2 = (Map) zi0.c.I(data);
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    Boolean bool = (Boolean) map.getOrDefault(new Integer(((Number) entry.getKey()).intValue()), Boolean.FALSE);
                    bool.getClass();
                    linkedHashMap.put(key, bool);
                }
                aVar.H2(yVar, new wwa.a(data, linkedHashMap, 13));
                return Unit.f186387a;
        }
    }
}
