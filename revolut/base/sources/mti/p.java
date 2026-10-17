package mti;

import com.revolut.feature.terms.api.model.TermsScope;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements zsi.i {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pre.c f208865a;

    public p(pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f208865a = termsInteractor;
    }

    public final Flow a() {
        TermsScope.INSTANCE.getClass();
        r rVarL = pre.c.l(this.f208865a, null, null, u.c(TermsScope.e), 11);
        f0 f0Var = f0.f322471a;
        return boh.f.e(rd0.e.b(ue0.e.E(zi0.c.F(rVarL, f0Var), zi0.c.P(f0Var, false, null, 3))), new msb.c(11));
    }
}
