package sa6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya6.d f261312a;

    public e(ya6.d charityCampaignsRepository) {
        Intrinsics.checkNotNullParameter(charityCampaignsRepository, "charityCampaignsRepository");
        this.f261312a = charityCampaignsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof sa6.d
            if (r0 == 0) goto L13
            r0 = r10
            sa6.d r0 = (sa6.d) r0
            int r1 = r0.f261308w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261308w = r1
            goto L18
        L13:
            sa6.d r0 = new sa6.d
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261308w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r10)
            goto Lba
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            yhm.o.b(r10)
            java.lang.String r10 = "charityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
            ya6.d r2 = r7.f261312a
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
            jpf.a r10 = r2.e
            w4l.i r4 = w4l.i.f294643c
            r5 = 2
            efm.r r10 = jpf.a.v(r10, r8, r5, r4)
            y7k.g0 r4 = new y7k.g0
            r5 = 4
            r4.<init>(r2, r8, r5)
            y25.c r8 = new y25.c
            r2 = 29
            r8.<init>(r4, r2)
            efm.r r8 = r10.doOnNext(r8)
            java.lang.String r10 = "doOnNext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            sa5.a r10 = new sa5.a
            r2 = 1
            r10.<init>(r2)
            r2 = 0
            efm.r r8 = m70.a.g(r8, r2, r10, r3)
            rvc.k r10 = new rvc.k
            r2 = 18
            r10.<init>(r9, r2)
            efm.r r8 = te0.w.a0(r8, r10)
            s8h.h r9 = new s8h.h
            r10 = 18
            r9.<init>(r10)
            sa6.a r10 = new sa6.a
            r2 = 1
            r10.<init>(r9, r2)
            efm.r r8 = r8.map(r10)
            java.lang.String r9 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            od0.h r9 = od0.i.Companion
            r9.getClass()
            fjm.j r9 = new fjm.j
            r10 = 11
            r9.<init>(r10)
            os2.g r10 = new os2.g
            r10.<init>(r9)
            efm.r r8 = r8.publish(r10)
            java.lang.String r9 = "publish(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r9 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r0.f261308w = r3
            java.lang.Object r10 = nim.a.b(r8, r0)
            if (r10 != r1) goto Lba
            return r1
        Lba:
            od0.i r10 = (od0.i) r10
            java.lang.Object r8 = r10.f224257a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.e.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
