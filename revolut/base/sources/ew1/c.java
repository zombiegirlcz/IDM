package ew1;

import android.os.Parcelable;
import aw0.n6;
import cam.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.breb.impl.ui.more.BrebMoreScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrebMoreScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BrebMoreScreen brebMoreScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brebMoreScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.S.getValue();
        Intrinsics.h(model);
        m mVar = (m) jVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        switch (str.hashCode()) {
            case -1738710218:
                if (str.equals("REMOVE_KEY_ID")) {
                    sv1.d dVar = mVar.f129996q;
                    String aliasValue = mVar.o.f61879b;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
                    lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.bre_b_area_more_remove_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.bre_b_area_more_remove_confirmation_subtitle, u.c(aliasValue), null, 12), null, null, false, 28);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.bre_b_area_more_remove_confirmation_action_remove, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.bre_b_area_more_remove_confirmation_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    mVar.f2(new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new eu7.c(mVar, 7));
                }
                break;
            case -601691820:
                if (str.equals("REACTIVATE_KEY_ID")) {
                    mVar.l2(new l(0, mVar, null), new eif.c(1, mVar, m.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 22));
                }
                break;
            case -190940371:
                if (str.equals("BLOCK_KEY_ID")) {
                    int i = R$string.bre_b_area_more_block_key_toast_title;
                    mVar.l2(new q(i, 2, mVar, null), new eif.c(1, mVar, m.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 21));
                }
                break;
            case 929406758:
                if (str.equals("REPLACE_KEY_ID")) {
                    mVar.l2(new l(1, mVar, null), new eif.c(1, mVar, m.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 23));
                }
                break;
        }
        return Unit.f186387a;
    }
}
