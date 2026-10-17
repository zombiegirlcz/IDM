package m15;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import czi.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WrapperFlowImpl f201234b;

    public /* synthetic */ a(WrapperFlowImpl wrapperFlowImpl, int i) {
        this.f201233a = i;
        this.f201234b = wrapperFlowImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f201233a;
        WrapperFlowImpl wrapperFlowImpl = this.f201234b;
        switch (i) {
            case 0:
                int i2 = b.f201235a;
                AnimatedBackgroundView animatedBackgroundView = new AnimatedBackgroundView(wrapperFlowImpl.m2(), null, 6, 0);
                animatedBackgroundView.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
                View viewD2 = wrapperFlowImpl.D2();
                ViewGroup viewGroup = viewD2 instanceof ViewGroup ? (ViewGroup) viewD2 : null;
                if (viewGroup != null) {
                    viewGroup.addView(animatedBackgroundView, 0, new ViewGroup.LayoutParams(-1, -1));
                }
                return Unit.f186387a;
            default:
                return c.d(0, 6, null, wrapperFlowImpl, wrapperFlowImpl.L);
        }
    }
}
