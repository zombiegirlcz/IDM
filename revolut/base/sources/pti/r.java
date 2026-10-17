package pti;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftPassesService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oti.g0;
import oti.j0;
import oti.m0;
import oti.p0;
import oti.s0;
import pti.n;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f239753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bti.i f239754x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, String str, bti.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f239753w = str;
        this.f239754x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f239753w, this.f239754x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        m0 m0Var;
        ServerErrorParams serverErrorParams;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        dj0.d dVar = null;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AsftPassesService asftPassesService = uVar.f239758a;
            bti.i iVar = this.f239754x;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            String str = iVar.f18607a;
            List<bti.j> list = iVar.f18608b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (bti.j jVar : list) {
                arrayList.add(new g0(jVar.f18610a, jVar.f18611b));
            }
            bti.k kVar = iVar.f18609c;
            if (kVar != null) {
                String str2 = kVar.f18612a;
                jo3.a aVarP = mo3.a.p(kVar.f18613b);
                bti.f fVar = kVar.f18614c;
                m0Var = new m0(str2, aVarP, new j0(mo3.a.p(fVar.f18597b), mo3.a.p(fVar.f18598c), String.valueOf(fVar.f18596a)));
            } else {
                m0Var = null;
            }
            p0 p0Var = new p0(str, arrayList, m0Var, iVar.d, iVar.e);
            this.u = 1;
            obj2 = asftPassesService.postFastTrackPass(this.f239753w, p0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Response response = (Response) obj2;
        if (response.code() == 202) {
            Object objBody = response.body();
            if (objBody != null) {
                return new m(((s0) objBody).f229686a, u.a(uVar, response, "Retry-After"), u.a(uVar, response, "x-retry-timeout"));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        ServerError serverErrorC = uVar.e.c(new HttpException(response));
        Integer num = serverErrorC != null ? new Integer(serverErrorC.f51362a) : null;
        if (serverErrorC != null && (serverErrorParams = serverErrorC.f51364c) != null) {
            dVar = serverErrorParams.f51370a;
        }
        if (num != null && num.intValue() == 10001) {
            return n.a.f239748a;
        }
        if (num == null || num.intValue() != 1006 || dVar == null) {
            throw new HttpException(response);
        }
        return new l(dVar);
    }
}
