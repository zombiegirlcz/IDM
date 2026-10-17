package unk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_hide_bottom_sheet.HideStudentBottomSheet;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import unk.d;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HideStudentBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HideStudentBottomSheet hideStudentBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = hideStudentBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(model.f52613a, "LIST_ID_HIDE_STUDENT_BUTTON")) {
            ((f) ((e) this.v.U.getValue())).C2(d.a.f281456a);
        }
        return Unit.f186387a;
    }
}
