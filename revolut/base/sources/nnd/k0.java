package nnd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements cli.n {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.j f217563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pnd.n f217564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pnd.k f217565c;
    public final pnd.e d;
    public final gte.a e;

    public k0(zjh.j legalEntityDisclaimerMapper, pnd.n accountPickerSingleModeMapper, pnd.k accountPickerMultipleModeMapper, pnd.e accountPickerAccountsSelectionMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(accountPickerSingleModeMapper, "accountPickerSingleModeMapper");
        Intrinsics.checkNotNullParameter(accountPickerMultipleModeMapper, "accountPickerMultipleModeMapper");
        Intrinsics.checkNotNullParameter(accountPickerAccountsSelectionMapper, "accountPickerAccountsSelectionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f217563a = legalEntityDisclaimerMapper;
        this.f217564b = accountPickerSingleModeMapper;
        this.f217565c = accountPickerMultipleModeMapper;
        this.d = accountPickerAccountsSelectionMapper;
        this.e = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f217532a, new nme.c0(this, 28), new nmb.v(6), new njj.c1(this, domainState, 6));
    }
}
