package qa9;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.onboarding.impl.R$id;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreen;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import q97.l1;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountryResidenceScreen f243984b;

    public /* synthetic */ e(CountryResidenceScreen countryResidenceScreen, int i) {
        this.f243983a = i;
        this.f243984b = countryResidenceScreen;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f243983a;
        CountryResidenceScreen countryResidenceScreen = this.f243984b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CountryResidenceScreen.W;
                com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) countryResidenceScreen.e3();
                cli.y yVar = aVar.u;
                if (com.bumptech.glide.d.x(((k) ((j2) yVar.f22677a).getValue()).f243986a)) {
                    aVar.H2(yVar, new l1(23));
                }
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr2 = CountryResidenceScreen.W;
                qji.c cVarZ2 = countryResidenceScreen.z2();
                no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                if (mVar != null) {
                    return mVar.getN();
                }
                return null;
            case 2:
                KProperty[] kPropertyArr3 = CountryResidenceScreen.W;
                qji.b bVarU2 = countryResidenceScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.country.screen.di.CountryResidenceScreenInjector");
                ta9.h hVar = (ta9.h) bVarU2;
                ta9.m mVar2 = hVar.f269210b;
                ta9.h hVar2 = hVar.f269211c;
                CountryResidenceScreenContract$InputData countryResidenceScreenContract$InputData = countryResidenceScreen.K;
                countryResidenceScreenContract$InputData.getClass();
                return new ta9.i(mVar2, hVar2, countryResidenceScreenContract$InputData);
            case 3:
                KProperty[] kPropertyArr4 = CountryResidenceScreen.W;
                return (m) ((ta9.i) countryResidenceScreen.R.getValue()).d.get();
            default:
                KProperty[] kPropertyArr5 = CountryResidenceScreen.W;
                CountryResidenceScreen countryResidenceScreen2 = this.f243984b;
                return tki.g.a(countryResidenceScreen2, countryResidenceScreen2.e3(), zhm.v.k((InputTextDelegate) countryResidenceScreen2.M.getValue(), (ListCellDelegate) countryResidenceScreen2.N.getValue(), (TextDelegate) countryResidenceScreen2.O.getValue(), (InputChecklistDelegate) countryResidenceScreen2.P.getValue(), new ListSubheaderDelegate()), R$id.country_recyclerView, null, null, null, 56);
        }
    }
}
