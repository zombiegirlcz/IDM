package hc5;

import kc5.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.d;
import w4l.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f150853a;

    public a(b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f150853a = repository;
    }

    public final d a(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b bVar = this.f150853a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return bVar.d.b(Unit.f186387a, loadingStrategy);
    }
}
