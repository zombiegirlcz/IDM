package wh8;

import com.revolut.feature.junior_onboarding.impl.service.JuniorCreationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorCreationService f297429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.h f297430b;

    public b(JuniorCreationService creationService) {
        Intrinsics.checkNotNullParameter(creationService, "creationService");
        this.f297429a = creationService;
        this.f297430b = new ao.h(20, new wdb.b(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kf8.h r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wh8.a
            if (r0 == 0) goto L13
            r0 = r6
            wh8.a r0 = (wh8.a) r0
            int r1 = r0.f297428w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297428w = r1
            goto L18
        L13:
            wh8.a r0 = new wh8.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297428w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ao.h r6 = r4.f297430b
            efm.d0 r5 = r6.k(r5)
            r0.f297428w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wh8.b.a(kf8.h, gim.c):java.lang.Object");
    }
}
