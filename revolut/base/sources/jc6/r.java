package jc6;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.CFACClaimingFor;
import ft3.h1;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import n30.p0;
import org.joda.time.Instant;
import v20.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public Object A;
    public /* synthetic */ Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public Object E;
    public Object F;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f172726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f172727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f172728y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Data data, s sVar, Data data2, nqi.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f172728y = data;
        this.B = sVar;
        this.z = data2;
        this.D = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r((Data) this.f172728y, (s) this.B, (Data) this.z, (nqi.c) this.D, continuation);
            case 1:
                return new r((kj7.f) this.f172727x, (String) this.f172728y, (String) this.z, (String) this.A, (String) this.B, (CFACClaimingFor) this.C, (List) this.D, (UUID) this.E, (List) this.F, continuation, 1);
            case 2:
                r rVar = new r((String) this.C, (p0) this.D, (UUID) this.E, (UUID) this.F, continuation);
                rVar.B = obj2;
                return rVar;
            case 3:
                return new r((ry3.a) this.f172727x, (hlm.i) this.f172728y, (wx3.c) this.z, (h1) this.A, (CoroutineScope) this.B, (hlm.c) this.C, (Ref$IntRef) this.D, (List) this.E, (ukm.q) this.F, continuation, 3);
            default:
                return new r((t0) this.f172728y, (List) this.z, (z20.q) this.A, (UUID) this.B, (Instant) this.C, (String) this.D, (v20.n) this.E, (xlb.o) this.F, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0234  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jc6.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Object obj3, Object obj4, Serializable serializable, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172727x = obj2;
        this.f172728y = obj3;
        this.z = obj4;
        this.A = serializable;
        this.B = obj5;
        this.C = obj6;
        this.D = obj7;
        this.E = obj8;
        this.F = obj9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, p0 p0Var, UUID uuid, UUID uuid2, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.C = str;
        this.D = p0Var;
        this.E = uuid;
        this.F = uuid2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t0 t0Var, List list, z20.q qVar, UUID uuid, Instant instant, String str, v20.n nVar, xlb.o oVar, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f172728y = t0Var;
        this.z = list;
        this.A = qVar;
        this.B = uuid;
        this.C = instant;
        this.D = str;
        this.E = nVar;
        this.F = oVar;
    }
}
