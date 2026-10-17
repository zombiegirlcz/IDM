package vu0;

import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeToActionLayout f292176b;

    public /* synthetic */ p(SwipeToActionLayout swipeToActionLayout, int i) {
        this.f292175a = i;
        this.f292176b = swipeToActionLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f292175a;
        SwipeToActionLayout swipeToActionLayout = this.f292176b;
        Boolean bool = (Boolean) obj2;
        switch (i) {
            case 0:
                SwipeToActionLayout.Companion companion = SwipeToActionLayout.INSTANCE;
                if (bool.booleanValue()) {
                    swipeToActionLayout.touchController.e = true;
                }
                break;
            default:
                swipeToActionLayout.touchController.d();
                swipeToActionLayout.a(true);
                break;
        }
        return Unit.f186387a;
    }
}
