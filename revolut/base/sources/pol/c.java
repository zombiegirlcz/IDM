package pol;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreen;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$ModalStep;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EnterPhoneScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EnterPhoneScreen enterPhoneScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = enterPhoneScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2 = this.u;
        EnterPhoneScreen enterPhoneScreen = this.v;
        switch (i2) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                enterPhoneScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.sso.impl.ui.phone.enter_phone.a) enterPhoneScreen.d()).v, EnterPhoneScreenContract$ModalStep.PhoneNumberCountry.f106670a, ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.sso.impl.ui.phone.enter_phone.a aVar4 = (com.revolut.sso.impl.ui.phone.enter_phone.a) enterPhoneScreen.d();
                y yVar = aVar4.u;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                String str = ((g) j2Var.getValue()).f238049a.f106150a;
                if (str.length() == 0) {
                    throw new IllegalStateException("Can't continue with empty phone");
                }
                int i3 = ((g) j2Var2.getValue()).f238049a.f106151b;
                wi0.b bVar = ((g) j2Var2.getValue()).f238049a.f106152c;
                String strR = a0.d.r(hx7.a.J(i3), str);
                EnterPhoneScreenContract$InputData.Mode mode = aVar4.o.f106662a;
                if (mode instanceof EnterPhoneScreenContract$InputData.Mode.Create) {
                    i = R$string.revolut_sso_create_new_phone_confirmation_dialog_description;
                } else if (mode instanceof EnterPhoneScreenContract$InputData.Mode.LostAccess) {
                    i = R$string.revolut_sso_lost_access_phone_confirmation_dialog_description;
                } else {
                    if (!(mode instanceof EnterPhoneScreenContract$InputData.Mode.Collect) && !(mode instanceof EnterPhoneScreenContract$InputData.Mode.SignUp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wi0.b.Companion.getClass();
                    i = Intrinsics.f(bVar, wi0.b.f297770q3) ? R$string.revolut_sso_sign_up_phone_dialog_description_us : R$string.revolut_sso_sign_up_phone_dialog_description;
                }
                tll.a aVar5 = aVar4.f106674s;
                TextClause textClause = new TextClause(jli.g.g(z80.b.b(aVar4.f106673r, strR, bVar.f297794a, null, 4)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                CountryImage countryImage = new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                com.revolut.sso.impl.ui.phone.enter_phone.b.Companion.getClass();
                Intrinsics.checkNotNullParameter("LIST_ID_ENTER_PHONE", "id");
                yji.l.b1(aVar4, aVar4.X1(((tll.b) aVar5).a(textClause, countryImage, textLocalisedClause, new ListIdTarget("LIST_ID_ENTER_PHONE"))), null, new of6.d(aVar4, str, i3, bVar, (Continuation) null), 3);
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.sso.impl.ui.phone.enter_phone.a) enterPhoneScreen.d()).C2(j.f238054a);
                return Unit.f186387a;
        }
    }
}
