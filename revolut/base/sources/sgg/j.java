package sgg;

import cli.n;
import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements f {

    @NotNull
    private static final h Companion = new h();
    public final TravelMilesAccountRegistrationTaxIdScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vfg.d f262657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f262658q;

    public j(n stateMapper, TravelMilesAccountRegistrationTaxIdScreenContract$InputData inputData, vfg.d accountsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        this.o = inputData;
        this.f262657p = accountsInteractor;
        this.f262658q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f262658q;
    }
}
