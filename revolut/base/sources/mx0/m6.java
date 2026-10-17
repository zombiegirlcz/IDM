package mx0;

import android.content.res.Configuration;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingBottomBarView f209837b;

    public /* synthetic */ m6(FloatingBottomBarView floatingBottomBarView, int i) {
        this.f209836a = i;
        this.f209837b = floatingBottomBarView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f209836a;
        FloatingBottomBarView floatingBottomBarView = this.f209837b;
        switch (i) {
            case 0:
                FloatingBottomBarView.b bVar = FloatingBottomBarView.Companion;
                floatingBottomBarView.q(((FloatingBottomBarView.Item) obj2).f58588a, false, true, false);
                return Unit.f186387a;
            default:
                return FloatingBottomBarView.c(floatingBottomBarView, (Configuration) obj2);
        }
    }
}
