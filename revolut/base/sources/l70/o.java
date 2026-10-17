package l70;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f192459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f192460b;

    public o(cpi.a dynamicResourceUsageValidation, cpi.a resKeyAsTextResource) {
        Intrinsics.checkNotNullParameter(dynamicResourceUsageValidation, "dynamicResourceUsageValidation");
        Intrinsics.checkNotNullParameter(resKeyAsTextResource, "resKeyAsTextResource");
        this.f192459a = yhm.j.b(dynamicResourceUsageValidation);
        this.f192460b = yhm.j.b(resKeyAsTextResource);
    }
}
