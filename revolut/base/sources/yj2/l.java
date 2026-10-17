package yj2;

import com.revolut.feature.atm.api.model.AtmBoundBox;
import com.revolut.feature.atm.api.model.AtmLocation;
import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    @NotNull
    public static final i Companion = new i();
    public static final AtmLocation e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk2.j f314394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w39.b f314395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f314396c;
    public final xoj.a d;

    static {
        wi0.b.Companion.getClass();
        wi0.a aVar = wi0.b.Companion;
        e = new AtmLocation(51.505643d, -0.0248464d);
    }

    public l(bk2.j repository, w39.b locationInteractor, ang.f userInteractor, xoj.a featuresInteractor, f atmsDisplayHelper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(atmsDisplayHelper, "atmsDisplayHelper");
        this.f314394a = repository;
        this.f314395b = locationInteractor;
        this.f314396c = userInteractor;
        this.d = featuresInteractor;
    }

    public final ufm.i a(AtmBoundBox boundBox, sj2.c cVar) {
        Intrinsics.checkNotNullParameter(boundBox, "boundBox");
        Intrinsics.checkNotNullParameter(boundBox, "boundBox");
        AtmLocation atmLocation = boundBox.f63133b;
        Double dValueOf = Double.valueOf(atmLocation.f63138a);
        Double dValueOf2 = Double.valueOf(atmLocation.f63139b);
        AtmLocation atmLocation2 = boundBox.f63132a;
        Double dValueOf3 = Double.valueOf(atmLocation2.f63138a);
        Double dValueOf4 = Double.valueOf(atmLocation2.f63139b);
        bk2.j jVar = this.f314394a;
        d0<List<ak2.b>> atmsBy = jVar.f16236a.getAtmsBy(dValueOf, dValueOf2, dValueOf3, dValueOf4, false, cVar != null ? cVar.a() : null);
        bjg.d dVar = new bjg.d(4, new bjg.c(jVar, 5));
        atmsBy.getClass();
        ufm.i iVar = new ufm.i(atmsBy, dVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(w.H0(w.i0(iVar), c(true)), new a(15, new yi5.b(this, 17)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public final z b() {
        ufm.i iVar = new ufm.i(this.f314396c.g(), new a(18, new yi5.b(this, 19)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        od0.i.Companion.getClass();
        return ue0.e.F(iVar, od0.h.a(e));
    }

    public final ufm.i c(boolean z) {
        ufm.i iVar = new ufm.i(((z39.b) this.f314395b).b(), new a(12, new h(this, z)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
