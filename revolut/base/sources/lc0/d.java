package lc0;

import android.graphics.Bitmap;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.NumberCoverDrawView;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardPhotoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CardPhotoScreen cardPhotoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardPhotoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            case 3:
                return new d(this.v, continuation, 3);
            default:
                return new d(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar;
        int i = this.u;
        CardPhotoScreen cardPhotoScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var = (b0) cardPhotoScreen.d();
                cli.y yVar = b0Var.u;
                h hVar = ((j) ((j2) yVar.f22677a).getValue()).f;
                Intrinsics.i(hVar, "null cannot be cast to non-null type com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreenContract.CameraMode.Preview");
                g gVar = (g) hVar;
                if (gVar.f193753c) {
                    b0Var.K2();
                } else {
                    l lVar2 = gVar.d;
                    l lVar3 = l.HIDDEN;
                    if (lVar2 != lVar3) {
                        z1 z1Var = b0Var.f193744w;
                        Bitmap bitmap = ((j) ((j2) yVar.f22677a).getValue()).f193758b;
                        if (bitmap == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        z1Var.k(new i(bitmap, false, new w(b0Var, 0)));
                    } else if (lVar2 == lVar3) {
                        b0Var.L2(new laj.b(l.VISIBLE, 6));
                    }
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var2 = (b0) cardPhotoScreen.d();
                cli.y yVar2 = b0Var2.u;
                j2 j2Var = (j2) yVar2.f22677a;
                j2 j2Var2 = (j2) yVar2.f22677a;
                h hVar2 = ((j) j2Var.getValue()).f;
                Intrinsics.i(hVar2, "null cannot be cast to non-null type com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreenContract.CameraMode.Preview");
                g gVar2 = (g) hVar2;
                if (gVar2.f193753c || (lVar = gVar2.d) == l.HIDDEN) {
                    if (((j) j2Var2.getValue()).f193758b != null) {
                        b0Var2.L2(new lbh.a(4));
                    } else if (((j) j2Var2.getValue()).f193757a != null) {
                        b0Var2.L2(new lbh.a(5));
                    }
                } else if (lVar == l.VISIBLE) {
                    b0Var2.L2(new laj.b(l.EDIT, 6));
                } else if (lVar == l.EDIT) {
                    b0Var2.v.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((b0) cardPhotoScreen.d()).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                CardPhotoScreen.Companion companion = CardPhotoScreen.INSTANCE;
                NumberCoverDrawView numberCoverDrawViewI3 = cardPhotoScreen.i3();
                if (numberCoverDrawViewI3 != null) {
                    ihm.b bVar = numberCoverDrawViewI3.f51293a;
                    List list = (List) bVar.f();
                    if (list == null || list.size() != 0) {
                        bVar.onNext(f0.f322471a);
                        numberCoverDrawViewI3.invalidate();
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                CardPhotoScreen.Companion companion2 = CardPhotoScreen.INSTANCE;
                cardPhotoScreen.h3().a();
                return Unit.f186387a;
        }
    }
}
