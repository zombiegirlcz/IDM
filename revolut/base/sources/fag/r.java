package fag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f133366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f133367b;

    public r(ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f133366a = memoryCache;
        this.f133367b = v0.a.d("create(...)");
    }

    public final pfm.h a(afi.a draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        pfm.h hVar = new pfm.h(new f0d.m(this, draft, 3), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final efm.k b(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        afi.a aVar = (afi.a) this.f133366a.get(draftId);
        if (aVar != null) {
            return efm.k.g(aVar);
        }
        rfm.h hVar = rfm.h.f253943a;
        Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
        return hVar;
    }
}
