package n7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213134a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f213135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io3.d f213136c;

    public /* synthetic */ q(AccountWrapper accountWrapper, s sVar, io3.d dVar) {
        this.f213135b = accountWrapper;
        this.f213136c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r8 = this;
            int r0 = r8.f213134a
            switch(r0) {
                case 0: goto L59;
                default: goto L5;
            }
        L5:
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = r8.f213135b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            java.lang.Boolean r3 = com.revolut.feature_move_money.api.model.b.b(r0)
            if (r3 == 0) goto L17
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L19
        L17:
            r3 = r2
            goto L1a
        L19:
            r3 = r1
        L1a:
            boolean r0 = n7i.s.a(r0)
            if (r0 == 0) goto L4e
            xi0.a r0 = xi0.b.Companion
            io3.d r4 = r8.f213136c
            java.lang.String r5 = r4.f163147c
            boolean r0 = r6.b.B(r0, r5)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r4.f163147c
            xi0.b r0 = xi0.a.a(r0)
            boolean r0 = cp5.d.A(r0)
            if (r0 == 0) goto L4e
            io3.l r0 = r4.e
            io3.l r5 = io3.l.REVX_FIAT
            if (r0 != r5) goto L4e
        L3e:
            io3.k r0 = r4.f
            io3.k r5 = io3.k.ACTIVE
            if (r0 != r5) goto L4e
            long r4 = r4.i
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L4e
            r0 = r2
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r3 == 0) goto L54
            if (r0 == 0) goto L54
            r1 = r2
        L54:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L59:
            xi0.a r0 = xi0.b.Companion
            io3.d r1 = r8.f213136c
            java.lang.String r2 = r1.f163147c
            r0.getClass()
            xi0.b r0 = xi0.a.a(r2)
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r8.f213135b
            boolean r2 = r7i.g.a(r0, r2)
            boolean r0 = cp5.d.A(r0)
            if (r0 == 0) goto L7c
            io3.k r0 = r1.f
            io3.k r1 = io3.k.ACTIVE
            if (r0 != r1) goto L7c
            if (r2 == 0) goto L7c
            r0 = 1
            goto L7d
        L7c:
            r0 = 0
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n7i.q.call():java.lang.Object");
    }

    public /* synthetic */ q(io3.d dVar, s sVar, AccountWrapper accountWrapper) {
        this.f213136c = dVar;
        this.f213135b = accountWrapper;
    }
}
