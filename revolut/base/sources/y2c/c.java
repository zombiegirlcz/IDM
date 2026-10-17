package y2c;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import uyd.e0;
import wf0.r0;
import wqj.g;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f310618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f310619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f310620c;

    public c(cl3.a contactsInteractor, j memoryCache) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f310618a = contactsInteractor;
        this.f310619b = memoryCache;
        Continuation continuation = null;
        this.f310620c = new x4l.c(new g(this, continuation, 21), new y1.a(this, 5), new xwd.a(this, 17), new r0(2, 8, continuation), new e0(3, 24, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof y2c.b
            if (r0 == 0) goto L13
            r0 = r5
            y2c.b r0 = (y2c.b) r0
            int r1 = r0.f310617w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310617w = r1
            goto L18
        L13:
            y2c.b r0 = new y2c.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f310617w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r5)
            if (r7 == 0) goto L37
            w4l.i r5 = w4l.i.f294643c
            goto L39
        L37:
            w4l.h r5 = w4l.h.f294642c
        L39:
            x4l.c r7 = r4.f310620c
            vkm.d r5 = r7.b(r6, r5)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.flow.Flow r5 = nz8.d.j(r5, r7, r6)
            r0.f310617w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r6 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y2c.c.a(gim.c, java.lang.String, boolean):java.lang.Object");
    }
}
