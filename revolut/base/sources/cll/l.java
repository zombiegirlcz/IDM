package cll;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fll.a f25063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d63.c f25064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f25065r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, fll.a cardTransformer, d63.c cardScannerControllerModelExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cardTransformer, "cardTransformer");
        Intrinsics.checkNotNullParameter(cardScannerControllerModelExtension, "cardScannerControllerModelExtension");
        this.f25063p = cardTransformer;
        this.f25064q = cardScannerControllerModelExtension;
        this.f25065r = new e(0);
    }

    @Override // yji.l
    public final void I1() {
        d63.c cVar = this.f25064q;
        yji.l.a1(this, cVar.f111444m, null, null, new j(this, null, 1), 3);
        yji.l.a1(this, cVar.f111445n, null, null, new j(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f25065r;
    }
}
