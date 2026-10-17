package dwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.d f120414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.c f120415b;

    public d(hwi.d repository, zjh.c pollingHelper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pollingHelper, "pollingHelper");
        this.f120414a = repository;
        this.f120415b = pollingHelper;
    }
}
