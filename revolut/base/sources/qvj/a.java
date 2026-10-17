package qvj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import svj.f;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public void a() {
        b();
        c();
    }

    public abstract void b();

    public abstract void c();

    public abstract void d(String str);

    public abstract List e();

    public abstract Long f();

    public abstract void g(List list);

    public void h(long j2, ArrayList trips) {
        Intrinsics.checkNotNullParameter(trips, "trips");
        if (!trips.isEmpty()) {
            g(trips);
        }
        i(new f(j2));
    }

    public abstract void i(f fVar);
}
