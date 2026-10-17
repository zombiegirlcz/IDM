package fhf;

import cli.n;
import cli.o;
import fg8.i0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f135227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f135228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3j.j f135229c;
    public final gte.a d;

    public l(whf.n transactionsListMapper, thf.d transactionIconResourcesMapper, m3j.j beneficiaryAvatarMapper, aqa.a cardOwnerAvatarMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(cardOwnerAvatarMapper, "cardOwnerAvatarMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f135227a = transactionsListMapper;
        this.f135228b = transactionIconResourcesMapper;
        this.f135229c = beneficiaryAvatarMapper;
        this.d = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f135213a, new fg8.g(4), new i0(6), new f0e.i(domainState, this, 9));
    }
}
