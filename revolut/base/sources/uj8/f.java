package uj8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_profile.impl.ui.junior_account_simple_picker.JuniorAccountSimplePickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAccountSimplePickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JuniorAccountSimplePickerController juniorAccountSimplePickerController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAccountSimplePickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.R.getValue();
        Intrinsics.h(model);
        i iVar = (i) bVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        h35.c cVar = iVar.f280537p;
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.junior_profile.api.models.JuniorProfile");
        com.revolut.feature.junior_profile.api.models.a it8 = (com.revolut.feature.junior_profile.api.models.a) obj3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(it8, "it");
        throw new IllegalStateException("SelectedJuniorHandler not provided");
    }
}
