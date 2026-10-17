package ug6;

import com.revolut.feature.external_accounts.api.navigation.OpenBankingConsentsDestination;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import iuf.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.j1;
import nii.n1;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExternalAccountTopupPayload.BrazilPixMandatePayload f279956w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, ExternalAccountTopupPayload.BrazilPixMandatePayload brazilPixMandatePayload, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f279956w = brazilPixMandatePayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f279956w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            v vVar = this.v;
            y yVar = new y(vVar, 28);
            lic.a aVar2 = new lic.a(vVar, 19);
            j jVar = new j(vVar, this.f279956w, null);
            this.u = 1;
            kVar = this;
            obj2 = n14.k.W(vVar, null, aVar2, yVar, jVar, kVar, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            kVar = this;
        }
        nii.h hVar = (nii.h) obj2;
        if (hVar instanceof nii.g) {
            n1 n1Var = ((nii.g) hVar).f216153b;
            if (n1Var instanceof j1) {
                String str = ((j1) n1Var).f216180b.f275445a;
                v vVar2 = kVar.v;
                vVar2.getClass();
                if (Intrinsics.f(str, "OPEN_FINANCE_LINK_CLICK_ID")) {
                    vVar2.f279974s.c(u0.f(OpenBankingConsentsDestination.f72349a));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Clause click for id ", str, " is invalid on Brazil PIX Mandate Result"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
            }
        } else if (!(hVar instanceof nii.f)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
