package pi6;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d f236451b;

    public /* synthetic */ o(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar, int i) {
        this.f236450a = i;
        this.f236451b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f236450a;
        com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar = this.f236451b;
        switch (i) {
            case 0:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                dVar.M2(e);
                return Boolean.TRUE;
            case 1:
                g1j.b result = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                u uVar = dVar.f72520r;
                j1j.d balance = result.f139686a;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(balance, "balance");
                uVar.f236457a.k(balance);
                return Unit.f186387a;
            default:
                Throwable e2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e2, "e");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                dVar.M2(e2);
                return Boolean.TRUE;
        }
    }
}
