package ym5;

import cli.y;
import com.revolut.feature.crypto.tfr.validation.impl.lei.LegalEntityIdScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements dli.b {
    public final LegalEntityIdScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nm5.f f314865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f314866q;

    public j(g stateMapper, LegalEntityIdScreenContract$InputData inputData, nm5.f updateCounterpartyDataInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(updateCounterpartyDataInteractor, "updateCounterpartyDataInteractor");
        this.o = inputData;
        this.f314865p = updateCounterpartyDataInteractor;
        this.f314866q = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f314866q;
    }
}
