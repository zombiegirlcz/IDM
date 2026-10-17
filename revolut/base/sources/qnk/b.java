package qnk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_resend_bottom_sheet.StudentEmailResendBottomSheet;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StudentEmailResendBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(StudentEmailResendBottomSheet studentEmailResendBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = studentEmailResendBottomSheet;
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

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(model.f52613a, "LIST_ID_STUDENT_EMAIL_RESEND")) {
            g gVar = (g) this.v.T.getValue();
            if (((c) ((j2) gVar.f247964q.f22677a).getValue()).f247960a == 0) {
                gVar.A1(new f(gVar, null, 0), new yi5.b(25));
            }
        }
        return Unit.f186387a;
    }
}
