package v2e;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandDetailRedeemScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandDetailRedeemScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) vVarE3;
        cli.y yVar = i0Var.B;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            String str = model.f52926a;
            if (Intrinsics.f(str, "STORE_BRAND_DETAIL_SECTION_HOW_IT_WORKS_TEXT_ID")) {
                i0Var.H2(yVar, new x(zBooleanValue, 0));
            } else if (Intrinsics.f(str, "STORE_BRAND_DETAIL_SECTION_DESCRIPTION_TEXT_ID")) {
                i0Var.H2(yVar, new x(zBooleanValue, 1));
            }
        } else {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "StoreRedeemParcel", j6.a.q("Invalid parcel for onPlainTextActionLabelClicked: expected Boolean, got ", obj3 != null ? obj3.getClass().getSimpleName() : null), null, h0Var);
        }
        return Unit.f186387a;
    }
}
