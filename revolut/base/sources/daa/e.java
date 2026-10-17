package daa;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.PixCopyPasteCodeInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixCopyPasteCodeInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixCopyPasteCodeInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(model.f53531a, "USE_KEY_BUTTON_ID")) {
            this.v.R2().C2(h.f112500a);
        }
        return Unit.f186387a;
    }
}
