package c1g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f20468b;

    public /* synthetic */ a(d dVar, int i) {
        this.f20467a = i;
        this.f20468b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20467a) {
            case 0:
                o8b.c cVar = (o8b.c) this.f20468b.f20478b;
                ArrayList arrayListC = cVar.c(cVar.f(), false);
                ArrayList arrayList = new ArrayList(zhm.w.t(arrayListC, 10));
                Iterator it8 = arrayListC.iterator();
                while (it8.hasNext()) {
                    kii.e.B(wi0.b.Companion, ((r8b.a) it8.next()).f252402a, arrayList);
                }
                return arrayList;
            default:
                d dVar = this.f20468b;
                ArrayList arrayListC2 = ((o8b.c) dVar.f20478b).c(((ik3.c) dVar.f20477a).c(), true);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListC2, 10));
                Iterator it9 = arrayListC2.iterator();
                while (it9.hasNext()) {
                    kii.e.B(wi0.b.Companion, ((r8b.a) it9.next()).f252402a, arrayList2);
                }
                return arrayList2;
        }
    }
}
