package n9i;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mll.h;
import n4d.a0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f213655b;

    public /* synthetic */ b(f fVar, int i) {
        this.f213654a = i;
        this.f213655b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213654a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186386b;
                return (i9i.d) this.f213655b.d.get("CACHE_KEY_SEARCH" + str);
            default:
                String query = (String) obj2;
                Intrinsics.checkNotNullParameter(query, "query");
                f fVar = this.f213655b;
                return fVar.e.f(new Pair(fVar.f213657a, query), true).map(new a0(new h(query, 21), 26));
        }
    }
}
