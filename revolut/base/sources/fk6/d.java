package fk6;

import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lk6.n;
import lk6.p;
import nii.n1;
import oki.h;
import yhm.o;
import yki.l;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ n u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f135728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = nVar;
        this.v = dVar;
        this.f135728w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, this.v, this.f135728w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = ((p) this.u).f196261c;
        com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar = this.v;
        if (str != null) {
            dVar.C1(new ExternalDestination.Browser(str, null));
            h.D2(this.f135728w);
        } else {
            dVar.C1(u0.b(jbb.a.a(ibb.c.f160140a, null, null, null, 14)));
        }
        return Unit.f186387a;
    }
}
