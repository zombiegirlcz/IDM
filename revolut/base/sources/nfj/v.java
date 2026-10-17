package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimFeedbackService;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimFeedbackService f215059a;

    public v(EsimFeedbackService esimFeedbackService) {
        Intrinsics.checkNotNullParameter(esimFeedbackService, "esimFeedbackService");
        this.f215059a = esimFeedbackService;
    }

    public static String a(dej.y yVar) {
        String strName;
        if (yVar instanceof dej.w) {
            strName = ((dej.w) yVar).f113676c.name();
        } else {
            if (!(yVar instanceof dej.x)) {
                throw new NoWhenBranchMatchedException();
            }
            strName = ((dej.x) yVar).f113688c.name();
        }
        return j6.a.q("Failed to send feedback data for EsimFeedbackType=REFUND_REASON, RefundReason=", strName);
    }

    public static void b(dej.y yVar, Throwable th10) {
        if (th10 != null) {
            Set setW = m72.b.w("EsimFeedbackRepositoryImpl", a(yVar));
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, setW);
        } else {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimFeedbackRepositoryImpl", a(yVar), null, h0Var);
        }
    }
}
