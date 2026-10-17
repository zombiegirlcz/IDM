package x34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import cv3.u;
import ft3.h1;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import t14.j;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f302644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f302645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f302646y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, h1 h1Var, u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302644w = bVar;
        this.f302645x = h1Var;
        this.f302646y = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f302644w, this.f302645x, this.f302646y, continuation, 0);
            default:
                return new a(this.f302644w, this.f302645x, this.f302646y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b bVar = this.f302644w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = bVar.f302647a;
                    String str = this.f302645x.f137835a;
                    Map<String, Object> map = this.f302646y.f109270a;
                    this.v = 1;
                    obj2 = creditPluginsService.acceptOverdraftOffer(str, map, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return bVar.f302648b.p((tt3.a) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = this.f302644w.f302647a;
                    String str2 = this.f302645x.f137835a;
                    Map<String, Object> map2 = this.f302646y.f109270a;
                    this.v = 1;
                    obj2 = creditPluginsService2.updateOverdraftOffer(str2, map2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                u14.a aVar3 = (u14.a) obj2;
                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                return new dv3.a(new u(aVar3.getOfferParameters()), j.a(aVar3.getOffer()));
        }
    }
}
