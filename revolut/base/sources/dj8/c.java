package dj8;

import cli.g;
import cli.k;
import cli.y;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import kd8.e;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements dli.b {
    public final JuniorPaymentLinksConsentInput o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f115130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1 f115131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f115132r;

    public c(d stateMapper, JuniorPaymentLinksConsentInput input, e juniorConsentInteractor, t1 juniorSettingsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(juniorSettingsInteractor, "juniorSettingsInteractor");
        this.o = input;
        this.f115130p = juniorConsentInteractor;
        this.f115131q = juniorSettingsInteractor;
        this.f115132r = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f115132r;
    }
}
