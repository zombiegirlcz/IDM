package h98;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f150194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardRequestReviewScreenContract$InputData f150195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f150196c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h(i iVar, g gVar, BaseScreen baseScreen, CardRequestReviewScreenContract$InputData cardRequestReviewScreenContract$InputData) {
        this.f150196c = iVar;
        this.f150194a = baseScreen;
        this.f150195b = cardRequestReviewScreenContract$InputData;
        int i = 16;
        this.d = e4m.b.b(new h08.e(iVar, this, 0, i));
        this.e = e4m.b.b(new h08.e(iVar, this, 2, i));
        this.f = e4m.b.b(new h08.e(iVar, this, 1, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
