package la0;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f193303a;

    public b(ImmutableMap extensionsMap) {
        Intrinsics.checkNotNullParameter(extensionsMap, "extensionsMap");
        this.f193303a = extensionsMap;
    }

    public b(Map providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f193303a = providers;
    }
}
