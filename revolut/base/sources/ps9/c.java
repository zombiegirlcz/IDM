package ps9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mq9.f f239431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jt0.b f239432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f239433c;

    public c(mq9.f groupsInteractor, jt0.b groupsDebtsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(groupsDebtsInteractor, "groupsDebtsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f239431a = groupsInteractor;
        this.f239432b = groupsDebtsInteractor;
        this.f239433c = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(st9.f r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ps9.a
            if (r0 == 0) goto L13
            r0 = r7
            ps9.a r0 = (ps9.a) r0
            int r1 = r0.f239429w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239429w = r1
            goto L18
        L13:
            ps9.a r0 = new ps9.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239429w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L54
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f265549c
            r0.f239429w = r3
            mq9.f r7 = r5.f239431a
            mr9.a r7 = (mr9.a) r7
            er9.f r7 = r7.f208082a
            er9.x r7 = (er9.x) r7
            r7.getClass()
            e38.c r2 = new e38.c
            r3 = 0
            r4 = 22
            r2.<init>(r7, r6, r3, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r6, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            st9.f r7 = (st9.f) r7
            java.lang.String r6 = r7.f265548b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ps9.c.a(st9.f, gim.c):java.lang.Object");
    }

    public final efm.r b(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        String groupId = group.f79285a;
        mr9.a aVar = (mr9.a) this.f239431a;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        er9.x xVar = (er9.x) aVar.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        efm.r rVarOnErrorReturnItem = m70.a.g(nim.a.w(xVar.f128606q.f(Unit.f186387a, xVar.o.a("RELOAD_STRATEGY_KEY_GROUPS", false)), new e2j.i(groupId, 18)), new bhi.c(group, 21), null, 2).onErrorReturnItem(group);
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturnItem, "onErrorReturnItem(...)");
        return rVarOnErrorReturnItem;
    }
}
