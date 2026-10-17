package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b6 {

    @NotNull
    public static final a6 Companion = new a6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m f184613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vlf.b f184614c;

    public b6(klf.h0 commonDataSource, klf.m chargeBreakdownDataSource, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(chargeBreakdownDataSource, "chargeBreakdownDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f184612a = commonDataSource;
        this.f184613b = chargeBreakdownDataSource;
        this.f184614c = commonUiMapper;
    }
}
