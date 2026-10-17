package az0;

import android.content.Context;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f11354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f11355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Image f11356y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(s0 s0Var, Context context, Image image, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11354w = s0Var;
        this.f11355x = context;
        this.f11356y = image;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t0(this.f11354w, this.f11355x, this.f11356y, continuation, 0);
            default:
                return new t0(this.f11354w, this.f11355x, this.f11356y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                Image image = ((PairedImage) this.f11356y).f59967a;
                this.v = 1;
                Context context = this.f11355x;
                Object objJ = ofm.q.J(jh.d.f(context).Q(), image, context, kli.a.k(context, 20.0f), kli.a.k(context, 20.0f), this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Image image2 = ((PairedImage) this.f11356y).f59968b;
                this.v = 1;
                Context context2 = this.f11355x;
                Object objJ2 = ofm.q.J(jh.d.f(context2).Q(), image2, context2, kli.a.k(context2, 20.0f), kli.a.k(context2, 20.0f), this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
        }
    }
}
