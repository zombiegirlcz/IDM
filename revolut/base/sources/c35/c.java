package c35;

import al4.p;
import bzg.t;
import k25.u;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qx4.i;
import xq3.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends b35.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20881a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f20882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k25.a f20883c;
    public final fs3.b d;
    public final i e;

    public c(w entryPointsInteractor, al4.c creditBuilderCardProductFeatureTogglesInteractor, k25.a productContract) {
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditBuilderCardProductFeatureTogglesInteractor, "creditBuilderCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(productContract, "productContract");
        this.f20882b = entryPointsInteractor;
        this.e = creditBuilderCardProductFeatureTogglesInteractor;
        this.f20883c = productContract;
        this.d = fs3.b.CREDIT_BUILDER_CARD;
    }

    @Override // mf1.a
    public final Flow a() {
        switch (this.f20881a) {
            case 0:
                return b35.d.d(boh.f.e(((u) this.f20883c).s(), new t(this, 15)));
            case 1:
                return b35.d.d(boh.f.e(((u) this.f20883c).s(), new t(this, 16)));
            default:
                return b35.d.d(boh.f.e(((u) this.f20883c).s(), new t(this, 19)));
        }
    }

    @Override // b35.d
    public final fs3.b c() {
        switch (this.f20881a) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    public c(w entryPointsInteractor, p creditCardProductFeatureTogglesInteractor, k25.a productContract) {
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(productContract, "productContract");
        this.f20882b = entryPointsInteractor;
        this.e = creditCardProductFeatureTogglesInteractor;
        this.f20883c = productContract;
        this.d = fs3.b.BALANCE_TRANSFER_CREDIT_CARD;
    }

    public c(w entryPointsInteractor, al4.u securedCreditCardProductFeatureTogglesInteractor, k25.a productContract) {
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardProductFeatureTogglesInteractor, "securedCreditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(productContract, "productContract");
        this.f20882b = entryPointsInteractor;
        this.e = securedCreditCardProductFeatureTogglesInteractor;
        this.f20883c = productContract;
        this.d = fs3.b.SECURED_CREDIT_CARD;
    }
}
