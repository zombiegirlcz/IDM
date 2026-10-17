package m58;

import afa.s;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.joint.impl.ui.withdraw.AmountData;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m2f.b0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.withdraw.b f202860b;

    public /* synthetic */ i(com.revolut.feature.joint.impl.ui.withdraw.b bVar, int i) {
        this.f202859a = i;
        this.f202860b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202859a) {
            case 0:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f202860b.f76609q.z(AccountId.Personal.f51414a, it8);
            case 1:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                dj0.d dVar = new dj0.d(0L, this.f202860b.o.f76604a);
                m70.a.c(t0.f186434a);
                return a.a(update, zi0.c.P(new AmountData(dVar, "", false), false, null, 3), null, null, null, 14);
            case 2:
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.e) {
                    com.revolut.feature.joint.impl.ui.withdraw.b bVar = this.f202860b;
                    bVar.l2(new b0(bVar, bVar.o.f76605b, null, 5), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                io3.d dVar2 = (io3.d) obj2;
                wsg.n nVar = this.f202860b.f76609q;
                xi0.a aVar = xi0.b.Companion;
                String str = dVar2.f163147c;
                aVar.getClass();
                d0 d0VarR = osg.b.r(nVar, xi0.a.a(str), io3.l.CURRENT, null, null, 60);
                m30.b bVar2 = new m30.b(24, new m30.c(24));
                d0VarR.getClass();
                ufm.i iVar = new ufm.i(d0VarR, bVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                od0.i.Companion.getClass();
                return new ufm.i(ue0.e.F(iVar, od0.i.f224256b), new m30.b(25, new s(dVar2, 11)), 1);
        }
    }
}
