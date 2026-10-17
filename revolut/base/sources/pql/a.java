package pql;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f238809c;
    public final String d;

    public a(String state, String str, String str2, List acceptedAuthenticationContexts) {
        Intrinsics.checkNotNullParameter(acceptedAuthenticationContexts, "acceptedAuthenticationContexts");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f238807a = acceptedAuthenticationContexts;
        this.f238808b = state;
        this.f238809c = str;
        this.d = str2;
    }

    public final List a() {
        return this.f238807a;
    }

    public final String b() {
        return this.f238808b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof pql.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pql.a r5 = (pql.a) r5
            java.util.List r1 = r4.f238807a
            java.util.List r3 = r5.f238807a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f238808b
            java.lang.String r3 = r5.f238808b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f238809c
            java.lang.String r3 = r5.f238809c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r5 = r5.d
            java.lang.String r1 = r4.d
            if (r1 != 0) goto L39
            if (r5 != 0) goto L37
            r5 = r0
            goto L40
        L37:
            r5 = r2
            goto L40
        L39:
            if (r5 != 0) goto L3c
            goto L37
        L3c:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L40:
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pql.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iC = p.a.c(this.f238807a.hashCode() * 31, 31, this.f238808b);
        String str = this.f238809c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
