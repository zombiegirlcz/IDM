package ish;

import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gsh.a0 f168252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f168253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f168254c;

    public a0(gsh.a0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f168252a = repository;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.f168253b = vkm.q.a(0, 1, fVar);
        this.f168254c = vkm.q.a(0, 1, fVar);
    }

    public final void a(dsh.o widgetIdAndContext) {
        Intrinsics.checkNotNullParameter(widgetIdAndContext, "widgetIdAndContext");
        this.f168253b.k(widgetIdAndContext);
    }
}
