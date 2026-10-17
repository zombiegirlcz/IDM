package s78;

import fmc.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf8.k f260575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zf8.n f260576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao.h f260577c;
    public final z d;
    public final ne0.j e;

    public h(zf8.k juniorAccountInfoProvider, zf8.n juniorAccountStatesProvider, ao.h juniorCoparentInteractor, z graduationInteractor, r10.f graduationUiInteractor, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(graduationInteractor, "graduationInteractor");
        Intrinsics.checkNotNullParameter(graduationUiInteractor, "graduationUiInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f260575a = juniorAccountInfoProvider;
        this.f260576b = juniorAccountStatesProvider;
        this.f260577c = juniorCoparentInteractor;
        this.d = graduationInteractor;
        this.e = memoryCache;
    }
}
