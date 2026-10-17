package g3k;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import w4l.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3k.c f140300a;

    public a(i3k.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f140300a = repository;
    }

    public final vkm.d a() {
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        i3k.c cVar = this.f140300a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return e.b(cVar.d.e(Unit.f186387a, loadingStrategy));
    }
}
