package xd7;

import cli.y;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vvc.t;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ImageGalleryLightboxScreen f304273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ImageGalleryLightboxScreen imageGalleryLightboxScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304273w = imageGalleryLightboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f304273w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f304273w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f304273w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ImageGalleryLightboxScreen imageGalleryLightboxScreen = this.f304273w;
        switch (i) {
            case 0:
                Integer num = (Integer) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarF3 = imageGalleryLightboxScreen.f3();
                Intrinsics.h(num);
                int iIntValue = num.intValue();
                iVarF3.I2();
                iVarF3.H2(iVarF3.f304286s, new t(iIntValue, iVarF3, 1));
                break;
            case 1:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarF32 = imageGalleryLightboxScreen.f3();
                Intrinsics.h(listId);
                iVarF32.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("gallery_share")) {
                    y yVar = iVarF32.f304286s;
                    Integer num2 = ((g) ((j2) yVar.f22677a).getValue()).f304279c;
                    rd7.h hVar = (rd7.h) d0.e0(num2 != null ? num2.intValue() : ((g) ((j2) yVar.f22677a).getValue()).f304278b, iVarF32.f304284q);
                    if (hVar != null) {
                        iVarF32.n2(new wtj.f(iVarF32, hVar, null, 29), new whi.b(6));
                    }
                } else if (listId.equals("gallery_confirm")) {
                    iVarF32.I2();
                    iVarF32.f304283p.f269937b = true;
                    iVarF32.B2();
                }
                break;
            default:
                String text = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarF33 = imageGalleryLightboxScreen.f3();
                Intrinsics.h(text);
                iVarF33.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                if (iVarF33.f304285r == rd7.c.EDITABLE) {
                    iVarF33.H2(iVarF33.f304286s, new wsg.j(text, 25));
                }
                break;
        }
        return Unit.f186387a;
    }
}
