package sje;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qtb.o;
import s6e.v;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f263711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final myj.e f263712c;

    public b(String itemId, jla.h productCatalogueInteractor, myj.e learnFeatureStateChecker) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(learnFeatureStateChecker, "learnFeatureStateChecker");
        this.f263710a = itemId;
        this.f263711b = productCatalogueInteractor;
        this.f263712c = learnFeatureStateChecker;
    }

    @Override // mf1.a
    public final Flow a() {
        return new v(rd0.e.e(mo3.a.g(rd0.e.b(this.f263712c.b()), null, new sa5.a(25), 1), h0.f322473a, new o(3, 23, (Continuation) null)), this, 7);
    }

    @Override // mf1.a
    public final String b() {
        return "CRYPTO_LEARN";
    }
}
