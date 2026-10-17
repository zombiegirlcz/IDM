package cf6;

import bf6.g;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import se6.h;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f23562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f23563x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f23563x = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d dVar = new d(this.f23563x, continuation, 0);
                dVar.v = str;
                dVar.f23562w = list;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                d dVar2 = new d(this.f23563x, continuation, 1);
                dVar2.v = str;
                dVar2.f23562w = list;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = this.f23563x;
        switch (i) {
            case 0:
                String str = this.v;
                List list = this.f23562w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = eVar.f23568h;
                String strQ = j6.a.q("BRANCHES_STORAGE_KEY_", str);
                List<h> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (h domain : list2) {
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    String str2 = domain.f262133a;
                    String str3 = domain.f262134b;
                    io3.b institutionLogo = domain.f262135c;
                    Intrinsics.checkNotNullParameter(institutionLogo, "institutionLogo");
                    arrayList.add(new af6.c(str2, str3, new uo3.a(institutionLogo.f163142a.toString(), institutionLogo.f163143b)));
                }
                cVar.G(arrayList, strQ, kii.e.o(af6.c.class, KTypeProjection.INSTANCE, List.class));
                break;
            default:
                String str4 = this.v;
                List list3 = this.f23562w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = eVar.f23567g;
                String strQ2 = j6.a.q("COUNTRY_DEPARTMENTS_STORAGE_KEY_PREFIX_", str4);
                List list4 = list3;
                g gVar = eVar.e;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(gVar.b((se6.i) it8.next()));
                }
                cVar2.G(arrayList2, strQ2, kii.e.o(af6.d.class, KTypeProjection.INSTANCE, List.class));
                break;
        }
        return Unit.f186387a;
    }
}
