package u36;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        d dVar = (d) this.receiver;
        KProperty[] kPropertyArr = CeFiToDeFiAssetPickerScreen.R;
        com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a aVar = (com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a) dVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        t36.c cVar = obj4 instanceof t36.c ? (t36.c) obj4 : null;
        if (cVar == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CeFiToDeFiAssetPicker", a0.d.m(obj4, "CeFi to DeFi asset picker row did not contain an asset: "), null, h0Var);
        } else {
            aVar.C2(new c(cVar));
        }
        return Unit.f186387a;
    }
}
