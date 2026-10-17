package cea;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23454a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.linked_account_details.a f23455b;

    public /* synthetic */ p(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar) {
        this.f23455b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f23454a;
        com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar = this.f23455b;
        dii.g result = (dii.g) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    String str = aVar.o.f80812a.o;
                    if (str == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Institution id should present for external institution pocket once revoke clicked");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        aVar.l2(new c84.y(aVar, str, null, 10), new yi5.b(26));
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(result, "it");
                aVar.C2(i.f23447a);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ p(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar, com.revolut.kompot.navigable.vc.modal.a aVar2) {
        this.f23455b = aVar;
    }
}
