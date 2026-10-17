package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Document;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v94.k;
import v94.l;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPdfDocumentControllerContract$InputData f67559a;

    public h(CreditPdfDocumentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f67559a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listC;
        v94.g domainState = (v94.g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = this.f67559a;
        CreditPdfDocumentControllerContract$Configuration creditPdfDocumentControllerContract$Configuration = creditPdfDocumentControllerContract$InputData.f67548b;
        List list = (List) iii.c.f(domainState.f286975a, new v80.a(6), new v78.d(4), new uw2.n(13));
        Clause clause = creditPdfDocumentControllerContract$Configuration.f67540a;
        CreditPdfDocumentControllerContract$Configuration.Button button = creditPdfDocumentControllerContract$Configuration.f67541b;
        Clause clause2 = button != null ? button.f67542a : null;
        CreditPdfDocumentControllerContract$Document creditPdfDocumentControllerContract$Document = creditPdfDocumentControllerContract$InputData.f67549c;
        if (creditPdfDocumentControllerContract$Document instanceof CreditPdfDocumentControllerContract$Document.Local) {
            listC = f0.f322471a;
        } else {
            if (!(creditPdfDocumentControllerContract$Document instanceof CreditPdfDocumentControllerContract$Document.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_DOWNLOAD_ACTION", new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
        }
        return new k(list, clause, clause2, listC, (File) domainState.f286975a.getContent());
    }
}
