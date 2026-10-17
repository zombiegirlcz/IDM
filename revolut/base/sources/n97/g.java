package n97;

import com.revolut.data.model.Data;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n8a.r;
import o97.l0;
import vkm.j2;
import vkm.q;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a97.g f213590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a97.k f213592c;
    public final AtomicBoolean d;
    public final oji.j e;
    public final j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v1 f213593g;

    public g(k kVar, a97.g delegate, String tileId) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        this.f213590a = delegate;
        this.f213591b = tileId;
        a97.k kVarF = delegate.f();
        this.f213592c = kVarF;
        this.d = new AtomicBoolean(false);
        this.e = new oji.j();
        this.f = q.c(new Data(kVarF.a(), null, true, 2, null));
        this.f213593g = new v1(new r(this, kVar, (Continuation) null, 3));
    }

    public final void a(l0 command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (c.f213585a[command.f223118b.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.d.set(true);
        Data data = new Data(null, null, false, 6, null);
        j2 j2Var = this.f;
        j2Var.getClass();
        j2Var.g(null, data);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(o97.y r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n97.f
            if (r0 == 0) goto L13
            r0 = r6
            n97.f r0 = (n97.f) r0
            int r1 = r0.f213589w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213589w = r1
            goto L18
        L13:
            n97.f r0 = new n97.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213589w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f213589w = r3
            a97.k r6 = r4.f213592c
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            o97.x r6 = (o97.x) r6
            boolean r5 = r6 instanceof o97.l0
            if (r5 == 0) goto L47
            r5 = r6
            o97.l0 r5 = (o97.l0) r5
            goto L48
        L47:
            r5 = 0
        L48:
            if (r5 == 0) goto L50
            r4.a(r5)
            o97.x r5 = r5.f223117a
            return r5
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n97.g.b(o97.y, gim.c):java.lang.Object");
    }
}
