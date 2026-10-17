package hle;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import ybl.d;
import ybl.k;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f153450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f153451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f153452c;

    public a(k tradingAccountsInteractor, f userInteractor, d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f153450a = tradingAccountsInteractor;
        this.f153451b = userInteractor;
        this.f153452c = portfolioInteractor;
    }
}
