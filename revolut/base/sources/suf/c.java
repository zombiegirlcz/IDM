package suf;

import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.models.user.TransportEligibilityState;
import com.revolut.feature.transport.models.user.TransportTerms;
import cvf.j;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f265746w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265746w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f265746w, continuation, 0);
            case 1:
                return new c(this.f265746w, continuation, 1);
            default:
                return new c(this.f265746w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TransportTerms transportTerms;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    TransportService transportService = this.f265746w.f265753a;
                    this.v = 1;
                    obj2 = transportService.getEligibilityState(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                dvf.a aVar2 = (dvf.a) obj2;
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                cxf.a aVarValueOf = cxf.a.valueOf(aVar2.getStatus());
                dvf.c terms = aVar2.getTerms();
                if (terms != null) {
                    Intrinsics.checkNotNullParameter(terms, "<this>");
                    transportTerms = new TransportTerms(terms.getId(), terms.getUri(), terms.getTitle(), terms.getSubtitle(), terms.getHtmlUri(), terms.getPdfUri());
                } else {
                    transportTerms = null;
                }
                return new TransportEligibilityState(aVarValueOf, transportTerms);
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    TransportService transportService2 = this.f265746w.f265753a;
                    this.v = 1;
                    obj2 = transportService2.getUserHelpOtp(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bvf.a aVar4 = (bvf.a) obj2;
                Intrinsics.checkNotNullParameter(aVar4, "<this>");
                return new axf.a(aVar4.getUsername(), aVar4.getPassword(), ruf.b.c(aVar4.getExpirationDate()));
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                h hVar = this.f265746w;
                if (i3 == 0) {
                    o.b(obj2);
                    TransportService transportService3 = hVar.f265753a;
                    List<String> listK = v.k(j.ACTIVE.a(), j.TO_BE_ACTIVATED.a(), j.PENDING.a());
                    this.v = 1;
                    obj2 = transportService3.getPurchasedTransitTicketsByState(listK, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h.a(hVar, (List) obj2);
                return Unit.f186387a;
        }
    }
}
