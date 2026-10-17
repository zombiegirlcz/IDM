package q67;

import cli.y;
import cli.z;
import com.revolut.feature.gif_view.impl.screen.GifViewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements z {
    public final y o;

    public f(GifViewScreenContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f74524a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
