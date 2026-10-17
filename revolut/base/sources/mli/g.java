package mli;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f206972b;

    public /* synthetic */ g(k kVar, int i) {
        this.f206971a = i;
        this.f206972b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f206971a;
        k kVar = this.f206972b;
        switch (i) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "LogoutCleaner", "Logout cleanup started", null, null, 16);
                ((com.revolut.analytics.tracking.v3.f) kVar.f206978b).i("started");
                break;
            default:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "LogoutCleaner", "Logout cleanup failed:", th10, h0Var);
                ((com.revolut.analytics.tracking.v3.f) kVar.f206978b).i(v1.c.u("failed: ", th10));
                break;
        }
        return Unit.f186387a;
    }
}
