package o92;

import cli.n;
import cli.y;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements dli.b {
    public final f92.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnrollmentLabelScreenContract$InputData f223067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f223068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f223069r;

    public h(f92.g repository, EnrollmentLabelScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = repository;
        this.f223067p = inputData;
        ViaVerdeEnrollment viaVerdeEnrollment = inputData.f62667a;
        this.f223068q = mra.d.b(this, new e(viaVerdeEnrollment, viaVerdeEnrollment.e, false), stateMapper, null, false, 12);
        this.f223069r = inputData.f62667a.e;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f223068q;
    }
}
