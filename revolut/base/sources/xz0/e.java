package xz0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f309760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f309761b;

    public e(ue0.c storage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f309760a = storage;
        this.f309761b = dateProvider;
    }
}
