package ai7;

import a31.m;
import ael.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qi7.g;
import vel.h;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ twg.c f5205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph7.c f5206c;

    public /* synthetic */ b(twg.c cVar, ph7.c cVar2, int i) {
        this.f5204a = i;
        this.f5205b = cVar;
        this.f5206c = cVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVarR;
        List instruments = (List) obj2;
        switch (this.f5204a) {
            case 0:
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<qi7.a> list = instruments;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (qi7.a aVar : list) {
                    linkedHashMap.put(aVar.f246657a, aVar.f246659c);
                }
                twg.c cVar = this.f5205b;
                e9h.d dVar = (e9h.d) cVar.f275019c;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (qi7.a aVar2 : list) {
                    String str = aVar2.f246657a;
                    h hVar = h.STOCK;
                    g gVar = aVar2.f246659c;
                    if (gVar instanceof qi7.e) {
                        dVarR = ((qi7.e) gVar).f246666a;
                    } else if (gVar instanceof qi7.c) {
                        dVarR = mif.a.R(((qi7.c) gVar).f246662a);
                    } else if (gVar instanceof qi7.b) {
                        dVarR = mif.a.R(((qi7.b) gVar).f246660a);
                    } else {
                        if (!(gVar instanceof qi7.d) && !(gVar instanceof qi7.f) && gVar != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVarR = null;
                    }
                    arrayList.add(new vel.g(str, hVar, dVarR, 8));
                }
                return nim.a.v(nim.a.v(rd0.e.b(h0h.b.a(dVar, arrayList, null, null, false, 12)), new agh.h(21)), new m(cVar, 13, this.f5206c, linkedHashMap));
            default:
                Intrinsics.checkNotNullParameter(instruments, "collectionInstruments");
                twg.c cVar2 = this.f5205b;
                ybl.b bVar = (ybl.b) cVar2.d;
                List list2 = instruments;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((qi7.a) it8.next()).f246657a);
                }
                return nim.a.v(((k) bVar).l(d0.i1(arrayList2)), new m(instruments, 14, cVar2, this.f5206c));
        }
    }
}
