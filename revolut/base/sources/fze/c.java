package fze;

import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import fjd.g0;
import fo1.b0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b f139175b;

    public /* synthetic */ c(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar, int i) {
        this.f139174a = i;
        this.f139175b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f139174a;
        Continuation continuation = null;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar = this.f139175b;
        switch (i) {
            case 0:
                oxe.j result = (oxe.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                String str = result.f230791a;
                if (((jte.d) bVar.v).c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c)) {
                    k kVar = new k(bVar, str, continuation, 0);
                    bVar.l2(new b0(kVar, continuation, 10), new c(bVar, 3));
                } else {
                    k kVar2 = new k(bVar, str, continuation, 1);
                    bVar.l2(new g0(bVar, kVar2, (Continuation) null), new c(bVar, 2));
                }
                break;
            case 1:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                bVar.l1().M0(new aii.i(e, (aii.a) null, 6));
                break;
            case 2:
                Throwable e2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e2, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                bVar.C2(new ste.g(e2));
                break;
            default:
                Throwable e4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e4, "e");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var2);
                bVar.C2(new ste.g(e4));
                break;
        }
        return Boolean.TRUE;
    }
}
