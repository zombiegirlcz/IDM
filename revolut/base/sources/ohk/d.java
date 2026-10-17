package ohk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f225387w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f225387w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f225387w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.v
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 1
            if (r2 == 0) goto L1a
            if (r2 != r3) goto L12
            yhm.o.b(r7)
            goto L99
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            ohk.g r7 = r6.f225387w
            ohk.k r2 = r7.f225393n
            r2.getClass()
            java.lang.String r4 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            boolean r4 = r0 instanceof retrofit2.HttpException
            r5 = 0
            if (r4 == 0) goto L31
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            goto L32
        L31:
            r0 = r5
        L32:
            if (r0 != 0) goto L36
        L34:
            r2 = r5
            goto L7d
        L36:
            ulm.r1 r0 = i26.l.m(r0)
            if (r0 != 0) goto L3d
            goto L34
        L3d:
            kg.o r2 = r2.f225398a     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = r0.string()     // Catch: java.lang.Exception -> L4c
            java.lang.Class<ohk.j> r4 = ohk.j.class
            java.lang.Object r0 = r2.c(r0, r4)     // Catch: java.lang.Exception -> L4c
            ohk.j r0 = (ohk.j) r0     // Catch: java.lang.Exception -> L4c
            goto L57
        L4c:
            r0 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r5, r5, r0, r2)
            r0 = r5
        L57:
            if (r0 == 0) goto L69
            java.lang.Integer r2 = r0.getCode()
            if (r2 != 0) goto L60
            goto L69
        L60:
            int r2 = r2.intValue()
            r4 = 1511(0x5e7, float:2.117E-42)
            if (r2 != r4) goto L69
            goto L6a
        L69:
            r0 = r5
        L6a:
            if (r0 == 0) goto L34
            ohk.j$a r0 = r0.getParams()
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.getWorkflowId()
            if (r0 == 0) goto L34
            ohk.h r2 = new ohk.h
            r2.<init>(r0)
        L7d:
            if (r2 != 0) goto L82
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L82:
            vkm.z1 r0 = r7.o
            r0.i()
            ohk.c r0 = new ohk.c
            r0.<init>(r7, r2, r5)
            r6.v = r5
            r6.u = r3
            zfk.n$a r2 = zfk.n.a.f322030a
            java.lang.Object r7 = lhk.p.b(r7, r2, r0, r6)
            if (r7 != r1) goto L99
            return r1
        L99:
            bgk.b r7 = (bgk.b) r7
            bgk.b$a r0 = bgk.b.a.f15209a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r0 == 0) goto La5
            r3 = 0
            goto Lbc
        La5:
            bgk.b$b r0 = bgk.b.C0097b.f15210a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r0 != 0) goto Lbc
            bgk.b$c r0 = bgk.b.c.f15211a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 == 0) goto Lb6
            goto Lbc
        Lb6:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        Lbc:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ohk.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
