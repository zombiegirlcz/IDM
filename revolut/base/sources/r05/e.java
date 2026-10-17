package r05;

import jla.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q7b.j;
import vkm.q;
import wkm.l;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f250702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f250703b;

    public e(h productCatalogueInteractor, g creditScoreInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(creditScoreInteractor, "creditScoreInteractor");
        this.f250702a = productCatalogueInteractor;
        this.f250703b = creditScoreInteractor;
    }

    public final l a() {
        return q.Q(bla.b.b(this.f250702a, "CREDIT_HEALTH"), new j((Continuation) null, this, 25));
    }
}
