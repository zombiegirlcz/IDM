package twl;

import efm.d0;
import h93.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import tof.a3;
import tof.hc;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f275052b;

    public /* synthetic */ g(i iVar, int i) {
        this.f275051a = i;
        this.f275052b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f275051a;
        i iVar = this.f275052b;
        switch (i) {
            case 0:
                f0 card = (f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return ((b0) iVar.f275056b).g(new hc(card.u, null));
            default:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                d0 d0VarFirstOrError = m70.a.g(osg.b.q(iVar.f275057c, false), null, new tw8.g(1), 1).firstOrError();
                ts5.o oVar = new ts5.o(25, new aqd.g(transaction, 12));
                d0VarFirstOrError.getClass();
                return new ufm.i(new ufm.i(d0VarFirstOrError, oVar, 1), new ts5.o(26, new tsk.j(27)), 1);
        }
    }
}
