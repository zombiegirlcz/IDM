package i8e;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubAccountEditNameScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SubAccountEditNameScreen subAccountEditNameScreen, Continuation continuation) {
        super(2, continuation);
        this.v = subAccountEditNameScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.P.getValue();
        Intrinsics.h(textData);
        k kVar = (k) bVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        String string = textData.f52598b.toString();
        kVar.H2(kVar.f159524q, new gae.a(textData, !d0.W(string) && string.length() <= 40, 13));
        return Unit.f186387a;
    }
}
