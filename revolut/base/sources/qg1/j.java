package qg1;

import android.os.Parcelable;
import cli.y;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import kg1.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar = this.v;
        y yVar = kVar.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            f fVar = new f(kVar, ((l) ((j2) yVar.f22677a).getValue()).f245633a, 1);
            g gVar = new g(kVar, continuation, 1);
            this.u = 1;
            obj2 = n14.k.V(kVar, null, null, fVar, gVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((nii.h) obj2) instanceof nii.g) {
            if (((l) ((j2) yVar.f22677a).getValue()).f245634b) {
                kVar.f245630r.getClass();
                kVar.C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14));
            } else {
                kVar.C2(c.b.f183900a);
            }
        }
        return Unit.f186387a;
    }
}
