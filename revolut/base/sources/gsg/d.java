package gsg;

import ayc.i;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import gs2.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bal.a f146457a;

    public d(bal.a entityRepository) {
        Intrinsics.checkNotNullParameter(entityRepository, "entityRepository");
        this.f146457a = entityRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof gsg.b
            if (r0 == 0) goto L13
            r0 = r5
            gsg.b r0 = (gsg.b) r0
            int r1 = r0.f146455w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146455w = r1
            goto L18
        L13:
            gsg.b r0 = new gsg.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146455w
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
            r0.f146455w = r3
            java.io.Serializable r5 = r4.b(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L46
            boolean r0 = r5 instanceof com.revolut.feature.be_driven_design.models.exception.NoActionsToBePerformedException
            if (r0 == 0) goto L45
            r3 = 0
            goto L46
        L45:
            throw r5
        L46:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gsg.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof gsg.c
            if (r0 == 0) goto L13
            r0 = r8
            gsg.c r0 = (gsg.c) r0
            int r1 = r0.f146456w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146456w = r1
            goto L18
        L13:
            gsg.c r0 = new gsg.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146456w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            vkm.d r8 = r7.c(r3)
            d4f.m r2 = new d4f.m
            r4 = 2
            r5 = 22
            r6 = 0
            r2.<init>(r4, r5, r6)
            vkm.y r4 = new vkm.y
            r4.<init>(r8, r2)
            r0.f146456w = r3
            java.lang.Object r8 = vkm.q.x(r4, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Throwable r8 = r8.getError()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gsg.d.b(gim.c):java.io.Serializable");
    }

    public final vkm.d c(boolean z) {
        return e.b(nim.a.w(((i) this.f146457a).b(new EntityConfigRepository$Params.Config("voluntary-offboarding", r0.g()), z), new t(4)));
    }
}
