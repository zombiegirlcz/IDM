package dfj;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d5 implements bej.n {

    @NotNull
    private static final c5 Companion = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pre.c f113943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfj.e f113944b;

    public d5(pre.c termsInteractor, nfj.e configurationRepository) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f113943a = termsInteractor;
        this.f113944b = configurationRepository;
    }

    public final cxe.u a() {
        nfj.g gVar = (nfj.g) this.f113944b;
        gVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.A(new vkm.y(nim.a.v(gVar.e.b(Unit.f186387a, loadingStrategy), new dee.x(25)), new c9k.k(3, 14, null)), new dee.x(26));
    }

    public final Flow b() {
        TermsScope.INSTANCE.getClass();
        efm.r rVarL = pre.c.l(this.f113943a, null, null, zhm.u.c(TermsScope.f90382t), 11);
        zhm.f0 f0Var = zhm.f0.f322471a;
        return boh.f.e(rd0.e.b(ue0.e.E(zi0.c.F(rVarL, f0Var), zi0.c.P(f0Var, false, null, 3))), new dee.x(24));
    }
}
