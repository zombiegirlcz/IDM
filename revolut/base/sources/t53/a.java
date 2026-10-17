package t53;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q53.c;
import vkm.d;
import w4l.k;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz5.a f268036a;

    public a(xz5.a tipsRepository) {
        Intrinsics.checkNotNullParameter(tipsRepository, "tipsRepository");
        this.f268036a = tipsRepository;
    }

    public final d a(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c cVar = (c) this.f268036a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return cVar.d.b(Unit.f186387a, loadingStrategy);
    }
}
