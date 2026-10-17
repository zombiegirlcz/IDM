package jt1;

import aw0.j8;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.transfer.core.models.FundingSource;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.i f178290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lt1.c f178291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yof.d f178292c;

    public p(lx1.i apmRecipientMapper, lt1.c amountItemsMapper, yof.d transferAmountMapper) {
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(amountItemsMapper, "amountItemsMapper");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        this.f178290a = apmRecipientMapper;
        this.f178291b = amountItemsMapper;
        this.f178292c = transferAmountMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        char c2;
        f3 f3Var;
        String str;
        bw0.m mVarD;
        Clause clauseJ;
        ApmQuoteCharges apmQuoteCharges;
        ApmQuoteCharges apmQuoteCharges2;
        bw0.m mVarC;
        TextClause textClause;
        List listK;
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BizumTransferData transferData = domainState.f178275c;
        b extraData = domainState.d;
        if (transferData == null) {
            listK = ((ppf.c) this.f178292c).f();
            textClause = null;
        } else {
            hrf.f direction = domainState.f178274b;
            int i = domainState.e;
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            Intrinsics.checkNotNullParameter(direction, "direction");
            dj0.d f72729b = transferData.getF72729b();
            FundingSource fundingSource = transferData.f61631a;
            xi0.b bVar = f72729b.f115083b;
            lt1.c cVar = this.f178291b;
            String strD = cVar.f199782c.d(f72729b.f115082a, bVar.f306286a);
            String string = u80.o.b(new u80.g(f72729b, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
            ppf.c cVar2 = (ppf.c) cVar.f199780a;
            List list = cVar2.f238600b;
            ldd.b bVar2 = cVar.d;
            boolean zA = bVar2.a("ITEM_AMOUNT_INPUT_ID");
            boolean zC = bVar2.c(i, "ITEM_AMOUNT_INPUT_ID");
            List list2 = extraData.d;
            hrf.h hVar = extraData.f178278c;
            bw0.h hVar2 = new bw0.h(strD, string, (TextClause) null, true, list, Boolean.valueOf(zA), list2, false, false, zC, false, (bw0.e) null, (Clause) null, false, 32132);
            PaymentPocketInfo paymentPocketInfoF = extraData.f178277b;
            if (paymentPocketInfoF == null) {
                paymentPocketInfoF = ((yt9.g) cVar.f199781b).f(fundingSource, transferData.f61633c);
            }
            boolean zA2 = hVar.a();
            yqi.b bVar3 = hVar.f154819c;
            h3 h3Var = zA2 ? h3.ERROR : h3.ACTIVE;
            int i2 = lt1.b.f199779a[direction.ordinal()];
            if (i2 == 1) {
                Image image = paymentPocketInfoF.f79169a;
                c2 = 1;
                Clause clause = paymentPocketInfoF.f79170b;
                Clause clause2 = paymentPocketInfoF.f79171c;
                boolean z = transferData.e;
                f3Var = new f3(image, clause, clause2, z, h3Var, z);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c2 = 1;
                f3Var = null;
            }
            if (transferData.f61632b == 0) {
                mVarC = cVar2.d();
            } else if (bVar3 != null) {
                mVarC = cVar2.c(bVar3);
            } else {
                boolean zD = transferData.d();
                ApmQuote apmQuote = extraData.f178276a;
                char c3 = ((apmQuote == null || (apmQuoteCharges2 = apmQuote.d) == null) ? null : apmQuoteCharges2.f62222a) != null ? c2 : (char) 0;
                if (zD) {
                    if (apmQuote == null) {
                        str = "transferData";
                    } else {
                        dj0.d dVar = apmQuote.f62211c;
                        str = "transferData";
                        if (dVar.f115082a != 0) {
                            ApmQuoteCharges apmQuoteCharges3 = apmQuote.d;
                            dj0.d dVar2 = apmQuoteCharges3 != null ? apmQuoteCharges3.f62222a : null;
                            clauseJ = cVar2.b(pyd.c.O(dVar, dVar2), (dVar2 != null ? dVar2.f115082a : 0L) > 0 ? c2 : 0);
                        }
                    }
                    clauseJ = null;
                } else {
                    str = "transferData";
                    if (c3 != 0) {
                        clauseJ = cVar2.j((apmQuote == null || (apmQuoteCharges = apmQuote.d) == null) ? null : apmQuoteCharges.f62222a, fundingSource.f92241b);
                    } else {
                        mVarD = cVar2.d();
                        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, hVar2, f3Var, mVarD, null, null, false, false, new yof.b(bVar, bVar3), null, 1506);
                        int i3 = domainState.e;
                        Intrinsics.checkNotNullParameter(transferData, str);
                        textClause = null;
                        InputTextDelegate.Model modelA = yof.d.a(cVar.f199780a, transferData.d, new TextLocalisedClause(R$string.apm_transfer_amount_note_placeholder, null, null, 14), 35, i3, false, null, null, null, 240);
                        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                        koi.j[] jVarArr = new koi.j[2];
                        jVarArr[0] = model;
                        jVarArr[c2] = modelA;
                        listK = zhm.v.k(jVarArr);
                    }
                }
                mVarD = new bw0.m(clauseJ, bw0.l.INFO, cVar2.e(false), true, null);
                CenteredAmountDelegate.Model model2 = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, hVar2, f3Var, mVarD, null, null, false, false, new yof.b(bVar, bVar3), null, 1506);
                int i32 = domainState.e;
                Intrinsics.checkNotNullParameter(transferData, str);
                textClause = null;
                InputTextDelegate.Model modelA2 = yof.d.a(cVar.f199780a, transferData.d, new TextLocalisedClause(R$string.apm_transfer_amount_note_placeholder, null, null, 14), 35, i32, false, null, null, null, 240);
                yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
                koi.j[] jVarArr2 = new koi.j[2];
                jVarArr2[0] = model2;
                jVarArr2[c2] = modelA2;
                listK = zhm.v.k(jVarArr2);
            }
            mVarD = mVarC;
            str = "transferData";
            CenteredAmountDelegate.Model model22 = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, hVar2, f3Var, mVarD, null, null, false, false, new yof.b(bVar, bVar3), null, 1506);
            int i322 = domainState.e;
            Intrinsics.checkNotNullParameter(transferData, str);
            textClause = null;
            InputTextDelegate.Model modelA22 = yof.d.a(cVar.f199780a, transferData.d, new TextLocalisedClause(R$string.apm_transfer_amount_note_placeholder, null, null, 14), 35, i322, false, null, null, null, 240);
            yp0.b.l(modelA22, 0, 0, 0, 0, null, false, 63);
            koi.j[] jVarArr22 = new koi.j[2];
            jVarArr22[0] = model22;
            jVarArr22[c2] = modelA22;
            listK = zhm.v.k(jVarArr22);
        }
        BizumContact contact = domainState.f178273a;
        TextClause textClause2 = new TextClause(contact.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        fy1.q qVar = (fy1.q) this.f178290a;
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new h(listK, new j8(textClause2, !Intrinsics.f(contact.x0(), contact.getDisplayName()) ? qVar.b(contact) : textClause, qVar.c(contact), qVar.a(contact), 16), extraData.f178278c.b());
    }
}
