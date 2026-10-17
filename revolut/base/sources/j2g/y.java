package j2g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreenContract$InputData;
import imk.p0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends oki.h implements l {

    @NotNull
    public static final n Companion = new n();
    public final wli.x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2g.a f170886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hyf.b f170887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c1g.k f170888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final exf.c f170889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r10.f f170890t;
    public final dyb.a u;
    public final c1g.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i4b.f f170891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f170892x;

    public y(z stateMapper, TravelExperiencesHomeScreenContract$InputData inputData, wli.x deeplinkHandler, l2g.a upcomingBookingsControllerModelExtension, hyf.b experiencesInteractor, c1g.k configInteractor, exf.c userLocationInteractor, r10.f dropOffInteractor, dyb.a kycCheckExtension, c1g.l destinationDiscoveryInteractor, i4b.f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(upcomingBookingsControllerModelExtension, "upcomingBookingsControllerModelExtension");
        Intrinsics.checkNotNullParameter(experiencesInteractor, "experiencesInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(userLocationInteractor, "userLocationInteractor");
        Intrinsics.checkNotNullParameter(dropOffInteractor, "dropOffInteractor");
        Intrinsics.checkNotNullParameter(kycCheckExtension, "kycCheckExtension");
        Intrinsics.checkNotNullParameter(destinationDiscoveryInteractor, "destinationDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = deeplinkHandler;
        this.f170886p = upcomingBookingsControllerModelExtension;
        this.f170887q = experiencesInteractor;
        this.f170888r = configInteractor;
        this.f170889s = userLocationInteractor;
        this.f170890t = dropOffInteractor;
        this.u = kycCheckExtension;
        this.v = destinationDiscoveryInteractor;
        this.f170891w = legalEntityContextProvider;
        this.f170892x = mra.d.b(this, new h(inputData.f93078a, null, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new j2c.b(this, continuation, 2), new yi5.b(26));
        l2g.c cVar = (l2g.c) this.f170886p;
        yji.l.a1(this, cVar.f191793l.e(zhm.u.c(new icg.b(cVar, 1)), zhm.u.c(hxf.e.EXPERIENCE)), null, null, new o(this, continuation, 5), 3);
        c1g.u uVar = (c1g.u) this.f170887q;
        efm.r rVarSwitchMap = ((c1g.m) uVar.f20511c).b().switchMap(new c03.u(13, new c1g.n(uVar, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, boh.f.e(rd0.e.b(rVarSwitchMap), new c1g.n(uVar, 1)), null, null, new o(this, continuation, 1), 3);
        l2(new p0(this, continuation, 14), new yi5.b(26));
        r10.f fVar = this.f170890t;
        fVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l0g.e eVar = (l0g.e) fVar.b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.n(nim.a.v(rd0.e.b(eVar.f.e(Unit.f186387a, loadingStrategy)), new bzg.t(fVar, 4)), h0.f322473a), null, null, new o(this, continuation, 2), 3);
        yji.l.a1(this, this.f170891w.j(new md6.q(md6.p.EXPERIENCES, false)), null, null, new o(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f170892x;
    }
}
