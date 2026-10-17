package mh4;

import dx4.a1;
import dx4.f0;
import dx4.g2;
import dx4.w1;
import dx4.z2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx4.x f205384a;

    public c0(mx4.x contentListItemMapper) {
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        this.f205384a = contentListItemMapper;
    }

    public static ArrayList b(ArrayList arrayList, List list) {
        List<Object> list2 = list;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (Object objA : list2) {
            if (objA instanceof w1) {
                w1 w1Var = (w1) objA;
                boolean zContains = arrayList.contains(w1Var.f120809a);
                String id10 = w1Var.f120809a;
                String title = w1Var.f120810b;
                String subtitle = w1Var.f120811c;
                a1 a1Var = w1Var.d;
                f0 f0Var = w1Var.e;
                boolean z = w1Var.f120812g;
                List items = w1Var.f120813h;
                z2 z2Var = w1Var.i;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(items, "items");
                objA = new w1(id10, title, subtitle, a1Var, f0Var, zContains, z, items, z2Var);
            } else if (objA instanceof g2) {
                g2 g2Var = (g2) objA;
                objA = g2.a(g2Var, b(arrayList, g2Var.d));
            }
            arrayList2.add(objA);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mh4.q a(mh4.k r29, mv3.a r30) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh4.c0.a(mh4.k, mv3.a):mh4.q");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.d, new ma2.s(domainState, this, 17), new m84.e(this, domainState), new m88.c(this, domainState, 5));
    }
}
