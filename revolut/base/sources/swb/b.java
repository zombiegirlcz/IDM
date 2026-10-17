package swb;

import aw0.n6;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sqd.h0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsGiftcardsDownloadScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsGiftcardsDownloadScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) revPointsGiftcardsDownloadScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a aVar3 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) revPointsGiftcardsDownloadScreen.d();
                aVar3.getClass();
                aVar3.n2(new h0(aVar3, null, 3), new su0.c(1, aVar3, com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 3));
                break;
        }
        return Unit.f186387a;
    }
}
