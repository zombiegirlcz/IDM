package yj2;

import com.revolut.feature.atm.api.model.AtmLocation;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import rfm.f0;
import te0.w;
import xn6.m;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f314390b;

    public /* synthetic */ g(l lVar, int i) {
        this.f314389a = i;
        this.f314390b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarM;
        d0 d0VarM2;
        switch (this.f314389a) {
            case 0:
                od0.i locationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(locationOptional, "locationOptional");
                AtmLocation atmLocation = (AtmLocation) locationOptional.g();
                l lVar = this.f314390b;
                if (atmLocation == null) {
                    d0VarM = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                } else {
                    d0 d0VarFirstOrError = lVar.f314396c.k(false).map(new a(11, new yi5.b(13))).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    od0.i.Companion.getClass();
                    z zVarF = ue0.e.F(d0VarFirstOrError, od0.i.f224256b);
                    f0 f0VarO = ((z39.b) lVar.f314395b).f319221b.a(new LocationDomain(atmLocation.f63138a, atmLocation.f63139b)).o();
                    Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
                    ufm.i iVar = new ufm.i(f0VarO, new a(13, new yi5.b(14)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.i iVar2 = new ufm.i(w.H0(zVarF, ue0.e.F(iVar, "")), new a(14, new yi5.b(15)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    d0VarM = iVar2;
                }
                return new ufm.i(d0VarM, new a(8, new g(lVar, 2)), 0);
            case 1:
                AtmLocation atmLocation2 = (AtmLocation) obj2;
                Intrinsics.checkNotNullParameter(atmLocation2, "atmLocation");
                this.f314390b.getClass();
                Intrinsics.checkNotNullParameter(atmLocation2, "<this>");
                return new LocationDomain(atmLocation2.f63138a, atmLocation2.f63139b);
            default:
                Boolean isHomeRegion = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isHomeRegion, "isHomeRegion");
                if (isHomeRegion.booleanValue()) {
                    d0VarM2 = new ufm.c(new a31.l(this.f314390b.f314394a, 7), 2);
                    Intrinsics.checkNotNullExpressionValue(d0VarM2, "fromCallable(...)");
                } else {
                    d0VarM2 = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(d0VarM2, "just(...)");
                }
                return new ufm.i(d0VarM2, new a(10, new m(2, isHomeRegion)), 1);
        }
    }
}
