package v2e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandDetailRedeemScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandDetailRedeemScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) vVarE3;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (kotlin.text.a0.H(model.f53228a, "STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_VOUCHER_", false)) {
            Object obj3 = model.u;
            UserVoucher userVoucher = obj3 instanceof UserVoucher ? (UserVoucher) obj3 : null;
            if (userVoucher == null) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "StoreRedeemParcel", j6.a.q("Invalid parcel for onRowClicked: expected UserVoucher, got ", obj3 != null ? obj3.getClass().getSimpleName() : null), null, h0Var);
            } else if (userVoucher.i != tvb.d.PENDING) {
                i0Var.C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, userVoucher.f83619a, null, null, 13), com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE)));
            }
        }
        return Unit.f186387a;
    }
}
