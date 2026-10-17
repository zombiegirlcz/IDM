package sxd;

import com.revolut.feature.standingordertopup.impl.ui.model.SuggestionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jmrtd.cbeff.ISO781611;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((nxd.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z zVar = this.v;
        cli.y yVar = zVar.f266458w;
        nxd.a aVar = (nxd.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        qxd.a aVar3 = aVar.f220554b;
        dj0.d dVar = aVar.f220553a;
        int i = u.f266451a[aVar3.ordinal()];
        final int i2 = 1;
        if (i == 1) {
            final SuggestionItem suggestionItem = new SuggestionItem(dVar, true);
            List list = ((g) ((j2) yVar.f22677a).getValue()).e;
            final ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj3 : list) {
                if (((SuggestionItem) obj3).f88197b) {
                    obj3 = suggestionItem;
                }
                arrayList.add(obj3);
            }
            final int i3 = 0;
            zVar.H2(yVar, new Function1() { // from class: sxd.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            return g.a((g) obj4, null, null, null, arrayList, suggestionItem, false, 79);
                        default:
                            return g.a((g) obj4, null, arrayList, suggestionItem, null, null, false, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
                    }
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final SuggestionItem suggestionItem2 = new SuggestionItem(dVar, true);
            List list2 = ((g) ((j2) yVar.f22677a).getValue()).f266427c;
            final ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (Object obj4 : list2) {
                if (((SuggestionItem) obj4).f88197b) {
                    obj4 = suggestionItem2;
                }
                arrayList2.add(obj4);
            }
            zVar.H2(yVar, new Function1() { // from class: sxd.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj42) {
                    switch (i2) {
                        case 0:
                            return g.a((g) obj42, null, null, null, arrayList2, suggestionItem2, false, 79);
                        default:
                            return g.a((g) obj42, null, arrayList2, suggestionItem2, null, null, false, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
                    }
                }
            });
        }
        return Unit.f186387a;
    }
}
