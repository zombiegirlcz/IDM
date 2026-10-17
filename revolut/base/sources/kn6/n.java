package kn6;

import cli.y;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends oki.h implements dli.b {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mn6.a f186026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f186027q;

    public n(f inputData, mn6.a pennyTopUpControllerExtension, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pennyTopUpControllerExtension, "pennyTopUpControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f186026p = pennyTopUpControllerExtension;
        dj0.d dVar = inputData.f186016a;
        ExternalInstitution externalInstitution = inputData.f186017b;
        this.f186027q = mra.d.b(this, new e(dVar, externalInstitution.f66108b, externalInstitution.f66110g.f163167a == io3.n.SEPA_INSTANT), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        f fVar = this.o;
        String str = fVar.f;
        if (str != null) {
            this.f186026p.b3(fVar.f186017b, str, new m(this, 3), new m(this, 4));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f186027q;
    }
}
