package s92;

import cli.n;
import cli.y;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends oki.h implements j {
    public final f92.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f261098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Regex f261099q;

    public k(f92.g repository, EnrollmentRegistrationScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = repository;
        f92.b bVar = inputData.f62673a;
        m70.a.c(t0.f186434a);
        this.f261098p = mra.d.b(this, new e(bVar, "", false), stateMapper, null, false, 12);
        this.f261099q = new Regex("^\\d{11}$");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f261098p;
    }
}
