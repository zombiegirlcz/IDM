package vd7;

import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.feature.image_gallery.screens.grid.ImageGalleryGridScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ImageGalleryGridScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ImageGalleryGridScreen imageGalleryGridScreen, Continuation continuation) {
        super(2, continuation);
        this.v = imageGalleryGridScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SmallCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallCardDelegate.Model model = (SmallCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.P.getValue();
        Intrinsics.h(model);
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53364p;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
        hVar.C2(new d(((Integer) obj3).intValue()));
        return Unit.f186387a;
    }
}
