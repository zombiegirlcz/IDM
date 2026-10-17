package r4c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z3c.g;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f251441a;

    public b(g productAssetsMapper, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(productAssetsMapper, "productAssetsMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f251441a = uiKitResources;
    }
}
