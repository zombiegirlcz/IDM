package gi1;

import android.os.Parcelable;
import aw0.n6;
import az0.l1;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.address.common.api.AddressFlowApi$AddressFieldSanitization;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreen;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import com.revolut.feature.address.common.impl.flow.validation_flow.AddressEnhancementAdvisor;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AddAddressScreen addAddressScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String streetLine2;
        ActionsBottomSheetController actionsBottomSheetController;
        String flat;
        String houseName;
        int i = this.u;
        AddAddressScreen addAddressScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar2 = (com.revolut.feature.address.common.impl.flow.screen.add.a) addAddressScreen.d();
                boolean zC = ((jte.d) aVar2.z).c(AddressFlowApi$AddressFieldSanitization.f60923c);
                Address address = aVar2.f61003r.f60978a;
                String strK2 = aVar2.K2();
                y yVar = aVar2.C;
                String strL = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) ((j2) yVar.f22677a).getValue()).f144028a.f263347b.f263344a, zC));
                j2 j2Var = (j2) yVar.f22677a;
                String strU = ehe.n.u(((k) j2Var.getValue()).d);
                String strL2 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.f263348c.f263344a, zC));
                String strL3 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.k.f263344a, zC));
                String strL4 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.f263352l.f263344a, zC));
                String strU2 = ehe.n.u(((k) j2Var.getValue()).f144028a.f.f263344a);
                String strL5 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.f263349g.f263344a, zC));
                String strL6 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.f263350h.f263344a, zC));
                String strL7 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.i.f263344a, zC));
                String strL8 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.f263351j.f263344a, zC));
                String strL9 = m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(((k) j2Var.getValue()).f144028a.e.f263344a, zC));
                String code = aVar2.B.getCode();
                if (d0.W(code)) {
                    code = ((k) ((j2) yVar.f22677a).getValue()).f144028a.d.f263344a;
                }
                Address address2 = address.copy((32704 & 1) != 0 ? address.streetLine1 : strL3, (32704 & 2) != 0 ? address.streetLine2 : strL4, (32704 & 4) != 0 ? address.region : m70.a.l(com.revolut.feature.address.common.impl.flow.screen.add.a.J2(code, zC)), (32704 & 8) != 0 ? address.city : strL2, (32704 & 16) != 0 ? address.postcode : strL, (32704 & 32) != 0 ? address.country : strK2, (32704 & 64) != 0 ? address.fullAddress : strU, (32704 & 128) != 0 ? address.streetType : strU2, (32704 & 256) != 0 ? address.street : strL5, (32704 & 512) != 0 ? address.houseNumber : strL6, (32704 & 1024) != 0 ? address.flat : strL8, (32704 & 2048) != 0 ? address.neighborhood : strL9, (32704 & 4096) != 0 ? address.houseName : strL7, (32704 & 8192) != 0 ? address.type : ((k) j2Var.getValue()).f144030c, (32704 & 16384) != 0 ? address.landmark : null);
                pi1.f fVar = aVar2.A;
                AddressFormat addressFormat = ((k) j2Var.getValue()).f144029b;
                o onValidationPassed = new o(aVar2, 1);
                o onValidationFailed = new o(aVar2, 2);
                com.revolut.feature.address.common.impl.flow.validation_flow.c cVar = (com.revolut.feature.address.common.impl.flow.validation_flow.c) fVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(address2, "address");
                Intrinsics.checkNotNullParameter(addressFormat, "addressFormat");
                Intrinsics.checkNotNullParameter("ADD_ADDRESS_SUBMIT_BUTTON_TAG", "buttonTag");
                Intrinsics.checkNotNullParameter(onValidationPassed, "onValidationPassed");
                Intrinsics.checkNotNullParameter(onValidationFailed, "onValidationFailed");
                cVar.f61031m.getClass();
                Intrinsics.checkNotNullParameter(address2, "address");
                AddressEnhancementAdvisor.AddressEnhancement addressEnhancement = (com.bumptech.glide.d.t(com.bumptech.glide.d.c(address2.getCountry())) && ((flat = address2.getFlat()) == null || d0.W(flat)) && ((houseName = address2.getHouseName()) == null || d0.W(houseName))) ? AddressEnhancementAdvisor.AddressEnhancement.JP_ROOM_NUMBER_NEEDED : (com.bumptech.glide.d.v(com.bumptech.glide.d.c(address2.getCountry())) && ((streetLine2 = address2.getStreetLine2()) == null || d0.W(streetLine2))) ? AddressEnhancementAdvisor.AddressEnhancement.SG_FLOOR_NUMBER_NEEDED : null;
                if (addressEnhancement != null) {
                    l1 l1Var = new l1(cVar, address2, addressFormat, onValidationPassed, onValidationFailed, 6);
                    com.revolut.feature.address.common.impl.flow.validation_flow.b bVar = cVar.f61032n;
                    AddAddressScreenContract$InputData addAddressScreenContract$InputData = cVar.f61030l;
                    AnalyticsProduct analyticsProductH = addAddressScreenContract$InputData.f60987p;
                    if (analyticsProductH == null) {
                        k9 k9Var = k9.ProductUnspecified;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                    }
                    AnalyticsProduct analyticsProduct = analyticsProductH;
                    AnalyticsContext analyticsContext = addAddressScreenContract$InputData.f60988q;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(addressEnhancement, "addressEnhancement");
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    int i2 = com.revolut.feature.address.common.impl.flow.validation_flow.a.f61027a[addressEnhancement.ordinal()];
                    if (i2 == 1) {
                        actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.address_enhancement_prompt_jp_title, null, null, 14), new TextLocalisedClause(R$string.address_enhancement_prompt_jp_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.address_enhancement_prompt_jp_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.address_enhancement_prompt_jp_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, analyticsContext, null, 16));
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.address_enhancement_prompt_sg_title, null, null, 14), new TextLocalisedClause(R$string.address_enhancement_prompt_sg_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.address_enhancement_prompt_sg_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.address_enhancement_prompt_sg_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, analyticsContext, null, 16));
                    }
                    cVar.N2(actionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, new pb2.v(l1Var, 22));
                } else {
                    cVar.T2(new pi1.c(cVar, address2, addressFormat, onValidationPassed, onValidationFailed, null, 1), new yi5.b(27));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.c(addAddressScreen.m2());
                addAddressScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar5 = (com.revolut.feature.address.common.impl.flow.screen.add.a) addAddressScreen.d();
                aVar5.getClass();
                aVar5.C2(new l(Address.INSTANCE.getEMPTY(), null, null, null));
                return Unit.f186387a;
        }
    }
}
