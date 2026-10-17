package b66;

import com.revolut.feature.defi.settings.impl.data.network.DeFiSeedPhraseExportService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSeedPhraseExportService f12536a;

    public c(DeFiSeedPhraseExportService service, b errorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        this.f12536a = service;
    }
}
