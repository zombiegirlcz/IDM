package gn6;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements f {
    public final oe6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f144926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f144927q;

    public j(oe6.a externalInstitutionsInteractor, n stateMapper, e inputData) {
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = externalInstitutionsInteractor;
        this.f144926p = inputData;
        this.f144927q = mra.d.b(this, new d(inputData.f144917a, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new i(this, null, 0), new gn.a(1));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144927q;
    }
}
