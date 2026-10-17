package fq;

import android.content.Context;
import androidx.glance.GlanceId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f137153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.appwidget_core.a f137154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f137155y;
    public final /* synthetic */ GlanceId z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.appwidget_core.a aVar, Context context, GlanceId glanceId, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f137154x = aVar;
        this.f137155y = context;
        this.z = glanceId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f137154x, this.f137155y, this.z, continuation, 0);
                jVar.f137153w = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f137154x, this.f137155y, this.z, continuation, 1);
                jVar2.f137153w = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((jq.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                jq.a aVar = (jq.a) this.f137153w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Context context = this.f137155y;
                    com.revolut.appwidget_core.a aVar3 = this.f137154x;
                    if (aVar != null) {
                        this.f137153w = null;
                        this.v = 1;
                        if (com.revolut.appwidget_core.a.b(aVar3, aVar, context, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        this.f137153w = null;
                        this.v = 2;
                        if (aVar3.i(context, this.z, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                c cVar = (c) this.f137153w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    int i3 = k.f137156a[cVar.ordinal()];
                    com.revolut.appwidget_core.a aVar5 = this.f137154x;
                    Context context2 = this.f137155y;
                    Continuation continuation = null;
                    if (i3 == 1) {
                        jq.a aVar6 = jq.a.LOGIN_REQUIRED;
                        this.f137153w = null;
                        this.v = 1;
                        if (com.revolut.appwidget_core.a.b(aVar5, aVar6, context2, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        phm.a aVar7 = (phm.a) j6.a.i(context2, iq.b.class);
                        b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                        if (aVar8 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iq.b.class, " is not found"));
                        }
                        Object objB = aVar8.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.appwidget_core.di.AppWidgetCoreComponent");
                        jq.g gVar = (jq.g) ((iq.b) objB).f167780p.get();
                        Flow flowQ = q.q(q.Q(new jij.d(rd0.e.b(((cn0.g) gVar.f177334a).g()), 6), new iw6.l(continuation, gVar, 23)));
                        j jVar = new j(aVar5, context2, this.z, continuation, 0);
                        this.f137153w = null;
                        this.v = 2;
                        if (q.o(flowQ, jVar, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
