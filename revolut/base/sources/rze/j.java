package rze;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a f258601b;

    public /* synthetic */ j(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar, int i) {
        this.f258600a = i;
        this.f258601b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f258600a;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar = this.f258601b;
        Throwable e = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                oki.h.D2(aVar.f91030w);
                return Boolean.FALSE;
            default:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                aVar.C2(new e(e));
                oki.h.D2(aVar.f91030w);
                return Boolean.TRUE;
        }
    }
}
