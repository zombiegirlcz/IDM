package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m f184586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vlf.b f184587c;
    public final elf.b0 d;
    public final elf.x e;
    public final elf.d1 f;

    public a1(klf.h0 commonDataSource, klf.m chargeBreakdownDataSource, vlf.b commonUiMapper, elf.b0 confirmationClickHandler, elf.x chargesClickHandler, elf.d1 noticeLinkClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(chargeBreakdownDataSource, "chargeBreakdownDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(confirmationClickHandler, "confirmationClickHandler");
        Intrinsics.checkNotNullParameter(chargesClickHandler, "chargesClickHandler");
        Intrinsics.checkNotNullParameter(noticeLinkClickHandler, "noticeLinkClickHandler");
        this.f184585a = commonDataSource;
        this.f184586b = chargeBreakdownDataSource;
        this.f184587c = commonUiMapper;
        this.d = confirmationClickHandler;
        this.e = chargesClickHandler;
        this.f = noticeLinkClickHandler;
    }
}
