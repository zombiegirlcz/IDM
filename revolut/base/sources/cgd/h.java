package cgd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ SharedFavouritesCounterpartChooserScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.u = sharedFavouritesCounterpartChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen = this.u;
        ((c) ((n) sharedFavouritesCounterpartChooserScreen.f86835e0.getValue())).x2(new ccg.c(27));
        sharedFavouritesCounterpartChooserScreen.h3().f183967b.i0();
        return Unit.f186387a;
    }
}
