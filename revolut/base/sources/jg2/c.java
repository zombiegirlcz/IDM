package jg2;

import efm.d0;
import hg2.h;
import jec.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import te0.w;
import xo9.i;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements i {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f173907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f173908b;

    public c(uw1.c apmFeatureChecker, h upiQrCodeInteractor) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(upiQrCodeInteractor, "upiQrCodeInteractor");
        this.f173907a = apmFeatureChecker;
        this.f173908b = upiQrCodeInteractor;
    }

    @Override // xo9.i
    public final d0 a(xo9.h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        return w.o0(p0.f264003c, new p(parsingResult, this, null, 3));
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return ((ty1.b) this.f173907a).b(uw1.f.UPI) ? new ufm.c(new e3j.b(code, 1), 2) : d0.l(new IllegalArgumentException("UPI QR code is not supported"));
    }
}
