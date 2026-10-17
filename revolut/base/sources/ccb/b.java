package ccb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import com.youTransactor.uCube.rpc.Constants;
import cx0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22972b;

    public /* synthetic */ b(View view, int i) {
        this.f22971a = i;
        this.f22972b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f22971a;
        View view = this.f22972b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                e0m.e.a(view);
                return Unit.f186387a;
            case 1:
                ValueAnimator animation = (ValueAnimator) obj2;
                Intrinsics.checkNotNullParameter(animation, "animation");
                Float fB = c.a.b(cx0.c.Companion, animation);
                if (fB != null) {
                    float fFloatValue = fB.floatValue();
                    view.setScaleY(fFloatValue);
                    view.setScaleX(fFloatValue);
                }
                return Unit.f186387a;
            case 2:
                ValueAnimator animation2 = (ValueAnimator) obj2;
                Intrinsics.checkNotNullParameter(animation2, "animation");
                Float fB2 = c.a.b(cx0.c.Companion, animation2);
                if (fB2 != null) {
                    view.setAlpha(fB2.floatValue());
                }
                return Unit.f186387a;
            case 3:
                gq0.d it8 = (gq0.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                it8.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                if (it8 instanceof gq0.b) {
                    return ty0.c.a(jh.d.f(context).b0(), ((gq0.b) it8).f145491a, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                }
                if (it8 instanceof gq0.c) {
                    return ((gq0.c) it8).f145492a;
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                View view2 = (View) obj2;
                Intrinsics.checkNotNullParameter(view2, "view");
                return Boolean.valueOf(view2 != view);
            default:
                KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                e0m.e.a(view);
                return Unit.f186387a;
        }
    }
}
