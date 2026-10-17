package com.revolut.feature.credit.loan.impl.ui.rev10.documents.section;

import aim.e;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocument;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionControllerContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w65.g;
import w65.i;
import yp0.b;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDocumentSectionControllerContract$InputData.PaymentReceipts f70423a;

    public a(LoanDocumentSectionControllerContract$InputData.PaymentReceipts inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f70423a = inputData;
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        List<LoanDocument> listP0 = d0.P0(list, new i());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (LoanDocument loanDocument : listP0) {
            String str = loanDocument.f70153a;
            TextClause textClause = new TextClause(loanDocument.f70154b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = loanDocument.f70155c;
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textClause, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, loanDocument, null, 0, 0, 0, 0, 532676568));
        }
        b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_documents_mortgage_payment_receipts_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_documents_mortgage_payment_receipts_subtitle, null, null, 14);
        e eVarB = u.b();
        LoanDocumentSectionControllerContract$InputData.PaymentReceipts paymentReceipts = this.f70423a;
        eVarB.addAll(a(paymentReceipts.f70421a));
        eVarB.addAll(a(paymentReceipts.f70422b));
        return new g(u.a(eVarB), textLocalisedClause, textLocalisedClause2);
    }
}
