package com.revolut.feature.apm.breb.impl;

import c12.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$Destination;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$StartType;
import com.revolut.feature.apm.breb.impl.ApmTransferDestinationBreb;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import hrf.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import t02.e;
import wi0.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements bv1.a {
    public static ApmTransferContract$InputData o(BrebContact contact, f fVar, TransferMoneyPocket transferMoneyPocket) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_product_bre_b_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_product_bre_b_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.payments_bank_transfer_amount_reference_default_value, null, null, 14);
        ApmTransferDestinationBreb.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        String str = contact.f62126h;
        boolean z = str == null || d0.W(str);
        ApmTransferDestinationBreb apmTransferDestinationBreb = new ApmTransferDestinationBreb("BREB", new ApmTransferDestinationBreb.Body(z ? e.a(contact) : null, e.b(contact), z ? null : contact.f62126h));
        b.Companion.getClass();
        return new ApmTransferContract$InputData(contact, fVar, textLocalisedClause, textLocalisedClause2, apmTransferDestinationBreb, transferMoneyPocket, textLocalisedClause3, null, new ApmTransferContract$InputData.TransferReasonConfig(b.O), 5824);
    }

    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BrebNavigation$Destination(BrebNavigation$StartType.Area.f61698a);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof BrebContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmBreb;
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BrebNavigation$Destination(BrebNavigation$StartType.Area.f61698a);
    }

    @Override // ny1.c
    public final aii.e g(ApmContact apmContact, f direction, TransferMoneyPocket funding) {
        BrebContact recipient = (BrebContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new p0(o(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return new BrebNavigation$Destination(BrebNavigation$StartType.Area.f61698a);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, f direction, TransferMoneyPocket funding) {
        BrebContact recipient = (BrebContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new ApmTransferContract$Destination(o(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BrebNavigation$Destination(BrebNavigation$StartType.RecipientList.f61704a);
    }
}
