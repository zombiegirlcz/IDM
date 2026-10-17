package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m1 f184854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vlf.b f184855c;
    public final elf.d1 d;

    public n7(klf.h0 commonDataSource, klf.m1 juniorDataSource, vlf.b commonUiMapper, elf.d1 noticeLinkClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(noticeLinkClickHandler, "noticeLinkClickHandler");
        this.f184853a = commonDataSource;
        this.f184854b = juniorDataSource;
        this.f184855c = commonUiMapper;
        this.d = noticeLinkClickHandler;
    }

    public final cmf.p a(boolean z) {
        klf.h0 h0Var = this.f184853a;
        return new cmf.p(ta6.a.g(h0Var.d(), h0Var.c(), new x5(this.f184854b.a(), 6), h0Var.i(), new m7(this, z, null)), new chc.c0(23), zhm.u.c(this.d), "StatusWithNotice");
    }
}
