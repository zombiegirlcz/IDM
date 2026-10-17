package atg;

import com.revolut.core.model.account.AccountId;
import ise.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xnd.l0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountId f9068b;

    public /* synthetic */ q(AccountId accountId, int i) {
        this.f9067a = i;
        this.f9068b = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f9067a;
        AccountId accountId = this.f9068b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                do3.n nVar = (do3.n) pair.f186386b;
                Intrinsics.h(list);
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((fo3.c) ((Pair) next).f186385a).f136805h, nVar.f116408a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Pair pair2 = (Pair) next;
                if (pair2 == null) {
                    RuntimeException runtimeException = new RuntimeException("Unable to find wallet by ownerId. If this happens in UI tests, please rewrite tapes ('GET /wallets' now always includes 'ownerId')");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
                    pair2 = (Pair) d0.b0(list);
                }
                return ((fo3.c) pair2.f186385a).f136801a;
            case 1:
                return j0.a((j0) obj2, null, null, null, this.f9068b, null, null, null, null, null, false, 8127);
            case 2:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar = (io3.d) obj3;
                    int i2 = kgf.b.f183978a[dVar.e.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2 && md6.s.j(dVar)) {
                            boolean z = accountId instanceof AccountId.Joint;
                            if (z) {
                                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Credit Pocket is not supported for JointAccount: id: ", dVar.f163145a));
                                h0 h0Var2 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                            }
                            if (!z) {
                                arrayList.add(obj3);
                            }
                        }
                    } else if (md6.s.j(dVar) && h30.l.D(xi0.b.Companion, dVar.f163147c)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 3:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return vea.l.g(accountId, pocket);
            case 4:
                io3.d pocket2 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket2, "pocket");
                return vea.l.g(accountId, pocket2);
            case 5:
                z03.c it9 = (z03.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9, accountId);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new l0(accountId, null, null);
            default:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                od0.i iVar = (od0.i) pair3.f186385a;
                xi0.b bVar = (xi0.b) pair3.f186386b;
                od0.h hVar = od0.i.Companion;
                ynd.i iVar2 = new ynd.i((qzi.h) iVar.f224257a, accountId, bVar);
                hVar.getClass();
                return od0.h.a(iVar2);
        }
    }

    public /* synthetic */ q(vea.l lVar, AccountId accountId, int i) {
        this.f9067a = i;
        this.f9068b = accountId;
    }
}
