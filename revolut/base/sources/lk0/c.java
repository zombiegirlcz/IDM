package lk0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f196166b;

    public /* synthetic */ c(e eVar, int i) {
        this.f196165a = i;
        this.f196166b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f196165a) {
            case 0:
                g currentPagedData = (g) obj2;
                Intrinsics.checkNotNullParameter(currentPagedData, "currentPagedData");
                e newPage = this.f196166b;
                Intrinsics.h(newPage);
                Intrinsics.checkNotNullParameter(currentPagedData, "<this>");
                Intrinsics.checkNotNullParameter(newPage, "newPage");
                List list = currentPagedData.f196174a;
                ArrayList arrayListF1 = d0.f1(list);
                Iterator it8 = arrayListF1.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                    } else if (!Intrinsics.f(((e) it8.next()).f196172b, newPage.f196172b)) {
                        i++;
                    }
                }
                if (i == -1) {
                    throw new IllegalArgumentException();
                }
                boolean z = newPage.f196173c || !newPage.f196171a.isEmpty();
                boolean z3 = i == v.j(list);
                boolean z4 = list.size() == 1;
                arrayListF1.remove(i);
                if (z || z3 || z4) {
                    arrayListF1.add(i, newPage);
                }
                return new g(arrayListF1);
            default:
                e it9 = (e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f196172b, this.f196166b.f196172b));
        }
    }
}
