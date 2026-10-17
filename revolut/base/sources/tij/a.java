package tij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb4.t f271538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f271539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wnj.a f271540c;

    public a(tb4.t deviceResolver, q subscriptionsByViewItemsMapper, wnj.a descriptorApplier) {
        Intrinsics.checkNotNullParameter(deviceResolver, "deviceResolver");
        Intrinsics.checkNotNullParameter(subscriptionsByViewItemsMapper, "subscriptionsByViewItemsMapper");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        this.f271538a = deviceResolver;
        this.f271539b = subscriptionsByViewItemsMapper;
        this.f271540c = descriptorApplier;
    }
}
