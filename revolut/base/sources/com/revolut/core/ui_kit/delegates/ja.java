package com.revolut.core.ui_kit.delegates;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.PdfDelegate;
import com.revolut.ui_kit_pdf.PdfView;
import ip0.k00;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ja extends koi.b {
    public final ihm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PdfView f54326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f54327h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f54328j;
    public float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(View itemView, ihm.b onStateChangeSubject) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onStateChangeSubject, "onStateChangeSubject");
        this.f = onStateChangeSubject;
        View viewFindViewById = itemView.findViewById(R$id.delegatePdf_pdfView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f54326g = (PdfView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.delegatePdf_overlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54327h = viewFindViewById2;
        this.i = -1;
        this.k = 1.0f;
        viewFindViewById2.setOnTouchListener(new gzl.b(this, 2));
    }

    public final void F(ga data) {
        Intrinsics.checkNotNullParameter(data, "data");
        PdfView pdfView = this.f54326g;
        ha haVar = data.f54210b;
        pdfView.setVisibility(0);
        ha haVar2 = data.f54210b;
        Pair pair = new Pair(data, PdfDelegate.b.C0416b.f52892a);
        ihm.b bVar = this.f;
        bVar.onNext(pair);
        this.f54326g.a(new k00(this, data, 0)).d(new File(haVar2.f54238a));
        this.f54326g.setVisibility(0);
        bVar.onNext(new Pair(data, PdfDelegate.b.a.f52891a));
    }
}
