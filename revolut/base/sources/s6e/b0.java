package s6e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6e.a f260265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f260266b;

    public b0(o6e.a repository, ang.f userInteractor, uli.c hostsProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(hostsProvider, "hostsProvider");
        this.f260265a = repository;
        this.f260266b = userInteractor;
    }
}
