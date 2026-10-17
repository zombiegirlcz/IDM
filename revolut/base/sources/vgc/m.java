package vgc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nhc.a f288831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f288832b;

    public m(nhc.a repository, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f288831a = repository;
        this.f288832b = serverErrorParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, long r9, int r11, gim.c r12) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r12 instanceof vgc.l
            if (r0 == 0) goto L13
            r0 = r12
            vgc.l r0 = (vgc.l) r0
            int r1 = r0.f288830x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288830x = r1
            goto L18
        L13:
            vgc.l r0 = new vgc.l
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288830x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$ObjectRef r8 = r0.u
            yhm.o.b(r12)
            goto L6c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.jvm.internal.Ref$ObjectRef r12 = p.a.w(r12)
            r2 = 0
            kotlin.ranges.IntRange r11 = kotlin.ranges.f.o(r2, r11)
            v0f.p r2 = new v0f.p
            r4 = 7
            r2.<init>(r11, r4)
            ugc.m r11 = new ugc.m
            r4 = 1
            r5 = 0
            r11.<init>(r9, r4, r5)
            vkm.q0 r9 = new vkm.q0
            r10 = 1
            r9.<init>(r2, r11, r10)
            t38.e r10 = new t38.e
            r11 = 15
            r10.<init>(r9, r11, r7, r8)
            sxe.g r8 = new sxe.g
            r8.<init>(r10, r5, r7, r12)
            vkm.v1 r9 = new vkm.v1
            r9.<init>(r8)
            r0.u = r12
            r0.f288830x = r3
            java.lang.Object r8 = vkm.q.z(r9, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r6 = r12
            r12 = r8
            r8 = r6
        L6c:
            vgc.i r12 = (vgc.i) r12
            boolean r9 = r12 instanceof vgc.g
            if (r9 != 0) goto La5
            vgc.h r9 = vgc.h.f288824a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r12, r9)
            if (r10 == 0) goto L7b
            goto La5
        L7b:
            if (r12 != 0) goto L9f
            java.lang.Object r10 = r8.f186409a
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            sf0.h r11 = r7.f288832b
            com.revolut.core.error.data.model.ServerError r10 = r11.a(r10)
            if (r10 == 0) goto L91
            int r10 = r10.f51362a
            r11 = 74601(0x12369, float:1.04538E-40)
            if (r10 != r11) goto L91
            return r9
        L91:
            java.lang.Object r8 = r8.f186409a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            if (r8 != 0) goto L9e
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Payment linking poll completed without result"
            r8.<init>(r9)
        L9e:
            throw r8
        L9f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        La5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vgc.m.a(java.lang.String, long, int, gim.c):java.lang.Object");
    }
}
