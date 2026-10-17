package oog;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreen;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlaceOfBirthScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlaceOfBirthScreen placeOfBirthScreen, Continuation continuation) {
        super(2, continuation);
        this.v = placeOfBirthScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a aVar2 = (com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) iVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.v;
        y yVar = aVar2.u;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "COUNTRY_LIST_ID");
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (zF) {
            if (((g) ((j2) yVar.f22677a).getValue()).f227102a.getContent() == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("country is mandatory");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            } else {
                oki.h.v2(aVar3, PlaceOfBirthScreenContract$ModalStep.CountryPicker.f94676a, popup);
            }
        } else if (!Intrinsics.f(str, "CITY_LIST_ID")) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("List id is not supported ", str));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
        } else if (((g) ((j2) yVar.f22677a).getValue()).f227102a.getContent() == null) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("country is mandatory");
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
        } else {
            oki.h.v2(aVar3, PlaceOfBirthScreenContract$ModalStep.CityPicker.f94675a, popup);
        }
        return Unit.f186387a;
    }
}
