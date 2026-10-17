package f9i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f132973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n80.d f132974b;

    public b(zk0.b fileSystemRepository, n80.d packageManagerResolver) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
        this.f132973a = fileSystemRepository;
        this.f132974b = packageManagerResolver;
    }
}
