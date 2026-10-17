package ynk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_status.StudentStatusScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import ynk.e;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StudentStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StudentStatusScreen studentStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = studentStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.P.getValue();
        Intrinsics.h(model);
        i iVar = (i) fVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "still_a_student_row")) {
            iVar.C2(e.c.f315499a);
        } else if (Intrinsics.f(str, "not_a_student_row")) {
            iVar.C2(e.b.f315498a);
        }
        return Unit.f186387a;
    }
}
