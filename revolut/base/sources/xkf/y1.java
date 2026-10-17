package xkf;

import com.revolut.feature.pay_with_photo.api.PayWithPhotoApi$Toggles$PayWithPhotoSaveFileAttachment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z1 f306801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(z1 z1Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f306801w = z1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y1(this.f306801w, continuation, 0);
            default:
                return new y1(this.f306801w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        int i = this.u;
        Continuation continuation = null;
        z1 z1Var = this.f306801w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    bl9.a aVar = z1Var.f306805m;
                    String str = z1Var.f306804l.f185494j;
                    this.v = 1;
                    hl9.d dVar = (hl9.d) aVar;
                    if (((jte.d) dVar.f153416b).c(PayWithPhotoApi$Toggles$PayWithPhotoSaveFileAttachment.f78942c)) {
                        skm.p0 p0Var = skm.p0.f264001a;
                        objJ = skm.e0.J(elm.f.f127540b, new fc0.e(dVar, str, (Continuation) null), this);
                        if (objJ != obj3) {
                            objJ = Unit.f186387a;
                        }
                    } else {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                vkm.z1 z1Var2 = z1Var.f306809r;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (z1Var2.emit(unit, this) == obj3) {
                    return obj3;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    y1 y1Var = new y1(z1Var, continuation, 0);
                    this.v = 1;
                    if (z1Var.Y2(this, y1Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
