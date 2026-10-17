package y2e;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.store.api.model.StoreMegaOfferListItem;
import com.revolut.feature.store.impl.ui.brands.StoreBrandsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(StoreBrandsScreen storeBrandsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        m2e.b bVar = obj3 instanceof m2e.b ? (m2e.b) obj3 : null;
        if (bVar != null) {
            s sVar = (s) this.v.R2();
            y yVar = sVar.f310658s;
            sVar.f310657r.Z2(bVar);
            Object obj4 = bVar.f201957a;
            String str = obj4 instanceof String ? (String) obj4 : null;
            if (str != null) {
                List list = ((a) ((j2) yVar.f22677a).getValue()).f310632a.f196174a;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    a0.x(((lk0.e) it8.next()).f196171a, arrayList);
                }
                Iterator it9 = arrayList.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (Intrinsics.f(((StoreMegaOfferListItem) next).f88561a, str)) {
                        break;
                    }
                }
                StoreMegaOfferListItem storeMegaOfferListItem = (StoreMegaOfferListItem) next;
                sVar.C2(new b(str, storeMegaOfferListItem != null ? storeMegaOfferListItem.f : null, u3e.e.b(((g2e.c) sVar.f310656q).a(), ((a) ((j2) yVar.f22677a).getValue()).f310633b)));
            }
        }
        return Unit.f186387a;
    }
}
