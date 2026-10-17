package a2j;

import cli.g;
import cli.y;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer.SavingsDisclaimerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rnb.p;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends h implements dli.b {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f887p;

    public d(p disclaimersDelegate, e stateMapper, SavingsDisclaimerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(disclaimersDelegate, "disclaimersDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = disclaimersDelegate;
        this.f887p = mra.d.b(this, new b(inputData.f99515a, inputData.f99516b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f887p;
    }
}
