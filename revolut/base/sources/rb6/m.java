package rb6;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreenContract$InputData;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa6.t;
import te0.w;
import ya6.q;
import ya6.z;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends jki.g implements i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aa6.c f252969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aa6.a f252970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AmountSuggestionScreenContract$InputData f252971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f252972s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(aa6.c donationsInteractor, aa6.a donationPocketsInteractor, p stateMapper, AmountSuggestionScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(donationPocketsInteractor, "donationPocketsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f252969p = donationsInteractor;
        this.f252970q = donationPocketsInteractor;
        this.f252971r = inputData;
        this.f252972s = new f(inputData.f72060b, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null);
    }

    @Override // yji.l
    public final void I1() {
        String str = this.f252971r.f72059a;
        t tVar = (t) this.f252969p;
        r rVarB = tVar.b(str, false);
        q qVar = tVar.f261345a;
        ya6.p pVar = q.Companion;
        yji.l.a1(this, rd0.e.b(w.m(rVarB, ((z) qVar).f311992j.f(6, false), ((sa6.j) this.f252970q).b())), null, null, new l(this, null), 3);
        yji.l.a1(this, kii.e.t(tVar.f, "hide(...)"), null, null, new r0e.c(this, null, 16), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f252972s;
    }
}
