package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class o8 {

    @NotNull
    public static final m8 Companion = new m8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184870a;

    public o8(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f184870a = commonDataSource;
    }

    public final cmf.p a() {
        return new cmf.p(new z7(this.f184870a.f(new kjk.x(22)), this, 4), new chc.c0(23), zhm.f0.f322471a, "TransferReasonBlock");
    }
}
