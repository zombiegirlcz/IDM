package grd;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddEditAssetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AddEditAssetController addEditAssetController, Continuation continuation) {
        super(2, continuation);
        this.v = addEditAssetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.R2();
        String str = textData.f52597a;
        String string = textData.f52598b.toString();
        if (d0.W(string)) {
            string = null;
        }
        ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) cVarE3).J2(str, false, string);
        return Unit.f186387a;
    }
}
