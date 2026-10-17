package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class th0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166519a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeToActionDelegate f166520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh0 f166521c;
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.wh d;

    public /* synthetic */ th0(SwipeToActionDelegate swipeToActionDelegate, zh0 zh0Var, com.revolut.core.ui_kit.delegates.wh whVar) {
        this.f166520b = swipeToActionDelegate;
        this.f166521c = zh0Var;
        this.d = whVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f166519a;
        com.revolut.core.ui_kit.delegates.wh whVar = this.d;
        zh0 zh0Var = this.f166521c;
        SwipeToActionDelegate swipeToActionDelegate = this.f166520b;
        View view = (View) obj2;
        SwipeToActionDelegate.SwipeAction action = (SwipeToActionDelegate.SwipeAction) obj3;
        switch (i) {
            case 0:
                SwipeToActionDelegate.Companion companion = SwipeToActionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(action, "action");
                if (zh0Var.f.getClickAvailable()) {
                    swipeToActionDelegate.t(zh0Var.f, whVar, action, vh0.CLICK);
                }
                break;
            default:
                SwipeToActionDelegate.Companion companion2 = SwipeToActionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(action, "action");
                swipeToActionDelegate.t(zh0Var.f, whVar, action, vh0.SWIPE);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ th0(zh0 zh0Var, SwipeToActionDelegate swipeToActionDelegate, com.revolut.core.ui_kit.delegates.wh whVar) {
        this.f166521c = zh0Var;
        this.f166520b = swipeToActionDelegate;
        this.d = whVar;
    }
}
