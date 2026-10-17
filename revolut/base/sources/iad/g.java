package iad;

import cli.y;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceTemplatePreviewContract$InputData;
import hcj.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;
import zjh.i;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final InvoiceTemplatePreviewContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f159994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f159995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f159996r;

    public g(InvoiceTemplatePreviewContract$InputData inputData, i invoiceTemplateInteractor, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invoiceTemplateInteractor, "invoiceTemplateInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f159994p = invoiceTemplateInteractor;
        this.f159995q = new vii.b();
        this.f159996r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f159995q, new o(continuation, this, 18)), null, null, new i13.d(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f159996r;
    }
}
