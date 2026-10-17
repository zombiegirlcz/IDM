package a9a;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.InputAliasScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InputAliasScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputAliasScreen inputAliasScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inputAliasScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PhoneEditorDelegate.PhoneData phoneData = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) this.v.e3()).K2(phoneData.f52896b);
        return Unit.f186387a;
    }
}
