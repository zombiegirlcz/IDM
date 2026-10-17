package egg;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pig.l;
import pig.m;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a f125639b;

    public /* synthetic */ d(com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a aVar, int i) {
        this.f125638a = i;
        this.f125639b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yvh.b bVar;
        switch (this.f125638a) {
            case 0:
                m result = (m) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a aVar = this.f125639b;
                i iVar = (i) ((b) ((j2) aVar.f94204r.f22677a).getValue()).f125637a.getContent();
                boolean z = ((iVar == null || iVar.d()) && (iVar == null || (bVar = (yvh.b) iVar.f224257a) == null || bVar.f317177b)) ? false : true;
                if (!(result instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                l lVar = (l) result;
                yji.l.b1(aVar, aVar.X1(((tig.d) aVar.o).b(lVar.f236488a, lVar.f236489b, lVar.f236490c, z ? tig.a.WITH_SPARE_CHANGE : tig.a.WITH_SUCCESS_DESCRIPTION, lVar.d)), null, new an8.a(result, z, aVar, (Continuation) null, 2), 3);
                return Unit.f186387a;
            case 1:
                this.f125639b.B2();
                return Unit.f186387a;
            default:
                this.f125639b.B2();
                return Unit.f186387a;
        }
    }
}
