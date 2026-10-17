package dwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.h f120434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.c f120435b;

    public k(hwi.h repository, zjh.c pollingHelper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pollingHelper, "pollingHelper");
        this.f120434a = repository;
        this.f120435b = pollingHelper;
    }
}
