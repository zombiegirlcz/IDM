package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Configuration;
import com.revolut.ui_kit_pdf.PdfView;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ CreditPdfDocumentController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditPdfDocumentController creditPdfDocumentController, Continuation continuation) {
        super(2, continuation);
        this.u = creditPdfDocumentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        CreditPdfDocumentController creditPdfDocumentController = this.u;
        CreditPdfDocumentControllerContract$Configuration.Button button = creditPdfDocumentController.L.f67548b.f67541b;
        d dVar = button != null ? button.f67543b : null;
        int i = dVar == null ? -1 : b.f67551a[dVar.ordinal()];
        if (i == -1) {
            int i2 = jli.h.f175850a;
        } else if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i22 = jli.h.f175850a;
        } else {
            PdfView creditPdfDocumentPdfView = creditPdfDocumentController.d3().f10690c;
            Intrinsics.checkNotNullExpressionValue(creditPdfDocumentPdfView, "creditPdfDocumentPdfView");
            View viewI = s.i(creditPdfDocumentPdfView, new Class[]{RecyclerView.class}, null);
            RecyclerView recyclerView = viewI instanceof RecyclerView ? (RecyclerView) viewI : null;
            if (recyclerView != null) {
                recyclerView.smoothScrollBy(0, recyclerView.computeVerticalScrollExtent() + recyclerView.getScrollY());
            }
        }
        return Unit.f186387a;
    }
}
