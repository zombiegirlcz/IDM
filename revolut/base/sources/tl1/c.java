package tl1;

import com.revolut.feature.apm.core.api.ApmToggles$Aani;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql1.d;
import skm.p0;
import te0.w;
import tgk.f;
import tjf.m0;
import xo9.h;
import xo9.i;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f271995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f271996b;

    public c(uw1.c apmFeatureChecker, d aaniQrCodeInteractor) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(aaniQrCodeInteractor, "aaniQrCodeInteractor");
        this.f271995a = apmFeatureChecker;
        this.f271996b = aaniQrCodeInteractor;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        return w.o0(p0.f264003c, new f(parsingResult, this, null, 16));
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ufm.i iVar = new ufm.i(((ty1.b) this.f271995a).d(uw1.f.AANI, ApmToggles$Aani.f61774c), new m0(new d62.a(code, 3), 1), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
