package n97;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements a97.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a97.g f213582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f213583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f213584c;

    public b(a97.g delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f213582a = delegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // a97.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n97.a
            if (r0 == 0) goto L13
            r0 = r5
            n97.a r0 = (n97.a) r0
            int r1 = r0.f213581w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213581w = r1
            goto L18
        L13:
            n97.a r0 = new n97.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213581w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Boolean r5 = r4.f213584c
            if (r5 == 0) goto L3b
        L36:
            boolean r5 = r5.booleanValue()
            goto L4e
        L3b:
            r0.f213581w = r3
            a97.g r5 = r4.f213582a
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            r4.f213584c = r5
            goto L36
        L4e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n97.b.d(gim.c):java.lang.Object");
    }

    @Override // a97.g
    public final a97.h e() {
        return this.f213582a.e();
    }

    @Override // a97.g
    public final a97.k f() {
        return this.f213582a.f();
    }

    @Override // a97.g
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f213582a.g(extensions);
    }

    @Override // a97.g
    public final boolean isEnabled() {
        Boolean bool = this.f213583b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zIsEnabled = this.f213582a.isEnabled();
        this.f213583b = Boolean.valueOf(zIsEnabled);
        return zIsEnabled;
    }
}
