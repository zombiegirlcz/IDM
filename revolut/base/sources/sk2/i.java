package sk2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.a f263764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w39.b f263765b;

    public i(y80.a permissionProvider, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f263764a = permissionProvider;
        this.f263765b = locationInteractor;
    }
}
