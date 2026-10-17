package swj;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;
import r0j.c;
import r0j.d;
import s06.e;
import sp5.h;
import te0.w;
import ufm.i;
import wi0.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt8.d f266229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f266230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f266231c;

    public a(mt8.d kycInteractor, c localPromptsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(localPromptsProvider, "localPromptsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f266229a = kycInteractor;
        this.f266230b = localPromptsProvider;
        this.f266231c = featureToggleInteractor;
    }

    public final i a(f0 card, b countryCode) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        i iVar = new i(w.H0(this.f266229a.getKyc(), ((uwj.a) this.f266230b).a()), new h(27, new e(countryCode, 19, card, this)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
