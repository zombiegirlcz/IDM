package pze;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ste.w;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b f240990b;

    public /* synthetic */ d(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar, int i) {
        this.f240989a = i;
        this.f240990b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f240989a;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar = this.f240990b;
        Throwable e = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                bVar.C2(new w(e));
                oki.h.D2(bVar.f91017y);
                return Boolean.TRUE;
            default:
                Intrinsics.checkNotNullParameter(e, "e");
                bVar.l1().M0(new aii.i(e, (aii.a) null, 6));
                return Unit.f186387a;
        }
    }
}
