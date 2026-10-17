package mc2;

import aw0.o9;
import c12.p0;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.apm.qvik.api.R$string;
import com.revolut.feature.apm.qvik.impl.common.ApmTransferDestinationQvik;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class c {
    public static p0 a(ApmPaymentDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        ApmContact apmContact = draft.d.d;
        QvikContact qvikContact = apmContact instanceof QvikContact ? (QvikContact) apmContact : null;
        if (qvikContact == null) {
            IllegalStateException illegalStateException = new IllegalStateException("QvikApmListNavigationProvider can't handle recipient: " + qvikContact);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        ApmTransferDirection.Draft draft2 = new ApmTransferDirection.Draft(draft, new ApmTransferRecipient.Contact(apmContact));
        ApmTransferDestinationQvik apmTransferDestinationQvik = new ApmTransferDestinationQvik(qvikContact);
        TransferMoneyPocket transferMoneyPocket = new TransferMoneyPocket(draft.f62194b, null, 2);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_descriptor_transfer_qvik_amount_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_descriptor_transfer_qvik_review_title, null, null, 14);
        String str = draft.f62195c;
        return new p0(new ApmTransferContract$InputData(draft2, textLocalisedClause, textLocalisedClause2, apmTransferDestinationQvik, transferMoneyPocket, null, false, false, false, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, false, false, null, null, 28960));
    }
}
