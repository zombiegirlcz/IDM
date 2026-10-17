package qa9;

import aw0.n6;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreen;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreenContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import q97.l1;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CountryResidenceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CountryResidenceScreen countryResidenceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = countryResidenceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((aw0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CountryResidenceScreen countryResidenceScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.onboarding.impl.onboarding.country.screen.a) countryResidenceScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar3 = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) countryResidenceScreen.d();
                dl0.a aVar4 = aVar3.f78432r;
                cli.y yVar = aVar3.u;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                if (aVar4.a(((k) j2Var.getValue()).f243986a.f297794a)) {
                    oki.h.v2(aVar3.v, CountryResidenceScreenContract$Modal.LanguageChangeDialog.f78429a, ModalDestination.Style.POPUP.f98311a);
                } else {
                    aVar3.C2(new l(((k) j2Var2.getValue()).f243986a, ((k) j2Var2.getValue()).e, aVar3.o.f78425b));
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = CountryResidenceScreen.W;
                countryResidenceScreen.d3().f213607c.setExpanded(false);
                ((tki.b) ((tki.a) countryResidenceScreen.V.getValue())).f271959b.h().scrollToPosition(((tki.b) ((tki.a) r5.getValue())).f271959b.f.getItemCount() - 1);
                com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar6 = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) countryResidenceScreen.d();
                cli.y yVar2 = aVar6.u;
                if (com.bumptech.glide.d.x(((k) ((j2) yVar2.f22677a).getValue()).f243986a)) {
                    aVar6.H2(yVar2, new l1(23));
                }
                break;
        }
        return Unit.f186387a;
    }
}
