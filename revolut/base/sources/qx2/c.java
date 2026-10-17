package qx2;

import cli.n;
import cli.y;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends h implements dli.b {
    public final y o;

    public c(n stateMapper, CardVideoPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f64679a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
