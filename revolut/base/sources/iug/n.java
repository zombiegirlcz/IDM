package iug;

import cli.o;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.AccountClosureConsentScreenContract$InputData;
import ieg.z;
import ip0.qn0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fug.d f168602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f168603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountClosureConsentScreenContract$InputData f168604c;

    public n(fug.d accountClosureConsentItemsMapper, gte.a featureToggleInteractor, AccountClosureConsentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(accountClosureConsentItemsMapper, "accountClosureConsentItemsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f168602a = accountClosureConsentItemsMapper;
        this.f168603b = featureToggleInteractor;
        this.f168604c = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f168591a, new isd.a(this, 29), new qn0(this), new z(this, domainState, 10));
    }
}
