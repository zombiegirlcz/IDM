package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x2 {

    @NotNull
    public static final w2 Companion = new w2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f185008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f185009b;

    public x2(klf.h0 commonDataSource, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f185008a = commonDataSource;
        this.f185009b = commonUiMapper;
    }
}
