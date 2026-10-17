package dc6;

import a94.q;
import b0a.h;
import b6d.r;
import ba6.l;
import bke.t;
import d73.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import xvh.a;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f112803b;

    public /* synthetic */ a(c cVar, int i) {
        this.f112802a = i;
        this.f112803b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112802a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                return zi0.c.F(nim.a.w(this.f112803b.f112805b.b((Collection) pair.f186386b, false), new t(list, 27)), new Pair(list, f0.f322471a));
            case 1:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                c cVar = this.f112803b;
                return nim.a.w(nim.a.w(pd.b.r(nim.a.w(aa6.c.a(cVar.f112804a, false), new q(23, baseCurrency)), new a(cVar, 0)), new q(24, baseCurrency)), new q(22, baseCurrency));
            case 2:
                List charitiesList = (List) obj2;
                Intrinsics.checkNotNullParameter(charitiesList, "charitiesList");
                xvh.c cVar2 = ((sa6.t) this.f112803b.f112804a).f261347c;
                a.b filter = a.b.f309269a;
                r rVar = (r) cVar2;
                Intrinsics.checkNotNullParameter(filter, "filter");
                efm.r rVarSwitchMap = m70.a.g(rVar.m(filter), null, new b6d.a(0), 1).switchMap(new h(13, new b6d.b(rVar, filter, 0)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                efm.r map = rVarSwitchMap.map(new sa6.a(new s8h.h(25), 9));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                efm.r map2 = map.map(new n(new t(charitiesList, 28), 12));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                i.Companion.getClass();
                return zi0.c.F(map2, i.f224256b);
            default:
                List charityList = (List) obj2;
                Intrinsics.checkNotNullParameter(charityList, "charityList");
                xua.a aVar = this.f112803b.d;
                List list2 = charityList;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((l) it8.next()).f13938a);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return nim.a.w(((yua.q) aVar).q((String[]) Arrays.copyOf(strArr, strArr.length)), new t(charityList, 26));
        }
    }
}
