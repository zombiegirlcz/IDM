package blf;

import klf.h0;
import klf.z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f16617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f16618b;

    public b(h0 commonDataSource, z1 savingsDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(savingsDataSource, "savingsDataSource");
        this.f16617a = commonDataSource;
        this.f16618b = savingsDataSource;
    }
}
