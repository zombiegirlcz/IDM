package te8;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.features.api.exception.JuniorAccountFeatureDisabledException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kbb.c f270066b;

    public /* synthetic */ g(kbb.c cVar, int i) {
        this.f270065a = i;
        this.f270066b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean juniorFeatureEnabled = (Boolean) obj2;
        switch (this.f270065a) {
            case 0:
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (!juniorFeatureEnabled.booleanValue()) {
                    return te0.w.h(new Data(null, new JuniorAccountFeatureDisabledException(0), false, 5, null));
                }
                ff8.i iVar = (ff8.i) ((ff8.e) this.f270066b.f182549b);
                iVar.getClass();
                w4l.j loadingStrategy = w4l.j.f294644c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(nim.a.v(iVar.e.b(Unit.f186387a, loadingStrategy), new fe9.f(16)), kotlin.coroutines.g.f186406a);
            case 1:
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (!juniorFeatureEnabled.booleanValue()) {
                    return te0.w.h(new Data(null, new JuniorAccountFeatureDisabledException(0), false, 5, null));
                }
                ff8.i iVar2 = (ff8.i) ((ff8.e) this.f270066b.f182549b);
                iVar2.getClass();
                w4l.h loadingStrategy2 = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                return rd0.e.c(nim.a.v(iVar2.e.b(Unit.f186387a, loadingStrategy2), new fe9.f(12)), kotlin.coroutines.g.f186406a);
            case 2:
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (!juniorFeatureEnabled.booleanValue()) {
                    return zi0.c.j(f0.f322471a);
                }
                ff8.i iVar3 = (ff8.i) ((ff8.e) this.f270066b.f182549b);
                iVar3.getClass();
                w4l.h loadingStrategy3 = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                return rd0.e.c(nim.a.v(iVar3.e.b(Unit.f186387a, loadingStrategy3), new fe9.f(13)), kotlin.coroutines.g.f186406a);
            default:
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (!juniorFeatureEnabled.booleanValue()) {
                    return te0.w.h(new Data(null, new JuniorAccountFeatureDisabledException(0), false, 5, null));
                }
                ff8.i iVar4 = (ff8.i) ((ff8.e) this.f270066b.f182549b);
                iVar4.getClass();
                w4l.h loadingStrategy4 = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                return rd0.e.c(nim.a.v(iVar4.e.b(Unit.f186387a, loadingStrategy4), new fe9.f(14)), kotlin.coroutines.g.f186406a);
        }
    }
}
