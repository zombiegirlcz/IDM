package jd3;

import bn2.p;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import efm.r;
import ffk.t;
import j87.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd3.a f172969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f172970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f172971c;

    public k(bd3.a cashbackInteractor, t pricingPlanInteractor, n walletInteractor, p backgroundsInteractor) {
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        this.f172969a = cashbackInteractor;
        this.f172970b = pricingPlanInteractor;
        this.f172971c = walletInteractor;
    }

    public static go.g b() {
        return new go.g(new Data(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cashback, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), null, false, 6, null), 2);
    }

    public final r a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        bd3.a aVar = this.f172969a;
        return nim.a.w(mif.a.e(aVar.c(loadingStrategy), aVar.g(loadingStrategy), this.f172971c.J(AccountId.Personal.f51414a, loadingStrategy)), new jcj.n(23));
    }

    public final r c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarA = a(loadingStrategy);
        r rVarV = this.f172970b.v(loadingStrategy);
        bd3.a aVar = this.f172969a;
        return nim.a.w(mif.a.h(rVarA, rVarV, aVar.c(loadingStrategy), aVar.g(loadingStrategy), rd0.e.c(aVar.f(loadingStrategy), kotlin.coroutines.g.f186406a), rd0.e.c(b(), p0.f264003c)), new m(this, 22));
    }
}
