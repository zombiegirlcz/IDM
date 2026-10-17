package com.revolut.feature.acquiring.card_reader.order.impl.ui.flow;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.CardReaderOrderFlowContract$Step;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreen;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.delivery_address.DeliveryAddressScreen;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreen;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreen;
import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import fb1.b;
import fb1.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nfc.k;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f60596t;
    public final CardReaderOrderFlowContract$Step.ProductDetails u;
    public final CardReaderOrderFlowContract$State v;

    public a(k vatScreenIntegrator) {
        Intrinsics.checkNotNullParameter(vatScreenIntegrator, "vatScreenIntegrator");
        this.f60596t = vatScreenIntegrator;
        this.u = CardReaderOrderFlowContract$Step.ProductDetails.f60594a;
        this.v = new CardReaderOrderFlowContract$State(null, null);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardReaderOrderFlowContract$Step step = (CardReaderOrderFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, CardReaderOrderFlowContract$Step.ProductDetails.f60594a)) {
            CardReaderProductDetailsScreen cardReaderProductDetailsScreen = new CardReaderProductDetailsScreen();
            c cVar = new c(this, 0);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            cardReaderProductDetailsScreen.H = cVar;
            return cardReaderProductDetailsScreen;
        }
        if (Intrinsics.f(step, CardReaderOrderFlowContract$Step.DeliveryAddress.f60593a)) {
            DeliveryAddressScreen deliveryAddressScreen = new DeliveryAddressScreen();
            c cVar2 = new c(this, 1);
            Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
            deliveryAddressScreen.H = cVar2;
            return deliveryAddressScreen;
        }
        if (!Intrinsics.f(step, CardReaderOrderFlowContract$Step.Vat.f60595a)) {
            if (!Intrinsics.f(step, CardReaderOrderFlowContract$Step.Checkout.f60592a)) {
                throw new NoWhenBranchMatchedException();
            }
            VatSelection vatSelection = ((CardReaderOrderFlowContract$State) A2().f98429a).f60590a;
            if (vatSelection == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Address address = ((CardReaderOrderFlowContract$State) A2().f98429a).f60591b;
            if (address == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            CheckoutScreen checkoutScreen = new CheckoutScreen(new CheckoutScreenContract$InputData(vatSelection, address));
            c cVar3 = new c(this, 2);
            Intrinsics.checkNotNullParameter(cVar3, "<set-?>");
            checkoutScreen.H = cVar3;
            return checkoutScreen;
        }
        wi0.a aVar = wi0.b.Companion;
        Address address2 = ((CardReaderOrderFlowContract$State) A2().f98429a).f60591b;
        if (address2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String country = address2.getCountry();
        aVar.getClass();
        wi0.b country2 = wi0.a.a(country);
        c onVatResult = new c(this, 3);
        k kVar = this.f60596t;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(country2, "country");
        Intrinsics.checkNotNullParameter(onVatResult, "onVatResult");
        VatInputScreen vatInputScreen = new VatInputScreen(new VatInputScreenContract$InputData(country2, ((o8b.c) kVar.f214897a).b(country2.f297794a)));
        n7h.c cVar4 = new n7h.c(onVatResult, 26);
        Intrinsics.checkNotNullParameter(cVar4, "<set-?>");
        vatInputScreen.H = cVar4;
        return vatInputScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
