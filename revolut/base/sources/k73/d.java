package k73;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.card_screen.impl.kompot.card_activation_methods.screen.CardActivationMethodsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends h implements dli.b {
    public final CardActivationMethodsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f181815p;

    public d(n stateMapper, CardActivationMethodsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f181815p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f181815p;
    }
}
