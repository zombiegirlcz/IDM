package t0l;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lyk.a f267050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f267051q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lyk.a spouseConsentInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(spouseConsentInteractor, "spouseConsentInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f267050p = spouseConsentInteractor;
        this.f267051q = new c(false);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f267051q;
    }
}
