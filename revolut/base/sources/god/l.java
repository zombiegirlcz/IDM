package god;

import aqd.o1;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerContract$Country;
import fvk.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f145148w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f145148w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f145148w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f145148w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        int i = this.u;
        m mVar = this.f145148w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object content = data.getContent();
                List list = content instanceof List ? (List) content : null;
                if (list != null) {
                    ArrayList<h> arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof h) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList = new ArrayList(w.t(arrayList2, 10));
                    for (h hVar : arrayList2) {
                        arrayList.add(new TripsCountryPickerContract$Country(hVar.f145141a, hVar.f145142b));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                mVar.H2(mVar.f145151r, new q((List) arrayList, 12));
                break;
            default:
                Map map = (Map) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.f145151r, new o1(map, 4));
                break;
        }
        return Unit.f186387a;
    }
}
