package gi1;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AddAddressScreen addAddressScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.address.common.impl.flow.screen.add.a aVar2 = (com.revolut.feature.address.common.impl.flow.screen.add.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        String string = d0.J0(text).toString();
        y yVar = aVar2.C;
        Pair pair = Intrinsics.f(listId, "POSTAL_CODE_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.f263347b, new o(aVar2, 3)) : Intrinsics.f(listId, "STREET_LINE_1_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.k, new o(aVar2, 7)) : Intrinsics.f(listId, "STREET_LINE_2_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.f263352l, new o(aVar2, 13)) : Intrinsics.f(listId, "STREET_NAME_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.f263349g, new o(aVar2, 14)) : Intrinsics.f(listId, "HOUSE_NUMBER_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.f263350h, new o(aVar2, 15)) : Intrinsics.f(listId, "HOUSE_NAME_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.i, new o(aVar2, 16)) : Intrinsics.f(listId, "FLAT_NUMBER_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.f263351j, new o(aVar2, 17)) : Intrinsics.f(listId, "CITY_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.f263348c, new o(aVar2, 18)) : Intrinsics.f(listId, "REGION_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.d, new o(aVar2, 19)) : Intrinsics.f(listId, "NEIGHBOURHOOD_ID") ? new Pair(((k) ((j2) yVar.f22677a).getValue()).f144028a.e, new o(aVar2, 0)) : null;
        if (pair != null) {
            sh1.g gVar = (sh1.g) pair.f186385a;
            Function1 function1 = (Function1) pair.f186386b;
            if (!Intrinsics.f(gVar.f263344a, string)) {
                function1.invoke(string);
            }
        }
        return Unit.f186387a;
    }
}
