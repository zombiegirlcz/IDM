package u69;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import t11.b2;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends b2 {
    public abstract List a();

    public abstract v69.b b(String str);

    public abstract List c(DateTime dateTime);

    public abstract void d();

    public abstract void e(DateTime dateTime, DateTime dateTime2);

    public abstract void f(DateTime dateTime, DateTime dateTime2);

    public void g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        d();
        j(items);
    }

    public void h(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List listP0 = d0.P0(items, new b());
        if (listP0.isEmpty()) {
            return;
        }
        f(((v69.b) d0.b0(listP0)).f286337c, ((v69.b) d0.m0(listP0)).f286337c);
        j(listP0);
    }

    public void i(ArrayList items, DateTime until) {
        DateTime dateTime;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(until, "until");
        List listP0 = d0.P0(items, new c());
        v69.b bVar = (v69.b) d0.d0(listP0);
        if (bVar == null || (dateTime = bVar.f286337c) == null) {
            dateTime = new DateTime(0L);
        }
        e(dateTime, until);
        j(listP0);
    }

    public abstract void j(List list);

    public abstract void k(String str, String str2, List list);

    public abstract void l(String str, List list);
}
