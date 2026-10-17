package g35;

import kotlin.jvm.internal.Intrinsics;
import xq3.w;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a35.n f140201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.j f140202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f140203c;
    public final al4.p d;
    public final ang.f e;
    public final a f;

    public o(a35.n creditProductsMediator, xq3.j creditApplicationInteractor, w entryPointsInteractor, al4.p creditCardProductFeatureTogglesInteractor, ang.f userInteractor, r multipleProductsPrimaryEntryPointDescriptionMapper, a creditCardPrimaryEntryPointFactory, p loanPrimaryEntryPointFactory, u refinancingLoanPrimaryEntryPointFactory, q mortgagesPrimaryEntryPointFactory, s overdraftPrimaryEntryPointFactory, t payLaterPrimaryEntryPointFactory) {
        Intrinsics.checkNotNullParameter(creditProductsMediator, "creditProductsMediator");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(multipleProductsPrimaryEntryPointDescriptionMapper, "multipleProductsPrimaryEntryPointDescriptionMapper");
        Intrinsics.checkNotNullParameter(creditCardPrimaryEntryPointFactory, "creditCardPrimaryEntryPointFactory");
        Intrinsics.checkNotNullParameter(loanPrimaryEntryPointFactory, "loanPrimaryEntryPointFactory");
        Intrinsics.checkNotNullParameter(refinancingLoanPrimaryEntryPointFactory, "refinancingLoanPrimaryEntryPointFactory");
        Intrinsics.checkNotNullParameter(mortgagesPrimaryEntryPointFactory, "mortgagesPrimaryEntryPointFactory");
        Intrinsics.checkNotNullParameter(overdraftPrimaryEntryPointFactory, "overdraftPrimaryEntryPointFactory");
        Intrinsics.checkNotNullParameter(payLaterPrimaryEntryPointFactory, "payLaterPrimaryEntryPointFactory");
        this.f140201a = creditProductsMediator;
        this.f140202b = creditApplicationInteractor;
        this.f140203c = entryPointsInteractor;
        this.d = creditCardProductFeatureTogglesInteractor;
        this.e = userInteractor;
        this.f = creditCardPrimaryEntryPointFactory;
    }
}
