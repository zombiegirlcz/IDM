package lra;

import com.revolut.data.model.Data;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import w4l.f;
import xo8.i0;
import xra.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f199473b;

    public /* synthetic */ b(d dVar, int i) {
        this.f199472a = i;
        this.f199473b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean pushToCardEnabled = (Boolean) obj2;
        switch (this.f199472a) {
            case 0:
                Intrinsics.checkNotNullParameter(pushToCardEnabled, "pushToCardEnabled");
                if (!pushToCardEnabled.booleanValue()) {
                    r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                h hVar = this.f199473b.f199477a;
                f fVar = hVar.f308316h;
                Unit unit = Unit.f186387a;
                return pd.b.r(nim.a.w(fVar.f(unit, hVar.f308315g.a(unit, true)), new i0(hVar, 23)), new xra.a(hVar, 6));
            case 1:
                Intrinsics.checkNotNullParameter(pushToCardEnabled, "pushToCardEnabled");
                if (!pushToCardEnabled.booleanValue()) {
                    r rVarJust2 = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
                    return rVarJust2;
                }
                h hVar2 = this.f199473b.f199477a;
                f fVar2 = hVar2.f308316h;
                Unit unit2 = Unit.f186387a;
                return nim.a.w(fVar2.f(unit2, hVar2.f308315g.a(unit2, true)), new i0(hVar2, 23));
            default:
                Intrinsics.checkNotNullParameter(pushToCardEnabled, "pushToCardEnabled");
                return pushToCardEnabled.booleanValue() ? this.f199473b.f199477a.f308316h.g(Unit.f186387a, true) : m.f235744a;
        }
    }
}
