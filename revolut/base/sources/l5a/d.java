package l5a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f192198a;

    public d(kla.a productIntroToggleResolver, kpj.f paymentsIntroNavBarTextStateMapper) {
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
        Intrinsics.checkNotNullParameter(paymentsIntroNavBarTextStateMapper, "paymentsIntroNavBarTextStateMapper");
        this.f192198a = paymentsIntroNavBarTextStateMapper;
    }
}
