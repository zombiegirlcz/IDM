package pk6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pig.y;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixBranchSelectionScreen f236926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PixBranchSelectionScreen pixBranchSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236926w = pixBranchSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f236926w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f236926w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        Object next;
        int i = this.u;
        PixBranchSelectionScreen pixBranchSelectionScreen = this.f236926w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (obj3 instanceof ho3.a) {
                    j jVarD3 = pixBranchSelectionScreen.d3();
                    String branchId = ((ho3.a) obj3).f154218a;
                    jVarD3.getClass();
                    Intrinsics.checkNotNullParameter(branchId, "branchId");
                    ExternalInstitution externalInstitution = (ExternalInstitution) ((e) ((j2) jVarD3.f236933q.f22677a).getValue()).f236927a.getContent();
                    if (externalInstitution != null && (list = externalInstitution.d) != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((ho3.a) next).f154218a, branchId)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        ho3.a aVar2 = (ho3.a) next;
                        if (aVar2 != null) {
                            jVarD3.C2(new g(aVar2));
                        }
                    }
                } else if (Intrinsics.f(obj3, k.f236934a)) {
                    pixBranchSelectionScreen.d3().C2(f.f236929a);
                }
                break;
            default:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarD32 = pixBranchSelectionScreen.d3();
                Intrinsics.h(query);
                jVarD32.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                jVarD32.H2(jVarD32.f236933q, new y(query, 5));
                break;
        }
        return Unit.f186387a;
    }
}
