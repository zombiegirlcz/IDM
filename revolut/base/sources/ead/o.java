package ead;

import cli.y;
import com.revolut.feature.shared.invoices.impl.ui.invoice_preview.InvoicePreviewScreenContract$InputData;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends oki.h implements dli.b {
    public final InvoicePreviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v60.g f124208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f124209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f124210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f124211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f124212t;

    public o(InvoicePreviewScreenContract$InputData inputData, v60.g previewDataProvider, q stateMapper) {
        String strName;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(previewDataProvider, "previewDataProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f124208p = previewDataProvider;
        this.f124209q = new vii.b();
        this.f124210r = new vii.b();
        this.f124211s = new vii.b();
        Set set = inputData.f86423b;
        t9d.d dVar = (t9d.d) d0.c0(set);
        this.f124212t = mra.d.b(this, new f(set, (dVar == null || (strName = dVar.name()) == null) ? "Pdf" : strName, 28), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        InvoicePreviewScreenContract$InputData invoicePreviewScreenContract$InputData = this.o;
        Set set = invoicePreviewScreenContract$InputData.f86423b;
        Set set2 = invoicePreviewScreenContract$InputData.f86423b;
        Continuation continuation = null;
        if (set.contains(t9d.d.Pdf)) {
            yji.l.a1(this, vkm.q.Q(this.f124209q, new m(0, this, continuation)), null, null, new n(0, this, null), 3);
        }
        if (set2.contains(t9d.d.Email)) {
            yji.l.a1(this, vkm.q.Q(this.f124210r, new m(1, this, continuation)), null, null, new n(1, this, null), 3);
        }
        if (set2.contains(t9d.d.Payment)) {
            yji.l.a1(this, vkm.q.Q(this.f124211s, new m(2, this, continuation)), null, null, new n(2, this, null), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f124212t;
    }
}
