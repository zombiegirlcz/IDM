package neg;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c f214526b;

    public /* synthetic */ p(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar, int i) {
        this.f214525a = i;
        this.f214526b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214525a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ((l80.f) this.f214526b.f94037t).getClass();
                return l.a(update, null, null, null, null, null, null, null, null, null, false, null, System.currentTimeMillis(), 2047);
            default:
                Data data = (Data) obj2;
                if (data.getContent() == null && data.getError() == null) {
                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar = this.f214526b;
                    cVar.H2(cVar.f94039x, new nci.q(data, 2));
                }
                return Unit.f186387a;
        }
    }
}
