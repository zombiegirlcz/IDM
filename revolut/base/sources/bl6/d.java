package bl6;

import com.revolut.feature.external_accounts.impl.domain.pse.model.PseInstitutions;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseProvider;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks.PseBanksScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PseBanksScreen f16478w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PseBanksScreen pseBanksScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16478w = pseBanksScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f16478w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f16478w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((PseProvider) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PseProvider pseProvider;
        String str;
        Object next;
        int i = this.u;
        PseBanksScreen pseBanksScreen = this.f16478w;
        switch (i) {
            case 0:
                PseProvider pseProvider2 = (PseProvider) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarD3 = pseBanksScreen.d3();
                String bankId = pseProvider2.f72418a;
                lVarD3.getClass();
                Intrinsics.checkNotNullParameter(bankId, "bankId");
                PseInstitutions pseInstitutions = (PseInstitutions) ((g) ((j2) lVarD3.f16485p.f22677a).getValue()).f16479a.getContent();
                if (pseInstitutions != null) {
                    Iterator it8 = d0.E0(pseInstitutions.f72417b, pseInstitutions.f72416a).iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((PseProvider) next).f72418a, bankId)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    pseProvider = (PseProvider) next;
                } else {
                    pseProvider = null;
                }
                if (pseProvider != null && (str = pseProvider.d) != null) {
                    bankId = str;
                }
                String str2 = pseProvider != null ? pseProvider.f72419b : null;
                if (str2 == null) {
                    str2 = "";
                }
                lVarD3.C2(new i(bankId, str2));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarD32 = pseBanksScreen.d3();
                Intrinsics.h(query);
                lVarD32.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                lVarD32.H2(lVarD32.f16485p, new bd2.b(query, 2));
                break;
        }
        return Unit.f186387a;
    }
}
