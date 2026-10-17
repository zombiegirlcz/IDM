package wxd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f300869c;

    public k(String value, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f300867a = value;
        this.f300868b = str;
        this.f300869c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
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
            boolean r1 = r5 instanceof wxd.k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wxd.k r5 = (wxd.k) r5
            java.lang.String r1 = r4.f300867a
            java.lang.String r3 = r5.f300867a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f300868b
            java.lang.String r3 = r4.f300868b
            if (r3 != 0) goto L23
            if (r1 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r1 != 0) goto L26
            goto L21
        L26:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List r1 = r4.f300869c
            java.util.List r5 = r5.f300869c
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wxd.k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f300867a.hashCode() * 31;
        String str = this.f300868b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f300869c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
