package znd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b f323791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AnalyticsSpendingPeriod$Interval f323792x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323791w = bVar;
        this.f323792x = analyticsSpendingPeriod$Interval;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q0(this.f323791w, this.f323792x, continuation, 0);
            default:
                return new q0(this.f323791w, this.f323792x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listD1;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    kge.d dVar = this.f323791w.f87567t;
                    this.v = 1;
                    if (dVar.A(this.f323792x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = this.f323791w;
                cli.y yVar = bVar.N;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                boolean z = true;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    kge.d dVar2 = bVar.f87567t;
                    yld.d screenType = bVar.v.f87547b;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(screenType, "screenType");
                    String string = screenType.toString();
                    this.v = 1;
                    if (dVar2.B(string, this.f323792x, null, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                c cVar = ((a) ((j2) yVar.f22677a).getValue()).f;
                if (cVar == null) {
                    return null;
                }
                ind.y yVar2 = cVar.f323727a;
                String str = yVar2.f162833a;
                Set set = ((a) ((j2) yVar.f22677a).getValue()).f323721w;
                if (!Intrinsics.f(str, "SMALL_SEGMENTS_GROUP_ID") && !set.contains(str)) {
                    z = false;
                }
                boolean z3 = z;
                if (z3) {
                    listD1 = zhm.d0.d1(set);
                } else {
                    List list = cVar.f323729c;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((he3.j) it8.next()).f151563a);
                    }
                    listD1 = arrayList;
                }
                bVar.R2(this.f323792x, listD1, yVar2.f162833a, yVar2.f162834b, z3);
                return Unit.f186387a;
        }
    }
}
