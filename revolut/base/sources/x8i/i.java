package x8i;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements w8i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a61.a f303414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final md0.b f303415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f303416c;
    public final fk3.a d;
    public final c9i.c e;

    public i(a61.a newsInteractor, md0.b chaosManagementInteractor, d newsBannersBuilder, fk3.a configurationInteractor, c9i.c newsUIMapper) {
        Intrinsics.checkNotNullParameter(newsInteractor, "newsInteractor");
        Intrinsics.checkNotNullParameter(chaosManagementInteractor, "chaosManagementInteractor");
        Intrinsics.checkNotNullParameter(newsBannersBuilder, "newsBannersBuilder");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(newsUIMapper, "newsUIMapper");
        this.f303414a = newsInteractor;
        this.f303415b = chaosManagementInteractor;
        this.f303416c = newsBannersBuilder;
        this.d = configurationInteractor;
        this.e = newsUIMapper;
    }

    public final r a(nd0.c type) {
        md0.e eVar = (md0.e) this.f303415b;
        Intrinsics.checkNotNullParameter(type, "type");
        gd0.f fVar = eVar.f204465a;
        nd0.d params = new nd0.d(type, eVar.f204466b);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        r rVarG = m70.a.g(fVar.f143029c.f(params, true), null, new x48.a(16), 1);
        f0 f0Var = f0.f322471a;
        r rVarStartWith = rVarG.onErrorReturnItem(f0Var).startWith(f0Var);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }
}
