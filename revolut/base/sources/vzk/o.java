package vzk;

import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalityInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f293560b;

    public /* synthetic */ o(u uVar, int i) {
        this.f293559a = i;
        this.f293560b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f293559a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                u uVar = this.f293560b;
                uVar.x2(new o(uVar, 2));
                return Boolean.FALSE;
            case 1:
                wi0.b selectedCountry = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                u uVar2 = this.f293560b;
                uVar2.x2(new vrl.n(new NationalityInput(selectedCountry, true, uVar2.y2(selectedCountry)), uVar2, 23));
                return Unit.f186387a;
            case 2:
                g updateState = (g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return g.a((g) this.f293560b.t2(), null, false, null, 11);
            case 3:
                return g.a((g) this.f293560b.t2(), null, true, null, 11);
            default:
                return g.a((g) this.f293560b.t2(), null, false, null, 11);
        }
    }
}
