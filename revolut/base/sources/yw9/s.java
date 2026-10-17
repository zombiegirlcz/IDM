package yw9;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f317376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ File f317377x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w wVar, File file, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f317376w = wVar;
        this.f317377x = file;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f317376w, this.f317377x, continuation, 0);
            default:
                return new s(this.f317376w, this.f317377x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 0;
        File file = this.f317377x;
        Continuation continuation = null;
        w wVar = this.f317376w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar = new r(wVar, file, continuation, i2);
                p0 p0Var = p0.f264001a;
                elm.f fVar = elm.f.f127540b;
                this.v = 1;
                Object objJ = e0.J(fVar, rVar, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    s sVar = new s(wVar, file, continuation, i2);
                    this.v = 1;
                    obj2 = u0.b0(wVar.X(), "CTA_BUTTON_TAG", sVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                q qVar = new q(wVar, (String) obj2, continuation, i3);
                this.v = 2;
                if (do3.q.t(wVar, qVar, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
