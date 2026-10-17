package ldj;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import koi.j;
import kotlin.jvm.internal.s0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194157a;

    public h(List list, List list2) {
        s0 s0Var = new s0(2);
        s0Var.b(list.toArray(new qv0.i[0]));
        s0Var.b(list2.toArray(new j[0]));
        ArrayList arrayList = s0Var.f186433a;
        this.f194157a = v.k(arrayList.toArray(new j[arrayList.size()]));
    }

    @Override // jki.n
    public final List c() {
        return this.f194157a;
    }
}
