package mt0;

import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingBottomBarExpandedView f208714b;

    public /* synthetic */ n(FloatingBottomBarExpandedView floatingBottomBarExpandedView, int i) {
        this.f208713a = i;
        this.f208714b = floatingBottomBarExpandedView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        int i = this.f208713a;
        FloatingBottomBarExpandedView floatingBottomBarExpandedView = this.f208714b;
        FloatingBottomBarExpandedView.ItemDelegate.Model delegateModel = (FloatingBottomBarExpandedView.ItemDelegate.Model) obj2;
        switch (i) {
            case 0:
                return FloatingBottomBarExpandedView.c(floatingBottomBarExpandedView, delegateModel);
            default:
                FloatingBottomBarExpandedView.Companion companion = FloatingBottomBarExpandedView.INSTANCE;
                Intrinsics.checkNotNullParameter(delegateModel, "delegateModel");
                p pVar = floatingBottomBarExpandedView.f57027g;
                Object obj3 = null;
                if (pVar == null || (list = pVar.f208717a) == null) {
                    return null;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(delegateModel.f57029a, ((FloatingBottomBarView.Item) next).f58588a)) {
                            obj3 = next;
                        }
                    }
                }
                return (FloatingBottomBarView.Item) obj3;
        }
    }
}
