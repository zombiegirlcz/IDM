package pof;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTimeUtils;
import pfm.m;
import pfm.n;
import rnf.s;
import te0.w;
import tof.a3;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f237981b;

    public /* synthetic */ d(j jVar, int i) {
        this.f237980a = i;
        this.f237981b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f237980a) {
            case 0:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                mhf.a aVar = this.f237981b.e;
                Set accountIds = y0.b(transaction.f272624y.f273143a);
                long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis();
                mjf.a aVar2 = (mjf.a) aVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(accountIds, "ids");
                g31.c cVar = aVar2.f205978a;
                Intrinsics.checkNotNullParameter(accountIds, "accountIds");
                n nVar = new n(new g31.a(accountIds, cVar, jCurrentTimeMillis, 0), 1);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                return w.g0(nVar);
            default:
                s entrypoint = (s) obj2;
                Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
                if (entrypoint != s.PUSH) {
                    return m.f235744a;
                }
                j jVar = this.f237981b;
                return ((c) jVar.f237987b).x0().c(te0.s.f270018a).flatMapCompletable(new po9.w(2, new d(jVar, 0)));
        }
    }
}
