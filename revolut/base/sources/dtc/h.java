package dtc;

import android.content.Context;
import h93.f0;
import java.util.LinkedHashMap;
import java.util.List;
import k71.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f117411b;

    public /* synthetic */ h(i iVar, int i) {
        this.f117410a = i;
        this.f117411b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f117410a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                q qVar = (q) pair.f186385a;
                List list = (List) pair.f186386b;
                i iVar = this.f117411b;
                thf.m mVar = iVar.f117412a;
                Intrinsics.h(qVar);
                l lVar = new l(mVar, qVar);
                btc.a aVar = new btc.a(iVar.f117415g, 2);
                k kVar = new k(mVar);
                c cVar = new c(iVar.f117413b);
                e eVar = new e();
                d dVar = new d();
                f fVar = new f(iVar.f117414c);
                a aVar2 = new a();
                Context context = iVar.f117416h;
                n nVar = new n(context);
                g gVar = new g(context);
                j jVar = new j(context);
                List list2 = list;
                int iB = q0.b(w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list2) {
                    linkedHashMap.put(((f0) obj3).f150110a, obj3);
                }
                b bVar = new b(linkedHashMap);
                p pVar = p.WORD_PREFIX;
                Pair[] elements = {new Pair(lVar, pVar), new Pair(aVar, pVar), new Pair(kVar, pVar), new Pair(nVar, pVar), new Pair(gVar, pVar), new Pair(cVar, pVar), new Pair(eVar, p.MIDDLE_OF_THE_WORD), new Pair(dVar, pVar), new Pair(fVar, pVar), new Pair(aVar2, pVar), new Pair(bVar, pVar), new Pair(jVar, pVar)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new zsc.h(kotlin.collections.d.L(elements));
            default:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                return enabled.booleanValue() ? m70.a.g(l93.f.d(this.f117411b.e, b93.d.ALL, false, 4), null, new dmb.m(26), 1).firstOrError() : te0.w.j(zhm.f0.f322471a);
        }
    }
}
