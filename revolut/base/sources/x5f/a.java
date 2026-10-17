package x5f;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vdl.i0;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ou5.b f302947w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ou5.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302947w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f302947w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a(this.f302947w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
            default:
                a aVar3 = new a(this.f302947w, continuation, 2);
                aVar3.v = obj2;
                return aVar3;
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
        int i = this.u;
        vkm.i iVar = vkm.i.f290039a;
        ou5.b bVar = this.f302947w;
        switch (i) {
            case 0:
                od0.i iVar2 = (od0.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) iVar2.f224257a;
                return str != null ? ((qmc.d) bVar.f229819a).a(str) : iVar;
            case 1:
                od0.i iVar3 = (od0.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str2 = (String) iVar3.f224257a;
                return str2 != null ? nim.a.v(rd0.e.b(((tul.b) bVar.f229821c).i(str2, w4l.h.f294642c)), new x29.a(22)) : iVar;
            default:
                od0.i iVar4 = (od0.i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str3 = (String) iVar4.f224257a;
                return str3 != null ? new wyd.f(u0.m(((qmc.d) bVar.f229819a).a(str3), i0.a((i0) bVar.d, u.c(str3))), bVar, 2) : iVar;
        }
    }
}
