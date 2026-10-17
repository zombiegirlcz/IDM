package xde;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kii.e;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f304419b;

    public /* synthetic */ a(c cVar, int i) {
        this.f304418a = i;
        this.f304419b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f304418a) {
            case 0:
                return ((ik3.c) this.f304419b.f304421b).g();
            default:
                List listB = ((ik3.c) this.f304419b.f304421b).b();
                wi0.a aVar = wi0.b.Companion;
                ArrayList arrayList = new ArrayList(w.t(listB, 10));
                Iterator it8 = listB.iterator();
                while (it8.hasNext()) {
                    e.B(aVar, (String) it8.next(), arrayList);
                }
                return arrayList;
        }
    }
}
