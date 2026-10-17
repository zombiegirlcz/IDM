package bt6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubTransactionExportReviewScreenContract$InputData f18291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f18292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.i f18293c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a0(b bVar, y yVar, TaxHubTransactionExportReviewScreenContract$InputData taxHubTransactionExportReviewScreenContract$InputData, thf.c cVar, thf.i iVar) {
        this.f18291a = taxHubTransactionExportReviewScreenContract$InputData;
        this.f18292b = cVar;
        this.f18293c = iVar;
        int i = 17;
        this.d = e4m.b.b(new afj.d(bVar, yVar, this, 1, i));
        this.e = e4m.b.b(new afj.d(bVar, yVar, this, 0, i));
        this.f = e4m.b.b(new afj.d(bVar, yVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
