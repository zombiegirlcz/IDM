package fvl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138486a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f138487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f138488c;
    public final /* synthetic */ xi0.b d;

    public /* synthetic */ a(xi0.b bVar, k7i.i iVar, Set set, xi0.b bVar2) {
        this.f138487b = bVar;
        this.f138488c = set;
        this.d = bVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        switch (this.f138486a) {
            case 0:
                xi0.b it8 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8, this.f138487b) || Intrinsics.f(it8, this.d) || this.f138488c.contains(it8));
            default:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list = pockets;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(z92.f.l((io3.d) it9.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!this.f138488c.contains((xi0.b) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                xi0.b bVar = this.f138487b;
                if (arrayList2.contains(bVar)) {
                    return bVar;
                }
                xi0.b bVar2 = (xi0.b) d0.d0(arrayList2);
                if (bVar2 != null) {
                    return bVar2;
                }
                hx7.e.n(new Exception("No eligible source pocket found: all pockets use prohibited currencies"));
                return this.d;
        }
    }

    public /* synthetic */ a(xi0.b bVar, xi0.b bVar2, Set set) {
        this.f138487b = bVar;
        this.d = bVar2;
        this.f138488c = set;
    }
}
