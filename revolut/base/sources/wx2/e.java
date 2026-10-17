package wx2;

import cli.n;
import cli.y;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoScreenContract$InputData;
import h93.l0;
import hx2.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends oki.h implements dli.b {
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f300738p;

    public e(n stateMapper, LocalGlobalCardInfoScreenContract$InputData inputData, q89.e onboardingInteractor, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.o = revolutCardsInteractor;
        this.f300738p = mra.d.b(this, new f(inputData.f64731a, inputData.f64732b, ((db9.d) onboardingInteractor).c(), inputData.f64733c, inputData.d), stateMapper, null, false, 12);
    }

    public final void I2(l0 l0Var, Function1 function1) {
        String str = ((f) ((j2) this.f300738p.f22677a).getValue()).e;
        if (str != null) {
            C2(new j(str));
        } else {
            l2(new wih.c(this, l0Var, function1, null, 14), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300738p;
    }
}
