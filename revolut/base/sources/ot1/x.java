package ot1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements jki.p {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.i f229422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.k f229423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q12.g f229424c;

    public x(lx1.i apmRecipientMapper, yof.k transferReviewMapper, q12.g quoteMapper) {
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        this.f229422a = apmRecipientMapper;
        this.f229423b = transferReviewMapper;
        this.f229424c = quoteMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        CellDetailsDelegate.Model model;
        List listA;
        TextLocalisedClause textLocalisedClause;
        a aVar;
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        c cVar = domainState.d;
        BizumTransferData bizumTransferData = domainState.f229386c;
        BizumTransferReviewInfo bizumTransferReviewInfo = domainState.f229385b;
        yof.k kVar = this.f229423b;
        if (cVar == null) {
            listA = ((ppf.d) kVar).e();
        } else {
            TransferTrustData transferTrustData = cVar.f229396b;
            int i = w.f229421a[bizumTransferReviewInfo.k().ordinal()];
            if (i == 1) {
                ppf.d dVar = (ppf.d) kVar;
                sa saVarB = dVar.b(transferTrustData.f92304a);
                if (saVarB != null) {
                    yp0.b.l(saVarB, 0, 0, 0, 0, null, false, 63);
                } else {
                    saVarB = null;
                }
                List listB = b(domainState);
                List listA2 = this.f229424c.a(cVar.f229395a, bizumTransferData.getF72729b(), bizumTransferData.d());
                qv0.i iVarC = c(bizumTransferData);
                boolean zB = bizumTransferReviewInfo.B8().b();
                if (zB) {
                    model = null;
                } else {
                    model = new CellDetailsDelegate.Model("ID_TRANSFER_REVIEW_ARRIVING_ON", new TextLocalisedClause(R$string.payments_bank_transfer_review_field_title_estimated_arrival, null, null, 14), new TextLocalisedClause(R$string.transfer_summary_screen_eta_instant, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                }
                CellDetailsSwitcherDelegate.Model modelI = !zB ? dVar.i(transferTrustData) : null;
                aim.e eVarB = zhm.u.b();
                if (saVarB != null) {
                    eVarB.add(saVarB);
                }
                eVarB.addAll(listB);
                if (iVarC != null) {
                    eVarB.add(iVarC);
                }
                eVarB.addAll(listA2);
                if (model != null) {
                    eVarB.add(model);
                }
                if (modelI != null) {
                    eVarB.add(modelI);
                }
                listA = zhm.u.a(eVarB);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List listB2 = b(domainState);
                qv0.i iVarC2 = c(bizumTransferData);
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_TRANSFER_REVIEW_REQUESTING", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transfer_review_field_requesting, null, null, 14), new MoneyClause(bizumTransferData.getF72729b(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                aim.e eVarB2 = zhm.u.b();
                eVarB2.addAll(listB2);
                if (iVarC2 != null) {
                    eVarB2.add(iVarC2);
                }
                eVarB2.add(model2);
                listA = zhm.u.a(eVarB2);
            }
        }
        int i2 = w.f229421a[bizumTransferReviewInfo.k().ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transfer_review_title_outgoing, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transfer_review_title_incoming, null, null, 14);
        }
        if (domainState.d == null) {
            m70.a.c(t0.f186434a);
            aVar = new a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false);
        } else {
            aVar = bizumTransferReviewInfo.B8().b() ? new a(new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_transfer_review_invite_action, null, null, 14), true) : bizumTransferReviewInfo.k() == hrf.f.INCOMING ? new a(new TextLocalisedClause(R.string.common_action_request, null, null, 14), true) : new a(new TextLocalisedClause(R.string.common_action_send, null, null, 14), true);
        }
        return new i(listA, aVar, textLocalisedClause);
    }

    public final List b(b bVar) {
        int i;
        ImageClause imageClause;
        Float fValueOf = Float.valueOf(16.0f);
        BizumTransferReviewInfo bizumTransferReviewInfo = bVar.f229385b;
        int i2 = w.f229421a[bizumTransferReviewInfo.k().ordinal()];
        if (i2 == 1) {
            i = com.revolut.feature.apm.core.api.R$string.apm_transfer_review_field_to;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.apm.core.api.R$string.apm_transfer_review_field_from;
        }
        int i3 = i;
        BizumContact bizumContactB8 = bizumTransferReviewInfo.B8();
        if (bizumTransferReviewInfo.B8().b()) {
            imageClause = null;
        } else {
            ApmBizum.f61808c.getClass();
            imageClause = new ImageClause(R$drawable.uikit_icn_24_bizum, (Integer) null, fValueOf, fValueOf, 18);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i3, null, null, 14);
        Clause[] elements = {imageClause, new TextClause(bizumContactB8.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        List listK = zhm.v.k(new CellDetailsDelegate.Model("ID_TRANSFER_REVIEW_RECIPIENT_NAME", textLocalisedClause, new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_TRANSFER_REVIEW_RECIPIENT_PHONE", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transfer_review_field_phone, null, null, 14), ((fy1.q) this.f229422a).d(bizumContactB8), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final qv0.i c(BizumTransferData bizumTransferData) {
        if (d0.W(bizumTransferData.d)) {
            return null;
        }
        String str = bizumTransferData.d;
        qv0.i iVarG = ((ppf.d) this.f229423b).g(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transfer_review_field_description, null, null, 14), str, false);
        yp0.b.l(iVarG, 0, 0, 0, 0, null, false, 63);
        return iVarG;
    }
}
