package w0i;

import ffk.t;
import hha.d;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import oha.e;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements o0i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f293763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f293764b;

    public b(t pricingPlanInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f293763a = featureToggleInteractor;
        this.f293764b = pricingPlanInteractor;
    }

    public static final boolean a(b bVar, d dVar) {
        bVar.getClass();
        ArrayList<oha.a> arrayList = dVar.i;
        if (arrayList.isEmpty()) {
            return false;
        }
        for (oha.a aVar : arrayList) {
            e eVar = aVar.f225325b;
            e.Companion.getClass();
            if (eVar.equals(e.f225331c) && aVar.f225326c == 0.0d) {
                return true;
            }
        }
        return false;
    }
}
