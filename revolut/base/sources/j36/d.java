package j36;

import androidx.room.util.DBUtil;
import g0f.f;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f170976w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f170976w = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f170976w, (Continuation) obj4, 0);
                dVar.v = (Map) obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                d dVar2 = new d(this.f170976w, (Continuation) obj4, 1);
                dVar2.v = (Map) obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        e eVar = this.f170976w;
        switch (i) {
            case 0:
                Map map = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g36.b bVar = (g36.b) eVar.d.get();
                DBUtil.performBlocking(bVar.f140207a, false, true, new f(bVar, h36.a.b(map), 25));
                break;
            default:
                Map map2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = eVar.f170978b;
                Intrinsics.checkNotNullParameter(map2, "<this>");
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    xi0.c cVar2 = (xi0.c) entry.getValue();
                    String str2 = cVar2.d;
                    int i2 = cVar2.f306288a;
                    Integer num = cVar2.f306291g;
                    int iIntValue = num != null ? num.intValue() : i2;
                    String str3 = cVar2.e;
                    String str4 = cVar2.i;
                    arrayList.add(new i36.c(i2, iIntValue, str, str2, str3, str4.length() > 0 ? str4 : null));
                }
                cVar.G(arrayList, "KEY_TOP_DEFI_CURRENCIES", kii.e.o(i36.c.class, KTypeProjection.INSTANCE, List.class));
                try {
                    m.Companion companion = m.INSTANCE;
                    g36.b bVar2 = (g36.b) eVar.d.get();
                    DBUtil.performBlocking(bVar2.f140207a, false, true, new f(bVar2, h36.a.b(map2), 25));
                    objA = Unit.f186387a;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                Throwable thA = m.a(objA);
                if (thA != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
