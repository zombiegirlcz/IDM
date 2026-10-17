package pj0;

import java.util.List;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements e4m.e {
    public static List a() {
        d.Companion.getClass();
        List listK = v.k(new ik0.a(), RxJava2CallAdapterFactory.create());
        s.k(listK);
        return listK;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
