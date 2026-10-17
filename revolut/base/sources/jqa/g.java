package jqa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.push_to_card.impl.flows.amount_common.Push2CardAmountService;
import java.util.Set;
import jm4.z3;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.c, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardTransferInputData f177574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f177575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f177576c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g(e eVar, PushToCardTransferInputData pushToCardTransferInputData) {
        this.f177575b = eVar;
        this.f177574a = pushToCardTransferInputData;
        int i = 29;
        this.d = e4m.b.b(new z3(eVar, this, 0, i));
        this.e = e4m.b.b(new z3(eVar, this, 1, i));
        this.f = e4m.b.b(new z3(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get());
    }

    public final jid.z q() {
        e eVar = this.f177575b;
        Retrofit retrofit = ((nj0.d) eVar.f177541b).f();
        kra.a aVar = kra.b.Companion;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(Push2CardAmountService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        Push2CardAmountService push2CardAmountService = (Push2CardAmountService) objCreate;
        vc.s.k(push2CardAmountService);
        aVar.getClass();
        ne0.d dVar = new ne0.d();
        rga.c cVarB = eVar.d.b();
        vc.s.j(cVarB);
        return new jid.z(new h30.q(push2CardAmountService, dVar, cVarB), eVar.f177543g.b());
    }
}
