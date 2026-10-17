package dec;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f113364a;

    public c(g paymentMethodIconMapper, a cardInfoMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(paymentMethodIconMapper, "paymentMethodIconMapper");
        Intrinsics.checkNotNullParameter(cardInfoMapper, "cardInfoMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f113364a = dateProvider;
    }
}
