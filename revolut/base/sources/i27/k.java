package i27;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b f157884b;

    public /* synthetic */ k(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar, int i) {
        this.f157883a = i;
        this.f157884b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157883a) {
            case 0:
                v17.l it8 = (v17.l) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f157884b.I2(new j(it8, 0));
                return Unit.f186387a;
            default:
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a aVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) obj2;
                tad.a aVar2 = ((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) ((j2) this.f157884b.f74195r.f22677a).getValue()).f74190a;
                boolean z = aVar2.f269306b;
                Data data = aVar2.f269307c;
                Intrinsics.checkNotNullParameter(data, "data");
                return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.a(aVar, new tad.a(data, true, z), null, null, false, false, 30);
        }
    }
}
