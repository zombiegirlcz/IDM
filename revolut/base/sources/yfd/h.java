package yfd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedFavouritesAddAssetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedFavouritesAddAssetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarT2 = this.v.T2();
        Intrinsics.h(model);
        w wVar = (w) qVarT2;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof ogd.e) {
            wVar.v2(new o(zhm.u.c(nz8.d.J((ogd.e) obj3))));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.l(obj3 != null ? obj3.getClass() : null, "provide handler for parcel type = "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
