package n52;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import n1.y;
import n4d.a0;
import org.jetbrains.annotations.NotNull;
import tx0.o1;
import ufm.i;
import xo9.h;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements m52.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.c f212536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wt9.b f212537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uw1.c f212538c;

    public c(zzl.c regexMatcher, wt9.b qrCodeInteractor, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(qrCodeInteractor, "qrCodeInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f212536a = regexMatcher;
        this.f212537b = qrCodeInteractor;
        this.f212538c = apmFeatureChecker;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        i iVar = new i(new ufm.c(new d62.b(parsingResult, 1), 2), new a0(new y(this, 20), 9), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ty1.b bVar = (ty1.b) this.f212538c;
        ufm.c cVar = new ufm.c(new s2i.i(bVar, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        i iVar = new i(cVar, new o1(new ty1.a(bVar, 3), 26), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(new i(iVar, new a0(new n45.b(code, this, 14), 7), 1), new a0(new n4d.d0(4), 8), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
