package ood;

import com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig;
import com.revolut.feature.spending_analytics.api.R$string;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends gim.i implements Function2 {
    public TripsMapBitmapConfig u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f227065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f227066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q0 f227067y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(h hVar, q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.f227066x = hVar;
        this.f227067y = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p0 p0Var = new p0(this.f227066x, this.f227067y, continuation);
        p0Var.f227065w = obj2;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP2;
        TripsMapBitmapConfig tripsMapBitmapConfig;
        h hVar = this.f227066x;
        b bVar = hVar.f227043b;
        List list = hVar.f227042a;
        CoroutineScope coroutineScope = (CoroutineScope) this.f227065w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        q0 q0Var = this.f227067y;
        if (i == 0) {
            yhm.o.b(obj2);
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((fod.c) it8.next()).f136925a.d);
            }
            Set setI1 = zhm.d0.i1(arrayList);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(setI1, 10));
            Iterator it9 = setI1.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((wi0.b) it9.next()).f297794a);
            }
            TripsMapBitmapConfig tripsMapBitmapConfig2 = new TripsMapBitmapConfig(arrayList2, new TripsMapBitmapConfig.Style.Custom(0), 60);
            jld.h hVar2 = new jld.h(20, coroutineScope, q0Var, tripsMapBitmapConfig2, hVar, null);
            this.f227065w = null;
            this.u = tripsMapBitmapConfig2;
            this.v = 1;
            objP2 = q0Var.p2(this, hVar2);
            if (objP2 == aVar) {
                return aVar;
            }
            tripsMapBitmapConfig = tripsMapBitmapConfig2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TripsMapBitmapConfig tripsMapBitmapConfig3 = this.u;
            yhm.o.b(obj2);
            tripsMapBitmapConfig = tripsMapBitmapConfig3;
            objP2 = obj2;
        }
        Object obj3 = ((yhm.m) objP2).f314193a;
        if (obj3 instanceof yhm.n) {
            return q0Var.l1().M0(new mod.q(R$string.trips_common_error_description));
        }
        yhm.o.b(obj3);
        ZonedDateTime zonedDateTime = (ZonedDateTime) ((Pair) obj3).f186386b;
        aii.o oVarL1 = q0Var.l1();
        List list3 = list;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            arrayList3.add(((fod.c) it10.next()).f136925a.d);
        }
        Set setI12 = zhm.d0.i1(arrayList3);
        String str = bVar.f227033c.f116410c;
        if (str == null) {
            str = "";
        }
        return oVarL1.M0(new mod.t(setI12, str, zonedDateTime, tripsMapBitmapConfig, list.size(), bVar.f227034g));
    }
}
