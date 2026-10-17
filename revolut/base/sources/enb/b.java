package enb;

import ip0.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f127789b;

    public /* synthetic */ b(g gVar, int i) {
        this.f127788a = i;
        this.f127789b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f127788a) {
            case 0:
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                Long l2 = (Long) j6.a.k(Long.TYPE, this.f127789b.f127799c, key);
                return Long.valueOf(l2 != null ? l2.longValue() : 0L);
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f127789b.f127798b.get("CACHE_KEY_TAX_FORMS");
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) v7.r("CACHE_KEY_STATEMENT_OPTIONS", g.d(it8), this.f127789b.f127798b);
        }
    }
}
