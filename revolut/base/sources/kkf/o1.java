package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final elf.h0 f184860b;

    public o1(klf.h0 commonDataSource, elf.h0 getHelpClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(getHelpClickHandler, "getHelpClickHandler");
        this.f184859a = commonDataSource;
        this.f184860b = getHelpClickHandler;
    }

    public final cmf.p a() {
        return new cmf.p(new kh4.f(this.f184859a.d(), this, 12), new i0(7), zhm.u.c(this.f184860b), "GetHelp");
    }
}
