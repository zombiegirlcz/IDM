package yod;

import kotlin.jvm.internal.Intrinsics;
import lnd.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f315657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f315658b;

    public f(fsd.c totalWealthGroupMapper, thf.c transactionCategoryResourcesMapper, t0 proCategoryGroupMapper) {
        Intrinsics.checkNotNullParameter(totalWealthGroupMapper, "totalWealthGroupMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(proCategoryGroupMapper, "proCategoryGroupMapper");
        this.f315657a = transactionCategoryResourcesMapper;
        this.f315658b = proCategoryGroupMapper;
    }

    public final b a(amd.j jVar) {
        String strName = jVar.f6332a.name();
        return new b(fsd.c.a(jVar.f6332a), Math.abs(mra.d.o0(jVar).f115082a), fsd.c.e(jVar), strName);
    }
}
