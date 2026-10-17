package hze;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157149b;

    public /* synthetic */ c(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, int i) {
        this.f157148a = i;
        this.f157149b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f157148a;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = this.f157149b;
        Throwable e = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                cVar.C2(new ste.g(e));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                cVar.C2(new ste.g(e));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var3);
                cVar.C2(new ste.g(e));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(e, "e");
                cVar.l1().M0(new aii.i(e, (aii.a) null, 6));
                break;
            case 4:
                Intrinsics.checkNotNullParameter(e, "e");
                cVar.l1().M0(new aii.i(e, (aii.a) null, 6));
                break;
            default:
                Intrinsics.checkNotNullParameter(e, "e");
                cVar.l1().M0(new aii.i(e, (aii.a) null, 6));
                break;
        }
        return Unit.f186387a;
    }
}
