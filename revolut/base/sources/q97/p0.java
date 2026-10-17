package q97;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import pej.a;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oej.a f243764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fej.b f243765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cej.a f243766c;

    public p0(t97.c productCellProvider, oej.a esimCoreInteractor, fej.b esimHomeFlowCommandProvider, cej.a esimFeatureAvailabilityInteractor, fej.e esimNotSupportedPromptCommandProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimNotSupportedPromptCommandProvider, "esimNotSupportedPromptCommandProvider");
        this.f243764a = esimCoreInteractor;
        this.f243765b = esimHomeFlowCommandProvider;
        this.f243766c = esimFeatureAvailabilityInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.ESIM || id10 == t97.d.MOBILE_PLANS;
    }

    @Override // p97.c
    public final efm.r b() {
        boolean zA;
        try {
            zA = ((efj.c) this.f243766c).a();
        } catch (Throwable th10) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimProductSearchDelegate", "Failed to check eSIM feature availability", th10, h0Var);
            zA = false;
        }
        efm.r rVarJust = efm.r.just(Boolean.valueOf(zA));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        efm.r map = rVarJust.map(new j0(new h(this, 21), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        pej.a aVarA;
        efm.d0 d0VarO0;
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.ESIM || bVar == t97.d.MOBILE_PLANS) {
            try {
                aVarA = ((oej.b) this.f243764a).a();
            } catch (Throwable th10) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimProductSearchDelegate", "Failed to handle click on product cell", th10, h0Var);
                aVarA = a.b.f235382a;
            }
            d0VarO0 = te0.w.o0(skm.p0.f264003c, new q03.m(aVarA, this, null, 24));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(prk.o.q("Unsupported product type: ", productCell.f234280a));
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimProductSearchDelegate", null, illegalStateException, h0Var2);
            d0VarO0 = efm.d0.l(illegalStateException);
        }
        ufm.i iVar = new ufm.i(d0VarO0, new j0(new h(20), 15), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
