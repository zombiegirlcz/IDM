package nfj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService;
import dej.a3;
import dej.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.q3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class i2 extends gim.i implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ dj0.d B;
    public final /* synthetic */ Long C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ dej.c F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Boolean J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ String M;
    public s2 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s2 f214960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f214961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ EsimDataPlanOfferInfo f214962y;
    public final /* synthetic */ dej.j1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(s2 s2Var, boolean z, EsimDataPlanOfferInfo esimDataPlanOfferInfo, dej.j1 j1Var, List list, dj0.d dVar, Long l2, String str, String str2, dej.c cVar, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Continuation continuation) {
        super(2, continuation);
        this.f214960w = s2Var;
        this.f214961x = z;
        this.f214962y = esimDataPlanOfferInfo;
        this.z = j1Var;
        this.A = list;
        this.B = dVar;
        this.C = l2;
        this.D = str;
        this.E = str2;
        this.F = cVar;
        this.G = str3;
        this.H = str4;
        this.I = str5;
        this.J = bool;
        this.K = str6;
        this.L = str7;
        this.M = str8;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i2(this.f214960w, this.f214961x, this.f214962y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        Object objPostSubscriptions;
        s2 s2Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s2 s2Var2 = this.f214960w;
            EsimSubscriptionsService esimSubscriptionsService = s2Var2.f215038a;
            lfj.s sVar = new lfj.s(this.f214961x);
            EsimDataPlanOfferInfo esimDataPlanOfferInfo = this.f214962y;
            if (esimDataPlanOfferInfo instanceof EsimDataPlanOfferInfo.FreeTeaser) {
                pair = new Pair("FREE_TEASER", ((EsimDataPlanOfferInfo.FreeTeaser) esimDataPlanOfferInfo).f100236a);
            } else if (esimDataPlanOfferInfo instanceof EsimDataPlanOfferInfo.PlanBenefit) {
                pair = new Pair("PRICING_PLAN_BENEFIT", ((EsimDataPlanOfferInfo.PlanBenefit) esimDataPlanOfferInfo).f100237a);
            } else {
                if (esimDataPlanOfferInfo != null) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(null, null);
            }
            String str = (String) pair.f186385a;
            String str2 = (String) pair.f186386b;
            lfj.w wVar = (str == null || str2 == null) ? null : new lfj.w(str2, str);
            dej.j1 j1Var = this.z;
            kfj.m2 m2Var = j1Var == null ? null : new kfj.m2(j1Var.f113568a, mo3.a.p(j1Var.f113569b), ksj.b.K(j1Var.f113570c));
            List list = this.A;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(new lfj.a0((String) it8.next()));
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            dj0.d dVar = this.B;
            jo3.a aVarP = dVar != null ? mo3.a.p(dVar) : null;
            lfj.x xVarA = ffj.a.a(this.C, this.D);
            String str3 = this.E;
            lfj.z zVar = str3 != null ? new lfj.z(str3) : null;
            dej.c cVar = this.F;
            lfj.y yVar = new lfj.y(this.G, this.H, this.I, cVar != null ? cVar.a() : null, sVar, wVar, m2Var, this.J, arrayList2, aVarP, this.K, xVarA, zVar, this.L);
            this.u = s2Var2;
            this.v = 1;
            objPostSubscriptions = esimSubscriptionsService.postSubscriptions(yVar, this.M, this);
            if (objPostSubscriptions == aVar) {
                return aVar;
            }
            s2Var = s2Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s2Var = this.u;
            yhm.o.b(obj2);
            objPostSubscriptions = obj2;
        }
        Response response = (Response) objPostSubscriptions;
        nd8.i iVar = new nd8.i(19);
        s2Var.getClass();
        e2 e2VarE = s2.e(response, iVar);
        Object objBody = response.body();
        if (objBody == null) {
            throw new HttpException(response);
        }
        dej.t1 t1VarD = ofj.p.d((q3) objBody);
        if (t1VarD.f113651b != j3.FAILED) {
            return new a3(t1VarD, e2VarE.f214939a, e2VarE.f214940b);
        }
        throw new IllegalStateException("Subscription purchase state is FAILED");
    }
}
