package hea;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) obj2;
        p pVar = (p) this.receiver;
        KProperty[] kPropertyArr = PocketDetailsScreen.f80841e0;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar.J2(model.f53337a);
        return Unit.f186387a;
    }
}
