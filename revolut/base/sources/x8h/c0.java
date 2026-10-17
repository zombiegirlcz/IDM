package x8h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements tzg.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.j f303330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f303331b;

    public c0(zjh.j repository, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f303330a = repository;
        this.f303331b = configurationInteractor;
    }

    public static ArrayList a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            xzg.r rVar = (xzg.r) obj2;
            int i = b0.f303326a[rVar.f310024c.ordinal()];
            boolean zContains = true;
            if (i == 1 || i == 2) {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((xi0.b) it8.next()).f306286a);
                }
                zContains = arrayList2.contains(rVar.f310023b);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (zContains) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
