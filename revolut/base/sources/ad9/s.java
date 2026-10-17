package ad9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements a99.g {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f3308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd9.c f3309b;

    public s(sf0.h serverErrorParser, bd9.c userMigrationRepository) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(userMigrationRepository, "userMigrationRepository");
        this.f3308a = serverErrorParser;
        this.f3309b = userMigrationRepository;
    }

    public final z a(boolean z) {
        d0 d0VarFirstOrError = m70.a.f(this.f3309b.f14542b.f(Boolean.valueOf(z), true), new a2g.m(12), new a9d.p(14), new a9d.p(15)).firstOrError();
        a9j.j jVar = new a9j.j(new a9h.b(26), 11);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, jVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.I(iVar, h0.f322473a, new p(this, 0));
    }
}
