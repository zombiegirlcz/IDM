package paa;

import cli.y;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements dli.b {
    public final AliasDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f234465p;

    public i(j stateMapper, AliasDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f234465p = mra.d.b(this, new d(inputData.f80664a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f234465p;
    }
}
