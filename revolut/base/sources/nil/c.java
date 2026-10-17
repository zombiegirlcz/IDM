package nil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w4l.k;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jil.a f216284a;

    public c(jil.a projectionsRepository) {
        Intrinsics.checkNotNullParameter(projectionsRepository, "projectionsRepository");
        this.f216284a = projectionsRepository;
    }

    public static ArrayList a(dj0.d investment, List projections) {
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(investment, "investment");
        List<tel.b> list = projections;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (tel.b projection : list) {
            Intrinsics.checkNotNullParameter(projection, "projection");
            Intrinsics.checkNotNullParameter(investment, "investment");
            LocalDate localDate = projection.f270117a;
            dj0.d dVarV = pyd.c.V(investment, projection.f270119c);
            tel.c cVar = projection.f270118b;
            arrayList.add(new tel.a(localDate, dVarV, pyd.c.V(investment, cVar.f270120a), pyd.c.V(investment, cVar.f270121b), pyd.c.V(investment, cVar.f270122c), pyd.c.V(investment, cVar.d), pyd.c.V(investment, cVar.e)));
        }
        return arrayList;
    }

    public final vkm.d b(dil.a params, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jil.a aVar = this.f216284a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return aVar.e.b(params, loadingStrategy);
    }
}
