package hzb;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsEarnScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(RevPointsEarnScreen revPointsEarnScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsEarnScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, ((nyb.i) ((com.revolut.feature.rev_points.impl.ui.earn.b) this.u.d()).F).f220797c, "REV_POINTS_UPSELL_UPGRADE_BANNER_COOL_DOWN_TIME_ID", Long.valueOf(System.currentTimeMillis()));
        return Unit.f186387a;
    }
}
