package icd;

import gcd.g;
import kotlin.jvm.internal.Intrinsics;
import vkm.d;
import w4l.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f160245a;

    public a(g repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f160245a = repository;
    }

    public final d a(String productId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = this.f160245a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.f.b(productId, loadingStrategy);
    }
}
