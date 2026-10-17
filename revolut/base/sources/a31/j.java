package a31;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f974c;

    public /* synthetic */ j(List list, String str, int i) {
        this.f972a = i;
        this.f973b = list;
        this.f974c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object next;
        switch (this.f972a) {
            case 0:
                List<qua.p> list = this.f973b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (qua.p pVarA : list) {
                    if (Intrinsics.f(pVarA.f249314a.f160150a, this.f974c)) {
                        pVarA = qua.p.a(pVarA, null, ibd.f.DISCONFIRMED, null, null, null, null, null, null, null, 0, null, -3, 33554431);
                    }
                    arrayList.add(pVarA);
                }
                return arrayList;
            case 1:
                List list2 = this.f973b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!Intrinsics.f(((qua.p) obj2).getId(), this.f974c)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            default:
                List list3 = this.f973b;
                Intrinsics.h(list3);
                Iterator it8 = list3.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((BackendScreen) next).getId(), this.f974c)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (BackendScreen) next;
        }
    }
}
