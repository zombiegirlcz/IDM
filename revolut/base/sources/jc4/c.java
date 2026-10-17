package jc4;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b f172704b;

    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar, int i) {
        this.f172703a = i;
        this.f172704b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f172703a;
        com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar = this.f172704b;
        Throwable error = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                bVar.P2();
                break;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var2);
                bVar.P2();
                break;
        }
        return Boolean.TRUE;
    }
}
