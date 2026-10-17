package ip0;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class uh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeToActionDelegate f166666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.wh f166667c;

    public /* synthetic */ uh0(SwipeToActionDelegate swipeToActionDelegate, com.revolut.core.ui_kit.delegates.wh whVar, int i) {
        this.f166665a = i;
        this.f166666b = swipeToActionDelegate;
        this.f166667c = whVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f166665a;
        com.revolut.core.ui_kit.delegates.wh whVar = this.f166667c;
        SwipeToActionDelegate swipeToActionDelegate = this.f166666b;
        switch (i) {
            case 0:
                SwipeToActionDelegate.Companion companion = SwipeToActionDelegate.INSTANCE;
                com.revolut.core.ui_kit.delegates.xh xhVar = new com.revolut.core.ui_kit.delegates.xh(whVar.f54925b);
                swipeToActionDelegate.f53503g.onNext(xhVar);
                SwipeToActionDelegate.INSTANCE.getClass();
                ((ihm.f) SwipeToActionDelegate.f53502j.getValue()).onNext(xhVar);
                break;
            default:
                SwipeToActionDelegate.Companion companion2 = SwipeToActionDelegate.INSTANCE;
                com.revolut.core.ui_kit.delegates.yh yhVar = new com.revolut.core.ui_kit.delegates.yh(whVar.f54925b);
                swipeToActionDelegate.f53503g.onNext(yhVar);
                SwipeToActionDelegate.INSTANCE.getClass();
                ((ihm.f) SwipeToActionDelegate.f53502j.getValue()).onNext(yhVar);
                break;
        }
        return Unit.f186387a;
    }
}
