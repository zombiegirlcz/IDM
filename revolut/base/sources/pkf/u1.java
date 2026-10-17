package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cvd.a f237134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.h0 f237135b;

    public u1(cvd.a unstakingDataInteractor, klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(unstakingDataInteractor, "unstakingDataInteractor");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f237134a = unstakingDataInteractor;
        this.f237135b = commonDataSource;
    }
}
