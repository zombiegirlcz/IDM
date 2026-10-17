package no;

import com.revolut.analytics.tracking.DynamicScreenNameError;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class w1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ y1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f217860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AnalyticsContext f217861x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ho.i f217862y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y1 y1Var, Object obj2, AnalyticsContext analyticsContext, ho.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = y1Var;
        this.f217860w = obj2;
        this.f217861x = analyticsContext;
        this.f217862y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w1(this.v, this.f217860w, this.f217861x, this.f217862y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Object screen = this.f217860w;
        y1 y1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.analytics.tracking.v3.k kVar = y1Var.e;
            this.u = 1;
            z1 z1Var = new z1(kVar, screen, this.f217861x, null);
            skm.p0 p0Var = skm.p0.f264001a;
            obj2 = skm.e0.J(zkm.o.f323119a.e, z1Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ho.h hVar = (ho.h) obj2;
        AnalyticsContext analyticsContext = hVar.f154166c;
        String str = hVar.f154164a;
        if (analyticsContext != null) {
            ho.i iVar = this.f217862y;
            if (!analyticsContext.equals(iVar != null ? iVar.f154169c : null)) {
                ((ho.t) y1Var.f217877h.get()).e2(hVar);
                if ((iVar != null ? iVar.f154167a : null) != null && !Intrinsics.f(iVar.f154167a, str)) {
                    Intrinsics.checkNotNullParameter(screen, "screen");
                    DynamicScreenNameError dynamicScreenNameError = new DynamicScreenNameError(screen.getClass(), screen.getClass().getSimpleName().concat(" tracked with dynamic title"));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.c cVar = rd0.c.ERROR;
                    String str2 = iVar.f154167a;
                    String strM3 = hVar.f154165b.M3(y1Var.f217876g);
                    StringBuilder sbM = v0.a.m("screen=", str2, "->", str, ",product=");
                    sbM.append(strM3);
                    rd0.d.a(cVar, "ScreenEventController", sbM.toString(), dynamicScreenNameError, h0Var);
                }
            }
        }
        return Unit.f186387a;
    }
}
