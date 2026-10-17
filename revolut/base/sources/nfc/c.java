package nfc;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ VatInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VatInputScreen vatInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = vatInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) ((ofc.b) this.v.Z.getValue()).f224801c.get();
        String vat = textData.f52598b.toString();
        i iVar = (i) gVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(vat, "vat");
        iVar.x2(new mll.h(vat, 25));
        return Unit.f186387a;
    }
}
