package kx2;

import ang.f;
import ib.b;
import java.util.Map;
import jla.h;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import til.m;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f190374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jvh.a f190375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f190376c;
    public final h d;

    public a(m workflowFlowProvider, jvh.a workflowInteractor, f userInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f190374a = workflowFlowProvider;
        this.f190375b = workflowInteractor;
        this.f190376c = userInteractor;
        this.d = productCatalogueInteractor;
    }

    public static Map a(String str) {
        return r0.k(new Pair(b.Flow, "PRODUCT_ONBOARDING"), new Pair("product", "MULTI_CURRENCY_CARD"), new Pair("country", str), new Pair("identityType", "INDIVIDUAL"));
    }
}
