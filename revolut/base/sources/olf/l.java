package olf;

import klf.r1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt0.b f226393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f226394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final glc.b f226395c;

    public l(jt0.b commonHeaderProvider, r1 roboDataSource, glc.b roboTradeDetailsMapper) {
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(roboDataSource, "roboDataSource");
        Intrinsics.checkNotNullParameter(roboTradeDetailsMapper, "roboTradeDetailsMapper");
        this.f226393a = commonHeaderProvider;
        this.f226394b = roboDataSource;
        this.f226395c = roboTradeDetailsMapper;
    }
}
