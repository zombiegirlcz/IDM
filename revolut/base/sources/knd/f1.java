package knd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class f1 extends gim.i implements Function2 {
    public int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ ukm.j0 C;
    public final /* synthetic */ h1 D;
    public final /* synthetic */ boolean E;
    public ukm.j0 u;
    public h1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f186070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f186071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f186072y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(List list, ukm.j0 j0Var, h1 h1Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.B = list;
        this.C = j0Var;
        this.D = h1Var;
        this.E = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f1(this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ukm.j0 j0Var;
        h1 h1Var;
        boolean z;
        List list;
        Iterator it8;
        int i;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.A;
        if (i2 == 0) {
            yhm.o.b(obj2);
            List list2 = this.B;
            Iterator it9 = list2.iterator();
            j0Var = this.C;
            h1Var = this.D;
            z = this.E;
            list = list2;
            it8 = it9;
            i = 0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.z;
            z = this.f186072y;
            it8 = this.f186071x;
            list = this.f186070w;
            h1Var = this.v;
            j0Var = this.u;
            yhm.o.b(obj2);
        }
        while (it8.hasNext()) {
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) it8.next();
            h1Var.getClass();
            a1 a1Var = new a1(analyticsSpendingPeriod$Interval, list.size() == 1, z);
            this.u = j0Var;
            this.v = h1Var;
            this.f186070w = list;
            this.f186071x = it8;
            this.f186072y = z;
            this.z = i;
            this.A = 1;
            if (j0Var.send(a1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f186387a;
    }
}
