package ruk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        j jVar = (j) this.receiver;
        KProperty[] kPropertyArr = AnalystDetailsScreen.X;
        t tVar = (t) jVar;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        tVar.v.b(((i) tVar.t2()).f257599a);
        return Unit.f186387a;
    }
}
