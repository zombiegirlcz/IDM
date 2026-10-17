package zs9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f324846w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(z zVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f324846w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f324846w, continuation, 0);
            default:
                return new w(this.f324846w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar = this.f324846w;
                e eVar = zVar.f324849q;
                List list = zVar.f324848p.f79401b;
                String str = ((p) zVar.t2()).f324836b;
                Image image = ((p) zVar.t2()).f324835a;
                xi0.b bVar = (xi0.b) ((p) zVar.t2()).e.getContent();
                st9.b bVar2 = ((p) zVar.t2()).f;
                this.v = 1;
                Object objA = eVar.a(list, str, image, bVar, bVar2, this);
                return objA == aVar ? aVar : objA;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                z zVar2 = this.f324846w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    e eVar2 = zVar2.f324849q;
                    this.v = 1;
                    obj2 = eVar2.c(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zVar2.x2(new zp5.f((Data) obj2, zVar2, 6));
                return Unit.f186387a;
        }
    }
}
