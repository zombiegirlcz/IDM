package com.revolut.feature.apm.qvik.impl.ui.pay;

import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.apm.qvik.api.R$string;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$StartType;
import com.revolut.feature.apm.qvik.impl.common.ApmTransferDestinationQvik;
import com.revolut.feature.apm.qvik.impl.data.models.QvikQrScanDetails;
import com.revolut.feature.apm.qvik.impl.data.models.QvikQrScanParams;
import com.revolut.feature.apm.qvik.impl.ui.pay.QvikPayFlowContract$Step;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import d8l.d;
import f23.y;
import fc2.j;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import ofm.q;
import oki.h;
import t02.e;
import tc2.b;
import tc2.g;
import tnb.g0;
import uc2.c;
import yji.n;
import yki.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final QvikPayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f62821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f62822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ic2.a f62823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cc2.a f62824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f62825t;

    public a(QvikPayFlowContract$InputData inputData, c qrHandler, g0 qrInteractor, ic2.a errorHandlerExtension, cc2.a navigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(qrInteractor, "qrInteractor");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.o = inputData;
        this.f62821p = qrHandler;
        this.f62822q = qrInteractor;
        this.f62823r = errorHandlerExtension;
        this.f62824s = navigationProvider;
        this.f62825t = d.a(this, new ta8.a(this, 5));
    }

    public final void I2(QvikQrScanDetails qvikQrScanDetails) {
        TextLocalisedClause textLocalisedClause;
        if (!(qvikQrScanDetails instanceof QvikQrScanDetails.Transfer)) {
            if (qvikQrScanDetails != null) {
                throw new NoWhenBranchMatchedException();
            }
            C2(tc2.d.f269572a);
            return;
        }
        QvikQrScanDetails.Transfer transfer = (QvikQrScanDetails.Transfer) qvikQrScanDetails;
        QvikQrScanParams qvikQrScanParams = transfer.f62792b;
        QvikContact contact = transfer.f62791a;
        Long l2 = qvikQrScanParams.e;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            textLocalisedClause = new TextLocalisedClause(R$string.qvik_transfer_amount_footer_expiry, u.c(new CompositeClause(v.k(new TimeClause(jLongValue, TimeClause.Format.DateLong.f57962b, null, null, 12), new TimeClause(jLongValue, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        ApmTransferDirection.Outgoing outgoing = new ApmTransferDirection.Outgoing(new ApmTransferRecipient.Contact(contact), qvikQrScanParams.f62795b, qvikQrScanParams.d);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_descriptor_transfer_qvik_amount_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.apm_descriptor_transfer_qvik_review_title, null, null, 14);
        TransferMoneyPocket transferMoneyPocket = new TransferMoneyPocket(qvikQrScanParams.f62794a, null, 2);
        String str = qvikQrScanParams.f62796c;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String url2 = transfer.f62793c;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(url2, "url");
        h.u2(this, this.f62825t, new QvikPayFlowContract$Step.Transfer(new ApmTransferContract$InputData(outgoing, textLocalisedClause2, textLocalisedClause3, new ApmTransferDestinationQvik(new ApmTransferDestinationQvik.Body(e.a(contact), e.b(contact), url2, null)), transferMoneyPocket, null, true, true, false, textClause, new ApmTransferContract$InputData.FooterConfig(textLocalisedClause != null ? new ApmFooterContent.TextOnly(textLocalisedClause) : null, new ApmFooterContent.ImageOnly(((j) this.f62824s).o())), true, false, null, null, 28960), qvikQrScanParams.f), null, 6);
    }

    @Override // yki.j
    public final void M0() {
        QvikNavigation$StartType.Pay pay = this.o.f62817a;
        if (pay instanceof QvikNavigation$StartType.Pay.Scanner) {
            h.u2(this, this.f62825t, QvikPayFlowContract$Step.Scanner.f62818a, null, 6);
        } else {
            if (!(pay instanceof QvikNavigation$StartType.Pay.Deeplink)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new g(this, (QvikNavigation$StartType.Pay.Deeplink) pay, null), new yi5.b(26));
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        z zVar;
        v60.d bVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sii.a onFinish = new sii.a(this, 26);
        ic2.b bVar2 = (ic2.b) this.f62823r;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        ic2.c cVar = bVar2.f160201l;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "error");
        Continuation continuation = null;
        if ((throwable instanceof UserDeclinedTwoFaException) || (throwable instanceof HandledNetworkException)) {
            zVar = null;
        } else {
            ServerError serverErrorA = cVar.f160202a.a(throwable);
            Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
            v60.e eVar = cVar.f160203b;
            if (numValueOf == null || (bVar = ((ao0.a) eVar).b(numValueOf)) == null) {
                bVar = new v60.b();
            }
            zVar = new z(q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
        if (zVar != null) {
            n.j2(bVar2, bVar2.L2(new y0(null, zVar, false, 5)), null, new y(bVar2, onFinish, continuation, 28), 3);
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62825t;
    }
}
