package qw2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityScreenContract$InputData;
import h93.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements j {
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ha3.f f249750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f249751q;

    public i(cli.n stateMapper, GooglePayCardSecurityScreenContract$InputData inputData, l93.f revolutCardsInteractor, ha3.f cardsConfigInteractor, c90.c uiResources) {
        o5l.g gVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.o = revolutCardsInteractor;
        this.f249750p = cardsConfigInteractor;
        f0 f0Var = inputData.f64498a;
        boolean z = inputData.f64499b;
        Data data = new Data(null, null, true, 3, null);
        int i = d.f249747a[uiResources.a().ordinal()];
        if (i == 1) {
            gVar = o5l.g.MDPI;
        } else if (i == 2) {
            gVar = o5l.g.HDPI;
        } else if (i == 3) {
            gVar = o5l.g.XHDPI;
        } else if (i == 4) {
            gVar = o5l.g.XXHDPI;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = o5l.g.XXXHDPI;
        }
        this.f249751q = mra.d.b(this, new k(f0Var, z, data, gVar), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f249750p.a(((k) ((j2) this.f249751q.f22677a).getValue()).f249752a.f150114h.f13639a)), null, null, new qp7.g(this, null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249751q;
    }
}
