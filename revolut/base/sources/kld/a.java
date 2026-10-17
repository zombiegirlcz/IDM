package kld;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rkd.f f185419a;

    public a(rkd.f delegatedFactory) {
        Intrinsics.checkNotNullParameter(delegatedFactory, "delegatedFactory");
        this.f185419a = delegatedFactory;
    }

    public final l a(nkd.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        rkd.g gVar = (rkd.g) this.f185419a.f254799a.f251552c;
        return new l(view, gVar.c(), gVar.b(), new n());
    }
}
