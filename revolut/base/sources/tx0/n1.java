package tx0;

import android.view.View;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarLargeCentred f275207b;

    public /* synthetic */ n1(NavBarLargeCentred navBarLargeCentred, int i) {
        this.f275206a = i;
        this.f275207b = navBarLargeCentred;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f275206a;
        NavBarLargeCentred navBarLargeCentred = this.f275207b;
        switch (i) {
            case 0:
                NavBarLargeCentred.Companion companion = NavBarLargeCentred.INSTANCE;
                fp0.p pVar = navBarLargeCentred.f59289e0;
                fp0.p.b(pVar, true);
                View view = pVar.f137029a;
                or0.m.a(view);
                view.setOnClickListener(new b2(navBarLargeCentred, navBarLargeCentred, 3));
                break;
            case 1:
                NavBarLargeCentred.Companion companion2 = NavBarLargeCentred.INSTANCE;
                fp0.p pVar2 = navBarLargeCentred.f59288d0;
                fp0.p.b(pVar2, true);
                View view2 = pVar2.f137029a;
                or0.m.a(view2);
                view2.setOnClickListener(new b2(navBarLargeCentred, navBarLargeCentred, 4));
                break;
            case 2:
                NavBarLargeCentred.K(navBarLargeCentred, 1);
                break;
            case 3:
                navBarLargeCentred.f59297s.onNext((ActionsView.Item) obj2);
                break;
            default:
                NavBarLargeCentred.K(navBarLargeCentred, 2);
                break;
        }
        return Unit.f186387a;
    }
}
