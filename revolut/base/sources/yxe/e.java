package yxe;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.edit_label.EditStoredMethodLabelScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yui.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditStoredMethodLabelScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EditStoredMethodLabelScreen editStoredMethodLabelScreen, Continuation continuation) {
        super(2, continuation);
        this.v = editStoredMethodLabelScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.R2();
        String text = textData.f52598b.toString();
        m mVar = (m) gVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        mVar.H2(mVar.f317676r, new v(text, 4));
        return Unit.f186387a;
    }
}
