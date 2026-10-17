package xd7;

import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ImageGalleryLightboxScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ImageGalleryLightboxScreen imageGalleryLightboxScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = imageGalleryLightboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ImageGalleryLightboxScreen imageGalleryLightboxScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                imageGalleryLightboxScreen.f3().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                imageGalleryLightboxScreen.P = !imageGalleryLightboxScreen.P;
                imageGalleryLightboxScreen.d3().f261832b.f0(imageGalleryLightboxScreen.e3());
                break;
        }
        return Unit.f186387a;
    }
}
