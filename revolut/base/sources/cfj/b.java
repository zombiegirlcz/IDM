package cfj;

import c5a.m0;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements aej.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f23717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f23718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cej.a f23719c;
    public final cej.b d;
    public final o97.r e;

    public b(g searchViewModelBuilder, r esimSearchKeywordsMatcher, cej.a esimFeatureAvailabilityInteractor, cej.b esimMobilePlansFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(searchViewModelBuilder, "searchViewModelBuilder");
        Intrinsics.checkNotNullParameter(esimSearchKeywordsMatcher, "esimSearchKeywordsMatcher");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimMobilePlansFeatureAvailabilityInteractor, "esimMobilePlansFeatureAvailabilityInteractor");
        this.f23717a = searchViewModelBuilder;
        this.f23718b = esimSearchKeywordsMatcher;
        this.f23719c = esimFeatureAvailabilityInteractor;
        this.d = esimMobilePlansFeatureAvailabilityInteractor;
        this.e = o97.r.ESIM;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(this, "searchSource");
        return rd0.e.c(boh.f.e(new v1(new m0(this.f23718b, this, searchQuery, null, 6)), new a(this, 0)), kotlin.coroutines.g.f186406a);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            java.lang.String r6 = r5.f223137c
            r0 = 0
            if (r6 == 0) goto L54
            int r1 = r6.hashCode()
            r2 = -1774141328(0xffffffff9640c070, float:-1.5570359E-25)
            if (r1 == r2) goto L40
            r2 = -1534853094(0xffffffffa484001a, float:-5.724605E-17)
            if (r1 == r2) goto L2d
            r2 = -635845256(0xffffffffda19c578, float:-1.0820698E16)
            if (r1 == r2) goto L19
            goto L54
        L19:
            java.lang.String r1 = "ID_MOBILE_PLAN_SUBSCRIPTION_ITEM"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L22
            goto L54
        L22:
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig$MobilePlanSubscription r6 = new com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig$MobilePlanSubscription
            r6.<init>(r4)
            r5.<init>(r6)
            goto L69
        L2d:
            java.lang.String r4 = "ID_SECTION_TITLE"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L54
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig$Home r4 = new com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig$Home
            r4.<init>(r0)
            r5.<init>(r4)
            goto L69
        L40:
            java.lang.String r1 = "ID_DATA_PLAN_SUBSCRIPTION_ITEM"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L49
            goto L54
        L49:
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig$Subscription r6 = new com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig$Subscription
            r6.<init>(r4)
            r5.<init>(r6)
            goto L69
        L54:
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            java.lang.String r5 = r5.f223137c
            java.lang.String r1 = "Can not navigate. Unsupported action id in the SearchPayload: "
            java.lang.String r5 = j6.a.q(r1, r5)
            java.lang.String r1 = "EsimSearchSourceImpl"
            rd0.d.a(r6, r1, r5, r0, r4)
            com.revolut.retail.core.navigation.DummyCommand r5 = com.revolut.retail.core.navigation.DummyCommand.f98635a
        L69:
            o97.l r4 = new o97.l
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cfj.b.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
