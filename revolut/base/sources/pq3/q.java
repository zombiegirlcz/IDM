package pq3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends z {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf0.c f238680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jf0.c deeplink) {
        super("revolut://app/credit/ne-ci-ftc-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f238680b = deeplink;
    }
}
