package ot8;

import kotlin.jvm.internal.Intrinsics;
import my8.r;
import vkm.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f229570a;

    public a(c kycDocsRepository) {
        Intrinsics.checkNotNullParameter(kycDocsRepository, "kycDocsRepository");
        this.f229570a = kycDocsRepository;
    }

    public final d a(r scope, wi0.b bVar, String str, wi0.b bVar2, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        c cVar = this.f229570a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        return cVar.f229576c.c(new b(bVar, scope, str, bVar2), z);
    }
}
