package zz4;

import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p35.e0;
import te0.w;
import uyd.z;
import uyh.k0;
import yhm.o;
import zrd.q;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f326507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e0 f326508x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f326507w = str;
        this.f326508x = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f326507w, this.f326508x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        rz4.b bVar = this.v.f326511b;
        bVar.getClass();
        String facilityId = this.f326507w;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        uz4.c cVar = bVar.f258509a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        d0<tz4.b> forbearanceApplicationAgreements = cVar.f284588a.getForbearanceApplicationAgreements(facilityId);
        z zVar = new z(23, new k0(facilityId, cVar, 3));
        forbearanceApplicationAgreements.getClass();
        ufm.i iVar = new ufm.i(forbearanceApplicationAgreements, zVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(w.i0(iVar), new zx0.b(new q(this.f326508x, 22), 28), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        this.u = 1;
        Object objB = nim.a.b(iVar2, this);
        return objB == aVar ? aVar : objB;
    }
}
