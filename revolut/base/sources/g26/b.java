package g26;

import eh9.j;
import i26.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import vkm.q;
import w4l.h;
import wkm.l;
import xv5.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f139911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f139912b;

    public b(k repository, c baseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        this.f139911a = repository;
        this.f139912b = baseCurrencyInteractor;
    }

    public static l c(b bVar, String str) {
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(e.b(c.b(bVar.f139912b)), new j((Continuation) null, bVar, str, 9));
    }

    public final l a(String assetId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(e.b(c.b(this.f139912b)), new a(null, this, assetId, loadingStrategy, 0));
    }

    public final l b(String assetId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(e.b(c.b(this.f139912b)), new a(null, this, assetId, loadingStrategy, 1));
    }
}
