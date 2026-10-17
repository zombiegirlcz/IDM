package zc0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class t1 extends kotlin.jvm.internal.q implements Function1 {
    public t1(y2 y2Var) {
        super(1, 0, y2.class, y2Var, "handleLargeActionButtonClicks", "handleLargeActionButtonClicks(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)Lio/reactivex/Completable;");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LargeActionButtonDelegate.Model p0 = (LargeActionButtonDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        y2 y2Var = (y2) this.receiver;
        y2Var.getClass();
        pfm.a aVarE = new pfm.a(te0.w.j(p0), new x(27, new a0(y2Var, 6)), 4).e(new pfm.h(new c2i.b(y2Var.f321169r, 3), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
