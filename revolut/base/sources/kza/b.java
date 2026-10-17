package kza;

import efm.r;
import jli.f;
import kotlin.jvm.internal.Intrinsics;
import mza.i;
import pza.g;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pza.a f191082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f191083b;

    public b(pza.a repository, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f191082a = repository;
        this.f191083b = languageProvider;
    }

    public final r a(i requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        mza.c requestParams2 = new mza.c(requestParams, ((s80.b) this.f191083b).b());
        g gVar = (g) this.f191082a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
        r map = gVar.e.f(requestParams2, true).map(new pv9.b(new f(26), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
