package ox5;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoSortingPickerScreen;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSortingPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoSortingPickerScreen cryptoSortingPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSortingPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVar = (b) this.v.L.getValue();
        Intrinsics.h(model);
        h hVar = (h) bVar;
        cli.y yVar = hVar.o;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        if (Intrinsics.f(model.f53324a, "id_sorting_dialog") && (obj3 instanceof SortingType)) {
            SortingType sortingType = ((a) ((j2) yVar.f22677a).getValue()).f230566a;
            hVar.H2(yVar, new oqk.c(Intrinsics.f(sortingType, obj3) ? sortingType.b() : (SortingType) obj3, 28));
        }
        return Unit.f186387a;
    }
}
