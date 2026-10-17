package e06;

import cli.n;
import cli.y;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CustomTipScreenContract$InputData f121435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f121436q;

    public h(w80.b amountFormatter, CustomTipScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountFormatter;
        this.f121435p = inputData;
        dj0.d dVar = inputData.f71620a;
        this.f121436q = mra.d.b(this, new d(dVar, dVar.f115083b, "", new dj0.d(0L, dVar.f115083b)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f121436q;
    }
}
