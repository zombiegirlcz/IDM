package xcd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ucd.b;
import vkm.d;
import w4l.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f304111a;

    public a(b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f304111a = repository;
    }

    public final d a(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b bVar = this.f304111a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return bVar.d.b(Unit.f186387a, loadingStrategy);
    }
}
