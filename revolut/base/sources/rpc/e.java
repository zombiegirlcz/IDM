package rpc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import ppc.r;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, r.class, "<init>", "<init>(Lcom/revolut/feature/wealth/api/ui/mappers/RoboFooterDisclaimerFactory$Disclaimer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k1h.f p0 = (k1h.f) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new r(p0);
    }
}
