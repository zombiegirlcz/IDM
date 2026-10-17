package y67;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreenContract$InputData;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitReviewScreenContract$InputData f311213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f311214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f311215c;
    public final e4m.e d;

    public c(d dVar, DirectDebitReviewScreenContract$InputData directDebitReviewScreenContract$InputData) {
        this.f311214b = dVar;
        this.f311213a = directDebitReviewScreenContract$InputData;
        int i = 8;
        this.f311215c = e4m.b.b(new q(dVar, this, 1, i));
        this.d = e4m.b.b(new q(dVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
