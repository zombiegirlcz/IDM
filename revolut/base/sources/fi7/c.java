package fi7;

import cli.y;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionFilterValue;
import com.revolut.feature.instruments.trend.collections.impl.R$string;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsTrendCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InstrumentsTrendCollectionController instrumentsTrendCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsTrendCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        List list;
        Object next;
        int i;
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(item);
        com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar2 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) hVarE3;
        y yVar = aVar2.f74919y;
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.f58324n;
        ph7.b bVar = obj3 instanceof ph7.b ? (ph7.b) obj3 : null;
        if (bVar != null && (data = ((j) ((j2) yVar.f22677a).getValue()).f135324b) != null && (list = (List) data.getContent()) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((ph7.a) next).f236231a == bVar) {
                    break;
                }
            }
            ph7.a filter = (ph7.a) next;
            if (filter != null) {
                ph7.b bVar2 = filter.f236231a;
                j60.a aVar3 = aVar2.o;
                ii7.b bVar3 = aVar2.f74913q;
                InstrumentsTrendCollectionFilterValue selectedValue = (InstrumentsTrendCollectionFilterValue) r0.h(bVar, ((j) ((j2) yVar.f22677a).getValue()).f135325c);
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
                int i2 = ii7.a.f161587a[bVar2.ordinal()];
                if (i2 == 1) {
                    i = R$string.instruments_trend_collections_asset_type;
                } else if (i2 == 2) {
                    i = R$string.instruments_trend_collections_filter;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.instruments_trend_collections_timeframe;
                }
                rp0.t tVar = new rp0.t(new TextLocalisedClause(i, null, null, 14), null, null, 30);
                List<InstrumentsTrendCollectionFilterValue> list2 = filter.f236232b;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue : list2) {
                    arrayList.add(new SingleChoiceDelegate.Model("INSTRUMENTS_TREND_COLLECTION_FILTER_" + instrumentsTrendCollectionFilterValue, ii7.b.b(instrumentsTrendCollectionFilterValue), Intrinsics.f(instrumentsTrendCollectionFilterValue, selectedValue), null, new k(bVar2, instrumentsTrendCollectionFilterValue), YearClass.CLASS_2008));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                aVar3.x(new rp0.y(arrayList, tVar, rp0.l.WINDOW, null, null, null, 1016));
            }
        }
        return Unit.f186387a;
    }
}
