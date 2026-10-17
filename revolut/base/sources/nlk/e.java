package nlk;

import jgk.z;
import kotlin.jvm.internal.Intrinsics;
import tb4.t;
import xlk.h;
import xlk.j;
import xlk.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e implements e4m.e {
    public static j a(ou5.b factory) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        z configuration = new z();
        Intrinsics.checkNotNullParameter(configuration, "suggestedFeaturesConfiguration");
        ang.f fVar = (ang.f) factory.f229819a;
        t tVar = (t) factory.f229820b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        ffk.t pricingPlanInteractor = (ffk.t) tVar.f269456b;
        ang.f userInteractor = (ang.f) tVar.f269457c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        zlk.b bVar = new zlk.b();
        ckk.a aVar = (ckk.a) factory.f229821c;
        t tVar2 = (t) factory.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new j(fVar, bVar, aVar, new h(configuration, (l) tVar2.f269456b, (xlk.e) tVar2.f269457c), (xlk.c) factory.e);
    }
}
