package u36;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        d dVar = (d) this.receiver;
        KProperty[] kPropertyArr = CeFiToDeFiAssetPickerScreen.R;
        com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a aVar = (com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a) dVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "CeFiToDeFiAssetPicker_SearchEmpty")) {
            aVar.H2(aVar.f71747r, new u21.b(17));
        } else {
            aVar.f71746q.a();
        }
        return Unit.f186387a;
    }
}
