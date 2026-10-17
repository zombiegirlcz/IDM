package jh3;

import com.revolut.data.model.Data;
import go.g;
import ie7.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je5.n;
import jec.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.s9;
import vkm.y;
import zg3.q;
import zg3.r;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements hh3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f174144a;

    public f(whf.b transactionsListContentProvider) {
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        this.f174144a = transactionsListContentProvider;
    }

    @Override // hh3.f
    public final Flow a(zg3.b bVar) {
        r block = (r) bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        List list = block.f322071b;
        if (list.isEmpty()) {
            return new g(new b(block, new Data(null, new IllegalStateException("No transactions in transactions block"), false, 5, null)), 2);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((q) it8.next()).f322068a);
        }
        return new y(new p(block, null, 5), new h(rd0.e.b(nim.a.w(whf.b.a(this.f174144a, te0.w.h(new s9(d0.i1(arrayList))), null, null, null, 14), new n(20))), block, 12));
    }
}
