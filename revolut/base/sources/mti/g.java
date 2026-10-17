package mti;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pti.t;
import pti.u;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements zsi.e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f208851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f208852c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f208853a;

    static {
        pkm.e eVar = pkm.e.SECONDS;
        f208851b = kotlin.time.c.g(1, eVar);
        f208852c = kotlin.time.c.g(5, eVar);
    }

    public g(u repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f208853a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mti.g r12, kotlinx.coroutines.flow.FlowCollector r13, java.lang.String r14, long r15, long r17, gim.c r19) {
        /*
            r0 = r19
            r12.getClass()
            boolean r1 = r0 instanceof mti.f
            if (r1 == 0) goto L18
            r1 = r0
            mti.f r1 = (mti.f) r1
            int r2 = r1.f208850w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f208850w = r2
            goto L1d
        L18:
            mti.f r1 = new mti.f
            r1.<init>(r12, r0)
        L1d:
            java.lang.Object r0 = r1.u
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f208850w
            r11 = 1
            if (r2 == 0) goto L34
            if (r2 != r11) goto L2c
            yhm.o.b(r0)
            goto L51
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            yhm.o.b(r0)
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            dp4.b1 r2 = new dp4.b1
            r9 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r9)
            r1.f208850w = r11
            r3 = r17
            java.lang.Object r0 = skm.h2.e(r3, r2, r1)
            if (r0 != r10) goto L51
            return r10
        L51:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L5a
            boolean r0 = r0.booleanValue()
            goto L5b
        L5a:
            r0 = 0
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mti.g.a(mti.g, kotlinx.coroutines.flow.FlowCollector, java.lang.String, long, long, gim.c):java.lang.Object");
    }

    public final vkm.d b(String passId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        u uVar = this.f208853a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(passId, "passId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return uVar.f239761g.b(passId, loadingStrategy);
    }

    public final akg.n c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        u uVar = this.f208853a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(uVar.f.b(Unit.f186387a, loadingStrategy), new msb.c(9));
    }

    public final Object d(String str, gim.i iVar) throws Throwable {
        u uVar = this.f208853a;
        uVar.getClass();
        t tVar = new t(uVar, str, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, tVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
