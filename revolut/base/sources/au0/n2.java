package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n2 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        NavBarContentCenterView.a((NavBarContentCenterView) this.receiver, p0);
        return Unit.f186387a;
    }
}
