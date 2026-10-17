package pql;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f238814c;
    public final String d;

    public d(String url2, String state, List acceptedAuthenticationContexts, String str) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(acceptedAuthenticationContexts, "acceptedAuthenticationContexts");
        this.f238812a = url2;
        this.f238813b = state;
        this.f238814c = acceptedAuthenticationContexts;
        this.d = str;
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
            boolean r1 = r5 instanceof pql.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pql.d r5 = (pql.d) r5
            java.lang.String r1 = r4.f238812a
            java.lang.String r3 = r5.f238812a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f238813b
            java.lang.String r3 = r5.f238813b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.f238814c
            java.util.List r3 = r5.f238814c
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
        throw new UnsupportedOperationException("Method not decompiled: pql.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f238812a.hashCode() * 31, 31, this.f238813b), 31, this.f238814c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
