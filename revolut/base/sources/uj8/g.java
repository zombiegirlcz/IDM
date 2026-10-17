package uj8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_profile.impl.ui.junior_account_simple_picker.JuniorAccountSimplePickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ JuniorAccountSimplePickerController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JuniorAccountSimplePickerController juniorAccountSimplePickerController, Continuation continuation) {
        super(2, continuation);
        this.u = juniorAccountSimplePickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((i) ((b) this.u.R.getValue())).f280539r.a();
        return Unit.f186387a;
    }
}
