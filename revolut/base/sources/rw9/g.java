package rw9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import rsl.p;
import xo9.i;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f257859c = new Regex("^(http[s]?)://revolut.me(?=/.+)(?!/.+/.+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f257860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2c.c f257861b;

    public g(ang.f userInteractor, y2c.c revolutMeInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutMeInteractor, "revolutMeInteractor");
        this.f257860a = userInteractor;
        this.f257861b = revolutMeInteractor;
    }

    @Override // xo9.i
    public final d0 a(xo9.h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        ufm.i iVar = new ufm.i(this.f257860a.f(false), new d(new p(parsingResult, this, 8), 0), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ufm.c cVar = new ufm.c(new e3j.b(code, this), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
