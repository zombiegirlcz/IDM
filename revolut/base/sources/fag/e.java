package fag;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f133317b;

    public /* synthetic */ e(i iVar, int i) {
        this.f133316a = i;
        this.f133317b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f133316a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                z9g.d dVar = (z9g.d) j6.a.k(z9g.d.class, this.f133317b.f133331b, "TRAVEL_HOTELS_AVAILABILITY_FILTERS");
                if (dVar != null) {
                    return j9g.p.a(dVar);
                }
                return null;
            case 1:
                b params = (b) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (o9g.a) this.f133317b.f133332c.get(i.a(params));
            case 2:
                zfi.c filtersLists = (zfi.c) obj2;
                Intrinsics.checkNotNullParameter(filtersLists, "filtersLists");
                ArrayList arrayList = filtersLists.f321957b;
                i iVar = this.f133317b;
                iVar.getClass();
                ufm.c cVar = new ufm.c(new g(iVar, arrayList, 0), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return te0.w.i0(cVar);
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (zfi.c) this.f133317b.f133332c.get("TRAVEL_HOTELS_AVAILABILITY_FILTERS");
        }
    }
}
