package c64;

import com.revolut.data.model.Data;
import dx4.x4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f21630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f21631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.c f21632c;
    public final boolean d;

    public k() {
        this(0);
    }

    public static k a(k kVar, ax4.b constructorState, Data calculatorContentData, fu3.c cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            constructorState = kVar.f21630a;
        }
        if ((i & 2) != 0) {
            calculatorContentData = kVar.f21631b;
        }
        if ((i & 4) != 0) {
            cVar = kVar.f21632c;
        }
        if ((i & 8) != 0) {
            z = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(calculatorContentData, "calculatorContentData");
        return new k(constructorState, calculatorContentData, cVar, z);
    }

    public final eu3.c c() {
        return (eu3.c) this.f21631b.getContent();
    }

    public final k e(Long l2) {
        eu3.c cVarC = c();
        eu3.c cVarA = null;
        if (cVarC != null) {
            x4 x4Var = cVarC.d;
            cVarA = eu3.c.a(cVarC, x4Var != null ? x4Var.a(l2) : null, null, 1015);
        }
        return f(cVarA);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f21630a, kVar.f21630a) && Intrinsics.f(this.f21631b, kVar.f21631b) && Intrinsics.f(this.f21632c, kVar.f21632c) && this.d == kVar.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c64.k f(eu3.c r14) {
        /*
            r13 = this;
            eu3.c r0 = r13.c()
            r1 = 0
            if (r0 == 0) goto La
            dx4.x4 r0 = r0.e
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r14 == 0) goto L10
            dx4.x4 r2 = r14.e
            goto L11
        L10:
            r2 = r1
        L11:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 == 0) goto L2f
            eu3.c r0 = r13.c()
            if (r0 == 0) goto L20
            dx4.x4 r0 = r0.d
            goto L21
        L20:
            r0 = r1
        L21:
            if (r14 == 0) goto L25
            dx4.x4 r1 = r14.d
        L25:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L2c
            goto L2f
        L2c:
            r0 = 0
        L2d:
            r4 = r0
            goto L31
        L2f:
            r0 = 1
            goto L2d
        L31:
            r5 = 2
            r6 = 0
            com.revolut.data.model.Data r1 = r13.f21631b
            r3 = 0
            r2 = r14
            com.revolut.data.model.Data r9 = com.revolut.data.model.Data.copy$default(r1, r2, r3, r4, r5, r6)
            r11 = 1
            r12 = 5
            r8 = 0
            r10 = 0
            r7 = r13
            c64.k r14 = a(r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c64.k.f(eu3.c):c64.k");
    }

    public final k g(Long l2) {
        eu3.c cVarC = c();
        eu3.c cVarA = null;
        if (cVarC != null) {
            x4 x4Var = cVarC.e;
            cVarA = eu3.c.a(cVarC, null, x4Var != null ? x4Var.a(l2) : null, 1007);
        }
        return f(cVarA);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f21631b, this.f21630a.hashCode() * 31, 31);
        fu3.c cVar = this.f21632c;
        return Boolean.hashCode(this.d) + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public k(ax4.b constructorState, Data calculatorContentData, fu3.c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(calculatorContentData, "calculatorContentData");
        this.f21630a = constructorState;
        this.f21631b = calculatorContentData;
        this.f21632c = cVar;
        this.d = z;
    }

    public /* synthetic */ k(int i) {
        this(new ax4.b(0), new Data(null, null, true, 3, null), null, false);
    }
}
