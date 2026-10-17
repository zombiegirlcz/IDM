package sgd;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.rename_watchlist.RenameWatchlistController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sdi.k;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RenameWatchlistController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RenameWatchlistController renameWatchlistController, Continuation continuation) {
        super(2, continuation);
        this.v = renameWatchlistController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.S.getValue();
        CharSequence newNameInput = textData.f52598b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(newNameInput, "newNameInput");
        fVar.H2(fVar.f262648q, new k(newNameInput, fVar, 3));
        return Unit.f186387a;
    }
}
