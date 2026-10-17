package mn6;

import aie.v;
import com.revolut.domain.models.openbanking.TopupUrlData;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.kompot.common.ExternalDestination;
import gld.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import mk5.s;
import nii.n1;
import skm.a2;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ j u;
    public final /* synthetic */ ExternalInstitution v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f207377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopupUrlData f207378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f207379y;
    public final /* synthetic */ Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, ExternalInstitution externalInstitution, Function0 function0, TopupUrlData topupUrlData, Function0 function02, Function0 function03, Continuation continuation) {
        super(2, continuation);
        this.u = jVar;
        this.v = externalInstitution;
        this.f207377w = function0;
        this.f207378x = topupUrlData;
        this.f207379y = function02;
        this.z = function03;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, this.v, this.f207377w, this.f207378x, this.f207379y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = this.v.f66108b;
        j jVar = this.u;
        n.j2(jVar, jVar.L2(jVar.f207384m.c(str, true)), null, new e0(3, null, this.f207377w), 3);
        TopupUrlData topupUrlData = this.f207378x;
        jVar.A2(new ExternalDestination.Browser(topupUrlData.f60407a, null));
        String str2 = topupUrlData.f60408b;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        on6.a aVar2 = jVar.f207386p;
        c cVar = new c(jVar, str2, null, 1);
        a2 a2Var = jVar.f207388r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        Function0 function0 = this.z;
        jVar.f207388r = jVar.T2(new v(aVar2, jVar, function0, cVar, this.f207379y, null), new s(jVar, function0, 15));
        return Unit.f186387a;
    }
}
