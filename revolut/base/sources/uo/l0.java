package uo;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements i0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f281489c = Duration.ofMinutes(15).toMillis();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f281490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef0.b f281491b;

    public l0(ue0.c sessionStorage, ef0.b systemCurrentTimeProvider) {
        Intrinsics.checkNotNullParameter(sessionStorage, "sessionStorage");
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        this.f281490a = sessionStorage;
        this.f281491b = systemCurrentTimeProvider;
    }

    public final void a(String storageSessionId) {
        Intrinsics.checkNotNullParameter(storageSessionId, "storageSessionId");
        this.f281490a.G(new k0(storageSessionId, this.f281491b.a() + f281489c), "SESSION_STORAGE_KEY", k0.class);
    }
}
