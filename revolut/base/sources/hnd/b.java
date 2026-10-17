package hnd;

import fmd.d;
import fmd.f;
import go.g;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements mf1.a {
    @Override // mf1.a
    public final Flow a() {
        return new g(new f(qf1.f.INCOME_SORTER.getId(), d.INSTANCE), 2);
    }

    @Override // mf1.a
    public final String b() {
        return "MONEY_HEALTH.income_sorter";
    }
}
