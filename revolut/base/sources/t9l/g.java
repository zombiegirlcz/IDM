package t9l;

import com.revolut.data.model.Data;
import h6i.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import klf.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mjf.b0;
import njf.j;
import s56.d0;
import t5e.m;
import vkm.q;
import vkm.v1;
import vkm.y;
import w4l.h;
import w4l.k;
import xif.o;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f269059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nhf.a f269060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.g f269061c;

    public g(com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, t70.g localization) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f269059a = transactionsInteractor;
        this.f269060b = unitedWalletInteractor;
        this.f269061c = localization;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(t9l.g r11, java.util.Set r12, t9l.a r13, gim.c r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof t9l.d
            if (r0 == 0) goto L16
            r0 = r14
            t9l.d r0 = (t9l.d) r0
            int r1 = r0.f269055w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f269055w = r1
            goto L1b
        L16:
            t9l.d r0 = new t9l.d
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f269055w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L6d
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r14)
            com.revolut.domain.interactors.transactions.a r4 = r11.f269059a
            tof.s9 r5 = new tof.s9
            r5.<init>(r12)
            int[] r11 = t9l.c.f269054a
            int r12 = r13.ordinal()
            r11 = r11[r12]
            if (r11 == r3) goto L57
            r12 = 2
            if (r11 != r12) goto L51
            tof.i1 r11 = tof.i1.f272794a
            java.util.List r11 = zhm.u.c(r11)
        L4f:
            r6 = r11
            goto L5a
        L51:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L57:
            zhm.f0 r11 = zhm.f0.f322471a
            goto L4f
        L5a:
            com.revolut.domain.interactors.transactions.TransactionsSort r8 = com.revolut.domain.interactors.transactions.TransactionsSort.STARTED_DATE_DESC
            r9 = 0
            r10 = 20
            r7 = 0
            ufm.i r11 = com.revolut.domain.interactors.transactions.a.b(r4, r5, r6, r7, r8, r9, r10)
            r0.f269055w = r3
            java.lang.Object r14 = nim.a.b(r11, r0)
            if (r14 != r1) goto L6d
            return r1
        L6d:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r11)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r14.iterator()
        L82:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L9b
            java.lang.Object r14 = r13.next()
            r0 = r14
            tof.a3 r0 = (tof.a3) r0
            java.lang.String r0 = r0.f272581b
            boolean r0 = r11.add(r0)
            if (r0 == 0) goto L82
            r12.add(r14)
            goto L82
        L9b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t9l.g.a(t9l.g, java.util.Set, t9l.a, gim.c):java.io.Serializable");
    }

    public static final Object b(g gVar, Set set, n0 n0Var) {
        gVar.getClass();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (true) {
            Object obj2 = null;
            if (!it8.hasNext()) {
                break;
            }
            String groupId = (String) it8.next();
            b0 b0Var = (b0) gVar.f269059a;
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            h loadingStrategy = h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            o oVar = (o) b0Var.f205984c;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            arrayList.add(new v1(new d0(28, groupId, obj2, oVar, loadingStrategy, (Continuation) null)));
        }
        Object objN = q.n(mo3.a.g(c8g.a.D(nim.a.v(u0.k(arrayList), new t9b.a(6))), null, null, 3), n0Var);
        return objN == fim.a.COROUTINE_SUSPENDED ? objN : Unit.f186387a;
    }

    public static ahd.c c(g gVar, String groupId) {
        gVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new ahd.c(gVar.d(y0.b(groupId), loadingStrategy), groupId, 2);
    }

    public final Flow d(Set groupIds, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (groupIds.isEmpty()) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        Continuation continuation = null;
        return q.q(nim.a.v(nim.a.v(u0.m(new v1(new n0(this, groupIds, continuation, 2)), new y(new w1(2, 23, continuation), rd0.e.e(new f(rd0.e.b(((j) this.f269060b).f()), 0), h0.f322473a, new pc2.d(3, 19, continuation)))), new t9b.a(5)), new m(this, 21)));
    }
}
