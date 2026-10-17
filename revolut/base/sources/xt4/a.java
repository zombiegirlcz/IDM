package xt4;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f308749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f308750x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308750x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f308750x, continuation, 0);
                aVar.f308749w = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f308750x, continuation, 1);
                aVar2.f308749w = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        od0.i iVar = (od0.i) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(iVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                od0.i iVar = (od0.i) this.f308749w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    if (!iVar.d()) {
                        return f0.f322471a;
                    }
                    List listC = u.c(iVar.c());
                    this.f308749w = null;
                    this.v = 1;
                    obj2 = this.f308750x.b(listC, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return (List) obj2;
            default:
                od0.i iVar2 = (od0.i) this.f308749w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    if (!iVar2.d()) {
                        return f0.f322471a;
                    }
                    List listC2 = u.c(iVar2.c());
                    this.f308749w = null;
                    this.v = 1;
                    obj2 = this.f308750x.b(listC2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return (List) obj2;
        }
    }
}
