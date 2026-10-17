package la8;

import cli.y;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l9k.v;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorIsaAddPhoneNumberScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorIsaAddPhoneNumberScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PhoneEditorDelegate.PhoneData data = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarE3 = this.v.R2();
        Intrinsics.h(data);
        com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a aVar2 = (com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) fVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        z80.b bVar = aVar2.f76771p;
        String str = data.f52896b;
        y yVar = aVar2.f76776w;
        String strG = bVar.g(str, ((e) ((j2) yVar.f22677a).getValue()).f193346a);
        if (strG != null) {
            str = strG;
        }
        if (!str.equals(((e) ((j2) yVar.f22677a).getValue()).f193347b)) {
            aVar2.H2(yVar, new v(str, aVar2, 2));
        }
        return Unit.f186387a;
    }
}
