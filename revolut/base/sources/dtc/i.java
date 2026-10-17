package dtc;

import android.content.Context;
import dkk.a0;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f117412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f117413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.a f117414c;
    public final nhf.a d;
    public final l93.f e;
    public final wif.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t70.b f117415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f117416h;

    public i(thf.m textResourcesMapper, thf.c categoryResourcesMapper, n8b.a countryInteractor, nhf.a unitedWalletInteractor, l93.f revolutCardsInteractor, wif.a userFeaturesChecker, t70.b currenciesLocalization, Context context) {
        Intrinsics.checkNotNullParameter(textResourcesMapper, "textResourcesMapper");
        Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f117412a = textResourcesMapper;
        this.f117413b = categoryResourcesMapper;
        this.f117414c = countryInteractor;
        this.d = unitedWalletInteractor;
        this.e = revolutCardsInteractor;
        this.f = userFeaturesChecker;
        this.f117415g = currenciesLocalization;
        this.f117416h = context;
    }

    public final ufm.i a() {
        d0 d0VarFirstOrError = this.f.d(wog.a.CARDS).firstOrError();
        a0 a0Var = new a0(new h(this, 1), 16);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, a0Var, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        d0 d0VarFirstOrError2 = ((njf.j) this.d).f().firstOrError();
        Intrinsics.h(d0VarFirstOrError2);
        ufm.i iVar2 = new ufm.i(w.H0(d0VarFirstOrError2, iVar), new a0(new h(this, 0), 15), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
