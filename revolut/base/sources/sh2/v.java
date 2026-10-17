package sh2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements e12.h {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh2.a f263419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh2.b f263420b;

    public v(qh2.a weroInteractor, a12.v chargebackMapper, xh2.b disputesMapper) {
        Intrinsics.checkNotNullParameter(weroInteractor, "weroInteractor");
        Intrinsics.checkNotNullParameter(chargebackMapper, "chargebackMapper");
        Intrinsics.checkNotNullParameter(disputesMapper, "disputesMapper");
        this.f263419a = weroInteractor;
        this.f263420b = disputesMapper;
    }
}
