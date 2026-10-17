package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReviewTrustedAccountScreenContract$InputData f233898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f233899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233900c;

    public b1(d0 d0Var, n nVar, ReviewTrustedAccountScreenContract$InputData reviewTrustedAccountScreenContract$InputData) {
        this.f233899b = nVar;
        this.f233898a = reviewTrustedAccountScreenContract$InputData;
        this.f233900c = e4m.b.b(new p2k.c(d0Var, this, 13));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233899b.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
