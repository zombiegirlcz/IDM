package gzj;

import hd.r;
import hzj.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements bzj.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f148151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f148152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5h.g f148153c;
    public final mzj.g d;

    public f(j limitItemsMapper, r limitsDataSource, a5h.g limitsPromptDataSource, mzj.g limitsPromptNavigationProvider) {
        Intrinsics.checkNotNullParameter(limitItemsMapper, "limitItemsMapper");
        Intrinsics.checkNotNullParameter(limitsDataSource, "limitsDataSource");
        Intrinsics.checkNotNullParameter(limitsPromptDataSource, "limitsPromptDataSource");
        Intrinsics.checkNotNullParameter(limitsPromptNavigationProvider, "limitsPromptNavigationProvider");
        this.f148151a = limitItemsMapper;
        this.f148152b = limitsDataSource;
        this.f148153c = limitsPromptDataSource;
        this.d = limitsPromptNavigationProvider;
    }
}
