package om4;

import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBackendDrivenEntryPoints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b extends qx4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f226520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.j f226521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq3.a f226522c;
    public final e0 d;
    public final vie.h e;

    public b(gte.a featureToggleInteractor, xq3.j creditApplicationInteractor, zq3.a creditEntryPointsInteractor, e0 creditCardFacilityExistsInteractor, vie.h tabCreditAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditEntryPointsInteractor, "creditEntryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditCardFacilityExistsInteractor, "creditCardFacilityExistsInteractor");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f226520a = featureToggleInteractor;
        this.f226521b = creditApplicationInteractor;
        this.f226522c = creditEntryPointsInteractor;
        this.d = creditCardFacilityExistsInteractor;
        this.e = tabCreditAvailabilityInteractor;
    }

    @Override // qx4.i
    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.Q(h(loadingStrategy), new okf.m((Continuation) null, this.d, 2));
    }

    @Override // qx4.f, qx4.i
    public final Flow e(grl.r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Continuation continuation = null;
        return vkm.q.q(rd0.e.e(xam.a.h(new au.c0(this, origin, continuation, 17), a.f226510a[origin.ordinal()] == 1 ? m() : i(origin)), zhm.h0.f322473a, new im2.b(3, 27, continuation)));
    }

    @Override // qx4.f
    public final Flow g(grl.r2 origin, boolean z) {
        Flow gVar;
        Intrinsics.checkNotNullParameter(origin, "origin");
        if (z) {
            if (((jte.d) this.f226520a).c(CreditCardApi$Toggles$CreditCardBackendDrivenEntryPoints.f68674c)) {
                List productTypes = zhm.u.c(ft3.j1.CREDIT_CARD);
                Intrinsics.checkNotNullParameter(origin, "origin");
                Intrinsics.checkNotNullParameter(productTypes, "productTypes");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                yr3.b bVar = this.f226522c.f324356a;
                String origin2 = origin.name();
                List list = productTypes;
                ArrayList productPaths = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    productPaths.add(ft3.g1.i((ft3.j1) it8.next()));
                }
                bVar.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Intrinsics.checkNotNullParameter(origin2, "origin");
                Intrinsics.checkNotNullParameter(productPaths, "productPaths");
                gVar = nim.a.v(rd0.e.n(bVar.d.b(new yr3.a(origin2, productPaths), loadingStrategy), zhm.h0.f322473a), new okk.d(16));
            } else {
                gVar = nim.a.v(n(), new okk.d(17));
            }
        } else {
            gVar = new go.g(zi0.c.P(al4.h.f6143a, false, null, 3), 2);
        }
        return n14.k.p(gVar, new okk.d(15));
    }

    public final xq3.j l() {
        return this.f226521b;
    }

    public Flow m() {
        return this.e.a() ? d() : i(grl.r2.DISCOVER);
    }

    public abstract jhi.k n();
}
