package pa8;

import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorIsaDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorIsaDetailsScreen juniorIsaDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorIsaDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsActionListDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String country;
        CellDetailsActionListDelegate.Model model = (CellDetailsActionListDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.R.getValue();
        String listId = model.f51796a;
        com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar2 = (com.revolut.feature.junior.isa.impl.ui.jisa_details.a) jVar;
        JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData = aVar2.o;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f76798t;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        switch (iHashCode) {
            case -2028660429:
                if (listId.equals("PHONE_NUMBER_CELL_ID")) {
                    Address addressI = pw5.a.i(aVar2.I2());
                    if (addressI == null || (country = addressI.getCountry()) == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Address for juniorRegId: ", juniorIsaDetailsScreenContract$InputData.f76787a, " is null"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        oki.h.v2(aVar3, new JuniorIsaDetailsScreenContract$ModalStep.UpdatePhone(aVar2.I2().getF77099b(), country, aVar2.I2().getF()), popup);
                    }
                }
                break;
            case -608660331:
                if (listId.equals("NINO_CELL_ID")) {
                    oki.h.v2(aVar3, new JuniorIsaDetailsScreenContract$ModalStep.UpdateNationalNumber(aVar2.I2().getF77099b()), popup);
                }
                break;
            case 122492314:
                if (listId.equals("GENDER_CELL_ID")) {
                    oki.h.v2(aVar3, new JuniorIsaDetailsScreenContract$ModalStep.UpdateGender(aVar2.I2().getD()), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 398342221:
                if (listId.equals("HOME_ADDRESS_CELL_ID")) {
                    Address addressI2 = pw5.a.i(aVar2.I2());
                    if (addressI2 == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Address for juniorRegId: ", juniorIsaDetailsScreenContract$InputData.f76787a, " is null"));
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                    } else {
                        oki.h.v2(aVar3, new JuniorIsaDetailsScreenContract$ModalStep.UpdateAddress(addressI2), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
