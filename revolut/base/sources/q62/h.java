package q62;

import cli.y;
import com.revolut.feature.apm.iris.impl.ui.settings.deregister.DeregisterDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements dli.b {

    @NotNull
    public static final f Companion = new f();
    public final DeregisterDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c62.d f242452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f242453q;

    public h(DeregisterDialogContract$InputData inputData, c62.d irisAliasInteractor, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(irisAliasInteractor, "irisAliasInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f242452p = irisAliasInteractor;
        this.f242453q = mra.d.b(this, a.f242448a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f242453q;
    }
}
