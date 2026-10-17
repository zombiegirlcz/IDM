package la8;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.v;
import nii.y0;
import vkm.j2;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorIsaAddPhoneNumberScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorIsaAddPhoneNumberScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((oki.h) juniorIsaAddPhoneNumberScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a aVar3 = (com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) juniorIsaAddPhoneNumberScreen.e3();
                y yVar = aVar3.f76776w;
                wi0.b bVar = ((e) ((j2) yVar.f22677a).getValue()).f193346a;
                yji.l.b1(aVar3, aVar3.X1(new y0(null, new v(new TextLocalisedClause(R$string.junior_trading_add_phone_confirmation_dialog_phone_placeholder, u.c(jli.g.g(z80.b.b(aVar3.f76771p, ((e) ((j2) yVar.f22677a).getValue()).f193347b, bVar.f297794a, null, 4))), null, 12), new TextLocalisedClause(R$string.junior_trading_add_phone_confirmation_dialog_title, null, null, 14), new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14), new TextLocalisedClause(R$string.junior_trading_add_phone_confirmation_dialog_button_confirm, null, null, 14), new TextLocalisedClause(R$string.junior_trading_add_phone_confirmation_dialog_button_go_back, null, null, 14), null, null, null, false, null, 4032), false, 5)), null, new l1g.e(aVar3, (Continuation) null, 18), 3);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a aVar5 = (com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) juniorIsaAddPhoneNumberScreen.e3();
                oki.h.v2(aVar5.f76777x, new JuniorIsaAddPhoneNumberScreenContract$ModalStep.ChangeCountryCode(((e) ((j2) aVar5.f76776w.f22677a).getValue()).f193346a.f297794a), ModalDestination.Style.POPUP.f98311a);
                break;
        }
        return Unit.f186387a;
    }
}
