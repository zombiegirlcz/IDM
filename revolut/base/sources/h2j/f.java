package h2j;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import com.revolut.retail.feature.balance.picker.impl.new_picker.currency.CurrencyChooserScreen;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreen;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreenContract$Step;
import ip0.y;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DualChooserScreen f148826w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(DualChooserScreen dualChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f148826w = dualChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f148826w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f148826w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DualChooserScreen dualChooserScreen = this.f148826w;
        switch (i) {
            case 0:
                y model = (y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = dualChooserScreen.R2();
                Intrinsics.h(model);
                com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar2 = (com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) kVarE3;
                DualChooserContract$InputData dualChooserContract$InputData = aVar2.o;
                cli.y yVar = aVar2.E;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f167226b.f58324n;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                xi0.b bVar = (xi0.b) obj3;
                xi0.b.Companion.getClass();
                Continuation continuation = null;
                if (bVar.equals(xi0.b.f306271c)) {
                    Set set = dualChooserContract$InputData.f99495j;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : set) {
                        if (obj4 instanceof DualChooserContract$ExtraConfiguration.DeFiCurrencies) {
                            arrayList.add(obj4);
                        }
                    }
                    DualChooserContract$ExtraConfiguration.DeFiCurrencies deFiCurrencies = (DualChooserContract$ExtraConfiguration.DeFiCurrencies) d0.d0(arrayList);
                    if (deFiCurrencies != null) {
                        oki.h.v2(aVar2.D, new DualChooserScreenContract$Step.DeFiAssetPicker(((i) ((j2) yVar.f22677a).getValue()).f148831b.f306286a, deFiCurrencies.f99488a), ModalDestination.Style.POPUP.f98311a);
                    } else {
                        yji.l.j2(aVar2, new CurrencyChooserScreen(new CurrencyChooserInputData(dualChooserContract$InputData.f99492c, null, ((i) ((j2) yVar.f22677a).getValue()).f148831b, dualChooserContract$InputData.f99493g, null, false, null, 82)), null, new m(aVar2, 0), 1);
                    }
                } else {
                    aVar2.l2(new g0a.e(aVar2, bVar, ((i) ((j2) yVar.f22677a).getValue()).d, continuation, 15), new yi5.b(26));
                }
                break;
            default:
                String selectedTabId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = dualChooserScreen.R2();
                Intrinsics.h(selectedTabId);
                com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar4 = (com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) kVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
                aVar4.C.k(selectedTabId);
                break;
        }
        return Unit.f186387a;
    }
}
