package b35;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.j;
import qf1.k;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements pf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f12005a;

    public e(a creditApplicationAccountIconProvider, g creditSearchKeywordsMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
        Intrinsics.checkNotNullParameter(creditSearchKeywordsMapper, "creditSearchKeywordsMapper");
        this.f12005a = creditApplicationAccountIconProvider;
    }

    @Override // pf1.a
    public final k a(qf1.d dVar) {
        mp3.g item = (mp3.g) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f12005a.a(item);
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        mp3.g item = (mp3.g) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return g.c(item.f207732b);
    }

    @Override // pf1.a
    public final j c(qf1.d dVar) {
        mp3.g item = (mp3.g) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f12005a.c(item);
    }
}
