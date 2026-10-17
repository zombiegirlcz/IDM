package pij;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class j1 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dej.n f236558x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, dej.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f236557w = bVar;
        this.f236558x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j1(this.f236558x, this.f236557w, continuation);
            default:
                return new j1(this.f236557w, this.f236558x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        dej.n nVar = this.f236558x;
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.f236557w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    dej.u uVar = nVar.f113596h;
                    if (uVar instanceof dej.q) {
                        dej.q qVar = (dej.q) uVar;
                        String str = qVar.f113621b;
                        String str2 = qVar.f113620a;
                        this.v = 1;
                        if (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.I2(bVar, str, str2, this) == obj3) {
                            return obj3;
                        }
                    } else if (uVar instanceof dej.r) {
                        dej.r rVar = (dej.r) uVar;
                        String str3 = rVar.f113631a;
                        String str4 = rVar.f113632b;
                        String str5 = rVar.f113633c;
                        this.v = 2;
                        if (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.J2(bVar, str3, str4, str5, this) == obj3) {
                            return obj3;
                        }
                    } else if (uVar instanceof dej.s) {
                        dej.s sVar = (dej.s) uVar;
                        bVar.C2(new EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked(sVar.f113645b, sVar.f113644a));
                    } else if (uVar instanceof dej.t) {
                        bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, ((dej.t) uVar).f113649a, null, null, 30)));
                    } else {
                        dej.o oVar = nVar.f113595g;
                        String str6 = oVar != null ? oVar.f113610c : null;
                        if (str6 != null) {
                            bVar.l2(new v0(bVar, str6, null, 1), new yi5.b(26));
                        } else {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", "Can't open perk redemption flow, deeplink is null", null, h0Var);
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                qij.l lVar = bVar.f101086t;
                String str7 = nVar.f113592a;
                this.v = 3;
                nfj.u uVar2 = (nfj.u) ((qij.o) lVar).d.f114146a;
                uVar2.getClass();
                nfj.s sVar2 = new nfj.s(uVar2, str7, null, 1);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, sVar2, this);
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ == obj3) {
                    return obj3;
                }
                return Unit.f186387a;
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    qij.l lVar2 = bVar.f101086t;
                    String str8 = nVar.f113592a;
                    this.v = 1;
                    nfj.u uVar3 = (nfj.u) ((qij.o) lVar2).d.f114146a;
                    uVar3.getClass();
                    nfj.s sVar3 = new nfj.s(uVar3, str8, null, 0);
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    Object objJ2 = skm.e0.J(elm.f.f127540b, sVar3, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(dej.n nVar, com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f236558x = nVar;
        this.f236557w = bVar;
    }
}
