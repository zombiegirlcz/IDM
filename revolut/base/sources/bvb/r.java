package bvb;

import cli.y;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreenContract$InputData;
import com.revolut.kompot.common.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1c.o0;
import nyb.i0;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends oki.h implements k {

    @NotNull
    public static final m Companion = new m();
    public final i90.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevPointsBuyingControllerScreenContract$InputData f19002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qub.a f19003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0 f19004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wub.a f19005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l80.e f19006t;
    public final sf0.h u;
    public final mre.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l61.a f19007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f19008x;

    public r(cli.n stateMapper, i90.b uuidUtils, RevPointsBuyingControllerScreenContract$InputData inputData, qub.a revPointsBuyingInteractor, i0 revPointsProductEligibilityInteractor, wub.a revPointsBuyingFeatureInteractor, l80.e dateProvider, sf0.h serverErrorParser, mre.c termsNavigationFactory, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsBuyingInteractor, "revPointsBuyingInteractor");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = uuidUtils;
        this.f19002p = inputData;
        this.f19003q = revPointsBuyingInteractor;
        this.f19004r = revPointsProductEligibilityInteractor;
        this.f19005s = revPointsBuyingFeatureInteractor;
        this.f19006t = dateProvider;
        this.u = serverErrorParser;
        this.v = termsNavigationFactory;
        this.f19007w = userCompanyInteractor;
        this.f19008x = mra.d.b(this, new e(new Data(null, null, true, 3, null), null, wp5.y.u(uuidUtils, "toString(...)"), false, false, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static final boolean I2(r rVar, Throwable th10, rub.j jVar, boolean z) {
        ServerError serverErrorA = rVar.u.a(th10);
        if (serverErrorA == null || serverErrorA.f51362a != 25271601) {
            return false;
        }
        if (z) {
            rVar.H2(rVar.f19008x, new l(rVar, 1));
        }
        rVar.C2(new h(jVar.getPrice()));
        return true;
    }

    @Override // yji.l
    public final void I1() {
        wub.a aVar = this.f19005s;
        go.g gVar = new go.g(Boolean.valueOf(aVar.b()), 2);
        go.g gVar2 = new go.g(Boolean.valueOf(aVar.a()), 2);
        Continuation continuation = null;
        jhi.b bVarG = mo3.a.g(rd0.e.b(this.f19004r.b(o0.ACTIVATION)), null, new bn4.y(25), 1);
        wub.d dVar = (wub.d) this.f19003q;
        dVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        tub.i iVar = dVar.f300098a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, yh5.b.g(gVar, gVar2, bVarG, iVar.d.b(Unit.f186387a, loadingStrategy)), null, null, new p(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(hng.g.b(((ang.b) this.f19007w).f7765a)), null, null, new p(this, continuation, 1), 3);
    }

    public final void J2() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Something is not working correctly while fetching data in RevPointsBuyingControllerScreenModel, please check the stacktrace");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        C2(new f(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, 30));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f19008x;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        aii.n nVarO2 = super.o2(event);
        if (event instanceof aii.i) {
            Throwable th10 = ((aii.i) event).f5287b;
            if (th10 instanceof HttpException) {
                Intrinsics.checkNotNullParameter(th10, "<this>");
                int iCode = ((HttpException) th10).code();
                Integer numValueOf = Integer.valueOf(iCode);
                if (400 > iCode || iCode >= 500) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    H2(this.f19008x, new l(this, 0));
                }
            }
        }
        return nVarO2;
    }
}
