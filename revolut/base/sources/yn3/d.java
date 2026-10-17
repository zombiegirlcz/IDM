package yn3;

import com.revolut.data.model.Data;
import e7l.g;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f315086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f315087b;

    public d(kdh.b deviceManagementInteractor, fk3.a configurationInteractor, e dateProvider) {
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f315086a = deviceManagementInteractor;
        this.f315087b = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof yn3.b
            if (r0 == 0) goto L13
            r0 = r11
            yn3.b r0 = (yn3.b) r0
            int r1 = r0.f315084y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315084y = r1
            goto L18
        L13:
            yn3.b r0 = new yn3.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f315082w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315084y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            long r1 = r0.v
            long r4 = r0.u
            yhm.o.b(r11)
            goto L80
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            yhm.o.b(r11)
            goto L47
        L3b:
            yhm.o.b(r11)
            r0.f315084y = r5
            java.lang.Object r11 = r10.b(r0)
            if (r11 != r1) goto L47
            goto L7d
        L47:
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r11.getContent()
            e7l.f r11 = (e7l.f) r11
            if (r11 == 0) goto Lb7
            java.lang.Long r11 = r11.f123365c1
            if (r11 == 0) goto Lb7
            long r6 = r11.longValue()
            r11 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r11
            long r8 = r8 * r6
            r0.u = r6
            r0.v = r8
            r0.f315084y = r4
            kdh.b r11 = r10.f315086a
            r2 = 0
            efm.r r11 = r11.j0(r2, r5)
            yjh.b0 r2 = new yjh.b0
            r4 = 11
            r2.<init>(r4)
            efm.r r11 = m70.a.g(r11, r3, r2, r5)
            java.lang.Object r11 = nim.a.e(r11, r0)
            if (r11 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r4 = r6
            r1 = r8
        L80:
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto Lb7
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L8a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r11.next()
            r6 = r0
            com.revolut.feature.devicemanagement.api.model.UserDevice r6 = (com.revolut.feature.devicemanagement.api.model.UserDevice) r6
            boolean r7 = r6.f71921m
            if (r7 == 0) goto L8a
            boolean r6 = r6.f71925r
            if (r6 != 0) goto L8a
            r3 = r0
        La0:
            com.revolut.feature.devicemanagement.api.model.UserDevice r3 = (com.revolut.feature.devicemanagement.api.model.UserDevice) r3
            if (r3 != 0) goto La5
            goto Lb7
        La5:
            long r6 = r3.f71923p
            long r6 = r6 + r1
            long r0 = java.lang.System.currentTimeMillis()
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 > 0) goto Lb1
            goto Lb7
        Lb1:
            qn3.a r11 = new qn3.a
            r11.<init>(r4)
            return r11
        Lb7:
            qn3.b$a r11 = qn3.b.a.f247869a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yn3.d.a(gim.c):java.lang.Object");
    }

    public final Object b(gim.c cVar) {
        r rVarTimeout = zi0.c.J(((ik3.c) this.f315087b).k(g.b.f123407a)).timeout(3L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarTimeout, "timeout(...)");
        return nim.a.e(ue0.e.E(rVarTimeout, new Data(null, null, false, 6, null)), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yn3.c
            if (r0 == 0) goto L13
            r0 = r5
            yn3.c r0 = (yn3.c) r0
            int r1 = r0.f315085w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315085w = r1
            goto L18
        L13:
            yn3.c r0 = new yn3.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315085w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f315085w = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            if (r5 == 0) goto L50
            java.lang.Object r5 = r5.getContent()
            e7l.f r5 = (e7l.f) r5
            if (r5 == 0) goto L50
            java.lang.Boolean r5 = r5.f123375h1
            if (r5 == 0) goto L50
            boolean r5 = r5.booleanValue()
            goto L51
        L50:
            r5 = 0
        L51:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yn3.d.c(gim.c):java.lang.Object");
    }
}
