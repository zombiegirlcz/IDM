package swb;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsGiftcardsDownloadScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsGiftcardsDownloadScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        oki.h.v2(((com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) this.u.d()).f83703t, RevPointsGiftcardsDownloadScreenContract$ModalStep.NotAvailable.f83698a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
