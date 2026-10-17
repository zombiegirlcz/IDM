package e0b;

import cli.y;
import com.revolut.feature.restricted_access.impl.ui.generic.RestrictedGenericScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements e {

    @NotNull
    public static final h Companion = new h();
    public final RestrictedGenericScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f121550p;

    public i(g stateMapper, RestrictedGenericScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f121550p = mra.d.b(this, d.f121548a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f121550p;
    }
}
