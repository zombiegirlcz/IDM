package ntf;

import cli.y;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsSearchScreen f219019w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TransferReasonsSearchScreen transferReasonsSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219019w = transferReasonsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f219019w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f219019w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f219019w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            default:
                e eVar4 = new e(this.f219019w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((TransferReasonNode) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferReasonsSearchScreen transferReasonsSearchScreen = this.f219019w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = transferReasonsSearchScreen.R2();
                Intrinsics.h(query);
                rVarE3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                y yVar = rVarE3.u;
                List list = ((g) ((j2) yVar.f22677a).getValue()).f219020a.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    TransferReasonNode reason = (TransferReasonNode) obj3;
                    a aVar2 = rVarE3.f219039r;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    Intrinsics.checkNotNullParameter(query, "query");
                    if (d0.J(aVar2.f219016a.b(hb9.b.B(reason)), query, true)) {
                        arrayList.add(obj3);
                    }
                }
                rVarE3.H2(yVar, new a54.c(query, arrayList));
                break;
            case 1:
                ty0.a data = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = transferReasonsSearchScreen.R2();
                Intrinsics.h(data);
                rVarE32.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                if (Intrinsics.f(data.f275445a, "GET_HELP_ID")) {
                    rVarE32.f219038q.getClass();
                    rVarE32.C1(psf.a.a());
                }
                break;
            case 2:
                TransferReasonNode reason2 = (TransferReasonNode) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE33 = transferReasonsSearchScreen.R2();
                Intrinsics.h(reason2);
                rVarE33.getClass();
                Intrinsics.checkNotNullParameter(reason2, "reason");
                rVarE33.C2(new l(((g) ((j2) rVarE33.u.f22677a).getValue()).f219020a, reason2));
                break;
            default:
                TransferReasonNode reason3 = (TransferReasonNode) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE34 = transferReasonsSearchScreen.R2();
                Intrinsics.h(reason3);
                rVarE34.getClass();
                Intrinsics.checkNotNullParameter(reason3, "reason");
                rVarE34.C2(new l(((g) ((j2) rVarE34.u.f22677a).getValue()).f219020a, reason3));
                break;
        }
        return Unit.f186387a;
    }
}
