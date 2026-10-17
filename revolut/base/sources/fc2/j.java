package fc2;

import c12.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.apm.qvik.api.R$string;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$Destination;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$StartType;
import com.revolut.feature.apm.qvik.impl.common.ApmTransferDestinationQvik;
import com.revolut.feature.apm.qvik.impl.common.ApmTransferDestinationQvikAlias;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements cc2.a {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f133624a;

    public j(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f133624a = dateProvider;
    }

    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new QvikNavigation$Destination(QvikNavigation$StartType.Settings.f62781a, product instanceof ApmQvik.b);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof QvikContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return (product instanceof ApmQvik) || (product instanceof ApmQvik.b);
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new QvikNavigation$Destination(QvikNavigation$StartType.NewContact.f62777a, product instanceof ApmQvik.b);
    }

    @Override // ny1.c
    public final aii.e g(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        QvikContact recipient = (QvikContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new p0(p(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return aVar instanceof ApmQvik.b ? new QvikNavigation$Destination(QvikNavigation$StartType.RecipientList.f62780a, true) : new QvikNavigation$Destination(QvikNavigation$StartType.Area.f62776a, false);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        QvikContact recipient = (QvikContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new ApmTransferContract$Destination(p(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new QvikNavigation$Destination(QvikNavigation$StartType.RecipientList.f62780a, product instanceof ApmQvik.b);
    }

    public final CdnImage o() {
        return new CdnImage("logo_light", "mobile/payments/hungary/instant_payment", null, new ImageTransformations(null, null, null, null, null, null, 48, 63), null, "logo_dark", Constants.TAG_GPI_VERSION);
    }

    public final ApmTransferContract$InputData p(QvikContact contact, hrf.f fVar, TransferMoneyPocket transferMoneyPocket) {
        ApmTransferDestination apmTransferDestinationQvikAlias;
        ApmTransferContract$InputData.FooterConfig footerConfig;
        ApmTransferDirection outgoing;
        int[] iArr = i.f133623a;
        int i = iArr[fVar.ordinal()];
        if (i == 1) {
            ApmDescriptor apmDescriptor = contact.f62148b;
            if ((apmDescriptor instanceof ApmDescriptor.Email) || (apmDescriptor instanceof ApmDescriptor.Phone) || (apmDescriptor instanceof ApmDescriptor.TaxNumber)) {
                Intrinsics.checkNotNullParameter(contact, "contact");
                apmTransferDestinationQvikAlias = new ApmTransferDestinationQvikAlias("GIRO_ALIAS", new ApmTransferDestinationQvikAlias.Body(t02.e.a(contact), t02.e.b(contact)));
            } else {
                if (!(apmDescriptor instanceof ApmDescriptor.BankAccount) && !(apmDescriptor instanceof ApmDescriptor.ExternalId)) {
                    throw new NoWhenBranchMatchedException();
                }
                apmTransferDestinationQvikAlias = new ApmTransferDestinationQvik(contact);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            apmTransferDestinationQvikAlias = new ApmTransferDestinationQvik(contact);
        }
        ApmTransferDestination apmTransferDestination = apmTransferDestinationQvikAlias;
        int i2 = iArr[fVar.ordinal()];
        if (i2 == 1) {
            footerConfig = new ApmTransferContract$InputData.FooterConfig(new ApmFooterContent.ImageOnly(o()), 1);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            footerConfig = null;
        }
        LocalDate localDateE = ((l80.f) this.f133624a).e();
        int i3 = iArr[fVar.ordinal()];
        if (i3 == 1) {
            outgoing = new ApmTransferDirection.Outgoing(new ApmTransferRecipient.Contact(contact), true, true);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ApmTransferRecipient.Contact contact2 = new ApmTransferRecipient.Contact(contact);
            LocalDate localDatePlusDays = localDateE.plusDays(60L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            LocalDate localDatePlusDays2 = localDateE.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
            LocalDate localDatePlusDays3 = localDateE.plusDays(60L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays3, "plusDays(...)");
            outgoing = new ApmTransferDirection.Incoming(contact2, new ApmTransferPayerSettings(false, false, localDatePlusDays, localDatePlusDays2, localDatePlusDays3));
        }
        return new ApmTransferContract$InputData(outgoing, new TextLocalisedClause(R$string.apm_descriptor_transfer_qvik_amount_title, null, null, 14), new TextLocalisedClause(R$string.apm_descriptor_transfer_qvik_review_title, null, null, 14), apmTransferDestination, transferMoneyPocket, null, false, false, false, null, footerConfig, false, false, null, null, 31712);
    }
}
