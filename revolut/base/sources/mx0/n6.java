package mx0;

import android.view.View;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingBottomBarView f209856b;

    public /* synthetic */ n6(FloatingBottomBarView floatingBottomBarView, int i) {
        this.f209855a = i;
        this.f209856b = floatingBottomBarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ro0.p pVar;
        switch (this.f209855a) {
            case 0:
                View view = this.f209856b.f58577l;
                return Integer.valueOf(view != null ? view.getHeight() : 0);
            case 1:
                return this.f209856b.f58577l;
            case 2:
                mt0.j jVar = this.f209856b.D;
                if (jVar != null && (pVar = jVar.d) != null) {
                    pVar.b();
                }
                return Unit.f186387a;
            default:
                return this.f209856b.f58579n;
        }
    }
}
