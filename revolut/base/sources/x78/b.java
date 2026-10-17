package x78;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior.accounts.impl.ui.pocket_picker.JuniorPocketChildPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorPocketChildPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorPocketChildPickerScreen juniorPocketChildPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorPocketChildPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.P.getValue();
        Intrinsics.h(model);
        k kVar = (k) gVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "ADD_NEW_CHILD_ID")) {
            kVar.C2(d.f303164a);
        } else {
            kVar.n2(new wtj.f(kVar, str, null, 25), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
