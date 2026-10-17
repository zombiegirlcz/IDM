package onh;

import adh.k;
import e9h.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jpc.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vel.f;
import vel.g;
import vel.h;
import xzg.k0;
import xzg.m0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f226948b;

    public /* synthetic */ a(e eVar, int i) {
        this.f226947a = i;
        this.f226948b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226947a) {
            case 0:
                m0 topMoversAssets = (m0) obj2;
                Intrinsics.checkNotNullParameter(topMoversAssets, "topMoversAssets");
                e eVar = this.f226948b;
                d dVar = (d) eVar.f177257c;
                ArrayList arrayList = topMoversAssets.d;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new g(((k0) it8.next()).f310003a, h.STOCK, (dj0.d) null, 12));
                }
                return nim.a.w(h0h.b.a(dVar, arrayList2, h0h.a.ONE_DAY, null, false, 8), new a(eVar, 1));
            default:
                List performanceAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
                List list = performanceAssets;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(new enh.a((f) it9.next(), null));
                }
                e eVar2 = this.f226948b;
                ArrayList arrayList4 = (ArrayList) eVar2.d;
                if (arrayList4 == null) {
                    List listP0 = d0.P0(arrayList3, new k(eVar2, 8));
                    ArrayList arrayList5 = new ArrayList(w.t(listP0, 10));
                    Iterator it10 = listP0.iterator();
                    while (it10.hasNext()) {
                        arrayList5.add(((enh.a) it10.next()).f127830a.a());
                    }
                    eVar2.d = arrayList5;
                    arrayList4 = arrayList5;
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (arrayList4.contains(((enh.a) obj3).f127830a.a())) {
                        arrayList6.add(obj3);
                    }
                }
                return d0.P0(arrayList6, new b83.a(arrayList4, 4));
        }
    }
}
