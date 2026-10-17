package nk6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection.PixBankSelectionScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nk6.f;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixBankSelectionScreen f216656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PixBankSelectionScreen pixBankSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f216656w = pixBankSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f216656w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f216656w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        PixBankSelectionScreen pixBankSelectionScreen = this.f216656w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (obj3 instanceof ExternalInstitution) {
                    h hVarD3 = pixBankSelectionScreen.d3();
                    String institutionId = ((ExternalInstitution) obj3).f66107a;
                    j jVar = (j) hVarD3;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                    List list = (List) ((e) ((j2) jVar.f216664p.f22677a).getValue()).f216657a.getContent();
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((ExternalInstitution) next).f66107a, institutionId)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        ExternalInstitution externalInstitution = (ExternalInstitution) next;
                        if (externalInstitution != null) {
                            jVar.C2(new g(externalInstitution.f66107a, externalInstitution.f66108b, externalInstitution.f66109c, externalInstitution.d));
                        }
                    }
                } else if (Intrinsics.f(obj3, k.f216665a)) {
                    ((j) pixBankSelectionScreen.d3()).C2(f.a.f216659a);
                }
                break;
            default:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarD32 = pixBankSelectionScreen.d3();
                Intrinsics.h(query);
                j jVar2 = (j) hVarD32;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                jVar2.H2(jVar2.f216664p, new nj8.b(query, 3));
                break;
        }
        return Unit.f186387a;
    }
}
