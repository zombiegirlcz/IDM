package rg3;

import com.revolut.feature.checklist_challenges.impl.network.ChecklistChallengesService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChecklistChallengesService f254000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f254001b;

    public c(ChecklistChallengesService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f254000a = service;
        this.f254001b = storage;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rg3.b
            if (r0 == 0) goto L13
            r0 = r9
            rg3.b r0 = (rg3.b) r0
            int r1 = r0.f253999x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253999x = r1
            goto L18
        L13:
            rg3.b r0 = new rg3.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253999x
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "CHECKLIST_CHALLENGES_LAST_MODIFIED_KEY"
            ue0.c r5 = r7.f254001b
            r6 = 1
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            java.util.List r8 = r0.u
            java.util.List r8 = (java.util.List) r8
            yhm.o.b(r9)
            goto L56
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r9)
            if (r8 == 0) goto L45
            java.lang.Object r9 = j6.a.k(r3, r5, r4)
            java.lang.String r9 = (java.lang.String) r9
            goto L46
        L45:
            r9 = 0
        L46:
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            r0.u = r2
            r0.f253999x = r6
            com.revolut.feature.checklist_challenges.impl.network.ChecklistChallengesService r2 = r7.f254000a
            java.lang.Object r9 = r2.getChecklistChallenges(r9, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            retrofit2.Response r9 = (retrofit2.Response) r9
            int r0 = r9.code()
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto L63
            if (r8 == 0) goto L63
            return r8
        L63:
            r8 = 200(0xc8, float:2.8E-43)
            if (r0 != r8) goto L85
            ulm.u0 r8 = r9.headers()
            java.lang.String r0 = "last-modified"
            java.lang.String r8 = r8.a(r0)
            if (r8 == 0) goto L76
            z9h.n.l(r3, r5, r4, r8)
        L76:
            java.lang.Object r8 = r9.body()
            if (r8 == 0) goto L7d
            return r8
        L7d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Required value was null."
            r8.<init>(r9)
            throw r8
        L85:
            retrofit2.HttpException r8 = new retrofit2.HttpException
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rg3.c.a(java.util.List, gim.c):java.lang.Object");
    }
}
