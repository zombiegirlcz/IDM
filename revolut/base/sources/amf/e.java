package amf;

import elf.p0;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f6372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f6373b;

    public e(p0 improveMerchantInfoClickHandler, m1 juniorDataSource) {
        Intrinsics.checkNotNullParameter(improveMerchantInfoClickHandler, "improveMerchantInfoClickHandler");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        this.f6372a = improveMerchantInfoClickHandler;
        this.f6373b = juniorDataSource;
    }

    public final cmf.k a() {
        return new cmf.k(new a3i.i(this.f6373b.a(), this, 19), u.c(this.f6372a), "ImproveMerchantInfo");
    }
}
