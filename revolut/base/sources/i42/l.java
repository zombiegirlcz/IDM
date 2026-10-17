package i42;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTerms$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends oki.h implements dli.b {

    @NotNull
    public static final j Companion = new j();
    public final ApmRegistrationTerms$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hk0.a f158277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f158278q;

    public l(ApmRegistrationTerms$InputData inputData, hk0.a networkFileRepository, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f158277p = networkFileRepository;
        this.f158278q = mra.d.b(this, new d(new Data(null, null, true, 3, null), true), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f158278q;
    }
}
