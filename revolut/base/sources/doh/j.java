package doh;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreenContract$Input;
import dkk.a0;
import dmj.e0;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sgm.e3;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e3 f116570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aah.h f116571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f116572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f116573s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PopularFirstBuyScreenContract$Input inputData, k stateMapper, e3 popularFirstBuyInteractor, aah.h wealthDisclaimersControllerModelExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(popularFirstBuyInteractor, "popularFirstBuyInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        this.f116570p = popularFirstBuyInteractor;
        this.f116571q = wealthDisclaimersControllerModelExtension;
        this.f116572r = v0.a.d("create(...)");
        int i = h.f116568a[inputData.f96138a.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        this.f116573s = new e(new Data(null, null, true, 3, null), null, z);
    }

    @Override // yji.l
    public final void I1() {
        a0 a0Var = new a0(new e0(this, 12), 3);
        ihm.f fVar = this.f116572r;
        r rVarSwitchMap = fVar.switchMap(a0Var);
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new i(this, null, 1), 3);
        fVar.onNext(Unit.f186387a);
        l.a1(this, nim.a.v(this.f116571q.f2828l.w0(), new dmj.a(18)), null, null, new i(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f116573s;
    }
}
